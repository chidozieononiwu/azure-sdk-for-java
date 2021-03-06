/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes each OS upgrade on the Virtual Machine Scale Set.
 */
public class UpgradeOperationHistoricalStatusInfoProperties {
    /**
     * Information about the overall status of the upgrade operation.
     */
    @JsonProperty(value = "runningStatus", access = JsonProperty.Access.WRITE_ONLY)
    private UpgradeOperationHistoryStatus runningStatus;

    /**
     * Counts of the VMs in each state.
     */
    @JsonProperty(value = "progress", access = JsonProperty.Access.WRITE_ONLY)
    private RollingUpgradeProgressInfo progress;

    /**
     * Error Details for this upgrade if there are any.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private ApiError error;

    /**
     * Invoker of the Upgrade Operation. Possible values include: 'Unknown',
     * 'User', 'Platform'.
     */
    @JsonProperty(value = "startedBy", access = JsonProperty.Access.WRITE_ONLY)
    private UpgradeOperationInvoker startedBy;

    /**
     * Image Reference details.
     */
    @JsonProperty(value = "targetImageReference", access = JsonProperty.Access.WRITE_ONLY)
    private ImageReference targetImageReference;

    /**
     * Information about OS rollback if performed.
     */
    @JsonProperty(value = "rollbackInfo", access = JsonProperty.Access.WRITE_ONLY)
    private RollbackStatusInfo rollbackInfo;

    /**
     * Get information about the overall status of the upgrade operation.
     *
     * @return the runningStatus value
     */
    public UpgradeOperationHistoryStatus runningStatus() {
        return this.runningStatus;
    }

    /**
     * Get counts of the VMs in each state.
     *
     * @return the progress value
     */
    public RollingUpgradeProgressInfo progress() {
        return this.progress;
    }

    /**
     * Get error Details for this upgrade if there are any.
     *
     * @return the error value
     */
    public ApiError error() {
        return this.error;
    }

    /**
     * Get invoker of the Upgrade Operation. Possible values include: 'Unknown', 'User', 'Platform'.
     *
     * @return the startedBy value
     */
    public UpgradeOperationInvoker startedBy() {
        return this.startedBy;
    }

    /**
     * Get image Reference details.
     *
     * @return the targetImageReference value
     */
    public ImageReference targetImageReference() {
        return this.targetImageReference;
    }

    /**
     * Get information about OS rollback if performed.
     *
     * @return the rollbackInfo value
     */
    public RollbackStatusInfo rollbackInfo() {
        return this.rollbackInfo;
    }

}
