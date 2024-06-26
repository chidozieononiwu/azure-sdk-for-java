// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.developer.devcenter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Indicates the Dev Box compute.
 */
public final class SkuName extends ExpandableStringEnum<SkuName> {

    /**
     * Intel, 8 vCPU, 32 GB RAM, 256 GB Storage.
     */
    @Generated
    public static final SkuName GENERAL_I_8C32GB256SSD_V2 = fromString("general_i_8c32gb256ssd_v2");

    /**
     * Intel, 8 vCPU, 32 GB RAM, 512 GB Storage.
     */
    @Generated
    public static final SkuName GENERAL_I_8C32GB512SSD_V2 = fromString("general_i_8c32gb512ssd_v2");

    /**
     * Intel, 8 vCPU, 32 GB RAM, 1024 GB Storage.
     */
    @Generated
    public static final SkuName GENERAL_I_8C32GB1024SSD_V2 = fromString("general_i_8c32gb1024ssd_v2");

    /**
     * Intel, 8 vCPU, 32 GB RAM, 2048 GB Storage.
     */
    @Generated
    public static final SkuName GENERAL_I_8C32GB2048SSD_V2 = fromString("general_i_8c32gb2048ssd_v2");

    /**
     * Intel, 16 vCPU, 64 GB RAM, 256 GB Storage.
     */
    @Generated
    public static final SkuName GENERAL_I_16C64GB256SSD_V2 = fromString("general_i_16c64gb256ssd_v2");

    /**
     * Intel, 16 vCPU, 64 GB RAM, 512 GB Storage.
     */
    @Generated
    public static final SkuName GENERAL_I_16C64GB512SSD_V2 = fromString("general_i_16c64gb512ssd_v2");

    /**
     * Intel, 16 vCPU, 64 GB RAM, 1024 GB Storage.
     */
    @Generated
    public static final SkuName GENERAL_I_16C64GB1024SSD_V2 = fromString("general_i_16c64gb1024ssd_v2");

    /**
     * Intel, 16 vCPU, 64 GB RAM, 2048 GB Storage.
     */
    @Generated
    public static final SkuName GENERAL_I_16C64GB2048SSD_V2 = fromString("general_i_16c64gb2048ssd_v2");

    /**
     * Intel, 32 vCPU, 128 GB RAM, 512 GB Storage.
     */
    @Generated
    public static final SkuName GENERAL_I_32C128GB512SSD_V2 = fromString("general_i_32c128gb512ssd_v2");

    /**
     * Intel, 32 vCPU, 128 GB RAM, 1024 GB Storage.
     */
    @Generated
    public static final SkuName GENERAL_I_32C128GB1024SSD_V2 = fromString("general_i_32c128gb1024ssd_v2");

    /**
     * Intel, 32 vCPU, 128 GB RAM, 2048 GB Storage.
     */
    @Generated
    public static final SkuName GENERAL_I_32C128GB2048SSD_V2 = fromString("general_i_32c128gb2048ssd_v2");

    /**
     * AMD, 8 vCPU, 32 GB RAM, 256 GB Storage.
     */
    @Generated
    public static final SkuName GENERAL_A_8C32GB256SSD_V2 = fromString("general_a_8c32gb256ssd_v2");

    /**
     * AMD, 8 vCPU, 32 GB RAM, 512 GB Storage.
     */
    @Generated
    public static final SkuName GENERAL_A_8C32GB512SSD_V2 = fromString("general_a_8c32gb512ssd_v2");

    /**
     * AMD, 8 vCPU, 32 GB RAM, 1024 GB Storage.
     */
    @Generated
    public static final SkuName GENERAL_A_8C32GB1024SSD_V2 = fromString("general_a_8c32gb1024ssd_v2");

    /**
     * AMD, 8 vCPU, 32 GB RAM, 2048 GB Storage.
     */
    @Generated
    public static final SkuName GENERAL_A_8C32GB2048SSD_V2 = fromString("general_a_8c32gb2048ssd_v2");

    /**
     * AMD, 16 vCPU, 64 GB RAM, 256 GB Storage.
     */
    @Generated
    public static final SkuName GENERAL_A_16C64GB256SSD_V2 = fromString("general_a_16c64gb256ssd_v2");

    /**
     * AMD, 16 vCPU, 64 GB RAM, 512 GB Storage.
     */
    @Generated
    public static final SkuName GENERAL_A_16C64GB512SSD_V2 = fromString("general_a_16c64gb512ssd_v2");

    /**
     * AMD, 16 vCPU, 64 GB RAM, 1024 GB Storage.
     */
    @Generated
    public static final SkuName GENERAL_A_16C64GB1024SSD_V2 = fromString("general_a_16c64gb1024ssd_v2");

    /**
     * AMD, 16 vCPU, 64 GB RAM, 2048 GB Storage.
     */
    @Generated
    public static final SkuName GENERAL_A_16C64GB2048SSD_V2 = fromString("general_a_16c64gb2048ssd_v2");

    /**
     * AMD, 32 vCPU, 128 GB RAM, 512 GB Storage.
     */
    @Generated
    public static final SkuName GENERAL_A_32C128GB512SSD_V2 = fromString("general_a_32c128gb512ssd_v2");

    /**
     * AMD, 32 vCPU, 128 GB RAM, 1024 GB Storage.
     */
    @Generated
    public static final SkuName GENERAL_A_32C128GB1024SSD_V2 = fromString("general_a_32c128gb1024ssd_v2");

    /**
     * AMD, 32 vCPU, 128 GB RAM, 2048 GB Storage.
     */
    @Generated
    public static final SkuName GENERAL_A_32C128GB2048SSD_V2 = fromString("general_a_32c128gb2048ssd_v2");

    /**
     * Creates a new instance of SkuName value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public SkuName() {
    }

    /**
     * Creates or finds a SkuName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SkuName.
     */
    @Generated
    public static SkuName fromString(String name) {
        return fromString(name, SkuName.class);
    }

    /**
     * Gets known SkuName values.
     *
     * @return known SkuName values.
     */
    @Generated
    public static Collection<SkuName> values() {
        return values(SkuName.class);
    }
}
