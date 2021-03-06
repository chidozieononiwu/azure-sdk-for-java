/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.compute.v2020_10_01_preview.ResourceInstanceViewStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The instance view of the role instance.
 */
public class RoleInstanceInstanceViewInner {
    /**
     * The Update Domain.
     */
    @JsonProperty(value = "platformUpdateDomain", access = JsonProperty.Access.WRITE_ONLY)
    private Integer platformUpdateDomain;

    /**
     * The Fault Domain.
     */
    @JsonProperty(value = "platformFaultDomain", access = JsonProperty.Access.WRITE_ONLY)
    private Integer platformFaultDomain;

    /**
     * Specifies a unique identifier generated internally for the cloud service
     * associated with this role instance. &lt;br /&gt;&lt;br /&gt; NOTE: If
     * you are using Azure Diagnostics extension, this property can be used as
     * 'DeploymentId' for querying details.
     */
    @JsonProperty(value = "privateId", access = JsonProperty.Access.WRITE_ONLY)
    private String privateId;

    /**
     * The statuses property.
     */
    @JsonProperty(value = "statuses", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceInstanceViewStatus> statuses;

    /**
     * Get the Update Domain.
     *
     * @return the platformUpdateDomain value
     */
    public Integer platformUpdateDomain() {
        return this.platformUpdateDomain;
    }

    /**
     * Get the Fault Domain.
     *
     * @return the platformFaultDomain value
     */
    public Integer platformFaultDomain() {
        return this.platformFaultDomain;
    }

    /**
     * Get specifies a unique identifier generated internally for the cloud service associated with this role instance. &lt;br /&gt;&lt;br /&gt; NOTE: If you are using Azure Diagnostics extension, this property can be used as 'DeploymentId' for querying details.
     *
     * @return the privateId value
     */
    public String privateId() {
        return this.privateId;
    }

    /**
     * Get the statuses value.
     *
     * @return the statuses value
     */
    public List<ResourceInstanceViewStatus> statuses() {
        return this.statuses;
    }

}
