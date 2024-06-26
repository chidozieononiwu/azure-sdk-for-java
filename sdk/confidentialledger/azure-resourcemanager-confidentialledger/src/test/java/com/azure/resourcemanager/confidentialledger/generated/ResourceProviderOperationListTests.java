// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.confidentialledger.models.ResourceProviderOperationList;

public final class ResourceProviderOperationListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceProviderOperationList model = BinaryData.fromString(
            "{\"value\":[{\"name\":\"quvgjxpybczme\",\"isDataAction\":true,\"display\":{\"provider\":\"pbsphrupidgs\",\"resource\":\"bejhphoycmsxa\",\"operation\":\"hdxbmtqio\",\"description\":\"zehtbmu\"}},{\"name\":\"ownoizhw\",\"isDataAction\":true,\"display\":{\"provider\":\"qsoqijgkd\",\"resource\":\"pazlobcufpdz\",\"operation\":\"btcqq\",\"description\":\"qglhq\"}},{\"name\":\"ufo\",\"isDataAction\":false,\"display\":{\"provider\":\"ifsqesaagdfmg\",\"resource\":\"lhjxr\",\"operation\":\"kwm\",\"description\":\"ktsizntocipaou\"}}],\"nextLink\":\"psqucmpoyf\"}")
            .toObject(ResourceProviderOperationList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceProviderOperationList model = new ResourceProviderOperationList();
        model = BinaryData.fromObject(model).toObject(ResourceProviderOperationList.class);
    }
}
