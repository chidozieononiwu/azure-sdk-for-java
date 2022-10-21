// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.DatabricksSparkPythonActivityTypeProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public final class DatabricksSparkPythonActivityTypePropertiesTests {
    @Test
    public void testDeserialize() {
        DatabricksSparkPythonActivityTypeProperties model =
            BinaryData
                .fromString("{\"parameters\":[],\"libraries\":[{},{},{},{}]}")
                .toObject(DatabricksSparkPythonActivityTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        DatabricksSparkPythonActivityTypeProperties model =
            new DatabricksSparkPythonActivityTypeProperties()
                .withParameters(Arrays.asList())
                .withLibraries(Arrays.asList(mapOf(), mapOf(), mapOf(), mapOf()));
        model = BinaryData.fromObject(model).toObject(DatabricksSparkPythonActivityTypeProperties.class);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}