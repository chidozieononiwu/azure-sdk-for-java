// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The VerificationCodeResponseProperties model.
 */
@Fluent
public final class VerificationCodeResponseProperties implements JsonSerializable<VerificationCodeResponseProperties> {
    /*
     * Verification code.
     */
    private String verificationCode;

    /*
     * Certificate subject.
     */
    private String subject;

    /*
     * Code expiry.
     */
    private String expiry;

    /*
     * Certificate thumbprint.
     */
    private String thumbprint;

    /*
     * Indicate if the certificate is verified by owner of private key.
     */
    private Boolean isVerified;

    /*
     * base-64 representation of X509 certificate .cer file or just .pem file content.
     */
    private byte[] certificate;

    /*
     * Certificate created time.
     */
    private String created;

    /*
     * Certificate updated time.
     */
    private String updated;

    /**
     * Creates an instance of VerificationCodeResponseProperties class.
     */
    public VerificationCodeResponseProperties() {
    }

    /**
     * Get the verificationCode property: Verification code.
     * 
     * @return the verificationCode value.
     */
    public String verificationCode() {
        return this.verificationCode;
    }

    /**
     * Set the verificationCode property: Verification code.
     * 
     * @param verificationCode the verificationCode value to set.
     * @return the VerificationCodeResponseProperties object itself.
     */
    public VerificationCodeResponseProperties withVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }

    /**
     * Get the subject property: Certificate subject.
     * 
     * @return the subject value.
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Set the subject property: Certificate subject.
     * 
     * @param subject the subject value to set.
     * @return the VerificationCodeResponseProperties object itself.
     */
    public VerificationCodeResponseProperties withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get the expiry property: Code expiry.
     * 
     * @return the expiry value.
     */
    public String expiry() {
        return this.expiry;
    }

    /**
     * Set the expiry property: Code expiry.
     * 
     * @param expiry the expiry value to set.
     * @return the VerificationCodeResponseProperties object itself.
     */
    public VerificationCodeResponseProperties withExpiry(String expiry) {
        this.expiry = expiry;
        return this;
    }

    /**
     * Get the thumbprint property: Certificate thumbprint.
     * 
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: Certificate thumbprint.
     * 
     * @param thumbprint the thumbprint value to set.
     * @return the VerificationCodeResponseProperties object itself.
     */
    public VerificationCodeResponseProperties withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the isVerified property: Indicate if the certificate is verified by owner of private key.
     * 
     * @return the isVerified value.
     */
    public Boolean isVerified() {
        return this.isVerified;
    }

    /**
     * Set the isVerified property: Indicate if the certificate is verified by owner of private key.
     * 
     * @param isVerified the isVerified value to set.
     * @return the VerificationCodeResponseProperties object itself.
     */
    public VerificationCodeResponseProperties withIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
        return this;
    }

    /**
     * Get the certificate property: base-64 representation of X509 certificate .cer file or just .pem file content.
     * 
     * @return the certificate value.
     */
    public byte[] certificate() {
        return CoreUtils.clone(this.certificate);
    }

    /**
     * Set the certificate property: base-64 representation of X509 certificate .cer file or just .pem file content.
     * 
     * @param certificate the certificate value to set.
     * @return the VerificationCodeResponseProperties object itself.
     */
    public VerificationCodeResponseProperties withCertificate(byte[] certificate) {
        this.certificate = CoreUtils.clone(certificate);
        return this;
    }

    /**
     * Get the created property: Certificate created time.
     * 
     * @return the created value.
     */
    public String created() {
        return this.created;
    }

    /**
     * Set the created property: Certificate created time.
     * 
     * @param created the created value to set.
     * @return the VerificationCodeResponseProperties object itself.
     */
    public VerificationCodeResponseProperties withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * Get the updated property: Certificate updated time.
     * 
     * @return the updated value.
     */
    public String updated() {
        return this.updated;
    }

    /**
     * Set the updated property: Certificate updated time.
     * 
     * @param updated the updated value to set.
     * @return the VerificationCodeResponseProperties object itself.
     */
    public VerificationCodeResponseProperties withUpdated(String updated) {
        this.updated = updated;
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
        jsonWriter.writeStringField("verificationCode", this.verificationCode);
        jsonWriter.writeStringField("subject", this.subject);
        jsonWriter.writeStringField("expiry", this.expiry);
        jsonWriter.writeStringField("thumbprint", this.thumbprint);
        jsonWriter.writeBooleanField("isVerified", this.isVerified);
        jsonWriter.writeBinaryField("certificate", this.certificate);
        jsonWriter.writeStringField("created", this.created);
        jsonWriter.writeStringField("updated", this.updated);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VerificationCodeResponseProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VerificationCodeResponseProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VerificationCodeResponseProperties.
     */
    public static VerificationCodeResponseProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VerificationCodeResponseProperties deserializedVerificationCodeResponseProperties
                = new VerificationCodeResponseProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("verificationCode".equals(fieldName)) {
                    deserializedVerificationCodeResponseProperties.verificationCode = reader.getString();
                } else if ("subject".equals(fieldName)) {
                    deserializedVerificationCodeResponseProperties.subject = reader.getString();
                } else if ("expiry".equals(fieldName)) {
                    deserializedVerificationCodeResponseProperties.expiry = reader.getString();
                } else if ("thumbprint".equals(fieldName)) {
                    deserializedVerificationCodeResponseProperties.thumbprint = reader.getString();
                } else if ("isVerified".equals(fieldName)) {
                    deserializedVerificationCodeResponseProperties.isVerified
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("certificate".equals(fieldName)) {
                    deserializedVerificationCodeResponseProperties.certificate = reader.getBinary();
                } else if ("created".equals(fieldName)) {
                    deserializedVerificationCodeResponseProperties.created = reader.getString();
                } else if ("updated".equals(fieldName)) {
                    deserializedVerificationCodeResponseProperties.updated = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVerificationCodeResponseProperties;
        });
    }
}
