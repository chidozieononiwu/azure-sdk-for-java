// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DevOpsProvisioningState;
import com.azure.resourcemanager.security.models.GitHubRepositoryProperties;
import com.azure.resourcemanager.security.models.OnboardingState;
import org.junit.jupiter.api.Assertions;

public final class GitHubRepositoryPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GitHubRepositoryProperties model = BinaryData.fromString(
            "{\"provisioningStatusMessage\":\"hqvlnnpxybafiqg\",\"provisioningStatusUpdateTimeUtc\":\"2021-07-27T17:03:14Z\",\"provisioningState\":\"Canceled\",\"repoId\":\"jekglklbyuli\",\"repoName\":\"cwvmzegj\",\"repoFullName\":\"fhjirwgdnqzbrfk\",\"onboardingState\":\"Onboarded\",\"repoUrl\":\"zmtksjci\",\"parentOwnerName\":\"igsxcdgljplk\"}")
            .toObject(GitHubRepositoryProperties.class);
        Assertions.assertEquals(DevOpsProvisioningState.CANCELED, model.provisioningState());
        Assertions.assertEquals(OnboardingState.ONBOARDED, model.onboardingState());
        Assertions.assertEquals("igsxcdgljplk", model.parentOwnerName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GitHubRepositoryProperties model
            = new GitHubRepositoryProperties().withProvisioningState(DevOpsProvisioningState.CANCELED)
                .withOnboardingState(OnboardingState.ONBOARDED).withParentOwnerName("igsxcdgljplk");
        model = BinaryData.fromObject(model).toObject(GitHubRepositoryProperties.class);
        Assertions.assertEquals(DevOpsProvisioningState.CANCELED, model.provisioningState());
        Assertions.assertEquals(OnboardingState.ONBOARDED, model.onboardingState());
        Assertions.assertEquals("igsxcdgljplk", model.parentOwnerName());
    }
}
