// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Parameters to Provision ILR API. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = IlrRequest.class)
@JsonTypeName("IlrRequest")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureFileShareProvisionILRRequest", value = AzureFileShareProvisionIlrRequest.class),
    @JsonSubTypes.Type(name = "IaasVMILRRegistrationRequest", value = IaasVmilrRegistrationRequest.class)
})
@Immutable
public class IlrRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IlrRequest.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
