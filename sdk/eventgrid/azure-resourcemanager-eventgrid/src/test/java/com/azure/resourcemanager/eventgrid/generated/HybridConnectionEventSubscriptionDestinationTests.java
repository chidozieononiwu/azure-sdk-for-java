// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.DeliveryAttributeMapping;
import com.azure.resourcemanager.eventgrid.models.HybridConnectionEventSubscriptionDestination;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class HybridConnectionEventSubscriptionDestinationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HybridConnectionEventSubscriptionDestination model = BinaryData.fromString(
            "{\"endpointType\":\"HybridConnection\",\"properties\":{\"resourceId\":\"hmpejtlkexaonw\",\"deliveryAttributeMappings\":[{\"type\":\"DeliveryAttributeMapping\",\"name\":\"qhr\"}]}}")
            .toObject(HybridConnectionEventSubscriptionDestination.class);
        Assertions.assertEquals("hmpejtlkexaonw", model.resourceId());
        Assertions.assertEquals("qhr", model.deliveryAttributeMappings().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HybridConnectionEventSubscriptionDestination model
            = new HybridConnectionEventSubscriptionDestination().withResourceId("hmpejtlkexaonw")
                .withDeliveryAttributeMappings(Arrays.asList(new DeliveryAttributeMapping().withName("qhr")));
        model = BinaryData.fromObject(model).toObject(HybridConnectionEventSubscriptionDestination.class);
        Assertions.assertEquals("hmpejtlkexaonw", model.resourceId());
        Assertions.assertEquals("qhr", model.deliveryAttributeMappings().get(0).name());
    }
}
