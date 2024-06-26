// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageactions.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.storageactions.fluent.models.StorageTaskReportInstanceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Fetch Storage Tasks Run Summary.
 */
@Immutable
public final class StorageTaskReportSummary {
    /*
     * Gets storage tasks run result summary.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<StorageTaskReportInstanceInner> value;

    /*
     * Request URL that can be used to query next page of storage task run results summary. Returned when the number of
     * run instances and summary reports exceed maximum page size.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of StorageTaskReportSummary class.
     */
    public StorageTaskReportSummary() {
    }

    /**
     * Get the value property: Gets storage tasks run result summary.
     * 
     * @return the value value.
     */
    public List<StorageTaskReportInstanceInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Request URL that can be used to query next page of storage task run results summary.
     * Returned when the number of run instances and summary reports exceed maximum page size.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
