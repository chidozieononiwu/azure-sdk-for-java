// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.TopicSpaceInner;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TopicSpaceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TopicSpaceInner model = BinaryData.fromString(
            "{\"properties\":{\"description\":\"ezxlskihm\",\"topicTemplates\":[\"dsajrednwyysh\",\"uwg\"],\"provisioningState\":\"Succeeded\"},\"id\":\"afpwzyifrkgwl\",\"name\":\"xeqipx\",\"type\":\"zdyi\"}")
            .toObject(TopicSpaceInner.class);
        Assertions.assertEquals("ezxlskihm", model.description());
        Assertions.assertEquals("dsajrednwyysh", model.topicTemplates().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TopicSpaceInner model = new TopicSpaceInner().withDescription("ezxlskihm")
            .withTopicTemplates(Arrays.asList("dsajrednwyysh", "uwg"));
        model = BinaryData.fromObject(model).toObject(TopicSpaceInner.class);
        Assertions.assertEquals("ezxlskihm", model.description());
        Assertions.assertEquals("dsajrednwyysh", model.topicTemplates().get(0));
    }
}
