// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters for creating multiple virtual machines as a single action. */
@Fluent
public final class BulkCreationParameters {
    /*
     * The number of virtual machine instances to create.
     */
    @JsonProperty(value = "instanceCount")
    private Integer instanceCount;

    /** Creates an instance of BulkCreationParameters class. */
    public BulkCreationParameters() {
    }

    /**
     * Get the instanceCount property: The number of virtual machine instances to create.
     *
     * @return the instanceCount value.
     */
    public Integer instanceCount() {
        return this.instanceCount;
    }

    /**
     * Set the instanceCount property: The number of virtual machine instances to create.
     *
     * @param instanceCount the instanceCount value to set.
     * @return the BulkCreationParameters object itself.
     */
    public BulkCreationParameters withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
