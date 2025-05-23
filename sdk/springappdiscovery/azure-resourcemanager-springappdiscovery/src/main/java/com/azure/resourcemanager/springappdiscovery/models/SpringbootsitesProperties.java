// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.springappdiscovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The springbootsites resource definition.
 */
@Fluent
public final class SpringbootsitesProperties implements JsonSerializable<SpringbootsitesProperties> {
    /*
     * The master site ID from Azure Migrate.
     */
    private String masterSiteId;

    /*
     * The migrate project ID from Azure Migrate.
     */
    private String migrateProjectId;

    /*
     * The resource provisioning state.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of SpringbootsitesProperties class.
     */
    public SpringbootsitesProperties() {
    }

    /**
     * Get the masterSiteId property: The master site ID from Azure Migrate.
     * 
     * @return the masterSiteId value.
     */
    public String masterSiteId() {
        return this.masterSiteId;
    }

    /**
     * Set the masterSiteId property: The master site ID from Azure Migrate.
     * 
     * @param masterSiteId the masterSiteId value to set.
     * @return the SpringbootsitesProperties object itself.
     */
    public SpringbootsitesProperties withMasterSiteId(String masterSiteId) {
        this.masterSiteId = masterSiteId;
        return this;
    }

    /**
     * Get the migrateProjectId property: The migrate project ID from Azure Migrate.
     * 
     * @return the migrateProjectId value.
     */
    public String migrateProjectId() {
        return this.migrateProjectId;
    }

    /**
     * Set the migrateProjectId property: The migrate project ID from Azure Migrate.
     * 
     * @param migrateProjectId the migrateProjectId value to set.
     * @return the SpringbootsitesProperties object itself.
     */
    public SpringbootsitesProperties withMigrateProjectId(String migrateProjectId) {
        this.migrateProjectId = migrateProjectId;
        return this;
    }

    /**
     * Get the provisioningState property: The resource provisioning state.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The resource provisioning state.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the SpringbootsitesProperties object itself.
     */
    public SpringbootsitesProperties withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("masterSiteId", this.masterSiteId);
        jsonWriter.writeStringField("migrateProjectId", this.migrateProjectId);
        jsonWriter.writeStringField("provisioningState",
            this.provisioningState == null ? null : this.provisioningState.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SpringbootsitesProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SpringbootsitesProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SpringbootsitesProperties.
     */
    public static SpringbootsitesProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SpringbootsitesProperties deserializedSpringbootsitesProperties = new SpringbootsitesProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("masterSiteId".equals(fieldName)) {
                    deserializedSpringbootsitesProperties.masterSiteId = reader.getString();
                } else if ("migrateProjectId".equals(fieldName)) {
                    deserializedSpringbootsitesProperties.migrateProjectId = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedSpringbootsitesProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSpringbootsitesProperties;
        });
    }
}
