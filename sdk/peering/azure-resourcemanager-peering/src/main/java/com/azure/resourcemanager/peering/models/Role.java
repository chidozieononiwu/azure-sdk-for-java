// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Role. */
public final class Role extends ExpandableStringEnum<Role> {
    /** Static value Noc for Role. */
    public static final Role NOC = fromString("Noc");

    /** Static value Policy for Role. */
    public static final Role POLICY = fromString("Policy");

    /** Static value Technical for Role. */
    public static final Role TECHNICAL = fromString("Technical");

    /** Static value Service for Role. */
    public static final Role SERVICE = fromString("Service");

    /** Static value Escalation for Role. */
    public static final Role ESCALATION = fromString("Escalation");

    /** Static value Other for Role. */
    public static final Role OTHER = fromString("Other");

    /**
     * Creates or finds a Role from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Role.
     */
    @JsonCreator
    public static Role fromString(String name) {
        return fromString(name, Role.class);
    }

    /** @return known Role values. */
    public static Collection<Role> values() {
        return values(Role.class);
    }
}
