// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.GovernanceRuleList;

public final class GovernanceRuleListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GovernanceRuleList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"tenantId\":\"ccsnjvcdwxlpq\",\"displayName\":\"kftnkhtjsyin\",\"description\":\"fq\",\"remediationTimeframe\":\"mtdh\",\"isGracePeriod\":true,\"rulePriority\":1983654874,\"isDisabled\":true,\"ruleType\":\"Integrated\",\"sourceResourceType\":\"Assessments\",\"excludedScopes\":[\"gszywk\",\"irryuzhlh\",\"joqrvqqaatj\",\"nrvgoupmfiibfgg\"],\"conditionSets\":[\"dataool\",\"datarwxkvtkkgl\",\"dataqwjygvja\",\"datavblm\"],\"includeMemberScopes\":false,\"ownerSource\":{\"type\":\"ByTag\",\"value\":\"bxvvyhg\"},\"governanceEmailNotification\":{\"disableManagerEmailNotification\":false,\"disableOwnerEmailNotification\":true},\"metadata\":{\"createdBy\":\"fegxuvwzfb\",\"createdOn\":\"2021-09-27T14:47:09Z\",\"updatedBy\":\"ctlpdngitvgb\",\"updatedOn\":\"2021-02-28T20:17:33Z\"}},\"id\":\"ixkwmyijejveg\",\"name\":\"hbpnaixexccbd\",\"type\":\"eaxhcexdrrvqahqk\"},{\"properties\":{\"tenantId\":\"pwijnhy\",\"displayName\":\"svfycxzbfv\",\"description\":\"wvrvmtg\",\"remediationTimeframe\":\"ppyostronzmyhgf\",\"isGracePeriod\":true,\"rulePriority\":884290238,\"isDisabled\":true,\"ruleType\":\"ServiceNow\",\"sourceResourceType\":\"Assessments\",\"excludedScopes\":[\"ekrrjr\"],\"conditionSets\":[\"datafxtsgum\",\"datajglikkxwslolb\"],\"includeMemberScopes\":false,\"ownerSource\":{\"type\":\"Manually\",\"value\":\"m\"},\"governanceEmailNotification\":{\"disableManagerEmailNotification\":true,\"disableOwnerEmailNotification\":false},\"metadata\":{\"createdBy\":\"plcrpwjxeznoig\",\"createdOn\":\"2021-05-13T00:39:55Z\",\"updatedBy\":\"w\",\"updatedOn\":\"2021-04-19T12:13:28Z\"}},\"id\":\"pn\",\"name\":\"saz\",\"type\":\"jjoqkagf\"}],\"nextLink\":\"xttaugzxnfaaz\"}")
            .toObject(GovernanceRuleList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GovernanceRuleList model = new GovernanceRuleList();
        model = BinaryData.fromObject(model).toObject(GovernanceRuleList.class);
    }
}
