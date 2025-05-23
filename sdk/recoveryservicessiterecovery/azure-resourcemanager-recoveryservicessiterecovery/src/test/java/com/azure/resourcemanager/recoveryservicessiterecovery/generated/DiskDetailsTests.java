// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.DiskDetails;
import org.junit.jupiter.api.Assertions;

public final class DiskDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiskDetails model = BinaryData.fromString(
            "{\"maxSizeMB\":607899688092596249,\"vhdType\":\"yqhyqqzzdcykey\",\"vhdId\":\"ewfopazdazg\",\"vhdName\":\"qgpewqcfutmdpvoz\"}")
            .toObject(DiskDetails.class);
        Assertions.assertEquals(607899688092596249L, model.maxSizeMB());
        Assertions.assertEquals("yqhyqqzzdcykey", model.vhdType());
        Assertions.assertEquals("ewfopazdazg", model.vhdId());
        Assertions.assertEquals("qgpewqcfutmdpvoz", model.vhdName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiskDetails model = new DiskDetails().withMaxSizeMB(607899688092596249L)
            .withVhdType("yqhyqqzzdcykey")
            .withVhdId("ewfopazdazg")
            .withVhdName("qgpewqcfutmdpvoz");
        model = BinaryData.fromObject(model).toObject(DiskDetails.class);
        Assertions.assertEquals(607899688092596249L, model.maxSizeMB());
        Assertions.assertEquals("yqhyqqzzdcykey", model.vhdType());
        Assertions.assertEquals("ewfopazdazg", model.vhdId());
        Assertions.assertEquals("qgpewqcfutmdpvoz", model.vhdName());
    }
}
