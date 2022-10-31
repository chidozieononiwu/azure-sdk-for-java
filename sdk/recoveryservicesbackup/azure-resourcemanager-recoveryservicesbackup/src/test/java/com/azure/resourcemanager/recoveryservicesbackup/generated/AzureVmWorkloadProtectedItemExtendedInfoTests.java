// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureVmWorkloadProtectedItemExtendedInfo;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureVmWorkloadProtectedItemExtendedInfoTests {
    @Test
    public void testDeserialize() {
        AzureVmWorkloadProtectedItemExtendedInfo model =
            BinaryData
                .fromString(
                    "{\"oldestRecoveryPoint\":\"2021-06-09T18:03:53Z\",\"oldestRecoveryPointInVault\":\"2021-11-30T12:32:49Z\",\"oldestRecoveryPointInArchive\":\"2021-04-24T08:57:31Z\",\"newestRecoveryPointInArchive\":\"2021-10-18T22:32:47Z\",\"recoveryPointCount\":1058689711,\"policyState\":\"eewchpxlktw\",\"recoveryModel\":\"ziycslevufuztck\"}")
                .toObject(AzureVmWorkloadProtectedItemExtendedInfo.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-09T18:03:53Z"), model.oldestRecoveryPoint());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-30T12:32:49Z"), model.oldestRecoveryPointInVault());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-24T08:57:31Z"), model.oldestRecoveryPointInArchive());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-18T22:32:47Z"), model.newestRecoveryPointInArchive());
        Assertions.assertEquals(1058689711, model.recoveryPointCount());
        Assertions.assertEquals("eewchpxlktw", model.policyState());
        Assertions.assertEquals("ziycslevufuztck", model.recoveryModel());
    }

    @Test
    public void testSerialize() {
        AzureVmWorkloadProtectedItemExtendedInfo model =
            new AzureVmWorkloadProtectedItemExtendedInfo()
                .withOldestRecoveryPoint(OffsetDateTime.parse("2021-06-09T18:03:53Z"))
                .withOldestRecoveryPointInVault(OffsetDateTime.parse("2021-11-30T12:32:49Z"))
                .withOldestRecoveryPointInArchive(OffsetDateTime.parse("2021-04-24T08:57:31Z"))
                .withNewestRecoveryPointInArchive(OffsetDateTime.parse("2021-10-18T22:32:47Z"))
                .withRecoveryPointCount(1058689711)
                .withPolicyState("eewchpxlktw")
                .withRecoveryModel("ziycslevufuztck");
        model = BinaryData.fromObject(model).toObject(AzureVmWorkloadProtectedItemExtendedInfo.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-09T18:03:53Z"), model.oldestRecoveryPoint());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-30T12:32:49Z"), model.oldestRecoveryPointInVault());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-24T08:57:31Z"), model.oldestRecoveryPointInArchive());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-18T22:32:47Z"), model.newestRecoveryPointInArchive());
        Assertions.assertEquals(1058689711, model.recoveryPointCount());
        Assertions.assertEquals("eewchpxlktw", model.policyState());
        Assertions.assertEquals("ziycslevufuztck", model.recoveryModel());
    }
}