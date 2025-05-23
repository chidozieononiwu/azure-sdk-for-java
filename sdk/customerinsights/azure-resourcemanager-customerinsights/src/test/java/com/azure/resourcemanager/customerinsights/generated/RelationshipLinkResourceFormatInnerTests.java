// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.customerinsights.fluent.models.RelationshipLinkResourceFormatInner;
import com.azure.resourcemanager.customerinsights.models.LinkTypes;
import com.azure.resourcemanager.customerinsights.models.ParticipantProfilePropertyReference;
import com.azure.resourcemanager.customerinsights.models.RelationshipLinkFieldMapping;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class RelationshipLinkResourceFormatInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RelationshipLinkResourceFormatInner model = BinaryData.fromString(
            "{\"properties\":{\"displayName\":{\"cbslhhx\":\"sfj\",\"vodhtn\":\"db\"},\"description\":{\"z\":\"ud\",\"kdlpa\":\"mes\",\"dfgsftufqobrj\":\"zrcxfailcfxwmdbo\",\"cc\":\"nac\"},\"interactionType\":\"knh\",\"linkName\":\"izvy\",\"mappings\":[{\"interactionFieldName\":\"zvulj\",\"linkType\":\"CopyIfNull\",\"relationshipFieldName\":\"eranokqgukkjqnv\"},{\"interactionFieldName\":\"roylaxxu\",\"linkType\":\"CopyIfNull\",\"relationshipFieldName\":\"isdos\"}],\"profilePropertyReferences\":[{\"interactionPropertyName\":\"b\",\"profilePropertyName\":\"svgjrwhryvy\"},{\"interactionPropertyName\":\"ytdc\",\"profilePropertyName\":\"xgccknfnw\"},{\"interactionPropertyName\":\"btmvpdvjdhttza\",\"profilePropertyName\":\"fedxihchrphkm\"}],\"provisioningState\":\"Succeeded\",\"relatedProfilePropertyReferences\":[{\"interactionPropertyName\":\"qnsdfzpbgtgky\",\"profilePropertyName\":\"kdghrjeuutlwx\"}],\"relationshipName\":\"z\",\"relationshipGuidId\":\"hokvbwnh\",\"tenantId\":\"qlgehg\"},\"id\":\"pipifh\",\"name\":\"f\",\"type\":\"oajvgcxtxjcs\"}")
            .toObject(RelationshipLinkResourceFormatInner.class);
        Assertions.assertEquals("sfj", model.displayName().get("cbslhhx"));
        Assertions.assertEquals("ud", model.description().get("z"));
        Assertions.assertEquals("knh", model.interactionType());
        Assertions.assertEquals("zvulj", model.mappings().get(0).interactionFieldName());
        Assertions.assertEquals(LinkTypes.COPY_IF_NULL, model.mappings().get(0).linkType());
        Assertions.assertEquals("eranokqgukkjqnv", model.mappings().get(0).relationshipFieldName());
        Assertions.assertEquals("b", model.profilePropertyReferences().get(0).interactionPropertyName());
        Assertions.assertEquals("svgjrwhryvy", model.profilePropertyReferences().get(0).profilePropertyName());
        Assertions.assertEquals("qnsdfzpbgtgky",
            model.relatedProfilePropertyReferences().get(0).interactionPropertyName());
        Assertions.assertEquals("kdghrjeuutlwx", model.relatedProfilePropertyReferences().get(0).profilePropertyName());
        Assertions.assertEquals("z", model.relationshipName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RelationshipLinkResourceFormatInner model
            = new RelationshipLinkResourceFormatInner().withDisplayName(mapOf("cbslhhx", "sfj", "vodhtn", "db"))
                .withDescription(mapOf("z", "ud", "kdlpa", "mes", "dfgsftufqobrj", "zrcxfailcfxwmdbo", "cc", "nac"))
                .withInteractionType("knh")
                .withMappings(Arrays.asList(
                    new RelationshipLinkFieldMapping().withInteractionFieldName("zvulj")
                        .withLinkType(LinkTypes.COPY_IF_NULL)
                        .withRelationshipFieldName("eranokqgukkjqnv"),
                    new RelationshipLinkFieldMapping().withInteractionFieldName("roylaxxu")
                        .withLinkType(LinkTypes.COPY_IF_NULL)
                        .withRelationshipFieldName("isdos")))
                .withProfilePropertyReferences(Arrays.asList(
                    new ParticipantProfilePropertyReference().withInteractionPropertyName("b")
                        .withProfilePropertyName("svgjrwhryvy"),
                    new ParticipantProfilePropertyReference().withInteractionPropertyName("ytdc")
                        .withProfilePropertyName("xgccknfnw"),
                    new ParticipantProfilePropertyReference().withInteractionPropertyName("btmvpdvjdhttza")
                        .withProfilePropertyName("fedxihchrphkm")))
                .withRelatedProfilePropertyReferences(
                    Arrays.asList(new ParticipantProfilePropertyReference().withInteractionPropertyName("qnsdfzpbgtgky")
                        .withProfilePropertyName("kdghrjeuutlwx")))
                .withRelationshipName("z");
        model = BinaryData.fromObject(model).toObject(RelationshipLinkResourceFormatInner.class);
        Assertions.assertEquals("sfj", model.displayName().get("cbslhhx"));
        Assertions.assertEquals("ud", model.description().get("z"));
        Assertions.assertEquals("knh", model.interactionType());
        Assertions.assertEquals("zvulj", model.mappings().get(0).interactionFieldName());
        Assertions.assertEquals(LinkTypes.COPY_IF_NULL, model.mappings().get(0).linkType());
        Assertions.assertEquals("eranokqgukkjqnv", model.mappings().get(0).relationshipFieldName());
        Assertions.assertEquals("b", model.profilePropertyReferences().get(0).interactionPropertyName());
        Assertions.assertEquals("svgjrwhryvy", model.profilePropertyReferences().get(0).profilePropertyName());
        Assertions.assertEquals("qnsdfzpbgtgky",
            model.relatedProfilePropertyReferences().get(0).interactionPropertyName());
        Assertions.assertEquals("kdghrjeuutlwx", model.relatedProfilePropertyReferences().get(0).profilePropertyName());
        Assertions.assertEquals("z", model.relationshipName());
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
