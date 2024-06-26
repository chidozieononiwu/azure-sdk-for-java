// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.RegulatoryComplianceAssessmentProperties;
import com.azure.resourcemanager.security.models.State;
import org.junit.jupiter.api.Assertions;

public final class RegulatoryComplianceAssessmentPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RegulatoryComplianceAssessmentProperties model = BinaryData.fromString(
            "{\"description\":\"washr\",\"assessmentType\":\"tkcnqxwb\",\"assessmentDetailsLink\":\"kulpiujwaasi\",\"state\":\"Passed\",\"passedResources\":1035814224,\"failedResources\":675446410,\"skippedResources\":549865384,\"unsupportedResources\":1223650177}")
            .toObject(RegulatoryComplianceAssessmentProperties.class);
        Assertions.assertEquals(State.PASSED, model.state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RegulatoryComplianceAssessmentProperties model
            = new RegulatoryComplianceAssessmentProperties().withState(State.PASSED);
        model = BinaryData.fromObject(model).toObject(RegulatoryComplianceAssessmentProperties.class);
        Assertions.assertEquals(State.PASSED, model.state());
    }
}
