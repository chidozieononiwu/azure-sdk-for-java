// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotoperations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iotoperations.implementation.models.InstanceResourceListResult;
import com.azure.resourcemanager.iotoperations.models.ExtendedLocationType;
import com.azure.resourcemanager.iotoperations.models.InstanceFeatureMode;
import com.azure.resourcemanager.iotoperations.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.iotoperations.models.OperationalMode;
import org.junit.jupiter.api.Assertions;

public final class InstanceResourceListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InstanceResourceListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"description\":\"cuertu\",\"provisioningState\":\"Failed\",\"version\":\"svqwhbmdgbbjfd\",\"schemaRegistryRef\":{\"resourceId\":\"gmbmbexppbh\"},\"features\":{\"fqawrlyxw\":{\"mode\":\"Preview\",\"settings\":{\"fpsalgbqu\":\"Enabled\",\"gjyjgzjaoyfhrtxi\":\"Enabled\",\"erkujys\":\"Enabled\",\"eju\":\"Enabled\"}},\"nguitnwuizgazxu\":{\"mode\":\"Disabled\",\"settings\":{\"nwbxgjvtbvpyssz\":\"Disabled\",\"rujqg\":\"Enabled\",\"muouqfp\":\"Disabled\",\"zw\":\"Disabled\"}}}},\"extendedLocation\":{\"name\":\"izuckyfihrfidfvz\",\"type\":\"CustomLocation\"},\"identity\":{\"principalId\":\"htymw\",\"tenantId\":\"dkfthwxmnt\",\"type\":\"None\",\"userAssignedIdentities\":{\"mzidnsezcxtb\":{\"clientId\":\"pvkmijcmmxdcuf\",\"principalId\":\"srp\"}}},\"location\":\"gfycc\",\"tags\":{\"flnrosfqpteehzz\":\"wmdwzjeiachboo\",\"swjdkirso\":\"ypyqrimzinp\"},\"id\":\"dqxhcrmnohjtckwh\",\"name\":\"soifiyipjxsqw\",\"type\":\"gr\"},{\"properties\":{\"description\":\"norcjxvsnbyxqab\",\"provisioningState\":\"Provisioning\",\"version\":\"pcyshu\",\"schemaRegistryRef\":{\"resourceId\":\"zafb\"},\"features\":{\"kudjkrlkhb\":{\"mode\":\"Stable\",\"settings\":{\"qcjm\":\"Enabled\",\"javbqidtqajz\":\"Enabled\",\"l\":\"Disabled\"}}}},\"extendedLocation\":{\"name\":\"hfepgzgqex\",\"type\":\"CustomLocation\"},\"identity\":{\"principalId\":\"xscpaierhhbc\",\"tenantId\":\"l\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"pxokajionp\":{\"clientId\":\"tjaodxobnb\",\"principalId\":\"k\"}}},\"location\":\"ex\",\"tags\":{\"dg\":\"xgcp\",\"djwzrlov\":\"aajrm\",\"qsqsy\":\"clwhijcoejctbz\",\"ppofmxaxcfjpgdd\":\"bkbfkgukdkex\"},\"id\":\"ocjjxhvpmouexh\",\"name\":\"zxibqeoj\",\"type\":\"xqbzvddntwnd\"},{\"properties\":{\"description\":\"btwnpzaoqvuhrhcf\",\"provisioningState\":\"Provisioning\",\"version\":\"dglmjthjqkwp\",\"schemaRegistryRef\":{\"resourceId\":\"eicxmqciwqvhkhi\"},\"features\":{\"uhrzayvvt\":{\"mode\":\"Disabled\",\"settings\":{\"bob\":\"Enabled\",\"ghmewuam\":\"Enabled\"}},\"gxlefgugnxkrxd\":{\"mode\":\"Disabled\",\"settings\":{\"iotkftutqxl\":\"Disabled\"}},\"big\":{\"mode\":\"Preview\",\"settings\":{\"hzrvqd\":\"Enabled\",\"bhj\":\"Enabled\"}}}},\"extendedLocation\":{\"name\":\"h\",\"type\":\"CustomLocation\"},\"identity\":{\"principalId\":\"owskanyktz\",\"tenantId\":\"u\",\"type\":\"None\",\"userAssignedIdentities\":{\"fvm\":{\"clientId\":\"ywgndrv\",\"principalId\":\"hzgpphrcgyncocpe\"},\"mivkwlzuvcc\":{\"clientId\":\"oo\",\"principalId\":\"xlzevgbmqjqabcy\"},\"bqqwxrj\":{\"clientId\":\"nfnbacfionlebxe\",\"principalId\":\"gtzxdpn\"}}},\"location\":\"al\",\"tags\":{\"snjampmng\":\"sub\",\"chcbonqvpkvlrxnj\":\"zscxaqwo\",\"pheoflokeyy\":\"ase\"},\"id\":\"enjbdlwtgrhp\",\"name\":\"jp\",\"type\":\"umasxazjpq\"}],\"nextLink\":\"gual\"}")
            .toObject(InstanceResourceListResult.class);
        Assertions.assertEquals("gfycc", model.value().get(0).location());
        Assertions.assertEquals("wmdwzjeiachboo", model.value().get(0).tags().get("flnrosfqpteehzz"));
        Assertions.assertEquals("cuertu", model.value().get(0).properties().description());
        Assertions.assertEquals("gmbmbexppbh", model.value().get(0).properties().schemaRegistryRef().resourceId());
        Assertions.assertEquals(InstanceFeatureMode.PREVIEW,
            model.value().get(0).properties().features().get("fqawrlyxw").mode());
        Assertions.assertEquals(OperationalMode.ENABLED,
            model.value().get(0).properties().features().get("fqawrlyxw").settings().get("fpsalgbqu"));
        Assertions.assertEquals("izuckyfihrfidfvz", model.value().get(0).extendedLocation().name());
        Assertions.assertEquals(ExtendedLocationType.CUSTOM_LOCATION, model.value().get(0).extendedLocation().type());
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.value().get(0).identity().type());
        Assertions.assertEquals("gual", model.nextLink());
    }
}
