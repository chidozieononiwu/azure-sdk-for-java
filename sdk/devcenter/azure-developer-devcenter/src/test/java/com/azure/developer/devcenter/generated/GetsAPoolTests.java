// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.developer.devcenter.models.DevBoxHardwareProfile;
import com.azure.developer.devcenter.models.DevBoxImageReference;
import com.azure.developer.devcenter.models.DevBoxOsType;
import com.azure.developer.devcenter.models.DevBoxPool;
import com.azure.developer.devcenter.models.DevBoxStorageProfile;
import com.azure.developer.devcenter.models.HibernateSupport;
import com.azure.developer.devcenter.models.OsDisk;
import com.azure.developer.devcenter.models.PoolHealthStatus;
import com.azure.developer.devcenter.models.StopOnDisconnectConfiguration;
import com.azure.developer.devcenter.models.StopOnDisconnectStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public final class GetsAPoolTests extends DevCenterClientTestBase {
    @Test
    @Disabled
    public void testGetsAPoolTests() {
        // method invocation
        DevBoxPool response = devBoxesClient.getPool("myProject", "DevPool");

        // response assertion
        Assertions.assertNotNull(response);
        // verify property "name"
        Assertions.assertEquals("LargeDevWorkStationPool", response.getName());
        // verify property "location"
        Assertions.assertEquals("centralus", response.getLocation());
        // verify property "osType"
        Assertions.assertEquals(DevBoxOsType.WINDOWS, response.getOsType());
        // verify property "hardwareProfile"
        DevBoxHardwareProfile responseHardwareProfile = response.getHardwareProfile();
        Assertions.assertNotNull(responseHardwareProfile);
        Assertions.assertEquals(8, responseHardwareProfile.getVCpus());
        Assertions.assertEquals(32, responseHardwareProfile.getMemoryGb());
        // verify property "hibernateSupport"
        Assertions.assertEquals(HibernateSupport.ENABLED, response.getHibernateSupport());
        // verify property "storageProfile"
        DevBoxStorageProfile responseStorageProfile = response.getStorageProfile();
        Assertions.assertNotNull(responseStorageProfile);
        OsDisk responseStorageProfileOsDisk = responseStorageProfile.getOsDisk();
        Assertions.assertNotNull(responseStorageProfileOsDisk);
        Assertions.assertEquals(1024, responseStorageProfileOsDisk.getDiskSizeGb());
        // verify property "imageReference"
        DevBoxImageReference responseImageReference = response.getImageReference();
        Assertions.assertNotNull(responseImageReference);
        Assertions.assertEquals("DevImage", responseImageReference.getName());
        Assertions.assertEquals("1.0.0", responseImageReference.getVersion());
        Assertions.assertNotNull(responseImageReference.getPublishedDate());
        // verify property "stopOnDisconnect"
        StopOnDisconnectConfiguration responseStopOnDisconnect = response.getStopOnDisconnect();
        Assertions.assertNotNull(responseStopOnDisconnect);
        Assertions.assertEquals(StopOnDisconnectStatus.ENABLED, responseStopOnDisconnect.getStatus());
        Assertions.assertEquals(60, responseStopOnDisconnect.getGracePeriodMinutes());
        // verify property "healthStatus"
        Assertions.assertEquals(PoolHealthStatus.HEALTHY, response.getHealthStatus());
    }
}
