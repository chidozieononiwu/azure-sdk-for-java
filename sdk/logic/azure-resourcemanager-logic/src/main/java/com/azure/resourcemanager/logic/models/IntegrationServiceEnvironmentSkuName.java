// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for IntegrationServiceEnvironmentSkuName. */
public final class IntegrationServiceEnvironmentSkuName
    extends ExpandableStringEnum<IntegrationServiceEnvironmentSkuName> {
    /** Static value NotSpecified for IntegrationServiceEnvironmentSkuName. */
    public static final IntegrationServiceEnvironmentSkuName NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Premium for IntegrationServiceEnvironmentSkuName. */
    public static final IntegrationServiceEnvironmentSkuName PREMIUM = fromString("Premium");

    /** Static value Developer for IntegrationServiceEnvironmentSkuName. */
    public static final IntegrationServiceEnvironmentSkuName DEVELOPER = fromString("Developer");

    /**
     * Creates or finds a IntegrationServiceEnvironmentSkuName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IntegrationServiceEnvironmentSkuName.
     */
    @JsonCreator
    public static IntegrationServiceEnvironmentSkuName fromString(String name) {
        return fromString(name, IntegrationServiceEnvironmentSkuName.class);
    }

    /** @return known IntegrationServiceEnvironmentSkuName values. */
    public static Collection<IntegrationServiceEnvironmentSkuName> values() {
        return values(IntegrationServiceEnvironmentSkuName.class);
    }
}
