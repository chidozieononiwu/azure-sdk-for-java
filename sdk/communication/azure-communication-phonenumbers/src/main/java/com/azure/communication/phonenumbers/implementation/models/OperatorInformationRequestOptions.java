// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents options to modify a search request for operator information. */
@Fluent
public final class OperatorInformationRequestOptions {
    /*
     * Includes the fields operatorDetails, numberType, and isoCountryCode in
     * the response.  Please note: use of this option will result in additional
     * costs
     */
    @JsonProperty(value = "includeAdditionalPhoneAndOperatorDetails")
    private Boolean includeAdditionalPhoneAndOperatorDetails;

    /**
     * Get the includeAdditionalPhoneAndOperatorDetails property: Includes the fields operatorDetails, numberType, and
     * isoCountryCode in the response. Please note: use of this option will result in additional costs.
     *
     * @return the includeAdditionalPhoneAndOperatorDetails value.
     */
    public Boolean isIncludeAdditionalPhoneAndOperatorDetails() {
        return this.includeAdditionalPhoneAndOperatorDetails;
    }

    /**
     * Set the includeAdditionalPhoneAndOperatorDetails property: Includes the fields operatorDetails, numberType, and
     * isoCountryCode in the response. Please note: use of this option will result in additional costs.
     *
     * @param includeAdditionalPhoneAndOperatorDetails the includeAdditionalPhoneAndOperatorDetails value to set.
     * @return the OperatorInformationRequestOptions object itself.
     */
    public OperatorInformationRequestOptions setIncludeAdditionalPhoneAndOperatorDetails(
            Boolean includeAdditionalPhoneAndOperatorDetails) {
        this.includeAdditionalPhoneAndOperatorDetails = includeAdditionalPhoneAndOperatorDetails;
        return this;
    }
}
