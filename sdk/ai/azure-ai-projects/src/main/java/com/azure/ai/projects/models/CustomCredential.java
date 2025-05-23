// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.projects.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Custom credential definition.
 */
@Immutable
public final class CustomCredential extends BaseCredentials {

    /*
     * The type of credential used by the connection
     */
    @Generated
    private CredentialType type = CredentialType.CUSTOM;

    /*
     * The credential type
     */
    @Generated
    private Map<String, String> keys;

    /**
     * Creates an instance of CustomCredential class.
     */
    @Generated
    private CustomCredential() {
    }

    /**
     * Get the type property: The type of credential used by the connection.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public CredentialType getType() {
        return this.type;
    }

    /**
     * Get the keys property: The credential type.
     *
     * @return the keys value.
     */
    @Generated
    public Map<String, String> getKeys() {
        return this.keys;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomCredential from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomCredential if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CustomCredential.
     */
    @Generated
    public static CustomCredential fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CustomCredential deserializedCustomCredential = new CustomCredential();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("keys".equals(fieldName)) {
                    Map<String, String> keys = reader.readMap(reader1 -> reader1.getString());
                    deserializedCustomCredential.keys = keys;
                } else if ("type".equals(fieldName)) {
                    deserializedCustomCredential.type = CredentialType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedCustomCredential;
        });
    }
}
