// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.models.ArtifactStorePropertiesFormatManagedResourceGroupConfiguration;
import org.junit.jupiter.api.Assertions;

public final class ArtifactStorePropertiesFormatManagedResourceGroupConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ArtifactStorePropertiesFormatManagedResourceGroupConfiguration model
            = BinaryData.fromString("{\"name\":\"kbnujr\",\"location\":\"vtylbfpncu\"}")
                .toObject(ArtifactStorePropertiesFormatManagedResourceGroupConfiguration.class);
        Assertions.assertEquals("kbnujr", model.name());
        Assertions.assertEquals("vtylbfpncu", model.location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ArtifactStorePropertiesFormatManagedResourceGroupConfiguration model
            = new ArtifactStorePropertiesFormatManagedResourceGroupConfiguration().withName("kbnujr")
                .withLocation("vtylbfpncu");
        model = BinaryData.fromObject(model)
            .toObject(ArtifactStorePropertiesFormatManagedResourceGroupConfiguration.class);
        Assertions.assertEquals("kbnujr", model.name());
        Assertions.assertEquals("vtylbfpncu", model.location());
    }
}
