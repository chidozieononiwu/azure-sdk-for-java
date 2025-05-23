// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Product-group link entity properties.
 */
@Fluent
public final class ProductGroupLinkContractProperties implements JsonSerializable<ProductGroupLinkContractProperties> {
    /*
     * Full resource Id of a group.
     */
    private String groupId;

    /**
     * Creates an instance of ProductGroupLinkContractProperties class.
     */
    public ProductGroupLinkContractProperties() {
    }

    /**
     * Get the groupId property: Full resource Id of a group.
     * 
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: Full resource Id of a group.
     * 
     * @param groupId the groupId value to set.
     * @return the ProductGroupLinkContractProperties object itself.
     */
    public ProductGroupLinkContractProperties withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (groupId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property groupId in model ProductGroupLinkContractProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ProductGroupLinkContractProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("groupId", this.groupId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProductGroupLinkContractProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProductGroupLinkContractProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ProductGroupLinkContractProperties.
     */
    public static ProductGroupLinkContractProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProductGroupLinkContractProperties deserializedProductGroupLinkContractProperties
                = new ProductGroupLinkContractProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("groupId".equals(fieldName)) {
                    deserializedProductGroupLinkContractProperties.groupId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProductGroupLinkContractProperties;
        });
    }
}
