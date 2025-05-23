// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.loganalytics.fluent.models.SavedSearchInner;
import com.azure.resourcemanager.loganalytics.fluent.models.SavedSearchesListResultInner;

/**
 * An instance of this class provides access to all the operations defined in SavedSearchesClient.
 */
public interface SavedSearchesClient {
    /**
     * Deletes the specified saved search in a given workspace.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String workspaceName, String savedSearchId,
        Context context);

    /**
     * Deletes the specified saved search in a given workspace.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, String savedSearchId);

    /**
     * Creates or updates a saved search for a given workspace.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @param parameters The parameters required to save a search.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return value object for saved search results along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SavedSearchInner> createOrUpdateWithResponse(String resourceGroupName, String workspaceName,
        String savedSearchId, SavedSearchInner parameters, Context context);

    /**
     * Creates or updates a saved search for a given workspace.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @param parameters The parameters required to save a search.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return value object for saved search results.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SavedSearchInner createOrUpdate(String resourceGroupName, String workspaceName, String savedSearchId,
        SavedSearchInner parameters);

    /**
     * Gets the specified saved search for a given workspace.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified saved search for a given workspace along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SavedSearchInner> getWithResponse(String resourceGroupName, String workspaceName, String savedSearchId,
        Context context);

    /**
     * Gets the specified saved search for a given workspace.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified saved search for a given workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SavedSearchInner get(String resourceGroupName, String workspaceName, String savedSearchId);

    /**
     * Gets the saved searches for a given Log Analytics Workspace.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the saved searches for a given Log Analytics Workspace along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SavedSearchesListResultInner> listByWorkspaceWithResponse(String resourceGroupName, String workspaceName,
        Context context);

    /**
     * Gets the saved searches for a given Log Analytics Workspace.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the saved searches for a given Log Analytics Workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SavedSearchesListResultInner listByWorkspace(String resourceGroupName, String workspaceName);
}
