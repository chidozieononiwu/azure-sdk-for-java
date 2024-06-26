// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ExpandMsixImageInner;
import com.azure.resourcemanager.desktopvirtualization.models.ExpandMsixImageList;
import com.azure.resourcemanager.desktopvirtualization.models.MsixPackageApplications;
import com.azure.resourcemanager.desktopvirtualization.models.MsixPackageDependencies;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ExpandMsixImageListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExpandMsixImageList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"packageAlias\":\"ivsiy\",\"imagePath\":\"kdncj\",\"packageName\":\"onbzoggculapzwy\",\"packageFamilyName\":\"gogtqxepnylbf\",\"packageFullName\":\"jlyjtlvofq\",\"displayName\":\"vfcibyfmowux\",\"packageRelativePath\":\"jpvd\",\"isRegularRegistration\":true,\"isActive\":true,\"packageDependencies\":[{\"dependencyName\":\"wzjbh\",\"publisher\":\"sxjrk\",\"minVersion\":\"btrnegvm\"},{\"dependencyName\":\"uqeqv\",\"publisher\":\"spastjbkkdmf\",\"minVersion\":\"est\"},{\"dependencyName\":\"lx\",\"publisher\":\"ilozapeewchpxlk\",\"minVersion\":\"kuziycsle\"}],\"version\":\"f\",\"lastUpdated\":\"2021-03-03T22:41:41Z\",\"packageApplications\":[{\"appId\":\"yhjtqedcgzu\",\"description\":\"mmrqz\",\"appUserModelID\":\"rjvpglydzgkrvqee\",\"friendlyName\":\"oepry\",\"iconImageName\":\"nwy\"},{\"appId\":\"mov\",\"description\":\"fvaawzqa\",\"appUserModelID\":\"lgzurig\",\"friendlyName\":\"ecxn\",\"iconImageName\":\"icokpv\"}]},\"id\":\"qtmldgxo\",\"name\":\"firclnpkciayz\",\"type\":\"iykhy\"},{\"properties\":{\"packageAlias\":\"vjlboxqvk\",\"imagePath\":\"mxho\",\"packageName\":\"ynhdwdigum\",\"packageFamilyName\":\"raauzzpt\",\"packageFullName\":\"zysdzh\",\"displayName\":\"wwvaiqyuvvfonk\",\"packageRelativePath\":\"hqyikvy\",\"isRegularRegistration\":false,\"isActive\":true,\"packageDependencies\":[{\"dependencyName\":\"wmn\",\"publisher\":\"ttijfybvpoekrs\",\"minVersion\":\"gbdhuzqgnjdg\"},{\"dependencyName\":\"nscliqhzvhxnk\",\"publisher\":\"tkubotppn\",\"minVersion\":\"xz\"}],\"version\":\"ihfrbbcevqa\",\"lastUpdated\":\"2021-01-25T14:16:29Z\",\"packageApplications\":[{\"appId\":\"lfkqojpy\",\"description\":\"gtrd\",\"appUserModelID\":\"ifmzzsd\",\"friendlyName\":\"brn\",\"iconImageName\":\"u\"},{\"appId\":\"a\",\"description\":\"g\",\"appUserModelID\":\"hocxvdfffwafqrou\",\"friendlyName\":\"spave\",\"iconImageName\":\"r\"},{\"appId\":\"n\",\"description\":\"zudhcxg\",\"appUserModelID\":\"oyxcdyuib\",\"friendlyName\":\"fdn\",\"iconImageName\":\"ydvfvfcjnae\"},{\"appId\":\"vhmgorffukis\",\"description\":\"w\",\"appUserModelID\":\"hwplefaxvx\",\"friendlyName\":\"cbtgnhnz\",\"iconImageName\":\"qxtjjfzqlqhyca\"}]},\"id\":\"ggxdb\",\"name\":\"esmi\",\"type\":\"knlrariaawiuagy\"}],\"nextLink\":\"qfby\"}")
                .toObject(ExpandMsixImageList.class);
        Assertions.assertEquals("ivsiy", model.value().get(0).packageAlias());
        Assertions.assertEquals("kdncj", model.value().get(0).imagePath());
        Assertions.assertEquals("onbzoggculapzwy", model.value().get(0).packageName());
        Assertions.assertEquals("gogtqxepnylbf", model.value().get(0).packageFamilyName());
        Assertions.assertEquals("jlyjtlvofq", model.value().get(0).packageFullName());
        Assertions.assertEquals("vfcibyfmowux", model.value().get(0).displayName());
        Assertions.assertEquals("jpvd", model.value().get(0).packageRelativePath());
        Assertions.assertEquals(true, model.value().get(0).isRegularRegistration());
        Assertions.assertEquals(true, model.value().get(0).isActive());
        Assertions.assertEquals("wzjbh", model.value().get(0).packageDependencies().get(0).dependencyName());
        Assertions.assertEquals("sxjrk", model.value().get(0).packageDependencies().get(0).publisher());
        Assertions.assertEquals("btrnegvm", model.value().get(0).packageDependencies().get(0).minVersion());
        Assertions.assertEquals("f", model.value().get(0).version());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-03T22:41:41Z"), model.value().get(0).lastUpdated());
        Assertions.assertEquals("yhjtqedcgzu", model.value().get(0).packageApplications().get(0).appId());
        Assertions.assertEquals("mmrqz", model.value().get(0).packageApplications().get(0).description());
        Assertions.assertEquals("rjvpglydzgkrvqee", model.value().get(0).packageApplications().get(0).appUserModelId());
        Assertions.assertEquals("oepry", model.value().get(0).packageApplications().get(0).friendlyName());
        Assertions.assertEquals("nwy", model.value().get(0).packageApplications().get(0).iconImageName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExpandMsixImageList model =
            new ExpandMsixImageList()
                .withValue(
                    Arrays
                        .asList(
                            new ExpandMsixImageInner()
                                .withPackageAlias("ivsiy")
                                .withImagePath("kdncj")
                                .withPackageName("onbzoggculapzwy")
                                .withPackageFamilyName("gogtqxepnylbf")
                                .withPackageFullName("jlyjtlvofq")
                                .withDisplayName("vfcibyfmowux")
                                .withPackageRelativePath("jpvd")
                                .withIsRegularRegistration(true)
                                .withIsActive(true)
                                .withPackageDependencies(
                                    Arrays
                                        .asList(
                                            new MsixPackageDependencies()
                                                .withDependencyName("wzjbh")
                                                .withPublisher("sxjrk")
                                                .withMinVersion("btrnegvm"),
                                            new MsixPackageDependencies()
                                                .withDependencyName("uqeqv")
                                                .withPublisher("spastjbkkdmf")
                                                .withMinVersion("est"),
                                            new MsixPackageDependencies()
                                                .withDependencyName("lx")
                                                .withPublisher("ilozapeewchpxlk")
                                                .withMinVersion("kuziycsle")))
                                .withVersion("f")
                                .withLastUpdated(OffsetDateTime.parse("2021-03-03T22:41:41Z"))
                                .withPackageApplications(
                                    Arrays
                                        .asList(
                                            new MsixPackageApplications()
                                                .withAppId("yhjtqedcgzu")
                                                .withDescription("mmrqz")
                                                .withAppUserModelId("rjvpglydzgkrvqee")
                                                .withFriendlyName("oepry")
                                                .withIconImageName("nwy"),
                                            new MsixPackageApplications()
                                                .withAppId("mov")
                                                .withDescription("fvaawzqa")
                                                .withAppUserModelId("lgzurig")
                                                .withFriendlyName("ecxn")
                                                .withIconImageName("icokpv"))),
                            new ExpandMsixImageInner()
                                .withPackageAlias("vjlboxqvk")
                                .withImagePath("mxho")
                                .withPackageName("ynhdwdigum")
                                .withPackageFamilyName("raauzzpt")
                                .withPackageFullName("zysdzh")
                                .withDisplayName("wwvaiqyuvvfonk")
                                .withPackageRelativePath("hqyikvy")
                                .withIsRegularRegistration(false)
                                .withIsActive(true)
                                .withPackageDependencies(
                                    Arrays
                                        .asList(
                                            new MsixPackageDependencies()
                                                .withDependencyName("wmn")
                                                .withPublisher("ttijfybvpoekrs")
                                                .withMinVersion("gbdhuzqgnjdg"),
                                            new MsixPackageDependencies()
                                                .withDependencyName("nscliqhzvhxnk")
                                                .withPublisher("tkubotppn")
                                                .withMinVersion("xz")))
                                .withVersion("ihfrbbcevqa")
                                .withLastUpdated(OffsetDateTime.parse("2021-01-25T14:16:29Z"))
                                .withPackageApplications(
                                    Arrays
                                        .asList(
                                            new MsixPackageApplications()
                                                .withAppId("lfkqojpy")
                                                .withDescription("gtrd")
                                                .withAppUserModelId("ifmzzsd")
                                                .withFriendlyName("brn")
                                                .withIconImageName("u"),
                                            new MsixPackageApplications()
                                                .withAppId("a")
                                                .withDescription("g")
                                                .withAppUserModelId("hocxvdfffwafqrou")
                                                .withFriendlyName("spave")
                                                .withIconImageName("r"),
                                            new MsixPackageApplications()
                                                .withAppId("n")
                                                .withDescription("zudhcxg")
                                                .withAppUserModelId("oyxcdyuib")
                                                .withFriendlyName("fdn")
                                                .withIconImageName("ydvfvfcjnae"),
                                            new MsixPackageApplications()
                                                .withAppId("vhmgorffukis")
                                                .withDescription("w")
                                                .withAppUserModelId("hwplefaxvx")
                                                .withFriendlyName("cbtgnhnz")
                                                .withIconImageName("qxtjjfzqlqhyca")))));
        model = BinaryData.fromObject(model).toObject(ExpandMsixImageList.class);
        Assertions.assertEquals("ivsiy", model.value().get(0).packageAlias());
        Assertions.assertEquals("kdncj", model.value().get(0).imagePath());
        Assertions.assertEquals("onbzoggculapzwy", model.value().get(0).packageName());
        Assertions.assertEquals("gogtqxepnylbf", model.value().get(0).packageFamilyName());
        Assertions.assertEquals("jlyjtlvofq", model.value().get(0).packageFullName());
        Assertions.assertEquals("vfcibyfmowux", model.value().get(0).displayName());
        Assertions.assertEquals("jpvd", model.value().get(0).packageRelativePath());
        Assertions.assertEquals(true, model.value().get(0).isRegularRegistration());
        Assertions.assertEquals(true, model.value().get(0).isActive());
        Assertions.assertEquals("wzjbh", model.value().get(0).packageDependencies().get(0).dependencyName());
        Assertions.assertEquals("sxjrk", model.value().get(0).packageDependencies().get(0).publisher());
        Assertions.assertEquals("btrnegvm", model.value().get(0).packageDependencies().get(0).minVersion());
        Assertions.assertEquals("f", model.value().get(0).version());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-03T22:41:41Z"), model.value().get(0).lastUpdated());
        Assertions.assertEquals("yhjtqedcgzu", model.value().get(0).packageApplications().get(0).appId());
        Assertions.assertEquals("mmrqz", model.value().get(0).packageApplications().get(0).description());
        Assertions.assertEquals("rjvpglydzgkrvqee", model.value().get(0).packageApplications().get(0).appUserModelId());
        Assertions.assertEquals("oepry", model.value().get(0).packageApplications().get(0).friendlyName());
        Assertions.assertEquals("nwy", model.value().get(0).packageApplications().get(0).iconImageName());
    }
}
