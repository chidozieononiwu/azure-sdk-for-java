// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.onlineexperimentation.generated;

/**
 * Samples for OnlineExperimentWorkspaces Delete.
 */
public final class OnlineExperimentWorkspacesDeleteSamples {
    /*
     * x-ms-original-file: 2025-05-31-preview/OnlineExperimentWorkspaces_Delete.json
     */
    /**
     * Sample code: Delete an Online Experiment Workspace.
     * 
     * @param manager Entry point to OnlineExperimentationManager.
     */
    public static void deleteAnOnlineExperimentWorkspace(
        com.azure.resourcemanager.onlineexperimentation.OnlineExperimentationManager manager) {
        manager.onlineExperimentWorkspaces().delete("res9871", "expworkspace3", com.azure.core.util.Context.NONE);
    }
}
