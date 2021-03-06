/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation.RecoveryPointsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing RecoveryPoints.
 */
public interface RecoveryPoints extends HasInner<RecoveryPointsInner> {
    /**
     * Provides the information of the backed up data identified using RecoveryPointID. This is an asynchronous operation. To know the status of the operation, call the GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with backed up item.
     * @param containerName Container name associated with backed up item.
     * @param protectedItemName Backed up item name whose backup data needs to be fetched.
     * @param recoveryPointId RecoveryPointID represents the backed up data to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecoveryPointResource> getAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String recoveryPointId);

    /**
     * Lists the backup copies for the backed up item.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up item.
     * @param containerName Container name associated with the backed up item.
     * @param protectedItemName Backed up item whose backup copies are to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecoveryPointResource> listAsync(final String vaultName, final String resourceGroupName, final String fabricName, final String containerName, final String protectedItemName);

}
