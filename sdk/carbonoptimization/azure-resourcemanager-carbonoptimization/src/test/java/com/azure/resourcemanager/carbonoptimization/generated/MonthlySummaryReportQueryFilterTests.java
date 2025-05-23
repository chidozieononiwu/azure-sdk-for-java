// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.carbonoptimization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.carbonoptimization.models.DateRange;
import com.azure.resourcemanager.carbonoptimization.models.EmissionScopeEnum;
import com.azure.resourcemanager.carbonoptimization.models.MonthlySummaryReportQueryFilter;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MonthlySummaryReportQueryFilterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MonthlySummaryReportQueryFilter model = BinaryData.fromString(
            "{\"reportType\":\"MonthlySummaryReport\",\"dateRange\":{},\"subscriptionList\":[\"f\",\"dio\",\"jpslwejd\"],\"resourceGroupUrlList\":[\"ryo\",\"psoacctazakljl\",\"hbcryffdfdosyge\"],\"resourceTypeList\":[\"ojakhmsbzjhcrze\",\"dphlxaolt\",\"qtrgqjbpfzfsinzg\",\"f\"],\"locationList\":[\"wzo\",\"xjtfelluwfzit\",\"np\",\"qfpjk\"],\"carbonScopeList\":[\"Scope3\",\"Scope1\",\"Scope1\",\"Scope1\"]}")
            .toObject(MonthlySummaryReportQueryFilter.class);
        Assertions.assertEquals("f", model.subscriptionList().get(0));
        Assertions.assertEquals("ryo", model.resourceGroupUrlList().get(0));
        Assertions.assertEquals("ojakhmsbzjhcrze", model.resourceTypeList().get(0));
        Assertions.assertEquals("wzo", model.locationList().get(0));
        Assertions.assertEquals(EmissionScopeEnum.SCOPE3, model.carbonScopeList().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MonthlySummaryReportQueryFilter model = new MonthlySummaryReportQueryFilter().withDateRange(new DateRange())
            .withSubscriptionList(Arrays.asList("f", "dio", "jpslwejd"))
            .withResourceGroupUrlList(Arrays.asList("ryo", "psoacctazakljl", "hbcryffdfdosyge"))
            .withResourceTypeList(Arrays.asList("ojakhmsbzjhcrze", "dphlxaolt", "qtrgqjbpfzfsinzg", "f"))
            .withLocationList(Arrays.asList("wzo", "xjtfelluwfzit", "np", "qfpjk"))
            .withCarbonScopeList(Arrays.asList(EmissionScopeEnum.SCOPE3, EmissionScopeEnum.SCOPE1,
                EmissionScopeEnum.SCOPE1, EmissionScopeEnum.SCOPE1));
        model = BinaryData.fromObject(model).toObject(MonthlySummaryReportQueryFilter.class);
        Assertions.assertEquals("f", model.subscriptionList().get(0));
        Assertions.assertEquals("ryo", model.resourceGroupUrlList().get(0));
        Assertions.assertEquals("ojakhmsbzjhcrze", model.resourceTypeList().get(0));
        Assertions.assertEquals("wzo", model.locationList().get(0));
        Assertions.assertEquals(EmissionScopeEnum.SCOPE3, model.carbonScopeList().get(0));
    }
}
