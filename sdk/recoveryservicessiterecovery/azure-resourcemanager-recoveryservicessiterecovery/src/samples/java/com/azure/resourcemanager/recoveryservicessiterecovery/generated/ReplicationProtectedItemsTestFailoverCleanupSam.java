// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.resourcemanager.recoveryservicessiterecovery.models.TestFailoverCleanupInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TestFailoverCleanupInputProperties;

/**
 * Samples for ReplicationProtectedItems TestFailoverCleanup.
 */
public final class ReplicationProtectedItemsTestFailoverCleanupSam {
    /*
     * x-ms-original-file:
     * specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2025-01-01/examples
     * /ReplicationProtectedItems_TestFailoverCleanup.json
     */
    /**
     * Sample code: Execute test failover cleanup.
     * 
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void
        executeTestFailoverCleanup(com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationProtectedItems()
            .testFailoverCleanup("resourceGroupPS1", "vault1", "cloud1", "cloud_6d224fc6-f326-5d35-96de-fbf51efb3179",
                "f8491e4f-817a-40dd-a90c-af773978c75b",
                new TestFailoverCleanupInput()
                    .withProperties(new TestFailoverCleanupInputProperties().withComments("Test Failover Cleanup")),
                com.azure.core.util.Context.NONE);
    }
}
