// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Grants.
 */
public interface Grants {
    /**
     * Get a list of grants that Microsoft has provided.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of grants that Microsoft has provided as paginated response with {@link PagedIterable}.
     */
    PagedIterable<GrantDetails> listAll();

    /**
     * Get a list of grants that Microsoft has provided.
     * 
     * @param includeAllocatedBudget May be used to include information about budget that has been allocated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of grants that Microsoft has provided as paginated response with {@link PagedIterable}.
     */
    PagedIterable<GrantDetails> listAll(Boolean includeAllocatedBudget, Context context);

    /**
     * Get details for a specific grant linked to the provided billing account and billing profile.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details for a specific grant linked to the provided billing account and billing profile as paginated
     * response with {@link PagedIterable}.
     */
    PagedIterable<GrantDetails> list(String billingAccountName, String billingProfileName);

    /**
     * Get details for a specific grant linked to the provided billing account and billing profile.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param includeAllocatedBudget May be used to include information about budget that has been allocated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details for a specific grant linked to the provided billing account and billing profile as paginated
     * response with {@link PagedIterable}.
     */
    PagedIterable<GrantDetails> list(String billingAccountName, String billingProfileName,
        Boolean includeAllocatedBudget, Context context);

    /**
     * Get details for a specific grant linked to the provided billing account and billing profile.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param includeAllocatedBudget May be used to include information about budget that has been allocated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details for a specific grant linked to the provided billing account and billing profile along with
     * {@link Response}.
     */
    Response<GrantDetails> getWithResponse(String billingAccountName, String billingProfileName,
        Boolean includeAllocatedBudget, Context context);

    /**
     * Get details for a specific grant linked to the provided billing account and billing profile.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details for a specific grant linked to the provided billing account and billing profile.
     */
    GrantDetails get(String billingAccountName, String billingProfileName);
}
