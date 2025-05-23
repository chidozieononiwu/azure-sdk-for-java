// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.VerticaTableDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class VerticaTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VerticaTableDataset model = BinaryData.fromString(
            "{\"type\":\"VerticaTable\",\"typeProperties\":{\"tableName\":\"datakuobclobnaqeizpl\",\"table\":\"datalyugpnn\",\"schema\":\"datajmkffeonmnvmu\"},\"description\":\"iqywlpxmliyt\",\"structure\":\"datagcrun\",\"schema\":\"datailxstekb\",\"linkedServiceName\":{\"referenceName\":\"rhyvs\",\"parameters\":{\"kltrvgioguoxc\":\"datariemorszffi\",\"gxgrggy\":\"datadqoxhdenmj\"}},\"parameters\":{\"xvvmrnjrdi\":{\"type\":\"Float\",\"defaultValue\":\"dataqinr\"},\"gcmpnc\":{\"type\":\"Bool\",\"defaultValue\":\"dataqswsychdcj\"}},\"annotations\":[\"datagbnoqnowvfxe\"],\"folder\":{\"name\":\"gwjekyqirvcpoln\"},\"\":{\"v\":\"datappdilb\"}}")
            .toObject(VerticaTableDataset.class);
        Assertions.assertEquals("iqywlpxmliyt", model.description());
        Assertions.assertEquals("rhyvs", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("xvvmrnjrdi").type());
        Assertions.assertEquals("gwjekyqirvcpoln", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VerticaTableDataset model = new VerticaTableDataset().withDescription("iqywlpxmliyt")
            .withStructure("datagcrun")
            .withSchema("datailxstekb")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("rhyvs")
                .withParameters(mapOf("kltrvgioguoxc", "datariemorszffi", "gxgrggy", "datadqoxhdenmj")))
            .withParameters(mapOf("xvvmrnjrdi",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("dataqinr"), "gcmpnc",
                new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("dataqswsychdcj")))
            .withAnnotations(Arrays.asList("datagbnoqnowvfxe"))
            .withFolder(new DatasetFolder().withName("gwjekyqirvcpoln"))
            .withTableName("datakuobclobnaqeizpl")
            .withTable("datalyugpnn")
            .withSchemaTypePropertiesSchema("datajmkffeonmnvmu");
        model = BinaryData.fromObject(model).toObject(VerticaTableDataset.class);
        Assertions.assertEquals("iqywlpxmliyt", model.description());
        Assertions.assertEquals("rhyvs", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("xvvmrnjrdi").type());
        Assertions.assertEquals("gwjekyqirvcpoln", model.folder().name());
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
