// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** This object is returned from a successful Get Daily Indices call. */
@Immutable
public final class DailyIndicesResult {
    /*
     * A list of all daily indices for the queried location.
     */
    @JsonProperty(value = "results", access = JsonProperty.Access.WRITE_ONLY)
    private List<DailyIndex> results;

    /** Set default DailyIndicesResult constructor to private */
    private DailyIndicesResult() {}

    /**
     * Get the results property: A list of all daily indices for the queried location.
     *
     * @return the results value.
     */
    public List<DailyIndex> getResults() {
        return this.results;
    }
}
