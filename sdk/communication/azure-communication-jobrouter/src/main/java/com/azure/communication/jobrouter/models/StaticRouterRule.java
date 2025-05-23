// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.communication.jobrouter.implementation.JsonMergePatchHelper;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * A rule providing static rules that always return the same result, regardless of input.
 */
@Fluent
public final class StaticRouterRule extends RouterRule {

    /*
     * The type discriminator describing a sub-type of RouterRule
     */
    @Generated
    private RouterRuleKind kind = RouterRuleKind.STATIC;

    /*
     * The static value this rule always returns. Values must be primitive values - number, string, boolean.
     */
    @Generated
    private RouterValue value;

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    /**
     * Creates an instance of StaticRouterRule class.
     */
    @Generated
    public StaticRouterRule() {
    }

    /**
     * Get the kind property: The type discriminator describing a sub-type of RouterRule.
     *
     * @return the kind value.
     */
    @Generated
    @Override
    public RouterRuleKind getKind() {
        return this.kind;
    }

    /**
     * Get the value property: The static value this rule always returns. Values must be primitive values - number,
     * string, boolean.
     *
     * @return the value value.
     */
    @Generated
    public RouterValue getValue() {
        return this.value;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (JsonMergePatchHelper.getRouterRuleAccessor().isJsonMergePatch(this)) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
            if (this.value != null) {
                jsonWriter.writeJsonField("value", this.value);
            }
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind.toString());
        if (updatedProperties.contains("value")) {
            if (this.value == null) {
                jsonWriter.writeNullField("value");
            } else {
                jsonWriter.writeJsonField("value", this.value);
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StaticRouterRule from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticRouterRule if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the StaticRouterRule.
     */
    @Generated
    public static StaticRouterRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StaticRouterRule deserializedStaticRouterRule = new StaticRouterRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("kind".equals(fieldName)) {
                    deserializedStaticRouterRule.kind = RouterRuleKind.fromString(reader.getString());
                } else if ("value".equals(fieldName)) {
                    deserializedStaticRouterRule.value = RouterValue.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedStaticRouterRule;
        });
    }

    /**
     * Set the value property: The static value this rule always returns. Values must be primitive values - number,
     * string, boolean.
     *
     * @param value the value value to set.
     * @return the StaticRouterRule object itself.
     */
    @Generated
    public StaticRouterRule setValue(RouterValue value) {
        this.value = value;
        this.updatedProperties.add("value");
        return this;
    }
}
