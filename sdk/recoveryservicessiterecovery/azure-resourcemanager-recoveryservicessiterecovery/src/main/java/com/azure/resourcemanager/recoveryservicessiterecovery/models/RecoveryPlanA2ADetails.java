// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Recovery plan A2A specific details.
 */
@Fluent
public final class RecoveryPlanA2ADetails extends RecoveryPlanProviderSpecificDetails {
    /*
     * Gets the Instance type.
     */
    private String instanceType = "A2A";

    /*
     * The primary zone.
     */
    private String primaryZone;

    /*
     * The recovery zone.
     */
    private String recoveryZone;

    /*
     * The primary extended location.
     */
    private ExtendedLocation primaryExtendedLocation;

    /*
     * The recovery extended location.
     */
    private ExtendedLocation recoveryExtendedLocation;

    /**
     * Creates an instance of RecoveryPlanA2ADetails class.
     */
    public RecoveryPlanA2ADetails() {
    }

    /**
     * Get the instanceType property: Gets the Instance type.
     * 
     * @return the instanceType value.
     */
    @Override
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Get the primaryZone property: The primary zone.
     * 
     * @return the primaryZone value.
     */
    public String primaryZone() {
        return this.primaryZone;
    }

    /**
     * Set the primaryZone property: The primary zone.
     * 
     * @param primaryZone the primaryZone value to set.
     * @return the RecoveryPlanA2ADetails object itself.
     */
    public RecoveryPlanA2ADetails withPrimaryZone(String primaryZone) {
        this.primaryZone = primaryZone;
        return this;
    }

    /**
     * Get the recoveryZone property: The recovery zone.
     * 
     * @return the recoveryZone value.
     */
    public String recoveryZone() {
        return this.recoveryZone;
    }

    /**
     * Set the recoveryZone property: The recovery zone.
     * 
     * @param recoveryZone the recoveryZone value to set.
     * @return the RecoveryPlanA2ADetails object itself.
     */
    public RecoveryPlanA2ADetails withRecoveryZone(String recoveryZone) {
        this.recoveryZone = recoveryZone;
        return this;
    }

    /**
     * Get the primaryExtendedLocation property: The primary extended location.
     * 
     * @return the primaryExtendedLocation value.
     */
    public ExtendedLocation primaryExtendedLocation() {
        return this.primaryExtendedLocation;
    }

    /**
     * Set the primaryExtendedLocation property: The primary extended location.
     * 
     * @param primaryExtendedLocation the primaryExtendedLocation value to set.
     * @return the RecoveryPlanA2ADetails object itself.
     */
    public RecoveryPlanA2ADetails withPrimaryExtendedLocation(ExtendedLocation primaryExtendedLocation) {
        this.primaryExtendedLocation = primaryExtendedLocation;
        return this;
    }

    /**
     * Get the recoveryExtendedLocation property: The recovery extended location.
     * 
     * @return the recoveryExtendedLocation value.
     */
    public ExtendedLocation recoveryExtendedLocation() {
        return this.recoveryExtendedLocation;
    }

    /**
     * Set the recoveryExtendedLocation property: The recovery extended location.
     * 
     * @param recoveryExtendedLocation the recoveryExtendedLocation value to set.
     * @return the RecoveryPlanA2ADetails object itself.
     */
    public RecoveryPlanA2ADetails withRecoveryExtendedLocation(ExtendedLocation recoveryExtendedLocation) {
        this.recoveryExtendedLocation = recoveryExtendedLocation;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (primaryExtendedLocation() != null) {
            primaryExtendedLocation().validate();
        }
        if (recoveryExtendedLocation() != null) {
            recoveryExtendedLocation().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("instanceType", this.instanceType);
        jsonWriter.writeStringField("primaryZone", this.primaryZone);
        jsonWriter.writeStringField("recoveryZone", this.recoveryZone);
        jsonWriter.writeJsonField("primaryExtendedLocation", this.primaryExtendedLocation);
        jsonWriter.writeJsonField("recoveryExtendedLocation", this.recoveryExtendedLocation);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RecoveryPlanA2ADetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RecoveryPlanA2ADetails if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RecoveryPlanA2ADetails.
     */
    public static RecoveryPlanA2ADetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RecoveryPlanA2ADetails deserializedRecoveryPlanA2ADetails = new RecoveryPlanA2ADetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instanceType".equals(fieldName)) {
                    deserializedRecoveryPlanA2ADetails.instanceType = reader.getString();
                } else if ("primaryZone".equals(fieldName)) {
                    deserializedRecoveryPlanA2ADetails.primaryZone = reader.getString();
                } else if ("recoveryZone".equals(fieldName)) {
                    deserializedRecoveryPlanA2ADetails.recoveryZone = reader.getString();
                } else if ("primaryExtendedLocation".equals(fieldName)) {
                    deserializedRecoveryPlanA2ADetails.primaryExtendedLocation = ExtendedLocation.fromJson(reader);
                } else if ("recoveryExtendedLocation".equals(fieldName)) {
                    deserializedRecoveryPlanA2ADetails.recoveryExtendedLocation = ExtendedLocation.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRecoveryPlanA2ADetails;
        });
    }
}
