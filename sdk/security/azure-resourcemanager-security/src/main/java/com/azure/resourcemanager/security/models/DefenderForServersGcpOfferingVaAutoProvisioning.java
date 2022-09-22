// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Vulnerability Assessment autoprovisioning configuration. */
@Fluent
public final class DefenderForServersGcpOfferingVaAutoProvisioning {
    /*
     * Is Vulnerability Assessment auto provisioning enabled
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * configuration for Vulnerability Assessment autoprovisioning
     */
    @JsonProperty(value = "configuration")
    private DefenderForServersGcpOfferingVaAutoProvisioningConfiguration configuration;

    /**
     * Get the enabled property: Is Vulnerability Assessment auto provisioning enabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Is Vulnerability Assessment auto provisioning enabled.
     *
     * @param enabled the enabled value to set.
     * @return the DefenderForServersGcpOfferingVaAutoProvisioning object itself.
     */
    public DefenderForServersGcpOfferingVaAutoProvisioning withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the configuration property: configuration for Vulnerability Assessment autoprovisioning.
     *
     * @return the configuration value.
     */
    public DefenderForServersGcpOfferingVaAutoProvisioningConfiguration configuration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: configuration for Vulnerability Assessment autoprovisioning.
     *
     * @param configuration the configuration value to set.
     * @return the DefenderForServersGcpOfferingVaAutoProvisioning object itself.
     */
    public DefenderForServersGcpOfferingVaAutoProvisioning withConfiguration(
        DefenderForServersGcpOfferingVaAutoProvisioningConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (configuration() != null) {
            configuration().validate();
        }
    }
}