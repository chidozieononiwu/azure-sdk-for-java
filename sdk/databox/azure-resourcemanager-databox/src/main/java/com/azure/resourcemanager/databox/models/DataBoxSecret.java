// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The secrets related to a DataBox. */
@Immutable
public final class DataBoxSecret {
    /*
     * Serial number of the assigned device.
     */
    @JsonProperty(value = "deviceSerialNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String deviceSerialNumber;

    /*
     * Password for out of the box experience on device.
     */
    @JsonProperty(value = "devicePassword", access = JsonProperty.Access.WRITE_ONLY)
    private String devicePassword;

    /*
     * Network configuration of the appliance.
     */
    @JsonProperty(value = "networkConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<ApplianceNetworkConfiguration> networkConfigurations;

    /*
     * The base 64 encoded public key to authenticate with the device
     */
    @JsonProperty(value = "encodedValidationCertPubKey", access = JsonProperty.Access.WRITE_ONLY)
    private String encodedValidationCertPubKey;

    /*
     * Per account level access credentials.
     */
    @JsonProperty(value = "accountCredentialDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<AccountCredentialDetails> accountCredentialDetails;

    /** Creates an instance of DataBoxSecret class. */
    public DataBoxSecret() {
    }

    /**
     * Get the deviceSerialNumber property: Serial number of the assigned device.
     *
     * @return the deviceSerialNumber value.
     */
    public String deviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    /**
     * Get the devicePassword property: Password for out of the box experience on device.
     *
     * @return the devicePassword value.
     */
    public String devicePassword() {
        return this.devicePassword;
    }

    /**
     * Get the networkConfigurations property: Network configuration of the appliance.
     *
     * @return the networkConfigurations value.
     */
    public List<ApplianceNetworkConfiguration> networkConfigurations() {
        return this.networkConfigurations;
    }

    /**
     * Get the encodedValidationCertPubKey property: The base 64 encoded public key to authenticate with the device.
     *
     * @return the encodedValidationCertPubKey value.
     */
    public String encodedValidationCertPubKey() {
        return this.encodedValidationCertPubKey;
    }

    /**
     * Get the accountCredentialDetails property: Per account level access credentials.
     *
     * @return the accountCredentialDetails value.
     */
    public List<AccountCredentialDetails> accountCredentialDetails() {
        return this.accountCredentialDetails;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkConfigurations() != null) {
            networkConfigurations().forEach(e -> e.validate());
        }
        if (accountCredentialDetails() != null) {
            accountCredentialDetails().forEach(e -> e.validate());
        }
    }
}
