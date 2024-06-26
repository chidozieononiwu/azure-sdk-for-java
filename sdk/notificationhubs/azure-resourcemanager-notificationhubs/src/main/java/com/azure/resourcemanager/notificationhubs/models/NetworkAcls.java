// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A collection of network authorization rules.
 */
@Fluent
public final class NetworkAcls {
    /*
     * List of IP rules.
     */
    @JsonProperty(value = "ipRules")
    private List<IpRule> ipRules;

    /*
     * A default (public Internet) network authorization rule, which contains rights if no other network rule matches.
     */
    @JsonProperty(value = "publicNetworkRule")
    private PublicInternetAuthorizationRule publicNetworkRule;

    /**
     * Creates an instance of NetworkAcls class.
     */
    public NetworkAcls() {
    }

    /**
     * Get the ipRules property: List of IP rules.
     * 
     * @return the ipRules value.
     */
    public List<IpRule> ipRules() {
        return this.ipRules;
    }

    /**
     * Set the ipRules property: List of IP rules.
     * 
     * @param ipRules the ipRules value to set.
     * @return the NetworkAcls object itself.
     */
    public NetworkAcls withIpRules(List<IpRule> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

    /**
     * Get the publicNetworkRule property: A default (public Internet) network authorization rule, which contains
     * rights if no other network rule matches.
     * 
     * @return the publicNetworkRule value.
     */
    public PublicInternetAuthorizationRule publicNetworkRule() {
        return this.publicNetworkRule;
    }

    /**
     * Set the publicNetworkRule property: A default (public Internet) network authorization rule, which contains
     * rights if no other network rule matches.
     * 
     * @param publicNetworkRule the publicNetworkRule value to set.
     * @return the NetworkAcls object itself.
     */
    public NetworkAcls withPublicNetworkRule(PublicInternetAuthorizationRule publicNetworkRule) {
        this.publicNetworkRule = publicNetworkRule;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipRules() != null) {
            ipRules().forEach(e -> e.validate());
        }
        if (publicNetworkRule() != null) {
            publicNetworkRule().validate();
        }
    }
}
