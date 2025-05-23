// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.standbypool.StandbyPoolManager;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolResource;
import com.azure.resourcemanager.standbypool.models.VirtualMachineState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class StandbyVirtualMachinePoolsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"elasticityProfile\":{\"maxReadyCapacity\":5310628995485261293,\"minReadyCapacity\":2691769915516552060},\"virtualMachineState\":\"Hibernated\",\"attachedVirtualMachineScaleSetId\":\"azyxoegukg\",\"provisioningState\":\"Succeeded\"},\"location\":\"ucgygevqz\",\"tags\":{\"p\":\"pmr\"},\"id\":\"zcdrqjsdpydnfyhx\",\"name\":\"eoejzic\",\"type\":\"ifsjttgzfbishcb\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        StandbyPoolManager manager = StandbyPoolManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<StandbyVirtualMachinePoolResource> response
            = manager.standbyVirtualMachinePools().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ucgygevqz", response.iterator().next().location());
        Assertions.assertEquals("pmr", response.iterator().next().tags().get("p"));
        Assertions.assertEquals(5310628995485261293L,
            response.iterator().next().properties().elasticityProfile().maxReadyCapacity());
        Assertions.assertEquals(2691769915516552060L,
            response.iterator().next().properties().elasticityProfile().minReadyCapacity());
        Assertions.assertEquals(VirtualMachineState.HIBERNATED,
            response.iterator().next().properties().virtualMachineState());
        Assertions.assertEquals("azyxoegukg",
            response.iterator().next().properties().attachedVirtualMachineScaleSetId());
    }
}
