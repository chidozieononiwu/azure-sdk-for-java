// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.selfhelp.fluent.models.SolutionResourceSelfHelpInner;
import com.azure.resourcemanager.selfhelp.models.ReplacementMapsSelfHelp;
import com.azure.resourcemanager.selfhelp.models.SectionSelfHelp;
import com.azure.resourcemanager.selfhelp.models.SolutionResourceSelfHelp;
import java.util.Collections;
import java.util.List;

public final class SolutionResourceSelfHelpImpl implements SolutionResourceSelfHelp {
    private SolutionResourceSelfHelpInner innerObject;

    private final com.azure.resourcemanager.selfhelp.SelfHelpManager serviceManager;

    SolutionResourceSelfHelpImpl(SolutionResourceSelfHelpInner innerObject,
        com.azure.resourcemanager.selfhelp.SelfHelpManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String solutionId() {
        return this.innerModel().solutionId();
    }

    public String title() {
        return this.innerModel().title();
    }

    public String content() {
        return this.innerModel().content();
    }

    public ReplacementMapsSelfHelp replacementMaps() {
        return this.innerModel().replacementMaps();
    }

    public List<SectionSelfHelp> sections() {
        List<SectionSelfHelp> inner = this.innerModel().sections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SolutionResourceSelfHelpInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.selfhelp.SelfHelpManager manager() {
        return this.serviceManager;
    }
}
