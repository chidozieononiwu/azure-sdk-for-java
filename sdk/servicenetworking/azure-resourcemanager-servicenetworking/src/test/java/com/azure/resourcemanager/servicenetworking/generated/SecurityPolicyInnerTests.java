// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.servicenetworking.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicenetworking.fluent.models.SecurityPolicyInner;
import com.azure.resourcemanager.servicenetworking.models.IpAccessRule;
import com.azure.resourcemanager.servicenetworking.models.IpAccessRuleAction;
import com.azure.resourcemanager.servicenetworking.models.IpAccessRulesPolicy;
import com.azure.resourcemanager.servicenetworking.models.SecurityPolicyProperties;
import com.azure.resourcemanager.servicenetworking.models.WafPolicy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SecurityPolicyInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecurityPolicyInner model = BinaryData.fromString(
            "{\"properties\":{\"policyType\":\"ipAccessRules\",\"wafPolicy\":{\"id\":\"xxwr\"},\"ipAccessRulesPolicy\":{\"rules\":[{\"name\":\"uskcqvkocrcj\",\"priority\":747491790,\"sourceAddressPrefixes\":[\"tnhxbn\",\"biksq\",\"gls\",\"ainqpjwnzlljfm\"],\"action\":\"allow\"},{\"name\":\"eebvmgxsab\",\"priority\":2117273621,\"sourceAddressPrefixes\":[\"duuji\",\"c\",\"czdzev\",\"dhkrwpdappdsbdk\"],\"action\":\"allow\"},{\"name\":\"rwjfe\",\"priority\":905142721,\"sourceAddressPrefixes\":[\"hutje\",\"tmrldhugjzzdatq\",\"hocdgeab\",\"gphuticndvka\"],\"action\":\"deny\"}]},\"provisioningState\":\"Succeeded\"},\"location\":\"ftyhxhurokf\",\"tags\":{\"giawx\":\"olniwpwcukjf\",\"nddhsgcbacph\":\"lryplwckbasyy\",\"nqgoulzndli\":\"jkot\",\"dgak\":\"wyqkgfgibm\"},\"id\":\"qsrxybzqqed\",\"name\":\"ytb\",\"type\":\"iqfouflmmnkz\"}")
            .toObject(SecurityPolicyInner.class);
        Assertions.assertEquals("ftyhxhurokf", model.location());
        Assertions.assertEquals("olniwpwcukjf", model.tags().get("giawx"));
        Assertions.assertEquals("xxwr", model.properties().wafPolicy().id());
        Assertions.assertEquals("uskcqvkocrcj", model.properties().ipAccessRulesPolicy().rules().get(0).name());
        Assertions.assertEquals(747491790, model.properties().ipAccessRulesPolicy().rules().get(0).priority());
        Assertions.assertEquals("tnhxbn",
            model.properties().ipAccessRulesPolicy().rules().get(0).sourceAddressPrefixes().get(0));
        Assertions.assertEquals(IpAccessRuleAction.ALLOW,
            model.properties().ipAccessRulesPolicy().rules().get(0).action());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecurityPolicyInner model
            = new SecurityPolicyInner().withLocation("ftyhxhurokf")
                .withTags(mapOf("giawx", "olniwpwcukjf", "nddhsgcbacph", "lryplwckbasyy", "nqgoulzndli", "jkot", "dgak",
                    "wyqkgfgibm"))
                .withProperties(
                    new SecurityPolicyProperties().withWafPolicy(new WafPolicy().withId("xxwr"))
                        .withIpAccessRulesPolicy(
                            new IpAccessRulesPolicy().withRules(Arrays.asList(
                                new IpAccessRule().withName("uskcqvkocrcj")
                                    .withPriority(747491790)
                                    .withSourceAddressPrefixes(
                                        Arrays.asList("tnhxbn", "biksq", "gls", "ainqpjwnzlljfm"))
                                    .withAction(IpAccessRuleAction.ALLOW),
                                new IpAccessRule().withName("eebvmgxsab")
                                    .withPriority(2117273621)
                                    .withSourceAddressPrefixes(Arrays.asList("duuji", "c", "czdzev", "dhkrwpdappdsbdk"))
                                    .withAction(IpAccessRuleAction.ALLOW),
                                new IpAccessRule().withName("rwjfe")
                                    .withPriority(905142721)
                                    .withSourceAddressPrefixes(
                                        Arrays.asList("hutje", "tmrldhugjzzdatq", "hocdgeab", "gphuticndvka"))
                                    .withAction(IpAccessRuleAction.DENY)))));
        model = BinaryData.fromObject(model).toObject(SecurityPolicyInner.class);
        Assertions.assertEquals("ftyhxhurokf", model.location());
        Assertions.assertEquals("olniwpwcukjf", model.tags().get("giawx"));
        Assertions.assertEquals("xxwr", model.properties().wafPolicy().id());
        Assertions.assertEquals("uskcqvkocrcj", model.properties().ipAccessRulesPolicy().rules().get(0).name());
        Assertions.assertEquals(747491790, model.properties().ipAccessRulesPolicy().rules().get(0).priority());
        Assertions.assertEquals("tnhxbn",
            model.properties().ipAccessRulesPolicy().rules().get(0).sourceAddressPrefixes().get(0));
        Assertions.assertEquals(IpAccessRuleAction.ALLOW,
            model.properties().ipAccessRulesPolicy().rules().get(0).action());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
