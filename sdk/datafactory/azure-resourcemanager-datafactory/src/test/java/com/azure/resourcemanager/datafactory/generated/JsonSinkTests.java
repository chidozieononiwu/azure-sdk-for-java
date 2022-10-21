// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.JsonSink;
import com.azure.resourcemanager.datafactory.models.JsonWriteSettings;
import com.azure.resourcemanager.datafactory.models.StoreWriteSettings;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public final class JsonSinkTests {
    @Test
    public void testDeserialize() {
        JsonSink model =
            BinaryData
                .fromString(
                    "{\"type\":\"JsonSink\",\"storeSettings\":{\"type\":\"StoreWriteSettings\",\"\":{}},\"formatSettings\":{\"type\":\"JsonWriteSettings\",\"\":{}},\"\":{}}")
                .toObject(JsonSink.class);
    }

    @Test
    public void testSerialize() {
        JsonSink model =
            new JsonSink()
                .withStoreSettings(
                    new StoreWriteSettings().withAdditionalProperties(mapOf("type", "StoreWriteSettings")))
                .withFormatSettings(new JsonWriteSettings());
        model = BinaryData.fromObject(model).toObject(JsonSink.class);
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