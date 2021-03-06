// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Linked service for Salesforce. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Salesforce")
@JsonFlatten
@Fluent
public class SalesforceLinkedService extends LinkedService {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SalesforceLinkedService.class);

    /*
     * The URL of Salesforce instance. Default is
     * 'https://login.salesforce.com'. To copy data from sandbox, specify
     * 'https://test.salesforce.com'. To copy data from custom domain, specify,
     * for example, 'https://[domain].my.salesforce.com'. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.environmentUrl")
    private Object environmentUrl;

    /*
     * The username for Basic authentication of the Salesforce instance. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /*
     * The password for Basic authentication of the Salesforce instance.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The security token is optional to remotely access Salesforce instance.
     */
    @JsonProperty(value = "typeProperties.securityToken")
    private SecretBase securityToken;

    /*
     * The Salesforce API version used in ADF. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.apiVersion")
    private Object apiVersion;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the environmentUrl property: The URL of Salesforce instance. Default is 'https://login.salesforce.com'. To
     * copy data from sandbox, specify 'https://test.salesforce.com'. To copy data from custom domain, specify, for
     * example, 'https://[domain].my.salesforce.com'. Type: string (or Expression with resultType string).
     *
     * @return the environmentUrl value.
     */
    public Object environmentUrl() {
        return this.environmentUrl;
    }

    /**
     * Set the environmentUrl property: The URL of Salesforce instance. Default is 'https://login.salesforce.com'. To
     * copy data from sandbox, specify 'https://test.salesforce.com'. To copy data from custom domain, specify, for
     * example, 'https://[domain].my.salesforce.com'. Type: string (or Expression with resultType string).
     *
     * @param environmentUrl the environmentUrl value to set.
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService withEnvironmentUrl(Object environmentUrl) {
        this.environmentUrl = environmentUrl;
        return this;
    }

    /**
     * Get the username property: The username for Basic authentication of the Salesforce instance. Type: string (or
     * Expression with resultType string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: The username for Basic authentication of the Salesforce instance. Type: string (or
     * Expression with resultType string).
     *
     * @param username the username value to set.
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password for Basic authentication of the Salesforce instance.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: The password for Basic authentication of the Salesforce instance.
     *
     * @param password the password value to set.
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the securityToken property: The security token is optional to remotely access Salesforce instance.
     *
     * @return the securityToken value.
     */
    public SecretBase securityToken() {
        return this.securityToken;
    }

    /**
     * Set the securityToken property: The security token is optional to remotely access Salesforce instance.
     *
     * @param securityToken the securityToken value to set.
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService withSecurityToken(SecretBase securityToken) {
        this.securityToken = securityToken;
        return this;
    }

    /**
     * Get the apiVersion property: The Salesforce API version used in ADF. Type: string (or Expression with resultType
     * string).
     *
     * @return the apiVersion value.
     */
    public Object apiVersion() {
        return this.apiVersion;
    }

    /**
     * Set the apiVersion property: The Salesforce API version used in ADF. Type: string (or Expression with resultType
     * string).
     *
     * @param apiVersion the apiVersion value to set.
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService withApiVersion(Object apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
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
        if (password() != null) {
            password().validate();
        }
        if (securityToken() != null) {
            securityToken().validate();
        }
    }
}
