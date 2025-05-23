// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.dell.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties specific to the Dell File System resource.
 */
@Fluent
public final class FileSystemResourceProperties implements JsonSerializable<FileSystemResourceProperties> {
    /*
     * Capacity for Dell Filesystem, Will be received as part of Job Status
     */
    private Capacity capacity;

    /*
     * Marketplace details
     */
    private MarketplaceDetails marketplace;

    /*
     * Provisioning State of the resource
     */
    private ProvisioningState provisioningState;

    /*
     * Delegated subnet id for Vnet injection
     */
    private String delegatedSubnetId;

    /*
     * Domain range for the delegated subnet
     */
    private String delegatedSubnetCidr;

    /*
     * User Details
     */
    private UserDetails user;

    /*
     * File system Id of the resource
     */
    private String fileSystemId;

    /*
     * Smart Connect FQDN of the resource
     */
    private String smartConnectFqdn;

    /*
     * OneFS url
     */
    private String oneFsUrl;

    /*
     * DellReferenceNumber of the resource
     */
    private String dellReferenceNumber;

    /*
     * EncryptionProperties of the resource
     */
    private EncryptionProperties encryption;

    /**
     * Creates an instance of FileSystemResourceProperties class.
     */
    public FileSystemResourceProperties() {
    }

    /**
     * Get the capacity property: Capacity for Dell Filesystem, Will be received as part of Job Status.
     * 
     * @return the capacity value.
     */
    public Capacity capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: Capacity for Dell Filesystem, Will be received as part of Job Status.
     * 
     * @param capacity the capacity value to set.
     * @return the FileSystemResourceProperties object itself.
     */
    public FileSystemResourceProperties withCapacity(Capacity capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the marketplace property: Marketplace details.
     * 
     * @return the marketplace value.
     */
    public MarketplaceDetails marketplace() {
        return this.marketplace;
    }

    /**
     * Set the marketplace property: Marketplace details.
     * 
     * @param marketplace the marketplace value to set.
     * @return the FileSystemResourceProperties object itself.
     */
    public FileSystemResourceProperties withMarketplace(MarketplaceDetails marketplace) {
        this.marketplace = marketplace;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning State of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the delegatedSubnetId property: Delegated subnet id for Vnet injection.
     * 
     * @return the delegatedSubnetId value.
     */
    public String delegatedSubnetId() {
        return this.delegatedSubnetId;
    }

    /**
     * Set the delegatedSubnetId property: Delegated subnet id for Vnet injection.
     * 
     * @param delegatedSubnetId the delegatedSubnetId value to set.
     * @return the FileSystemResourceProperties object itself.
     */
    public FileSystemResourceProperties withDelegatedSubnetId(String delegatedSubnetId) {
        this.delegatedSubnetId = delegatedSubnetId;
        return this;
    }

    /**
     * Get the delegatedSubnetCidr property: Domain range for the delegated subnet.
     * 
     * @return the delegatedSubnetCidr value.
     */
    public String delegatedSubnetCidr() {
        return this.delegatedSubnetCidr;
    }

    /**
     * Set the delegatedSubnetCidr property: Domain range for the delegated subnet.
     * 
     * @param delegatedSubnetCidr the delegatedSubnetCidr value to set.
     * @return the FileSystemResourceProperties object itself.
     */
    public FileSystemResourceProperties withDelegatedSubnetCidr(String delegatedSubnetCidr) {
        this.delegatedSubnetCidr = delegatedSubnetCidr;
        return this;
    }

    /**
     * Get the user property: User Details.
     * 
     * @return the user value.
     */
    public UserDetails user() {
        return this.user;
    }

    /**
     * Set the user property: User Details.
     * 
     * @param user the user value to set.
     * @return the FileSystemResourceProperties object itself.
     */
    public FileSystemResourceProperties withUser(UserDetails user) {
        this.user = user;
        return this;
    }

    /**
     * Get the fileSystemId property: File system Id of the resource.
     * 
     * @return the fileSystemId value.
     */
    public String fileSystemId() {
        return this.fileSystemId;
    }

    /**
     * Set the fileSystemId property: File system Id of the resource.
     * 
     * @param fileSystemId the fileSystemId value to set.
     * @return the FileSystemResourceProperties object itself.
     */
    public FileSystemResourceProperties withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * Get the smartConnectFqdn property: Smart Connect FQDN of the resource.
     * 
     * @return the smartConnectFqdn value.
     */
    public String smartConnectFqdn() {
        return this.smartConnectFqdn;
    }

    /**
     * Set the smartConnectFqdn property: Smart Connect FQDN of the resource.
     * 
     * @param smartConnectFqdn the smartConnectFqdn value to set.
     * @return the FileSystemResourceProperties object itself.
     */
    public FileSystemResourceProperties withSmartConnectFqdn(String smartConnectFqdn) {
        this.smartConnectFqdn = smartConnectFqdn;
        return this;
    }

    /**
     * Get the oneFsUrl property: OneFS url.
     * 
     * @return the oneFsUrl value.
     */
    public String oneFsUrl() {
        return this.oneFsUrl;
    }

    /**
     * Set the oneFsUrl property: OneFS url.
     * 
     * @param oneFsUrl the oneFsUrl value to set.
     * @return the FileSystemResourceProperties object itself.
     */
    public FileSystemResourceProperties withOneFsUrl(String oneFsUrl) {
        this.oneFsUrl = oneFsUrl;
        return this;
    }

    /**
     * Get the dellReferenceNumber property: DellReferenceNumber of the resource.
     * 
     * @return the dellReferenceNumber value.
     */
    public String dellReferenceNumber() {
        return this.dellReferenceNumber;
    }

    /**
     * Set the dellReferenceNumber property: DellReferenceNumber of the resource.
     * 
     * @param dellReferenceNumber the dellReferenceNumber value to set.
     * @return the FileSystemResourceProperties object itself.
     */
    public FileSystemResourceProperties withDellReferenceNumber(String dellReferenceNumber) {
        this.dellReferenceNumber = dellReferenceNumber;
        return this;
    }

    /**
     * Get the encryption property: EncryptionProperties of the resource.
     * 
     * @return the encryption value.
     */
    public EncryptionProperties encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: EncryptionProperties of the resource.
     * 
     * @param encryption the encryption value to set.
     * @return the FileSystemResourceProperties object itself.
     */
    public FileSystemResourceProperties withEncryption(EncryptionProperties encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (capacity() != null) {
            capacity().validate();
        }
        if (marketplace() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property marketplace in model FileSystemResourceProperties"));
        } else {
            marketplace().validate();
        }
        if (delegatedSubnetId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property delegatedSubnetId in model FileSystemResourceProperties"));
        }
        if (delegatedSubnetCidr() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property delegatedSubnetCidr in model FileSystemResourceProperties"));
        }
        if (user() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property user in model FileSystemResourceProperties"));
        } else {
            user().validate();
        }
        if (dellReferenceNumber() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property dellReferenceNumber in model FileSystemResourceProperties"));
        }
        if (encryption() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property encryption in model FileSystemResourceProperties"));
        } else {
            encryption().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FileSystemResourceProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("marketplace", this.marketplace);
        jsonWriter.writeStringField("delegatedSubnetId", this.delegatedSubnetId);
        jsonWriter.writeStringField("delegatedSubnetCidr", this.delegatedSubnetCidr);
        jsonWriter.writeJsonField("user", this.user);
        jsonWriter.writeStringField("dellReferenceNumber", this.dellReferenceNumber);
        jsonWriter.writeJsonField("encryption", this.encryption);
        jsonWriter.writeJsonField("capacity", this.capacity);
        jsonWriter.writeStringField("fileSystemId", this.fileSystemId);
        jsonWriter.writeStringField("smartConnectFqdn", this.smartConnectFqdn);
        jsonWriter.writeStringField("oneFsUrl", this.oneFsUrl);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FileSystemResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FileSystemResourceProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FileSystemResourceProperties.
     */
    public static FileSystemResourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FileSystemResourceProperties deserializedFileSystemResourceProperties = new FileSystemResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("marketplace".equals(fieldName)) {
                    deserializedFileSystemResourceProperties.marketplace = MarketplaceDetails.fromJson(reader);
                } else if ("delegatedSubnetId".equals(fieldName)) {
                    deserializedFileSystemResourceProperties.delegatedSubnetId = reader.getString();
                } else if ("delegatedSubnetCidr".equals(fieldName)) {
                    deserializedFileSystemResourceProperties.delegatedSubnetCidr = reader.getString();
                } else if ("user".equals(fieldName)) {
                    deserializedFileSystemResourceProperties.user = UserDetails.fromJson(reader);
                } else if ("dellReferenceNumber".equals(fieldName)) {
                    deserializedFileSystemResourceProperties.dellReferenceNumber = reader.getString();
                } else if ("encryption".equals(fieldName)) {
                    deserializedFileSystemResourceProperties.encryption = EncryptionProperties.fromJson(reader);
                } else if ("capacity".equals(fieldName)) {
                    deserializedFileSystemResourceProperties.capacity = Capacity.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedFileSystemResourceProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("fileSystemId".equals(fieldName)) {
                    deserializedFileSystemResourceProperties.fileSystemId = reader.getString();
                } else if ("smartConnectFqdn".equals(fieldName)) {
                    deserializedFileSystemResourceProperties.smartConnectFqdn = reader.getString();
                } else if ("oneFsUrl".equals(fieldName)) {
                    deserializedFileSystemResourceProperties.oneFsUrl = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFileSystemResourceProperties;
        });
    }
}
