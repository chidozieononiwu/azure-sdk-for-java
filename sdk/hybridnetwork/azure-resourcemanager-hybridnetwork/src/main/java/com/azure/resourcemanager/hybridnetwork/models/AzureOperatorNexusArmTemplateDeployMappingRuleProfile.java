// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure Operator Distributed Services template deploy mapping rule profile.
 */
@Fluent
public final class AzureOperatorNexusArmTemplateDeployMappingRuleProfile extends MappingRuleProfile {
    /*
     * The template mapping rule profile.
     */
    @JsonProperty(value = "templateMappingRuleProfile")
    private ArmTemplateMappingRuleProfile templateMappingRuleProfile;

    /**
     * Creates an instance of AzureOperatorNexusArmTemplateDeployMappingRuleProfile class.
     */
    public AzureOperatorNexusArmTemplateDeployMappingRuleProfile() {
    }

    /**
     * Get the templateMappingRuleProfile property: The template mapping rule profile.
     * 
     * @return the templateMappingRuleProfile value.
     */
    public ArmTemplateMappingRuleProfile templateMappingRuleProfile() {
        return this.templateMappingRuleProfile;
    }

    /**
     * Set the templateMappingRuleProfile property: The template mapping rule profile.
     * 
     * @param templateMappingRuleProfile the templateMappingRuleProfile value to set.
     * @return the AzureOperatorNexusArmTemplateDeployMappingRuleProfile object itself.
     */
    public AzureOperatorNexusArmTemplateDeployMappingRuleProfile
        withTemplateMappingRuleProfile(ArmTemplateMappingRuleProfile templateMappingRuleProfile) {
        this.templateMappingRuleProfile = templateMappingRuleProfile;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureOperatorNexusArmTemplateDeployMappingRuleProfile
        withApplicationEnablement(ApplicationEnablement applicationEnablement) {
        super.withApplicationEnablement(applicationEnablement);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (templateMappingRuleProfile() != null) {
            templateMappingRuleProfile().validate();
        }
    }
}
