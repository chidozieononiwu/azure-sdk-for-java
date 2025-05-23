// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.ServerNameItem;
import org.junit.jupiter.api.Assertions;

public final class ServerNameItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServerNameItem model
            = BinaryData.fromString("{\"name\":\"qsoqijgkd\",\"fullyQualifiedDomainName\":\"pazlobcufpdz\"}")
                .toObject(ServerNameItem.class);
        Assertions.assertEquals("qsoqijgkd", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServerNameItem model = new ServerNameItem().withName("qsoqijgkd");
        model = BinaryData.fromObject(model).toObject(ServerNameItem.class);
        Assertions.assertEquals("qsoqijgkd", model.name());
    }
}
