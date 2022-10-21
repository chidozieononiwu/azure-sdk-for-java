// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AzureSqlMITableDatasetTypeProperties;
import org.junit.jupiter.api.Test;

public final class AzureSqlMITableDatasetTypePropertiesTests {
    @Test
    public void testDeserialize() {
        AzureSqlMITableDatasetTypeProperties model =
            BinaryData.fromString("{}").toObject(AzureSqlMITableDatasetTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        AzureSqlMITableDatasetTypeProperties model = new AzureSqlMITableDatasetTypeProperties();
        model = BinaryData.fromObject(model).toObject(AzureSqlMITableDatasetTypeProperties.class);
    }
}