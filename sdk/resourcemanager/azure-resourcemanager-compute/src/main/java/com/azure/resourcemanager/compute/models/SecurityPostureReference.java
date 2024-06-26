// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.fluent.models.VirtualMachineExtensionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Specifies the security posture to be used for all virtual machines in the scale set. Minimum api-version:
 * 2023-03-01.
 */
@Fluent
public final class SecurityPostureReference {
    /*
     * The security posture reference id in the form of
     * /CommunityGalleries/{communityGalleryName}/securityPostures/{securityPostureName}/versions/{major.minor.patch}|{
     * major.*}|latest
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * List of virtual machine extensions to exclude when applying the Security Posture.
     */
    @JsonProperty(value = "excludeExtensions")
    private List<VirtualMachineExtensionInner> excludeExtensions;

    /**
     * Creates an instance of SecurityPostureReference class.
     */
    public SecurityPostureReference() {
    }

    /**
     * Get the id property: The security posture reference id in the form of
     * /CommunityGalleries/{communityGalleryName}/securityPostures/{securityPostureName}/versions/{major.minor.patch}|{major.*}|latest.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The security posture reference id in the form of
     * /CommunityGalleries/{communityGalleryName}/securityPostures/{securityPostureName}/versions/{major.minor.patch}|{major.*}|latest.
     * 
     * @param id the id value to set.
     * @return the SecurityPostureReference object itself.
     */
    public SecurityPostureReference withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the excludeExtensions property: List of virtual machine extensions to exclude when applying the Security
     * Posture.
     * 
     * @return the excludeExtensions value.
     */
    public List<VirtualMachineExtensionInner> excludeExtensions() {
        return this.excludeExtensions;
    }

    /**
     * Set the excludeExtensions property: List of virtual machine extensions to exclude when applying the Security
     * Posture.
     * 
     * @param excludeExtensions the excludeExtensions value to set.
     * @return the SecurityPostureReference object itself.
     */
    public SecurityPostureReference withExcludeExtensions(List<VirtualMachineExtensionInner> excludeExtensions) {
        this.excludeExtensions = excludeExtensions;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (excludeExtensions() != null) {
            excludeExtensions().forEach(e -> e.validate());
        }
    }
}
