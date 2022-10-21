// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CmdkeySetup;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import org.junit.jupiter.api.Test;

public final class CmdkeySetupTests {
    @Test
    public void testDeserialize() {
        CmdkeySetup model =
            BinaryData
                .fromString("{\"type\":\"CmdkeySetup\",\"typeProperties\":{\"password\":{\"type\":\"SecretBase\"}}}")
                .toObject(CmdkeySetup.class);
    }

    @Test
    public void testSerialize() {
        CmdkeySetup model = new CmdkeySetup().withPassword(new SecretBase());
        model = BinaryData.fromObject(model).toObject(CmdkeySetup.class);
    }
}