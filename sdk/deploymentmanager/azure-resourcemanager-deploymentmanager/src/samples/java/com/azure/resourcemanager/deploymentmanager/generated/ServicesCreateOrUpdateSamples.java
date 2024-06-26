// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.generated;

import java.util.HashMap;
import java.util.Map;

/** Samples for Services CreateOrUpdate. */
public final class ServicesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/deploymentmanager/resource-manager/Microsoft.DeploymentManager/preview/2019-11-01-preview/examples/service_createorupdate.json
     */
    /**
     * Sample code: Create service.
     *
     * @param manager Entry point to DeploymentManager.
     */
    public static void createService(com.azure.resourcemanager.deploymentmanager.DeploymentManager manager) {
        manager
            .services()
            .define("myService")
            .withRegion("centralus")
            .withExistingServiceTopology("myResourceGroup", "myTopology")
            .withTargetLocation("centralus")
            .withTargetSubscriptionId("600c95c5-3ee5-44fe-b190-ca38a19adcd7")
            .withTags(mapOf())
            .create();
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
