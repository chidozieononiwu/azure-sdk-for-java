// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.resourcemanager.servicefabric.fluent.models.ApplicationTypeResourceListInner;
import java.util.List;

/** An immutable client-side representation of ApplicationTypeResourceList. */
public interface ApplicationTypeResourceList {
    /**
     * Gets the value property: The value property.
     *
     * @return the value value.
     */
    List<ApplicationTypeResource> value();

    /**
     * Gets the nextLink property: URL to get the next set of application type list results if there are any.
     *
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner com.azure.resourcemanager.servicefabric.fluent.models.ApplicationTypeResourceListInner object.
     *
     * @return the inner object.
     */
    ApplicationTypeResourceListInner innerModel();
}
