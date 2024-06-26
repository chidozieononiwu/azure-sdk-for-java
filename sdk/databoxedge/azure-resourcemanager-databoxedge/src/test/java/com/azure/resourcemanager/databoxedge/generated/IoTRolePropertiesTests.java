// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databoxedge.fluent.models.IoTRoleProperties;
import com.azure.resourcemanager.databoxedge.models.Authentication;
import com.azure.resourcemanager.databoxedge.models.IoTDeviceInfo;
import com.azure.resourcemanager.databoxedge.models.MountPointMap;
import com.azure.resourcemanager.databoxedge.models.PlatformType;
import com.azure.resourcemanager.databoxedge.models.RoleStatus;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class IoTRolePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IoTRoleProperties model =
            BinaryData
                .fromString(
                    "{\"hostPlatform\":\"Windows\",\"ioTDeviceDetails\":{\"deviceId\":\"skdsnfdsdoakg\",\"ioTHostHub\":\"dlmkkzevdl\",\"ioTHostHubId\":\"wpusdsttwvogv\",\"authentication\":{}},\"ioTEdgeDeviceDetails\":{\"deviceId\":\"jdcngqqm\",\"ioTHostHub\":\"akufgmjz\",\"ioTHostHubId\":\"rdgrtw\",\"authentication\":{}},\"shareMappings\":[{\"shareId\":\"zkopb\",\"roleId\":\"nrfdw\",\"mountPoint\":\"uhhziuiefozbhdm\",\"roleType\":\"IOT\"},{\"shareId\":\"mzqhoftrmaequi\",\"roleId\":\"xicslfao\",\"mountPoint\":\"piyylhalnswhccsp\",\"roleType\":\"Functions\"},{\"shareId\":\"ivwitqscywugg\",\"roleId\":\"luhczbw\",\"mountPoint\":\"hairsbrgzdwms\",\"roleType\":\"Functions\"}],\"roleStatus\":\"Enabled\"}")
                .toObject(IoTRoleProperties.class);
        Assertions.assertEquals(PlatformType.WINDOWS, model.hostPlatform());
        Assertions.assertEquals("skdsnfdsdoakg", model.ioTDeviceDetails().deviceId());
        Assertions.assertEquals("dlmkkzevdl", model.ioTDeviceDetails().ioTHostHub());
        Assertions.assertEquals("wpusdsttwvogv", model.ioTDeviceDetails().ioTHostHubId());
        Assertions.assertEquals("jdcngqqm", model.ioTEdgeDeviceDetails().deviceId());
        Assertions.assertEquals("akufgmjz", model.ioTEdgeDeviceDetails().ioTHostHub());
        Assertions.assertEquals("rdgrtw", model.ioTEdgeDeviceDetails().ioTHostHubId());
        Assertions.assertEquals("zkopb", model.shareMappings().get(0).shareId());
        Assertions.assertEquals(RoleStatus.ENABLED, model.roleStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IoTRoleProperties model =
            new IoTRoleProperties()
                .withHostPlatform(PlatformType.WINDOWS)
                .withIoTDeviceDetails(
                    new IoTDeviceInfo()
                        .withDeviceId("skdsnfdsdoakg")
                        .withIoTHostHub("dlmkkzevdl")
                        .withIoTHostHubId("wpusdsttwvogv")
                        .withAuthentication(new Authentication()))
                .withIoTEdgeDeviceDetails(
                    new IoTDeviceInfo()
                        .withDeviceId("jdcngqqm")
                        .withIoTHostHub("akufgmjz")
                        .withIoTHostHubId("rdgrtw")
                        .withAuthentication(new Authentication()))
                .withShareMappings(
                    Arrays
                        .asList(
                            new MountPointMap().withShareId("zkopb"),
                            new MountPointMap().withShareId("mzqhoftrmaequi"),
                            new MountPointMap().withShareId("ivwitqscywugg")))
                .withRoleStatus(RoleStatus.ENABLED);
        model = BinaryData.fromObject(model).toObject(IoTRoleProperties.class);
        Assertions.assertEquals(PlatformType.WINDOWS, model.hostPlatform());
        Assertions.assertEquals("skdsnfdsdoakg", model.ioTDeviceDetails().deviceId());
        Assertions.assertEquals("dlmkkzevdl", model.ioTDeviceDetails().ioTHostHub());
        Assertions.assertEquals("wpusdsttwvogv", model.ioTDeviceDetails().ioTHostHubId());
        Assertions.assertEquals("jdcngqqm", model.ioTEdgeDeviceDetails().deviceId());
        Assertions.assertEquals("akufgmjz", model.ioTEdgeDeviceDetails().ioTHostHub());
        Assertions.assertEquals("rdgrtw", model.ioTEdgeDeviceDetails().ioTHostHubId());
        Assertions.assertEquals("zkopb", model.shareMappings().get(0).shareId());
        Assertions.assertEquals(RoleStatus.ENABLED, model.roleStatus());
    }
}
