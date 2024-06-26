// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.HttpC2DMessagesNotInAllowedRange;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class HttpC2DMessagesNotInAllowedRangeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HttpC2DMessagesNotInAllowedRange model = BinaryData.fromString(
            "{\"ruleType\":\"HttpC2DMessagesNotInAllowedRange\",\"timeWindowSize\":\"PT233H56M47S\",\"minThreshold\":1694812131,\"maxThreshold\":1737160005,\"displayName\":\"dqlmfdggnbbu\",\"description\":\"wovvv\",\"isEnabled\":false}")
            .toObject(HttpC2DMessagesNotInAllowedRange.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals(1694812131, model.minThreshold());
        Assertions.assertEquals(1737160005, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT233H56M47S"), model.timeWindowSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HttpC2DMessagesNotInAllowedRange model
            = new HttpC2DMessagesNotInAllowedRange().withIsEnabled(false).withMinThreshold(1694812131)
                .withMaxThreshold(1737160005).withTimeWindowSize(Duration.parse("PT233H56M47S"));
        model = BinaryData.fromObject(model).toObject(HttpC2DMessagesNotInAllowedRange.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals(1694812131, model.minThreshold());
        Assertions.assertEquals(1737160005, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT233H56M47S"), model.timeWindowSize());
    }
}
