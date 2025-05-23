// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties for high level summary of firmware analysis results.
 */
@Immutable
public final class FirmwareSummary extends SummaryResourceProperties {
    /*
     * The type of summary.
     */
    private SummaryType summaryType = SummaryType.FIRMWARE;

    /*
     * Total extracted size of the firmware in bytes.
     */
    private Long extractedSize;

    /*
     * Firmware file size in bytes.
     */
    private Long fileSize;

    /*
     * Extracted file count.
     */
    private Long extractedFileCount;

    /*
     * Components count.
     */
    private Long componentCount;

    /*
     * Binary count
     */
    private Long binaryCount;

    /*
     * Time used for analysis
     */
    private Long analysisTimeSeconds;

    /*
     * The number of root file systems found.
     */
    private Long rootFileSystems;

    /**
     * Creates an instance of FirmwareSummary class.
     */
    private FirmwareSummary() {
    }

    /**
     * Get the summaryType property: The type of summary.
     * 
     * @return the summaryType value.
     */
    @Override
    public SummaryType summaryType() {
        return this.summaryType;
    }

    /**
     * Get the extractedSize property: Total extracted size of the firmware in bytes.
     * 
     * @return the extractedSize value.
     */
    public Long extractedSize() {
        return this.extractedSize;
    }

    /**
     * Get the fileSize property: Firmware file size in bytes.
     * 
     * @return the fileSize value.
     */
    public Long fileSize() {
        return this.fileSize;
    }

    /**
     * Get the extractedFileCount property: Extracted file count.
     * 
     * @return the extractedFileCount value.
     */
    public Long extractedFileCount() {
        return this.extractedFileCount;
    }

    /**
     * Get the componentCount property: Components count.
     * 
     * @return the componentCount value.
     */
    public Long componentCount() {
        return this.componentCount;
    }

    /**
     * Get the binaryCount property: Binary count.
     * 
     * @return the binaryCount value.
     */
    public Long binaryCount() {
        return this.binaryCount;
    }

    /**
     * Get the analysisTimeSeconds property: Time used for analysis.
     * 
     * @return the analysisTimeSeconds value.
     */
    public Long analysisTimeSeconds() {
        return this.analysisTimeSeconds;
    }

    /**
     * Get the rootFileSystems property: The number of root file systems found.
     * 
     * @return the rootFileSystems value.
     */
    public Long rootFileSystems() {
        return this.rootFileSystems;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("summaryType", this.summaryType == null ? null : this.summaryType.toString());
        jsonWriter.writeNumberField("extractedSize", this.extractedSize);
        jsonWriter.writeNumberField("fileSize", this.fileSize);
        jsonWriter.writeNumberField("extractedFileCount", this.extractedFileCount);
        jsonWriter.writeNumberField("componentCount", this.componentCount);
        jsonWriter.writeNumberField("binaryCount", this.binaryCount);
        jsonWriter.writeNumberField("analysisTimeSeconds", this.analysisTimeSeconds);
        jsonWriter.writeNumberField("rootFileSystems", this.rootFileSystems);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FirmwareSummary from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FirmwareSummary if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the FirmwareSummary.
     */
    public static FirmwareSummary fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FirmwareSummary deserializedFirmwareSummary = new FirmwareSummary();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedFirmwareSummary.withProvisioningState(ProvisioningState.fromString(reader.getString()));
                } else if ("summaryType".equals(fieldName)) {
                    deserializedFirmwareSummary.summaryType = SummaryType.fromString(reader.getString());
                } else if ("extractedSize".equals(fieldName)) {
                    deserializedFirmwareSummary.extractedSize = reader.getNullable(JsonReader::getLong);
                } else if ("fileSize".equals(fieldName)) {
                    deserializedFirmwareSummary.fileSize = reader.getNullable(JsonReader::getLong);
                } else if ("extractedFileCount".equals(fieldName)) {
                    deserializedFirmwareSummary.extractedFileCount = reader.getNullable(JsonReader::getLong);
                } else if ("componentCount".equals(fieldName)) {
                    deserializedFirmwareSummary.componentCount = reader.getNullable(JsonReader::getLong);
                } else if ("binaryCount".equals(fieldName)) {
                    deserializedFirmwareSummary.binaryCount = reader.getNullable(JsonReader::getLong);
                } else if ("analysisTimeSeconds".equals(fieldName)) {
                    deserializedFirmwareSummary.analysisTimeSeconds = reader.getNullable(JsonReader::getLong);
                } else if ("rootFileSystems".equals(fieldName)) {
                    deserializedFirmwareSummary.rootFileSystems = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFirmwareSummary;
        });
    }
}
