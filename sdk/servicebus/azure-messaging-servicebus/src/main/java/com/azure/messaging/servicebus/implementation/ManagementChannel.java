// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus.implementation;

import com.azure.core.amqp.exception.AmqpErrorCondition;
import com.azure.core.amqp.exception.AmqpErrorContext;
import com.azure.core.amqp.exception.AmqpException;
import com.azure.core.amqp.exception.AmqpResponseCode;
import com.azure.core.amqp.exception.SessionErrorContext;
import com.azure.core.amqp.implementation.ChannelCacheWrapper;
import com.azure.core.amqp.implementation.ExceptionUtil;
import com.azure.core.amqp.implementation.MessageSerializer;
import com.azure.core.amqp.implementation.RequestResponseChannel;
import com.azure.core.amqp.implementation.RequestResponseUtils;
import com.azure.core.amqp.implementation.TokenManager;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.servicebus.ServiceBusErrorSource;
import com.azure.messaging.servicebus.ServiceBusException;
import com.azure.messaging.servicebus.ServiceBusMessage;
import com.azure.messaging.servicebus.ServiceBusReceivedMessage;
import com.azure.messaging.servicebus.ServiceBusTransactionContext;
import com.azure.messaging.servicebus.administration.models.CreateRuleOptions;
import com.azure.messaging.servicebus.administration.models.RuleProperties;
import com.azure.messaging.servicebus.models.ServiceBusReceiveMode;
import org.apache.qpid.proton.Proton;
import org.apache.qpid.proton.amqp.Binary;
import org.apache.qpid.proton.amqp.DescribedType;
import org.apache.qpid.proton.amqp.UnsignedInteger;
import org.apache.qpid.proton.amqp.messaging.AmqpValue;
import org.apache.qpid.proton.amqp.messaging.ApplicationProperties;
import org.apache.qpid.proton.amqp.transaction.TransactionalState;
import org.apache.qpid.proton.amqp.transport.DeliveryState;
import org.apache.qpid.proton.message.Message;
import reactor.core.Exceptions;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.SynchronousSink;

import java.nio.BufferOverflowException;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

import static com.azure.core.amqp.implementation.ClientConstants.ENTITY_PATH_KEY;
import static com.azure.core.util.FluxUtil.fluxError;
import static com.azure.core.util.FluxUtil.monoError;
import static com.azure.messaging.servicebus.implementation.ManagementConstants.OPERATION_ADD_RULE;
import static com.azure.messaging.servicebus.implementation.ManagementConstants.OPERATION_GET_RULES;
import static com.azure.messaging.servicebus.implementation.ManagementConstants.OPERATION_GET_SESSION_STATE;
import static com.azure.messaging.servicebus.implementation.ManagementConstants.OPERATION_PEEK;
import static com.azure.messaging.servicebus.implementation.ManagementConstants.OPERATION_REMOVE_RULE;
import static com.azure.messaging.servicebus.implementation.ManagementConstants.OPERATION_RENEW_SESSION_LOCK;
import static com.azure.messaging.servicebus.implementation.ManagementConstants.OPERATION_SCHEDULE_MESSAGE;
import static com.azure.messaging.servicebus.implementation.ManagementConstants.OPERATION_SET_SESSION_STATE;
import static com.azure.messaging.servicebus.implementation.ManagementConstants.OPERATION_UPDATE_DISPOSITION;
import static com.azure.messaging.servicebus.implementation.ServiceBusConstants.DISPOSITION_STATUS_KEY;
import static com.azure.messaging.servicebus.implementation.ServiceBusConstants.SESSION_ID_KEY;

/**
 * Channel responsible for Service Bus related metadata, peek  and management plane operations. Management plane
 * operations increasing quotas, etc.
 */
public class ManagementChannel implements ServiceBusManagementNode {
    private final MessageSerializer messageSerializer;
    private final TokenManager tokenManager;
    private final Duration operationTimeout;
    private final ChannelCacheWrapper channelCache;
    private final String fullyQualifiedNamespace;
    private final ClientLogger logger;
    private final String entityPath;

