// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devhub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The fields needed for OIDC with GitHub. */
@Fluent
public final class GitHubWorkflowProfileOidcCredentials {
    /*
     * Azure Application Client ID
     */
    @JsonProperty(value = "azureClientId")
    private String azureClientId;

    /*
     * Azure Directory (tenant) ID
     */
    @JsonProperty(value = "azureTenantId")
    private String azureTenantId;

    /**
     * Get the azureClientId property: Azure Application Client ID.
     *
     * @return the azureClientId value.
     */
    public String azureClientId() {
        return this.azureClientId;
    }

    /**
     * Set the azureClientId property: Azure Application Client ID.
     *
     * @param azureClientId the azureClientId value to set.
     * @return the GitHubWorkflowProfileOidcCredentials object itself.
     */
    public GitHubWorkflowProfileOidcCredentials withAzureClientId(String azureClientId) {
        this.azureClientId = azureClientId;
        return this;
    }

    /**
     * Get the azureTenantId property: Azure Directory (tenant) ID.
     *
     * @return the azureTenantId value.
     */
    public String azureTenantId() {
        return this.azureTenantId;
    }

    /**
     * Set the azureTenantId property: Azure Directory (tenant) ID.
     *
     * @param azureTenantId the azureTenantId value to set.
     * @return the GitHubWorkflowProfileOidcCredentials object itself.
     */
    public GitHubWorkflowProfileOidcCredentials withAzureTenantId(String azureTenantId) {
        this.azureTenantId = azureTenantId;
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