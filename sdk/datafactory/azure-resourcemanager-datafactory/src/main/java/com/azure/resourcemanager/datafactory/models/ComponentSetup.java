// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.LicensedComponentSetupTypeProperties;
import java.io.IOException;

/**
 * The custom setup of installing 3rd party components.
 */
@Fluent
public final class ComponentSetup extends CustomSetupBase {
    /*
     * The type of custom setup.
     */
    private String type = "ComponentSetup";

    /*
     * Install 3rd party component type properties.
     */
    private LicensedComponentSetupTypeProperties innerTypeProperties = new LicensedComponentSetupTypeProperties();

    /**
     * Creates an instance of ComponentSetup class.
     */
    public ComponentSetup() {
    }

    /**
     * Get the type property: The type of custom setup.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Install 3rd party component type properties.
     * 
     * @return the innerTypeProperties value.
     */
    LicensedComponentSetupTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * Get the componentName property: The name of the 3rd party component.
     * 
     * @return the componentName value.
     */
    public String componentName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().componentName();
    }

    /**
     * Set the componentName property: The name of the 3rd party component.
     * 
     * @param componentName the componentName value to set.
     * @return the ComponentSetup object itself.
     */
    public ComponentSetup withComponentName(String componentName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new LicensedComponentSetupTypeProperties();
        }
        this.innerTypeProperties().withComponentName(componentName);
        return this;
    }

    /**
     * Get the licenseKey property: The license key to activate the component.
     * 
     * @return the licenseKey value.
     */
    public SecretBase licenseKey() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().licenseKey();
    }

    /**
     * Set the licenseKey property: The license key to activate the component.
     * 
     * @param licenseKey the licenseKey value to set.
     * @return the ComponentSetup object itself.
     */
    public ComponentSetup withLicenseKey(SecretBase licenseKey) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new LicensedComponentSetupTypeProperties();
        }
        this.innerTypeProperties().withLicenseKey(licenseKey);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerTypeProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerTypeProperties in model ComponentSetup"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ComponentSetup.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("typeProperties", this.innerTypeProperties);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ComponentSetup from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ComponentSetup if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ComponentSetup.
     */
    public static ComponentSetup fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ComponentSetup deserializedComponentSetup = new ComponentSetup();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("typeProperties".equals(fieldName)) {
                    deserializedComponentSetup.innerTypeProperties
                        = LicensedComponentSetupTypeProperties.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedComponentSetup.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedComponentSetup;
        });
    }
}