    private volatile boolean isDisposed;

    ManagementChannel(ChannelCacheWrapper channelCache, String fullyQualifiedNamespace, String entityPath,
        TokenManager tokenManager, MessageSerializer messageSerializer, Duration operationTimeout) {
        this.channelCache = Objects.requireNonNull(channelCache, "'channelCache' cannot be null.");
        this.fullyQualifiedNamespace
            = Objects.requireNonNull(fullyQualifiedNamespace, "'fullyQualifiedNamespace' cannot be null.");
        this.entityPath = Objects.requireNonNull(entityPath, "'entityPath' cannot be null.");

        Map<String, Object> loggingContext = new HashMap<>(1);
        loggingContext.put(ENTITY_PATH_KEY, entityPath);
        this.logger = new ClientLogger(ManagementChannel.class, loggingContext);

        this.messageSerializer = Objects.requireNonNull(messageSerializer, "'messageSerializer' cannot be null.");
        this.tokenManager = Objects.requireNonNull(tokenManager, "'tokenManager' cannot be null.");
        this.operationTimeout = Objects.requireNonNull(operationTimeout, "'operationTimeout' cannot be null.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mono<Void> cancelScheduledMessages(Iterable<Long> sequenceNumbers, String associatedLinkName) {
        final List<Long> numbers = new ArrayList<>();
        sequenceNumbers.forEach(s -> numbers.add(s));

        if (numbers.isEmpty()) {
            return Mono.empty();
        }

        return isAuthorized(ManagementConstants.OPERATION_CANCEL_SCHEDULED_MESSAGE)
            .then(channelCache.get().flatMap(channel -> {
                final Message requestMessage = createManagementMessage(
                    ManagementConstants.OPERATION_CANCEL_SCHEDULED_MESSAGE, associatedLinkName);

                final Long[] longs = numbers.toArray(new Long[0]);
                requestMessage
                    .setBody(new AmqpValue(Collections.singletonMap(ManagementConstants.SEQUENCE_NUMBERS, longs)));

                return sendWithVerify(channel, requestMessage, null);
            }))
            .then();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mono<byte[]> getSessionState(String sessionId, String associatedLinkName) {
        if (sessionId == null) {
            return monoError(logger, new NullPointerException("'sessionId' cannot be null."));
        } else if (sessionId.isEmpty()) {
            return monoError(logger, new IllegalArgumentException("'sessionId' cannot be blank."));
        }

        return isAuthorized(OPERATION_GET_SESSION_STATE).then(channelCache.get().flatMap(channel -> {
            final Message message = createManagementMessage(OPERATION_GET_SESSION_STATE, associatedLinkName);

            final Map<String, Object> body = new HashMap<>();
            body.put(ManagementConstants.SESSION_ID, sessionId);

            message.setBody(new AmqpValue(body));

            return sendWithVerify(channel, message, null);
        })).flatMap(response -> {
            final Object value = ((AmqpValue) response.getBody()).getValue();

            if (!(value instanceof Map)) {
                return monoError(logger,
                    new AmqpException(false,
                        String.format("Body not expected when renewing session. Id: %s. Value: %s", sessionId, value),
                        getErrorContext()));
            }

            @SuppressWarnings("unchecked")
            final Map<String, Object> map = (Map<String, Object>) value;
            final Object sessionState = map.get(ManagementConstants.SESSION_STATE);

            if (sessionState == null) {
                logger.atInfo().addKeyValue(SESSION_ID_KEY, sessionId).log("Does not have a session state.");
                return Mono.empty();
            }

            final byte[] state = ((Binary) sessionState).getArray();
            return Mono.just(state);
        });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mono<ServiceBusReceivedMessage> peek(long fromSequenceNumber, String sessionId, String associatedLinkName) {
        return peek(fromSequenceNumber, sessionId, associatedLinkName, 1).next();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Flux<ServiceBusReceivedMessage> peek(long fromSequenceNumber, String sessionId, String associatedLinkName,
        int maxMessages) {
        return isAuthorized(OPERATION_PEEK).thenMany(channelCache.get().flatMap(channel -> {
            final Message message = createManagementMessage(OPERATION_PEEK, associatedLinkName);

            // set mandatory properties on AMQP message body
            final Map<String, Object> requestBody = new HashMap<>();
            requestBody.put(ManagementConstants.FROM_SEQUENCE_NUMBER, fromSequenceNumber);
            requestBody.put(ManagementConstants.MESSAGE_COUNT_KEY, maxMessages);

            if (!CoreUtils.isNullOrEmpty(sessionId)) {
                requestBody.put(ManagementConstants.SESSION_ID, sessionId);
            }

            message.setBody(new AmqpValue(requestBody));

            return sendWithVerify(channel, message, null);
        }).flatMapMany(response -> {
            final List<ServiceBusReceivedMessage> messages
                = messageSerializer.deserializeList(response, ServiceBusReceivedMessage.class);

            return Flux.fromIterable(messages);
        }));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Flux<ServiceBusReceivedMessage> receiveDeferredMessages(ServiceBusReceiveMode receiveMode, String sessionId,
        String associatedLinkName, Iterable<Long> sequenceNumbers) {
        if (sequenceNumbers == null) {
            return fluxError(logger, new NullPointerException("'sequenceNumbers' cannot be null"));
        }

        final List<Long> numbers = new ArrayList<>();
        sequenceNumbers.forEach(s -> numbers.add(s));

        if (numbers.isEmpty()) {
            return Flux.empty();
        }

        return isAuthorized(ManagementConstants.OPERATION_RECEIVE_BY_SEQUENCE_NUMBER)
            .thenMany(channelCache.get().flatMap(channel -> {
                final Message message = createManagementMessage(
                    ManagementConstants.OPERATION_RECEIVE_BY_SEQUENCE_NUMBER, associatedLinkName);

                // set mandatory properties on AMQP message body
                final Map<String, Object> requestBodyMap = new HashMap<>();

                requestBodyMap.put(ManagementConstants.SEQUENCE_NUMBERS, numbers.toArray(new Long[0]));

                requestBodyMap.put(ManagementConstants.RECEIVER_SETTLE_MODE,
                    UnsignedInteger.valueOf(receiveMode == ServiceBusReceiveMode.RECEIVE_AND_DELETE ? 0 : 1));

                if (!CoreUtils.isNullOrEmpty(sessionId)) {
                    requestBodyMap.put(ManagementConstants.SESSION_ID, sessionId);
                }

                message.setBody(new AmqpValue(requestBodyMap));

                return sendWithVerify(channel, message, null);
            }).flatMapMany(amqpMessage -> {
                final List<ServiceBusReceivedMessage> messageList
                    = messageSerializer.deserializeList(amqpMessage, ServiceBusReceivedMessage.class);

                return Flux.fromIterable(messageList);
            }));
    }

    private Throwable mapError(Throwable throwable) {
        if (throwable instanceof AmqpException) {
            return new ServiceBusException(throwable, ServiceBusErrorSource.MANAGEMENT);
        }

        return throwable;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mono<OffsetDateTime> renewMessageLock(String lockToken, String associatedLinkName) {
        return isAuthorized(ManagementConstants.OPERATION_RENEW_LOCK).then(channelCache.get().flatMap(channel -> {
            final Message requestMessage
                = createManagementMessage(ManagementConstants.OPERATION_RENEW_LOCK, associatedLinkName);
            final Map<String, Object> requestBody = new HashMap<>();
            requestBody.put(ManagementConstants.LOCK_TOKENS_KEY, new UUID[] { UUID.fromString(lockToken) });
            requestMessage.setBody(new AmqpValue(requestBody));

            return sendWithVerify(channel, requestMessage, null);
        }).map(responseMessage -> {
            final List<OffsetDateTime> renewTimeList
                = messageSerializer.deserializeList(responseMessage, OffsetDateTime.class);
            if (CoreUtils.isNullOrEmpty(renewTimeList)) {
                throw logger.logExceptionAsError(Exceptions.propagate(new AmqpException(false, String
                    .format("Service bus response empty. Could not renew message with lock token: '%s'.", lockToken),
                    getErrorContext())));
            }

            return renewTimeList.get(0);
        }));
    }

    @Override
    public Mono<OffsetDateTime> renewSessionLock(String sessionId, String associatedLinkName) {
        if (sessionId == null) {
            return monoError(logger, new NullPointerException("'sessionId' cannot be null."));
        } else if (sessionId.isEmpty()) {
            return monoError(logger, new IllegalArgumentException("'sessionId' cannot be blank."));
        }

        return isAuthorized(OPERATION_RENEW_SESSION_LOCK).then(channelCache.get().flatMap(channel -> {
            final Message message = createManagementMessage(OPERATION_RENEW_SESSION_LOCK, associatedLinkName);

            final Map<String, Object> body = new HashMap<>();
            body.put(ManagementConstants.SESSION_ID, sessionId);

            message.setBody(new AmqpValue(body));

            return sendWithVerify(channel, message, null);
        })).map(response -> {
            final Object value = ((AmqpValue) response.getBody()).getValue();

            if (!(value instanceof Map)) {
                throw logger.logExceptionAsError(Exceptions.propagate(new AmqpException(false,
                    String.format("Body not expected when renewing session. Id: %s. Value: %s", sessionId, value),
                    getErrorContext())));
            }

            @SuppressWarnings("unchecked")
            final Map<String, Object> map = (Map<String, Object>) value;
            final Object expirationValue = map.get(ManagementConstants.EXPIRATION);

            if (!(expirationValue instanceof Date)) {
                throw logger.logExceptionAsError(Exceptions.propagate(new AmqpException(false,
                    String.format("Expiration is not of type Date when renewing session. Id: %s. Value: %s", sessionId,
                        expirationValue),
                    getErrorContext())));
            }
            return ((Date) expirationValue).toInstant().atOffset(ZoneOffset.UTC);
        });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Flux<Long> schedule(List<ServiceBusMessage> messages, OffsetDateTime scheduledEnqueueTime, int maxLinkSize,
        String associatedLinkName, ServiceBusTransactionContext transactionContext) {

        return isAuthorized(OPERATION_SCHEDULE_MESSAGE).thenMany(channelCache.get().flatMap(channel -> {

            final Collection<Map<String, Object>> messageList = new LinkedList<>();

            for (ServiceBusMessage message : messages) {
                message.setScheduledEnqueueTime(scheduledEnqueueTime);
                // Serialize the request.
                final Message amqpMessage = messageSerializer.serialize(message);

                // The maxsize allowed logic is from ReactorSender, this logic should be kept in sync.
                final int payloadSize = messageSerializer.getSize(amqpMessage);
                final int allocationSize
                    = Math.min(payloadSize + ManagementConstants.MAX_MESSAGING_AMQP_HEADER_SIZE_BYTES, maxLinkSize);
                final byte[] bytes = new byte[allocationSize];

                int encodedSize;
                try {
                    encodedSize = amqpMessage.encode(bytes, 0, allocationSize);
                } catch (BufferOverflowException exception) {
                    final String errorMessage = String.format(
                        "Error sending. Size of the payload exceeded maximum message size: %s kb", maxLinkSize / 1024);
                    final AmqpErrorContext errorContext = channel.getErrorContext();

                    return monoError(logger, new AmqpException(false, AmqpErrorCondition.LINK_PAYLOAD_SIZE_EXCEEDED,
                        errorMessage, exception, errorContext));
                }

                final Map<String, Object> messageEntry = new HashMap<>();
                messageEntry.put(ManagementConstants.MESSAGE, new Binary(bytes, 0, encodedSize));
                messageEntry.put(ManagementConstants.MESSAGE_ID, amqpMessage.getMessageId());

                final String sessionId = amqpMessage.getGroupId();
                if (!CoreUtils.isNullOrEmpty(sessionId)) {
                    messageEntry.put(ManagementConstants.SESSION_ID, sessionId);
                }

                final String partitionKey = message.getPartitionKey();
                if (!CoreUtils.isNullOrEmpty(partitionKey)) {
                    messageEntry.put(ManagementConstants.PARTITION_KEY, partitionKey);
                }

                messageList.add(messageEntry);
            }

            final Map<String, Object> requestBodyMap = new HashMap<>();
            requestBodyMap.put(ManagementConstants.MESSAGES, messageList);

            final Message requestMessage = createManagementMessage(OPERATION_SCHEDULE_MESSAGE, associatedLinkName);

            requestMessage.setBody(new AmqpValue(requestBodyMap));

            TransactionalState transactionalState = null;
            if (transactionContext != null && transactionContext.getTransactionId() != null) {
                transactionalState = new TransactionalState();
                transactionalState.setTxnId(Binary.create(transactionContext.getTransactionId()));
            }

            return sendWithVerify(channel, requestMessage, transactionalState);
        }).flatMapMany(response -> {
            final List<Long> sequenceNumbers = messageSerializer.deserializeList(response, Long.class);
            if (CoreUtils.isNullOrEmpty(sequenceNumbers)) {
                fluxError(logger,
                    new AmqpException(false,
                        String.format("Service Bus response was empty. Could not schedule message()s."),
                        getErrorContext()));
            }
            return Flux.fromIterable(sequenceNumbers);
        }));
    }

    @Override
    public Mono<Void> setSessionState(String sessionId, byte[] state, String associatedLinkName) {
        if (sessionId == null) {
            return monoError(logger, new NullPointerException("'sessionId' cannot be null."));
        } else if (sessionId.isEmpty()) {
            return monoError(logger, new IllegalArgumentException("'sessionId' cannot be blank."));
        }

        return isAuthorized(OPERATION_SET_SESSION_STATE).then(channelCache.get().flatMap(channel -> {
            final Message message = createManagementMessage(OPERATION_SET_SESSION_STATE, associatedLinkName);

            final Map<String, Object> body = new HashMap<>();
            body.put(ManagementConstants.SESSION_ID, sessionId);
            body.put(ManagementConstants.SESSION_STATE, state == null ? null : new Binary(state));

            message.setBody(new AmqpValue(body));

            return sendWithVerify(channel, message, null).then();
        }));
    }

    @Override
    public Mono<Void> updateDisposition(String lockToken, DispositionStatus dispositionStatus, String deadLetterReason,
        String deadLetterErrorDescription, Map<String, Object> propertiesToModify, String sessionId,
        String associatedLinkName, ServiceBusTransactionContext transactionContext) {

        return isAuthorized(OPERATION_UPDATE_DISPOSITION).then(channelCache.get().flatMap(channel -> {
            logger.atVerbose()
                .addKeyValue(ServiceBusConstants.LOCK_TOKEN_KEY, lockToken)
                .addKeyValue(DISPOSITION_STATUS_KEY, dispositionStatus)
                .addKeyValue(SESSION_ID_KEY, sessionId)
                .log("Scheduling disposition (via management node).");

            final Message message = createManagementMessage(OPERATION_UPDATE_DISPOSITION, associatedLinkName);

            final Map<String, Object> requestBody = new HashMap<>();
            requestBody.put(ManagementConstants.LOCK_TOKENS_KEY, new UUID[] { UUID.fromString(lockToken) });
            requestBody.put(ManagementConstants.DISPOSITION_STATUS_KEY, dispositionStatus.getValue());

            if (deadLetterReason != null) {
                requestBody.put(ManagementConstants.DEADLETTER_REASON_KEY, deadLetterReason);
            }

            if (deadLetterErrorDescription != null) {
                requestBody.put(ManagementConstants.DEADLETTER_DESCRIPTION_KEY, deadLetterErrorDescription);
            }

            if (propertiesToModify != null && propertiesToModify.size() > 0) {
                requestBody.put(ManagementConstants.PROPERTIES_TO_MODIFY_KEY, propertiesToModify);
            }

            if (!CoreUtils.isNullOrEmpty(sessionId)) {
                requestBody.put(ManagementConstants.SESSION_ID, sessionId);
            }

            message.setBody(new AmqpValue(requestBody));

            TransactionalState transactionalState = null;
            if (transactionContext != null && transactionContext.getTransactionId() != null) {
                transactionalState = new TransactionalState();
                transactionalState.setTxnId(Binary.create(transactionContext.getTransactionId()));
            }

            return sendWithVerify(channel, message, transactionalState);
        })).then();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mono<Void> createRule(String ruleName, CreateRuleOptions ruleOptions) {
        return isAuthorized(OPERATION_ADD_RULE).then(channelCache.get().flatMap(channel -> {
            final Message message = createManagementMessage(OPERATION_ADD_RULE, null);

            final Map<String, Object> body = new HashMap<>(2);
            body.put(ManagementConstants.RULE_NAME, ruleName);
            body.put(ManagementConstants.RULE_DESCRIPTION, MessageUtils.encodeRuleOptionToMap(ruleName, ruleOptions));

            message.setBody(new AmqpValue(body));

            return sendWithVerify(channel, message, null);
        })).then();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mono<Void> deleteRule(String ruleName) {
        return isAuthorized(OPERATION_REMOVE_RULE).then(channelCache.get().flatMap(channel -> {
            final Message message = createManagementMessage(OPERATION_REMOVE_RULE, null);

            final Map<String, Object> body = new HashMap<>(1);
            body.put(ManagementConstants.RULE_NAME, ruleName);

            message.setBody(new AmqpValue(body));

            return sendWithVerify(channel, message, null);
        })).then();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Flux<RuleProperties> listRules() {
        return isAuthorized(OPERATION_GET_RULES).then(channelCache.get().flatMap(channel -> {
            final Message message = createManagementMessage(OPERATION_GET_RULES, null);

            final Map<String, Object> body = new HashMap<>(2);
            body.put(ManagementConstants.SKIP, 0);
            body.put(ManagementConstants.TOP, Integer.MAX_VALUE);

            message.setBody(new AmqpValue(body));

            return sendWithVerify(channel, message, null);
        })).flatMapMany(response -> {
            AmqpResponseCode statusCode = RequestResponseUtils.getStatusCode(response);

            List<RuleProperties> list;
            if (statusCode == AmqpResponseCode.OK) {
                list = getRuleProperties((AmqpValue) response.getBody());
            } else if (statusCode == AmqpResponseCode.NO_CONTENT) {
                list = Collections.emptyList();
            } else {
                throw logger.logExceptionAsWarning(
                    new AmqpException(true, "Get rules response error. Could not get rules.", getErrorContext()));
            }

            return Flux.fromIterable(list);
        });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() {
        if (isDisposed) {
            return;
        }

        isDisposed = true;
        tokenManager.close();
    }

    private Mono<Message> sendWithVerify(RequestResponseChannel channel, Message message, DeliveryState deliveryState) {
        return channel.sendWithAck(message, deliveryState).handle((Message response, SynchronousSink<Message> sink) -> {
            if (RequestResponseUtils.isSuccessful(response)) {
                sink.next(response);
                return;
            }

            final AmqpResponseCode statusCode = RequestResponseUtils.getStatusCode(response);

            if (statusCode == AmqpResponseCode.NO_CONTENT) {
                sink.next(response);
                return;
            }

            final String errorCondition = RequestResponseUtils.getErrorCondition(response);

            if (statusCode == AmqpResponseCode.NOT_FOUND) {
                final AmqpErrorCondition amqpErrorCondition = AmqpErrorCondition.fromString(errorCondition);

                if (amqpErrorCondition == AmqpErrorCondition.MESSAGE_NOT_FOUND) {
                    logger.info("There was no matching message found.");
                    sink.next(response);
                    return;
                } else if (amqpErrorCondition == AmqpErrorCondition.SESSION_NOT_FOUND) {
                    logger.info("There was no matching session found.");
                    sink.next(response);
                    return;
                }
            }

            final String statusDescription = RequestResponseUtils.getStatusDescription(response);
            final Throwable throwable
                = ExceptionUtil.toException(errorCondition, statusDescription, channel.getErrorContext());

            logger.atWarning()
                .addKeyValue("status", statusCode)
                .addKeyValue("description", statusDescription)
                .addKeyValue("condition", errorCondition)
                .log("Operation not successful.");

            sink.error(throwable);
        }).switchIfEmpty(errorIfEmpty(channel)).onErrorMap(this::mapError);
    }

    private <T> Mono<T> errorIfEmpty(RequestResponseChannel channel) {
        return Mono.error(() -> {
            String error = String.format("entityPath[%s] No response received from management channel.", entityPath);
            return logger.logExceptionAsWarning(new AmqpException(true, error, channel.getErrorContext()));
        });
    }

    private Mono<Void> isAuthorized(String operation) {
        return tokenManager.getAuthorizationResults().onErrorMap(this::mapError).next().handle((response, sink) -> {
            if (response != AmqpResponseCode.ACCEPTED && response != AmqpResponseCode.OK) {
                final String message = String.format(
                    "User does not have authorization to perform operation " + "[%s] on entity [%s]. Response: [%s]",
                    operation, entityPath, response);
                final Throwable exc
                    = new AmqpException(false, AmqpErrorCondition.UNAUTHORIZED_ACCESS, message, getErrorContext());
                sink.error(new ServiceBusException(exc, ServiceBusErrorSource.MANAGEMENT));
            } else {
                sink.complete();
            }
        });
    }

    /**
     * Creates an AMQP message with the required application properties.
     *
     * @param operation Management operation to perform (ie. peek, update-disposition, etc.)
     * @param associatedLinkName Name of the open receive link that first received the message.
     * @return An AMQP message with the required headers.
     */
    private Message createManagementMessage(String operation, String associatedLinkName) {
        final Duration serverTimeout = MessageUtils.adjustServerTimeout(operationTimeout);
        final Map<String, Object> applicationProperties = new HashMap<>();
        applicationProperties.put(ManagementConstants.MANAGEMENT_OPERATION_KEY, operation);
        applicationProperties.put(ManagementConstants.SERVER_TIMEOUT, serverTimeout.toMillis());

        if (!CoreUtils.isNullOrEmpty(associatedLinkName)) {
            applicationProperties.put(ManagementConstants.ASSOCIATED_LINK_NAME_KEY, associatedLinkName);
        }

        final Message message = Proton.message();
        message.setApplicationProperties(new ApplicationProperties(applicationProperties));

        return message;
    }

    private AmqpErrorContext getErrorContext() {
        return new SessionErrorContext(fullyQualifiedNamespace, entityPath);
    }

    /**
     * Get {@link RuleProperties} from message body.
     *
     * @param messageBody A message body which is {@link AmqpValue} type.
     * @return A collection of {@link RuleProperties}.
     *
     * @throws UnsupportedOperationException if client cannot support filter with descriptor in message body.
     */
    private List<RuleProperties> getRuleProperties(AmqpValue messageBody) {
        if (messageBody == null) {
            return Collections.emptyList();
        }

        @SuppressWarnings("unchecked")
        List<Map<String, DescribedType>> rules
            = ((Map<String, List<Map<String, DescribedType>>>) messageBody.getValue()).get(ManagementConstants.RULES);
        if (rules == null) {
            return Collections.emptyList();
        }

        List<RuleProperties> ruleProperties = new ArrayList<>();
        for (Map<String, DescribedType> rule : rules) {
            DescribedType ruleDescription = rule.get(ManagementConstants.RULE_DESCRIPTION);
            ruleProperties.add(MessageUtils.decodeRuleDescribedType(ruleDescription));
        }

        return ruleProperties;
    }
}
