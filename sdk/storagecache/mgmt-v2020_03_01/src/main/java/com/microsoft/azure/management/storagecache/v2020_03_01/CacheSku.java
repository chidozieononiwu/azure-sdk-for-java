/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2020_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SKU for the Cache.
 */
public class CacheSku {
    /**
     * SKU name for this Cache.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get sKU name for this Cache.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set sKU name for this Cache.
     *
     * @param name the name value to set
     * @return the CacheSku object itself.
     */
    public CacheSku withName(String name) {
        this.name = name;
        return this;
    }

}
