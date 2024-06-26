// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties that make up the expected REST response. */
@Fluent
public final class RestResponse {
    /*
     * The HTTP status codes expected in a successful health check response. The response is expected to match one of
     * the given status codes. If no expected status codes are provided, default expected status code is 200 OK.
     */
    @JsonProperty(value = "successStatusCodes")
    private List<String> successStatusCodes;

    /*
     * The regular expressions to match the response content with.
     */
    @JsonProperty(value = "regex")
    private RestResponseRegex regex;

    /** Creates an instance of RestResponse class. */
    public RestResponse() {
    }

    /**
     * Get the successStatusCodes property: The HTTP status codes expected in a successful health check response. The
     * response is expected to match one of the given status codes. If no expected status codes are provided, default
     * expected status code is 200 OK.
     *
     * @return the successStatusCodes value.
     */
    public List<String> successStatusCodes() {
        return this.successStatusCodes;
    }

    /**
     * Set the successStatusCodes property: The HTTP status codes expected in a successful health check response. The
     * response is expected to match one of the given status codes. If no expected status codes are provided, default
     * expected status code is 200 OK.
     *
     * @param successStatusCodes the successStatusCodes value to set.
     * @return the RestResponse object itself.
     */
    public RestResponse withSuccessStatusCodes(List<String> successStatusCodes) {
        this.successStatusCodes = successStatusCodes;
        return this;
    }

    /**
     * Get the regex property: The regular expressions to match the response content with.
     *
     * @return the regex value.
     */
    public RestResponseRegex regex() {
        return this.regex;
    }

    /**
     * Set the regex property: The regular expressions to match the response content with.
     *
     * @param regex the regex value to set.
     * @return the RestResponse object itself.
     */
    public RestResponse withRegex(RestResponseRegex regex) {
        this.regex = regex;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (regex() != null) {
            regex().validate();
        }
    }
}
