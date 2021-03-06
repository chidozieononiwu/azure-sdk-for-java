// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.fluent.models.Get2ItemsItem;
import com.azure.resourcemanager.authorization.fluent.models.Get3ItemsItem;
import com.azure.resourcemanager.authorization.fluent.models.Get6ItemsItem;
import com.azure.resourcemanager.authorization.fluent.models.Get7ItemsItem;
import com.azure.resourcemanager.authorization.fluent.models.Get8ItemsItem;
import com.azure.resourcemanager.authorization.fluent.models.MicrosoftGraphOrgContactInner;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ContactsOrgContactsClient. */
public interface ContactsOrgContactsClient {
    /**
     * Get entities from contacts.
     *
     * @param consistencyLevel Indicates the requested consistency level.
     * @param top Show only the first n items.
     * @param skip Skip the first n items.
     * @param search Search items by search phrases.
     * @param filter Filter items by property values.
     * @param count Include count of items.
     * @param orderby Order items by property values.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entities from contacts.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<MicrosoftGraphOrgContactInner> listOrgContactAsync(
        String consistencyLevel,
        Integer top,
        Integer skip,
        String search,
        String filter,
        Boolean count,
        List<Get6ItemsItem> orderby,
        List<Get7ItemsItem> select,
        List<Get8ItemsItem> expand);

    /**
     * Get entities from contacts.
     *
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entities from contacts.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<MicrosoftGraphOrgContactInner> listOrgContactAsync();

    /**
     * Get entities from contacts.
     *
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entities from contacts.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MicrosoftGraphOrgContactInner> listOrgContact();

    /**
     * Get entities from contacts.
     *
     * @param consistencyLevel Indicates the requested consistency level.
     * @param top Show only the first n items.
     * @param skip Skip the first n items.
     * @param search Search items by search phrases.
     * @param filter Filter items by property values.
     * @param count Include count of items.
     * @param orderby Order items by property values.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entities from contacts.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MicrosoftGraphOrgContactInner> listOrgContact(
        String consistencyLevel,
        Integer top,
        Integer skip,
        String search,
        String filter,
        Boolean count,
        List<Get6ItemsItem> orderby,
        List<Get7ItemsItem> select,
        List<Get8ItemsItem> expand,
        Context context);

    /**
     * Add new entity to contacts.
     *
     * @param body New entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an Azure Active Directory object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<MicrosoftGraphOrgContactInner>> createOrgContactWithResponseAsync(MicrosoftGraphOrgContactInner body);

    /**
     * Add new entity to contacts.
     *
     * @param body New entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an Azure Active Directory object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MicrosoftGraphOrgContactInner> createOrgContactAsync(MicrosoftGraphOrgContactInner body);

    /**
     * Add new entity to contacts.
     *
     * @param body New entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an Azure Active Directory object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MicrosoftGraphOrgContactInner createOrgContact(MicrosoftGraphOrgContactInner body);

    /**
     * Add new entity to contacts.
     *
     * @param body New entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an Azure Active Directory object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MicrosoftGraphOrgContactInner> createOrgContactWithResponse(
        MicrosoftGraphOrgContactInner body, Context context);

    /**
     * Get entity from contacts by key.
     *
     * @param orgContactId key: id of orgContact.
     * @param consistencyLevel Indicates the requested consistency level.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity from contacts by key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<MicrosoftGraphOrgContactInner>> getOrgContactWithResponseAsync(
        String orgContactId, String consistencyLevel, List<Get2ItemsItem> select, List<Get3ItemsItem> expand);

    /**
     * Get entity from contacts by key.
     *
     * @param orgContactId key: id of orgContact.
     * @param consistencyLevel Indicates the requested consistency level.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity from contacts by key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MicrosoftGraphOrgContactInner> getOrgContactAsync(
        String orgContactId, String consistencyLevel, List<Get2ItemsItem> select, List<Get3ItemsItem> expand);

    /**
     * Get entity from contacts by key.
     *
     * @param orgContactId key: id of orgContact.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity from contacts by key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MicrosoftGraphOrgContactInner> getOrgContactAsync(String orgContactId);

    /**
     * Get entity from contacts by key.
     *
     * @param orgContactId key: id of orgContact.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity from contacts by key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MicrosoftGraphOrgContactInner getOrgContact(String orgContactId);

    /**
     * Get entity from contacts by key.
     *
     * @param orgContactId key: id of orgContact.
     * @param consistencyLevel Indicates the requested consistency level.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity from contacts by key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MicrosoftGraphOrgContactInner> getOrgContactWithResponse(
        String orgContactId,
        String consistencyLevel,
        List<Get2ItemsItem> select,
        List<Get3ItemsItem> expand,
        Context context);

    /**
     * Update entity in contacts.
     *
     * @param orgContactId key: id of orgContact.
     * @param body New property values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> updateOrgContactWithResponseAsync(String orgContactId, MicrosoftGraphOrgContactInner body);

    /**
     * Update entity in contacts.
     *
     * @param orgContactId key: id of orgContact.
     * @param body New property values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> updateOrgContactAsync(String orgContactId, MicrosoftGraphOrgContactInner body);

    /**
     * Update entity in contacts.
     *
     * @param orgContactId key: id of orgContact.
     * @param body New property values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void updateOrgContact(String orgContactId, MicrosoftGraphOrgContactInner body);

    /**
     * Update entity in contacts.
     *
     * @param orgContactId key: id of orgContact.
     * @param body New property values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> updateOrgContactWithResponse(
        String orgContactId, MicrosoftGraphOrgContactInner body, Context context);

    /**
     * Delete entity from contacts.
     *
     * @param orgContactId key: id of orgContact.
     * @param ifMatch ETag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteOrgContactWithResponseAsync(String orgContactId, String ifMatch);

    /**
     * Delete entity from contacts.
     *
     * @param orgContactId key: id of orgContact.
     * @param ifMatch ETag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteOrgContactAsync(String orgContactId, String ifMatch);

    /**
     * Delete entity from contacts.
     *
     * @param orgContactId key: id of orgContact.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteOrgContactAsync(String orgContactId);

    /**
     * Delete entity from contacts.
     *
     * @param orgContactId key: id of orgContact.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteOrgContact(String orgContactId);

    /**
     * Delete entity from contacts.
     *
     * @param orgContactId key: id of orgContact.
     * @param ifMatch ETag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteOrgContactWithResponse(String orgContactId, String ifMatch, Context context);
}
