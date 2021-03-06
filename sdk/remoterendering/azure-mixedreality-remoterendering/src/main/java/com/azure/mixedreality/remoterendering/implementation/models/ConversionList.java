// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.mixedreality.remoterendering.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of conversions. */
@Fluent
public final class ConversionList {
    /*
     * The list of conversions.
     */
    @JsonProperty(value = "conversions", required = true)
    private List<Conversion> conversions;

    /*
     * If more conversions are available this field will contain a URL where
     * the next batch of conversions can be requested. This URL will need the
     * same authentication as all calls to the Azure Remote Rendering API.
     */
    @JsonProperty(value = "@nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of ConversionList class.
     *
     * @param conversions the conversions value to set.
     */
    @JsonCreator
    public ConversionList(@JsonProperty(value = "conversions", required = true) List<Conversion> conversions) {
        this.conversions = conversions;
    }

    /**
     * Get the conversions property: The list of conversions.
     *
     * @return the conversions value.
     */
    public List<Conversion> getConversions() {
        return this.conversions;
    }

    /**
     * Get the nextLink property: If more conversions are available this field will contain a URL where the next batch
     * of conversions can be requested. This URL will need the same authentication as all calls to the Azure Remote
     * Rendering API.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }
}
