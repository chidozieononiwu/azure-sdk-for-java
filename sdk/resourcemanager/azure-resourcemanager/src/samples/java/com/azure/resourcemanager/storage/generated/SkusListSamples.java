// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

/**
 * Samples for Skus List.
 */
public final class SkusListSamples {
    /*
     * x-ms-original-file:
     * specification/storage/resource-manager/Microsoft.Storage/stable/2024-01-01/examples/SKUList.json
     */
    /**
     * Sample code: SkuList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void skuList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts().manager().serviceClient().getSkus().list(com.azure.core.util.Context.NONE);
    }
}
