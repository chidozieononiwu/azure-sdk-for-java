// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.models.SnapshotCreationData;
import org.junit.jupiter.api.Assertions;

public final class SnapshotCreationDataTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnapshotCreationData model
            = BinaryData.fromString("{\"sourceId\":\"vjymjhxxjyngud\"}").toObject(SnapshotCreationData.class);
        Assertions.assertEquals("vjymjhxxjyngud", model.sourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SnapshotCreationData model = new SnapshotCreationData().withSourceId("vjymjhxxjyngud");
        model = BinaryData.fromObject(model).toObject(SnapshotCreationData.class);
        Assertions.assertEquals("vjymjhxxjyngud", model.sourceId());
    }
}
