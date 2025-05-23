// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/**
 * Samples for PolicyRestriction Get.
 */
public final class PolicyRestrictionGetSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementGetPolicyRestriction.json
     */
    /**
     * Sample code: ApiManagementGetPolicyRestriction.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void
        apiManagementGetPolicyRestriction(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.policyRestrictions()
            .getWithResponse("rg1", "apimService1", "policyRestriction1", com.azure.core.util.Context.NONE);
    }
}
