// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databoxedge.fluent.models.ContainerProperties;
import com.azure.resourcemanager.databoxedge.models.AzureContainerDataFormat;
import org.junit.jupiter.api.Assertions;

public final class ContainerPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContainerProperties model =
            BinaryData
                .fromString(
                    "{\"containerStatus\":\"Offline\",\"dataFormat\":\"PageBlob\",\"refreshDetails\":{\"inProgressRefreshJobId\":\"dsjnka\",\"lastCompletedRefreshJobTimeInUTC\":\"2021-05-13T01:39:31Z\",\"errorManifestFile\":\"iiswacffgdkzze\",\"lastJob\":\"fvhqc\"},\"createdDateTime\":\"2021-02-08T02:11:50Z\"}")
                .toObject(ContainerProperties.class);
        Assertions.assertEquals(AzureContainerDataFormat.PAGE_BLOB, model.dataFormat());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContainerProperties model = new ContainerProperties().withDataFormat(AzureContainerDataFormat.PAGE_BLOB);
        model = BinaryData.fromObject(model).toObject(ContainerProperties.class);
        Assertions.assertEquals(AzureContainerDataFormat.PAGE_BLOB, model.dataFormat());
    }
}
