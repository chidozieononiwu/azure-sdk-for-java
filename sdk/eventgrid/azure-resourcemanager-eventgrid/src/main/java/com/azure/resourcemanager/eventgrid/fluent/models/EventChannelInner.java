// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.models.EventChannelDestination;
import com.azure.resourcemanager.eventgrid.models.EventChannelFilter;
import com.azure.resourcemanager.eventgrid.models.EventChannelProvisioningState;
import com.azure.resourcemanager.eventgrid.models.EventChannelSource;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicReadinessState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Event Channel. */
@JsonFlatten
@Fluent
public class EventChannelInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventChannelInner.class);

    /*
     * The system metadata relating to Event Channel resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Source of the event channel. This represents a unique resource in the
     * partner's resource model.
     */
    @JsonProperty(value = "properties.source")
    private EventChannelSource source;

    /*
     * Represents the destination of an event channel.
     */
    @JsonProperty(value = "properties.destination")
    private EventChannelDestination destination;

    /*
     * Provisioning state of the event channel.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private EventChannelProvisioningState provisioningState;

    /*
     * The readiness state of the corresponding partner topic.
     */
    @JsonProperty(value = "properties.partnerTopicReadinessState", access = JsonProperty.Access.WRITE_ONLY)
    private PartnerTopicReadinessState partnerTopicReadinessState;

    /*
     * Expiration time of the event channel. If this timer expires while the
     * corresponding partner topic is never activated,
     * the event channel and corresponding partner topic are deleted.
     */
    @JsonProperty(value = "properties.expirationTimeIfNotActivatedUtc")
    private OffsetDateTime expirationTimeIfNotActivatedUtc;

    /*
     * Information about the filter for the event channel.
     */
    @JsonProperty(value = "properties.filter")
    private EventChannelFilter filter;

    /*
     * Friendly description about the topic. This can be set by the
     * publisher/partner to show custom description for the customer partner
     * topic.
     * This will be helpful to remove any ambiguity of the origin of creation
     * of the partner topic for the customer.
     */
    @JsonProperty(value = "properties.partnerTopicFriendlyDescription")
    private String partnerTopicFriendlyDescription;

    /**
     * Get the systemData property: The system metadata relating to Event Channel resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the source property: Source of the event channel. This represents a unique resource in the partner's resource
     * model.
     *
     * @return the source value.
     */
    public EventChannelSource source() {
        return this.source;
    }

    /**
     * Set the source property: Source of the event channel. This represents a unique resource in the partner's resource
     * model.
     *
     * @param source the source value to set.
     * @return the EventChannelInner object itself.
     */
    public EventChannelInner withSource(EventChannelSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the destination property: Represents the destination of an event channel.
     *
     * @return the destination value.
     */
    public EventChannelDestination destination() {
        return this.destination;
    }

    /**
     * Set the destination property: Represents the destination of an event channel.
     *
     * @param destination the destination value to set.
     * @return the EventChannelInner object itself.
     */
    public EventChannelInner withDestination(EventChannelDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the event channel.
     *
     * @return the provisioningState value.
     */
    public EventChannelProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the partnerTopicReadinessState property: The readiness state of the corresponding partner topic.
     *
     * @return the partnerTopicReadinessState value.
     */
    public PartnerTopicReadinessState partnerTopicReadinessState() {
        return this.partnerTopicReadinessState;
    }

    /**
     * Get the expirationTimeIfNotActivatedUtc property: Expiration time of the event channel. If this timer expires
     * while the corresponding partner topic is never activated, the event channel and corresponding partner topic are
     * deleted.
     *
     * @return the expirationTimeIfNotActivatedUtc value.
     */
    public OffsetDateTime expirationTimeIfNotActivatedUtc() {
        return this.expirationTimeIfNotActivatedUtc;
    }

    /**
     * Set the expirationTimeIfNotActivatedUtc property: Expiration time of the event channel. If this timer expires
     * while the corresponding partner topic is never activated, the event channel and corresponding partner topic are
     * deleted.
     *
     * @param expirationTimeIfNotActivatedUtc the expirationTimeIfNotActivatedUtc value to set.
     * @return the EventChannelInner object itself.
     */
    public EventChannelInner withExpirationTimeIfNotActivatedUtc(OffsetDateTime expirationTimeIfNotActivatedUtc) {
        this.expirationTimeIfNotActivatedUtc = expirationTimeIfNotActivatedUtc;
        return this;
    }

    /**
     * Get the filter property: Information about the filter for the event channel.
     *
     * @return the filter value.
     */
    public EventChannelFilter filter() {
        return this.filter;
    }

    /**
     * Set the filter property: Information about the filter for the event channel.
     *
     * @param filter the filter value to set.
     * @return the EventChannelInner object itself.
     */
    public EventChannelInner withFilter(EventChannelFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the partnerTopicFriendlyDescription property: Friendly description about the topic. This can be set by the
     * publisher/partner to show custom description for the customer partner topic. This will be helpful to remove any
     * ambiguity of the origin of creation of the partner topic for the customer.
     *
     * @return the partnerTopicFriendlyDescription value.
     */
    public String partnerTopicFriendlyDescription() {
        return this.partnerTopicFriendlyDescription;
    }

    /**
     * Set the partnerTopicFriendlyDescription property: Friendly description about the topic. This can be set by the
     * publisher/partner to show custom description for the customer partner topic. This will be helpful to remove any
     * ambiguity of the origin of creation of the partner topic for the customer.
     *
     * @param partnerTopicFriendlyDescription the partnerTopicFriendlyDescription value to set.
     * @return the EventChannelInner object itself.
     */
    public EventChannelInner withPartnerTopicFriendlyDescription(String partnerTopicFriendlyDescription) {
        this.partnerTopicFriendlyDescription = partnerTopicFriendlyDescription;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() != null) {
            source().validate();
        }
        if (destination() != null) {
            destination().validate();
        }
        if (filter() != null) {
            filter().validate();
        }
    }
}
