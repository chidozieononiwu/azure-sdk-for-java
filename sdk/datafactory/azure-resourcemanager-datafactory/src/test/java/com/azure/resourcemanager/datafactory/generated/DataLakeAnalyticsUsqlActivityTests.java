// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.DataLakeAnalyticsUsqlActivity;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DataLakeAnalyticsUsqlActivityTests {
    @Test
    public void testDeserialize() {
        DataLakeAnalyticsUsqlActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"DataLakeAnalyticsU-SQL\",\"typeProperties\":{\"scriptLinkedService\":{\"referenceName\":\"x\",\"parameters\":{}},\"parameters\":{}},\"linkedServiceName\":{\"referenceName\":\"irnb\",\"parameters\":{}},\"policy\":{\"retryIntervalInSeconds\":1133753792,\"secureInput\":true,\"secureOutput\":true,\"\":{}},\"name\":\"wmpftmfoe\",\"description\":\"og\",\"dependsOn\":[{\"activity\":\"wetamfddrvlk\",\"dependencyConditions\":[\"Completed\",\"Skipped\",\"Failed\"],\"\":{}}],\"userProperties\":[{\"name\":\"chdidr\"}],\"\":{}}")
                .toObject(DataLakeAnalyticsUsqlActivity.class);
        Assertions.assertEquals("wmpftmfoe", model.name());
        Assertions.assertEquals("og", model.description());
        Assertions.assertEquals("wetamfddrvlk", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("chdidr", model.userProperties().get(0).name());
        Assertions.assertEquals("irnb", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1133753792, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("x", model.scriptLinkedService().referenceName());
    }

    @Test
    public void testSerialize() {
        DataLakeAnalyticsUsqlActivity model =
            new DataLakeAnalyticsUsqlActivity()
                .withName("wmpftmfoe")
                .withDescription("og")
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("wetamfddrvlk")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.COMPLETED,
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.FAILED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(Arrays.asList(new UserProperty().withName("chdidr")))
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("irnb").withParameters(mapOf()))
                .withPolicy(
                    new ActivityPolicy()
                        .withRetryIntervalInSeconds(1133753792)
                        .withSecureInput(true)
                        .withSecureOutput(true)
                        .withAdditionalProperties(mapOf()))
                .withScriptLinkedService(new LinkedServiceReference().withReferenceName("x").withParameters(mapOf()))
                .withParameters(mapOf());
        model = BinaryData.fromObject(model).toObject(DataLakeAnalyticsUsqlActivity.class);
        Assertions.assertEquals("wmpftmfoe", model.name());
        Assertions.assertEquals("og", model.description());
        Assertions.assertEquals("wetamfddrvlk", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("chdidr", model.userProperties().get(0).name());
        Assertions.assertEquals("irnb", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1133753792, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("x", model.scriptLinkedService().referenceName());
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