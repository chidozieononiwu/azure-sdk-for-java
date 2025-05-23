// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.neonpostgres.generated;

/**
 * Samples for Branches Get.
 */
public final class BranchesGetSamples {
    /*
     * x-ms-original-file: 2025-03-01/Branches_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: Branches_Get_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void branchesGetMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.branches()
            .getWithResponse("rgneon", "test-org", "entity-name", "entity-name", com.azure.core.util.Context.NONE);
    }
}
