// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectory;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectoryType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SqlDataDirectoryTests {
    @Test
    public void testDeserialize() {
        SqlDataDirectory model =
            BinaryData
                .fromString("{\"type\":\"Data\",\"path\":\"wwpgdakchzyvlixq\",\"logicalName\":\"kcxk\"}")
                .toObject(SqlDataDirectory.class);
        Assertions.assertEquals(SqlDataDirectoryType.DATA, model.type());
        Assertions.assertEquals("wwpgdakchzyvlixq", model.path());
        Assertions.assertEquals("kcxk", model.logicalName());
    }

    @Test
    public void testSerialize() {
        SqlDataDirectory model =
            new SqlDataDirectory()
                .withType(SqlDataDirectoryType.DATA)
                .withPath("wwpgdakchzyvlixq")
                .withLogicalName("kcxk");
        model = BinaryData.fromObject(model).toObject(SqlDataDirectory.class);
        Assertions.assertEquals(SqlDataDirectoryType.DATA, model.type());
        Assertions.assertEquals("wwpgdakchzyvlixq", model.path());
        Assertions.assertEquals("kcxk", model.logicalName());
    }
}