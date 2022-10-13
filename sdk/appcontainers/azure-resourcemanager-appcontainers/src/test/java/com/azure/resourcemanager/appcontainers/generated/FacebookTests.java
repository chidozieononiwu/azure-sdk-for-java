// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.AppRegistration;
import com.azure.resourcemanager.appcontainers.models.Facebook;
import com.azure.resourcemanager.appcontainers.models.LoginScopes;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FacebookTests {
    @Test
    public void testDeserialize() {
        Facebook model =
            BinaryData
                .fromString(
                    "{\"enabled\":false,\"registration\":{\"appId\":\"yulpkudjkr\",\"appSecretSettingName\":\"hbzhfepg\"},\"graphApiVersion\":\"qex\",\"login\":{\"scopes\":[\"xscpaierhhbc\"]}}")
                .toObject(Facebook.class);
        Assertions.assertEquals(false, model.enabled());
        Assertions.assertEquals("yulpkudjkr", model.registration().appId());
        Assertions.assertEquals("hbzhfepg", model.registration().appSecretSettingName());
        Assertions.assertEquals("qex", model.graphApiVersion());
        Assertions.assertEquals("xscpaierhhbc", model.login().scopes().get(0));
    }

    @Test
    public void testSerialize() {
        Facebook model =
            new Facebook()
                .withEnabled(false)
                .withRegistration(new AppRegistration().withAppId("yulpkudjkr").withAppSecretSettingName("hbzhfepg"))
                .withGraphApiVersion("qex")
                .withLogin(new LoginScopes().withScopes(Arrays.asList("xscpaierhhbc")));
        model = BinaryData.fromObject(model).toObject(Facebook.class);
        Assertions.assertEquals(false, model.enabled());
        Assertions.assertEquals("yulpkudjkr", model.registration().appId());
        Assertions.assertEquals("hbzhfepg", model.registration().appSecretSettingName());
        Assertions.assertEquals("qex", model.graphApiVersion());
        Assertions.assertEquals("xscpaierhhbc", model.login().scopes().get(0));
    }
}