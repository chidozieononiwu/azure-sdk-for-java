// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.documentintelligence.models;

import com.azure.ai.documentintelligence.implementation.AnalyzeOperationDetailsHelper;
import com.azure.core.annotation.Generated;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Status and result of the analyze operation.
 */
public final class AnalyzeOperationDetails implements JsonSerializable<AnalyzeOperationDetails> {

    /*
     * Operation status. notStarted, running, succeeded, or failed
     */
    @Generated
    private final DocumentIntelligenceOperationStatus status;

    /*
     * Date and time (UTC) when the analyze operation was submitted.
     */
    @Generated
    private final OffsetDateTime createdOn;

    /*
     * Date and time (UTC) when the status was last updated.
     */
    @Generated
    private final OffsetDateTime lastUpdatedOn;

    /*
     * Encountered error during document analysis.
     */
    @Generated
    private DocumentIntelligenceError error;

    /*
     * Document analysis result.
     */
    @Generated
    private AnalyzeResult analyzeResult;

    /**
     * Creates an instance of AnalyzeOperationDetails class.
     *
     * @param status the status value to set.
     * @param createdOn the createdOn value to set.
     * @param lastUpdatedOn the lastUpdatedOn value to set.
     */
    @Generated
    private AnalyzeOperationDetails(DocumentIntelligenceOperationStatus status, OffsetDateTime createdOn,
        OffsetDateTime lastUpdatedOn) {
        this.status = status;
        this.createdOn = createdOn;
        this.lastUpdatedOn = lastUpdatedOn;
    }

    /**
     * Get the status property: Operation status. notStarted, running, succeeded, or failed.
     *
     * @return the status value.
     */
    @Generated
    public DocumentIntelligenceOperationStatus getStatus() {
        return this.status;
    }

    /**
     * Get the createdOn property: Date and time (UTC) when the analyze operation was submitted.
     *
     * @return the createdOn value.
     */
    @Generated
    public OffsetDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Get the lastUpdatedOn property: Date and time (UTC) when the status was last updated.
     *
     * @return the lastUpdatedOn value.
     */
    @Generated
    public OffsetDateTime getLastUpdatedOn() {
        return this.lastUpdatedOn;
    }

    /**
     * Get the error property: Encountered error during document analysis.
     *
     * @return the error value.
     */
    @Generated
    public DocumentIntelligenceError getError() {
        return this.error;
    }

    /**
     * Get the analyzeResult property: Document analysis result.
     *
     * @return the analyzeResult value.
     */
    @Generated
    public AnalyzeResult getAnalyzeResult() {
        return this.analyzeResult;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("createdDateTime",
            this.createdOn == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.createdOn));
        jsonWriter.writeStringField("lastUpdatedDateTime",
            this.lastUpdatedOn == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastUpdatedOn));
        jsonWriter.writeJsonField("error", this.error);
        jsonWriter.writeJsonField("analyzeResult", this.analyzeResult);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AnalyzeOperationDetails from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnalyzeOperationDetails if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AnalyzeOperationDetails.
     */
    @Generated
    public static AnalyzeOperationDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DocumentIntelligenceOperationStatus status = null;
            OffsetDateTime createdOn = null;
            OffsetDateTime lastUpdatedOn = null;
            DocumentIntelligenceError error = null;
            AnalyzeResult analyzeResult = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("status".equals(fieldName)) {
                    status = DocumentIntelligenceOperationStatus.fromString(reader.getString());
                } else if ("createdDateTime".equals(fieldName)) {
                    createdOn = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastUpdatedDateTime".equals(fieldName)) {
                    lastUpdatedOn = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("error".equals(fieldName)) {
                    error = DocumentIntelligenceError.fromJson(reader);
                } else if ("analyzeResult".equals(fieldName)) {
                    analyzeResult = AnalyzeResult.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            AnalyzeOperationDetails deserializedAnalyzeOperationDetails
                = new AnalyzeOperationDetails(status, createdOn, lastUpdatedOn);
            deserializedAnalyzeOperationDetails.error = error;
            deserializedAnalyzeOperationDetails.analyzeResult = analyzeResult;
            return deserializedAnalyzeOperationDetails;
        });
    }

    private String operationId;

    static {
        AnalyzeOperationDetailsHelper.setAccessor(new AnalyzeOperationDetailsHelper.AnalyzeOperationDetailsAccessor() {

            @Override
            public void setOperationId(AnalyzeOperationDetails analyzeOperation, String operationId) {
                analyzeOperation.setOperationId(operationId);
            }
        });
    }

    /**
     * Gets the operationId property: Operation ID.
     *
     * @return the operationId value.
     */
    public String getResultId() {
        return operationId;
    }

    /**
     * Sets the operationId property: Operation ID.
     *
     * @param operationId the operationId value to set.
     */
    private void setOperationId(String operationId) {
        this.operationId = operationId;
    }
}
