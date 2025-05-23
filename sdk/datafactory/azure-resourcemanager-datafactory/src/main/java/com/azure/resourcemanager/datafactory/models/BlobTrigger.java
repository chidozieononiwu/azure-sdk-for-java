// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.BlobTriggerTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Trigger that runs every time the selected Blob container changes.
 */
@Fluent
public final class BlobTrigger extends MultiplePipelineTrigger {
    /*
     * Trigger type.
     */
    private String type = "BlobTrigger";

    /*
     * Blob Trigger properties.
     */
    private BlobTriggerTypeProperties innerTypeProperties = new BlobTriggerTypeProperties();

    /**
     * Creates an instance of BlobTrigger class.
     */
    public BlobTrigger() {
    }

    /**
     * Get the type property: Trigger type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Blob Trigger properties.
     * 
     * @return the innerTypeProperties value.
     */
    BlobTriggerTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlobTrigger withPipelines(List<TriggerPipelineReference> pipelines) {
        super.withPipelines(pipelines);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlobTrigger withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlobTrigger withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the folderPath property: The path of the container/folder that will trigger the pipeline.
     * 
     * @return the folderPath value.
     */
    public String folderPath() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().folderPath();
    }

    /**
     * Set the folderPath property: The path of the container/folder that will trigger the pipeline.
     * 
     * @param folderPath the folderPath value to set.
     * @return the BlobTrigger object itself.
     */
    public BlobTrigger withFolderPath(String folderPath) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new BlobTriggerTypeProperties();
        }
        this.innerTypeProperties().withFolderPath(folderPath);
        return this;
    }

    /**
     * Get the maxConcurrency property: The max number of parallel files to handle when it is triggered.
     * 
     * @return the maxConcurrency value.
     */
    public int maxConcurrency() {
        return this.innerTypeProperties() == null ? 0 : this.innerTypeProperties().maxConcurrency();
    }

    /**
     * Set the maxConcurrency property: The max number of parallel files to handle when it is triggered.
     * 
     * @param maxConcurrency the maxConcurrency value to set.
     * @return the BlobTrigger object itself.
     */
    public BlobTrigger withMaxConcurrency(int maxConcurrency) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new BlobTriggerTypeProperties();
        }
        this.innerTypeProperties().withMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * Get the linkedService property: The Azure Storage linked service reference.
     * 
     * @return the linkedService value.
     */
    public LinkedServiceReference linkedService() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().linkedService();
    }

    /**
     * Set the linkedService property: The Azure Storage linked service reference.
     * 
     * @param linkedService the linkedService value to set.
     * @return the BlobTrigger object itself.
     */
    public BlobTrigger withLinkedService(LinkedServiceReference linkedService) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new BlobTriggerTypeProperties();
        }
        this.innerTypeProperties().withLinkedService(linkedService);
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
                .log(
                    new IllegalArgumentException("Missing required property innerTypeProperties in model BlobTrigger"));
        } else {
            innerTypeProperties().validate();
        }
        if (pipelines() != null) {
            pipelines().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BlobTrigger.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeArrayField("annotations", annotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeArrayField("pipelines", pipelines(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("typeProperties", this.innerTypeProperties);
        jsonWriter.writeStringField("type", this.type);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BlobTrigger from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BlobTrigger if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BlobTrigger.
     */
    public static BlobTrigger fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BlobTrigger deserializedBlobTrigger = new BlobTrigger();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedBlobTrigger.withDescription(reader.getString());
                } else if ("runtimeState".equals(fieldName)) {
                    deserializedBlobTrigger.withRuntimeState(TriggerRuntimeState.fromString(reader.getString()));
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedBlobTrigger.withAnnotations(annotations);
                } else if ("pipelines".equals(fieldName)) {
                    List<TriggerPipelineReference> pipelines
                        = reader.readArray(reader1 -> TriggerPipelineReference.fromJson(reader1));
                    deserializedBlobTrigger.withPipelines(pipelines);
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedBlobTrigger.innerTypeProperties = BlobTriggerTypeProperties.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedBlobTrigger.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedBlobTrigger.withAdditionalProperties(additionalProperties);

            return deserializedBlobTrigger;
        });
    }
}
