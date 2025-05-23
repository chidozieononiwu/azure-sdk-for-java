// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.ReplicationStatusInner;
import com.azure.resourcemanager.netapp.models.MirrorState;
import com.azure.resourcemanager.netapp.models.RelationshipStatus;
import org.junit.jupiter.api.Assertions;

public final class ReplicationStatusInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReplicationStatusInner model = BinaryData.fromString(
            "{\"healthy\":false,\"relationshipStatus\":\"Idle\",\"mirrorState\":\"Uninitialized\",\"totalProgress\":\"washr\",\"errorMessage\":\"tkcnqxwb\"}")
            .toObject(ReplicationStatusInner.class);
        Assertions.assertFalse(model.healthy());
        Assertions.assertEquals(RelationshipStatus.IDLE, model.relationshipStatus());
        Assertions.assertEquals(MirrorState.UNINITIALIZED, model.mirrorState());
        Assertions.assertEquals("washr", model.totalProgress());
        Assertions.assertEquals("tkcnqxwb", model.errorMessage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReplicationStatusInner model = new ReplicationStatusInner().withHealthy(false)
            .withRelationshipStatus(RelationshipStatus.IDLE)
            .withMirrorState(MirrorState.UNINITIALIZED)
            .withTotalProgress("washr")
            .withErrorMessage("tkcnqxwb");
        model = BinaryData.fromObject(model).toObject(ReplicationStatusInner.class);
        Assertions.assertFalse(model.healthy());
        Assertions.assertEquals(RelationshipStatus.IDLE, model.relationshipStatus());
        Assertions.assertEquals(MirrorState.UNINITIALIZED, model.mirrorState());
        Assertions.assertEquals("washr", model.totalProgress());
        Assertions.assertEquals("tkcnqxwb", model.errorMessage());
    }
}
