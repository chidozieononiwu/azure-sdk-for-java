// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.CustomAssessmentAutomationRequest;
import com.azure.resourcemanager.security.models.SeverityEnum;
import com.azure.resourcemanager.security.models.SupportedCloudEnum;
import org.junit.jupiter.api.Assertions;

public final class CustomAssessmentAutomationRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomAssessmentAutomationRequest model = BinaryData.fromString(
            "{\"properties\":{\"compressedQuery\":\"gszufoxciqopid\",\"supportedCloud\":\"GCP\",\"severity\":\"Medium\",\"displayName\":\"dhkha\",\"description\":\"khnzbonlw\",\"remediationDescription\":\"oegokdwbwh\"},\"id\":\"szzcmrvexztv\",\"name\":\"t\",\"type\":\"gsfraoyzkoow\"}")
            .toObject(CustomAssessmentAutomationRequest.class);
        Assertions.assertEquals("gszufoxciqopid", model.compressedQuery());
        Assertions.assertEquals(SupportedCloudEnum.GCP, model.supportedCloud());
        Assertions.assertEquals(SeverityEnum.MEDIUM, model.severity());
        Assertions.assertEquals("dhkha", model.displayName());
        Assertions.assertEquals("khnzbonlw", model.description());
        Assertions.assertEquals("oegokdwbwh", model.remediationDescription());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomAssessmentAutomationRequest model
            = new CustomAssessmentAutomationRequest().withCompressedQuery("gszufoxciqopid")
                .withSupportedCloud(SupportedCloudEnum.GCP).withSeverity(SeverityEnum.MEDIUM).withDisplayName("dhkha")
                .withDescription("khnzbonlw").withRemediationDescription("oegokdwbwh");
        model = BinaryData.fromObject(model).toObject(CustomAssessmentAutomationRequest.class);
        Assertions.assertEquals("gszufoxciqopid", model.compressedQuery());
        Assertions.assertEquals(SupportedCloudEnum.GCP, model.supportedCloud());
        Assertions.assertEquals(SeverityEnum.MEDIUM, model.severity());
        Assertions.assertEquals("dhkha", model.displayName());
        Assertions.assertEquals("khnzbonlw", model.description());
        Assertions.assertEquals("oegokdwbwh", model.remediationDescription());
    }
}
