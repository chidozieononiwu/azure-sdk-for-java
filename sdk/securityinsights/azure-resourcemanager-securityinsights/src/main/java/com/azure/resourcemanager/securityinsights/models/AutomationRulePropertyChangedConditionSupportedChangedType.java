// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AutomationRulePropertyChangedConditionSupportedChangedType. */
public final class AutomationRulePropertyChangedConditionSupportedChangedType
    extends ExpandableStringEnum<AutomationRulePropertyChangedConditionSupportedChangedType> {
    /** Static value ChangedFrom for AutomationRulePropertyChangedConditionSupportedChangedType. */
    public static final AutomationRulePropertyChangedConditionSupportedChangedType CHANGED_FROM =
        fromString("ChangedFrom");

    /** Static value ChangedTo for AutomationRulePropertyChangedConditionSupportedChangedType. */
    public static final AutomationRulePropertyChangedConditionSupportedChangedType CHANGED_TO = fromString("ChangedTo");

    /**
     * Creates or finds a AutomationRulePropertyChangedConditionSupportedChangedType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AutomationRulePropertyChangedConditionSupportedChangedType.
     */
    @JsonCreator
    public static AutomationRulePropertyChangedConditionSupportedChangedType fromString(String name) {
        return fromString(name, AutomationRulePropertyChangedConditionSupportedChangedType.class);
    }

    /**
     * Gets known AutomationRulePropertyChangedConditionSupportedChangedType values.
     *
     * @return known AutomationRulePropertyChangedConditionSupportedChangedType values.
     */
    public static Collection<AutomationRulePropertyChangedConditionSupportedChangedType> values() {
        return values(AutomationRulePropertyChangedConditionSupportedChangedType.class);
    }
}
