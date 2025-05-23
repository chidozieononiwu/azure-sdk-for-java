// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.resourcemanager.automation.models.Connection;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Connection Update.
 */
public final class ConnectionUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/examples/
     * updateConnection.json
     */
    /**
     * Sample code: Update a connection.
     * 
     * @param manager Entry point to AutomationManager.
     */
    public static void updateAConnection(com.azure.resourcemanager.automation.AutomationManager manager) {
        Connection resource = manager.connections()
            .getWithResponse("rg", "myAutomationAccount28", "myConnection", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withName("myConnection")
            .withDescription("my description goes here")
            .withFieldDefinitionValues(mapOf("AutomationCertificateName", "myCertificateName", "SubscriptionID",
                "b5e4748c-f69a-467c-8749-e2f9c8cd3009"))
            .apply();
    }

    // Use "Map.of" if available
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
