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

/** Linked service for CosmosDB (MongoDB API) data source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CosmosDbMongoDbApi")
@JsonFlatten
@Fluent
public class CosmosDbMongoDbApiLinkedService extends LinkedService {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CosmosDbMongoDbApiLinkedService.class);

    /*
     * The CosmosDB (MongoDB API) connection string. Type: string, SecureString
     * or AzureKeyVaultSecretReference. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.connectionString", required = true)
    private Object connectionString;

    /*
     * The name of the CosmosDB (MongoDB API) database that you want to access.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.database", required = true)
    private Object database;

    /**
     * Get the connectionString property: The CosmosDB (MongoDB API) connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The CosmosDB (MongoDB API) connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set.
     * @return the CosmosDbMongoDbApiLinkedService object itself.
     */
    public CosmosDbMongoDbApiLinkedService withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the database property: The name of the CosmosDB (MongoDB API) database that you want to access. Type: string
     * (or Expression with resultType string).
     *
     * @return the database value.
     */
    public Object database() {
        return this.database;
    }

    /**
     * Set the database property: The name of the CosmosDB (MongoDB API) database that you want to access. Type: string
     * (or Expression with resultType string).
     *
     * @param database the database value to set.
     * @return the CosmosDbMongoDbApiLinkedService object itself.
     */
    public CosmosDbMongoDbApiLinkedService withDatabase(Object database) {
        this.database = database;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbMongoDbApiLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbMongoDbApiLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbMongoDbApiLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbMongoDbApiLinkedService withAnnotations(List<Object> annotations) {
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
        if (connectionString() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property connectionString in model CosmosDbMongoDbApiLinkedService"));
        }
        if (database() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property database in model CosmosDbMongoDbApiLinkedService"));
        }
    }
}
