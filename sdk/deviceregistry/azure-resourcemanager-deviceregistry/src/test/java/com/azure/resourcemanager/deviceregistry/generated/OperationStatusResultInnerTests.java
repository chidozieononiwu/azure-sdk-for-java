// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceregistry.fluent.models.OperationStatusResultInner;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class OperationStatusResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationStatusResultInner model = BinaryData.fromString(
            "{\"id\":\"ijbpzvgnwzsymgl\",\"name\":\"fcyzkohdbihanufh\",\"status\":\"cbjy\",\"percentComplete\":758913948,\"startTime\":\"2021-01-26T06:35:32Z\",\"endTime\":\"2021-05-03T19:17:55Z\",\"operations\":[{\"id\":\"abifpikxwczbys\",\"name\":\"pqxu\",\"status\":\"ivyqniwbybrkxvd\",\"percentComplete\":920256064,\"startTime\":\"2021-10-08T05:03:40Z\",\"endTime\":\"2020-12-24T14:06:57Z\",\"operations\":[{\"id\":\"ukxgaud\",\"name\":\"snhsjcnyejhkryh\",\"status\":\"napczwlokjy\",\"percentComplete\":186394728,\"startTime\":\"2021-01-17T01:20:32Z\",\"endTime\":\"2021-03-14T04:22:39Z\",\"operations\":[{\"status\":\"joxzjnchgejspodm\",\"operations\":[]},{\"status\":\"ilzyd\",\"operations\":[]},{\"status\":\"h\",\"operations\":[]}]},{\"id\":\"yahux\",\"name\":\"pmqnja\",\"status\":\"wixjsprozvcp\",\"percentComplete\":409698731,\"startTime\":\"2021-12-06T20:49:14Z\",\"endTime\":\"2021-10-19T17:11:59Z\",\"operations\":[{\"status\":\"fdatsc\",\"operations\":[]},{\"status\":\"dvpjhulsuuvmk\",\"operations\":[]},{\"status\":\"ozkrwfndiodjpslw\",\"operations\":[]}]}]},{\"id\":\"vwryoqpso\",\"name\":\"ctazakljlahbcryf\",\"status\":\"dfdosygexp\",\"percentComplete\":375105800,\"startTime\":\"2021-10-20T08:16:50Z\",\"endTime\":\"2021-03-23T09:06:17Z\",\"operations\":[{\"id\":\"zjhcrzevdphlx\",\"name\":\"lthqtrgqjbp\",\"status\":\"zfsinzgvf\",\"percentComplete\":1860932522,\"startTime\":\"2021-07-27T02:51:06Z\",\"endTime\":\"2021-01-19T00:37:06Z\",\"operations\":[{\"status\":\"j\",\"operations\":[]},{\"status\":\"felluwfzitonpe\",\"operations\":[]},{\"status\":\"fpjkjlxofp\",\"operations\":[]},{\"status\":\"vhpfxxypininmay\",\"operations\":[]}]},{\"id\":\"bbkpodep\",\"name\":\"ginuvamih\",\"status\":\"ognarxzxtheotus\",\"percentComplete\":1072359643,\"startTime\":\"2021-07-28T11:08:18Z\",\"endTime\":\"2021-05-25T08:44:02Z\",\"operations\":[{\"status\":\"qi\",\"operations\":[]},{\"status\":\"nhungbw\",\"operations\":[]}]}]},{\"id\":\"fygxgispemvtzfk\",\"name\":\"ubljofxqe\",\"status\":\"fjaeq\",\"percentComplete\":1946289710,\"startTime\":\"2021-07-12T07:47:05Z\",\"endTime\":\"2021-01-23T03:52:26Z\",\"operations\":[{\"id\":\"smjqulngsntnbyb\",\"name\":\"gc\",\"status\":\"rwclxxwrljdo\",\"percentComplete\":3133273,\"startTime\":\"2021-09-12T04:17:06Z\",\"endTime\":\"2021-04-14T07:28:45Z\",\"operations\":[{\"status\":\"cr\",\"operations\":[]},{\"status\":\"jdkwtnhxbnjb\",\"operations\":[]}]}]},{\"id\":\"rglssainqpj\",\"name\":\"zlljfmppeebvm\",\"status\":\"xsabkyqdu\",\"percentComplete\":2066308678,\"startTime\":\"2021-09-28T15:07:41Z\",\"endTime\":\"2021-06-27T01:31:51Z\",\"operations\":[{\"id\":\"zevndhkrwpdappds\",\"name\":\"kvwrwjfeu\",\"status\":\"nhutjeltmrldhugj\",\"percentComplete\":1346954674,\"startTime\":\"2021-10-25T23:35:46Z\",\"endTime\":\"2021-03-07T21:41:58Z\",\"operations\":[{\"status\":\"oc\",\"operations\":[]},{\"status\":\"geablgphuticndvk\",\"operations\":[]}]},{\"id\":\"wyiftyhxhur\",\"name\":\"ftyxolniw\",\"status\":\"wcukjfkgiawxk\",\"percentComplete\":764612558,\"startTime\":\"2021-02-17T21:17:55Z\",\"endTime\":\"2021-09-09T09:42:48Z\",\"operations\":[{\"status\":\"basyy\",\"operations\":[]},{\"status\":\"nddhsgcbacph\",\"operations\":[]}]}]}]}")
            .toObject(OperationStatusResultInner.class);
        Assertions.assertEquals("ijbpzvgnwzsymgl", model.id());
        Assertions.assertEquals("fcyzkohdbihanufh", model.name());
        Assertions.assertEquals("cbjy", model.status());
        Assertions.assertEquals(758913948, model.percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-26T06:35:32Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-03T19:17:55Z"), model.endTime());
        Assertions.assertEquals("abifpikxwczbys", model.operations().get(0).id());
        Assertions.assertEquals("pqxu", model.operations().get(0).name());
        Assertions.assertEquals("ivyqniwbybrkxvd", model.operations().get(0).status());
        Assertions.assertEquals(920256064, model.operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-08T05:03:40Z"), model.operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-24T14:06:57Z"), model.operations().get(0).endTime());
        Assertions.assertEquals("ukxgaud", model.operations().get(0).operations().get(0).id());
        Assertions.assertEquals("snhsjcnyejhkryh", model.operations().get(0).operations().get(0).name());
        Assertions.assertEquals("napczwlokjy", model.operations().get(0).operations().get(0).status());
        Assertions.assertEquals(186394728, model.operations().get(0).operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-17T01:20:32Z"),
            model.operations().get(0).operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-14T04:22:39Z"),
            model.operations().get(0).operations().get(0).endTime());
        Assertions.assertEquals("joxzjnchgejspodm",
            model.operations().get(0).operations().get(0).operations().get(0).status());
    }
}
