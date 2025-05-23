// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmProtectionContainerMappingDetails;

public final class InMageRcmProtectionContainerMappingDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMageRcmProtectionContainerMappingDetails model
            = BinaryData.fromString("{\"instanceType\":\"InMageRcm\",\"enableAgentAutoUpgrade\":\"yymotuz\"}")
                .toObject(InMageRcmProtectionContainerMappingDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMageRcmProtectionContainerMappingDetails model = new InMageRcmProtectionContainerMappingDetails();
        model = BinaryData.fromObject(model).toObject(InMageRcmProtectionContainerMappingDetails.class);
    }
}
