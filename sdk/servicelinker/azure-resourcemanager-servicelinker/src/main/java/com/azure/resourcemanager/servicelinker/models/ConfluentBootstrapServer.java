// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The service properties when target service type is ConfluentBootstrapServer. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ConfluentBootstrapServer")
@Fluent
public final class ConfluentBootstrapServer extends TargetServiceBase {
    /*
     * The endpoint of service.
     */
    @JsonProperty(value = "endpoint")
    private String endpoint;

    /**
     * Get the endpoint property: The endpoint of service.
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: The endpoint of service.
     *
     * @param endpoint the endpoint value to set.
     * @return the ConfluentBootstrapServer object itself.
     */
    public ConfluentBootstrapServer withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
