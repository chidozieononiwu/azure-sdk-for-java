// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.implementation;

import com.azure.resourcemanager.confluent.fluent.models.InvitationRecordInner;
import com.azure.resourcemanager.confluent.models.InvitationRecord;
import com.azure.resourcemanager.confluent.models.MetadataEntity;

public final class InvitationRecordImpl implements InvitationRecord {
    private InvitationRecordInner innerObject;

    private final com.azure.resourcemanager.confluent.ConfluentManager serviceManager;

    InvitationRecordImpl(InvitationRecordInner innerObject,
        com.azure.resourcemanager.confluent.ConfluentManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public String id() {
        return this.innerModel().id();
    }

    public MetadataEntity metadata() {
        return this.innerModel().metadata();
    }

    public String email() {
        return this.innerModel().email();
    }

    public String authType() {
        return this.innerModel().authType();
    }

    public String status() {
        return this.innerModel().status();
    }

    public String acceptedAt() {
        return this.innerModel().acceptedAt();
    }

    public String expiresAt() {
        return this.innerModel().expiresAt();
    }

    public InvitationRecordInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.confluent.ConfluentManager manager() {
        return this.serviceManager;
    }
}
