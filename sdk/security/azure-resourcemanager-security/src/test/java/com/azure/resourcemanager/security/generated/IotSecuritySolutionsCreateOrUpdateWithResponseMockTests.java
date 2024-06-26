// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.AdditionalWorkspaceDataType;
import com.azure.resourcemanager.security.models.AdditionalWorkspaceType;
import com.azure.resourcemanager.security.models.AdditionalWorkspacesProperties;
import com.azure.resourcemanager.security.models.DataSource;
import com.azure.resourcemanager.security.models.ExportData;
import com.azure.resourcemanager.security.models.IoTSecuritySolutionModel;
import com.azure.resourcemanager.security.models.RecommendationConfigStatus;
import com.azure.resourcemanager.security.models.RecommendationConfigurationProperties;
import com.azure.resourcemanager.security.models.RecommendationType;
import com.azure.resourcemanager.security.models.SecuritySolutionStatus;
import com.azure.resourcemanager.security.models.UnmaskedIpLoggingStatus;
import com.azure.resourcemanager.security.models.UserDefinedResourcesProperties;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class IotSecuritySolutionsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"location\":\"orbpcjesfyvuz\",\"properties\":{\"workspace\":\"vmshkkgygfohrm\",\"displayName\":\"hhlclpkr\",\"status\":\"Disabled\",\"export\":[\"RawEvents\",\"RawEvents\"],\"disabledDataSources\":[\"TwinData\",\"TwinData\"],\"iotHubs\":[\"vr\",\"nztxtmrmgftj\"],\"userDefinedResources\":{\"query\":\"ilohlgrjcxh\",\"querySubscriptions\":[\"hz\",\"sjxw\"]},\"autoDiscoveredResources\":[\"bvuyly\",\"mbwep\"],\"recommendationsConfiguration\":[{\"recommendationType\":\"IoT_PrivilegedDockerOptions\",\"name\":\"msxhdk\",\"status\":\"Disabled\"},{\"recommendationType\":\"IoT_PrivilegedDockerOptions\",\"name\":\"x\",\"status\":\"Disabled\"}],\"unmaskedIpLoggingStatus\":\"Enabled\",\"additionalWorkspaces\":[{\"workspace\":\"nbyoullyfzmn\",\"type\":\"Sentinel\",\"dataTypes\":[\"Alerts\",\"RawEvents\"]}]},\"tags\":{\"zlmpxfmdjs\":\"tjgzkmwf\",\"cbdnpfcg\":\"ommdzphxulx\",\"bzxp\":\"dttowqxxc\"},\"id\":\"loovhati\",\"name\":\"wtc\",\"type\":\"zuzpkf\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        SecurityManager manager = SecurityManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        IoTSecuritySolutionModel response = manager.iotSecuritySolutions().define("apndm")
            .withExistingResourceGroup("cjqzrevfwcba").withRegion("vmkmzv")
            .withTags(mapOf("lvkcmc", "tuvfnhitjkbibxlw", "oiahk", "iaunlodincfbao")).withWorkspace("xfblsxyfq")
            .withDisplayName("todgkllefmizdcsr").withStatus(SecuritySolutionStatus.DISABLED)
            .withExport(Arrays.asList(ExportData.RAW_EVENTS))
            .withDisabledDataSources(Arrays.asList(DataSource.TWIN_DATA, DataSource.TWIN_DATA, DataSource.TWIN_DATA))
            .withIotHubs(Arrays.asList("xcgqbmxbp"))
            .withUserDefinedResources(new UserDefinedResourcesProperties().withQuery("nxskehojvma")
                .withQuerySubscriptions(Arrays.asList("flfpi")))
            .withRecommendationsConfiguration(Arrays.asList(
                new RecommendationConfigurationProperties()
                    .withRecommendationType(RecommendationType.IO_T_INCONSISTENT_MODULE_SETTINGS)
                    .withStatus(RecommendationConfigStatus.DISABLED),
                new RecommendationConfigurationProperties()
                    .withRecommendationType(RecommendationType.IO_T_ACRAUTHENTICATION)
                    .withStatus(RecommendationConfigStatus.ENABLED),
                new RecommendationConfigurationProperties()
                    .withRecommendationType(RecommendationType.IO_T_SHARED_CREDENTIALS)
                    .withStatus(RecommendationConfigStatus.DISABLED)))
            .withUnmaskedIpLoggingStatus(UnmaskedIpLoggingStatus.ENABLED)
            .withAdditionalWorkspaces(
                Arrays.asList(
                    new AdditionalWorkspacesProperties().withWorkspace("awhamigsqz")
                        .withType(AdditionalWorkspaceType.SENTINEL)
                        .withDataTypes(Arrays.asList(AdditionalWorkspaceDataType.ALERTS,
                            AdditionalWorkspaceDataType.ALERTS, AdditionalWorkspaceDataType.RAW_EVENTS)),
                    new AdditionalWorkspacesProperties().withWorkspace("rxjkc")
                        .withType(AdditionalWorkspaceType.SENTINEL)
                        .withDataTypes(Arrays.asList(AdditionalWorkspaceDataType.RAW_EVENTS,
                            AdditionalWorkspaceDataType.RAW_EVENTS)),
                    new AdditionalWorkspacesProperties().withWorkspace("kjfkxnwtzs")
                        .withType(AdditionalWorkspaceType.SENTINEL)
                        .withDataTypes(Arrays.asList(AdditionalWorkspaceDataType.RAW_EVENTS)),
                    new AdditionalWorkspacesProperties().withWorkspace("vcjskqsfnmiwapd")
                        .withType(AdditionalWorkspaceType.SENTINEL).withDataTypes(Arrays
                            .asList(AdditionalWorkspaceDataType.RAW_EVENTS, AdditionalWorkspaceDataType.RAW_EVENTS))))
            .create();

        Assertions.assertEquals("orbpcjesfyvuz", response.location());
        Assertions.assertEquals("tjgzkmwf", response.tags().get("zlmpxfmdjs"));
        Assertions.assertEquals("vmshkkgygfohrm", response.workspace());
        Assertions.assertEquals("hhlclpkr", response.displayName());
        Assertions.assertEquals(SecuritySolutionStatus.DISABLED, response.status());
        Assertions.assertEquals(ExportData.RAW_EVENTS, response.export().get(0));
        Assertions.assertEquals(DataSource.TWIN_DATA, response.disabledDataSources().get(0));
        Assertions.assertEquals("vr", response.iotHubs().get(0));
        Assertions.assertEquals("ilohlgrjcxh", response.userDefinedResources().query());
        Assertions.assertEquals("hz", response.userDefinedResources().querySubscriptions().get(0));
        Assertions.assertEquals(RecommendationType.IO_T_PRIVILEGED_DOCKER_OPTIONS,
            response.recommendationsConfiguration().get(0).recommendationType());
        Assertions.assertEquals(RecommendationConfigStatus.DISABLED,
            response.recommendationsConfiguration().get(0).status());
        Assertions.assertEquals(UnmaskedIpLoggingStatus.ENABLED, response.unmaskedIpLoggingStatus());
        Assertions.assertEquals("nbyoullyfzmn", response.additionalWorkspaces().get(0).workspace());
        Assertions.assertEquals(AdditionalWorkspaceType.SENTINEL, response.additionalWorkspaces().get(0).type());
        Assertions.assertEquals(AdditionalWorkspaceDataType.ALERTS,
            response.additionalWorkspaces().get(0).dataTypes().get(0));
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
