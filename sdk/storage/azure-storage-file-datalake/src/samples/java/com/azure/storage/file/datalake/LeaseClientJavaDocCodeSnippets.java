// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.datalake;

import com.azure.core.http.RequestConditions;
import com.azure.core.util.Context;
import com.azure.storage.file.datalake.specialized.DataLakeLeaseClient;
import com.azure.storage.file.datalake.specialized.DataLakeLeaseClientBuilder;

import java.time.Duration;
import java.time.OffsetDateTime;

public class LeaseClientJavaDocCodeSnippets {
    private final DataLakeLeaseClient client = new DataLakeLeaseClientBuilder()
        .fileClient(JavaDocCodeSnippetsHelpers.getFileClient("fileName"))
        .buildClient();
    private final Duration timeout = Duration.ofSeconds(30);
    private final String key = "key";
    private final String value = "value";
    private final RequestConditions yourOptionalRequestConditions = new RequestConditions()
        .setIfModifiedSince(OffsetDateTime.now().minusDays(3))
        .setIfUnmodifiedSince(OffsetDateTime.now().minusHours(3));

    /**
     * Code snippets for {@link DataLakeLeaseClient#acquireLease(int)}
     */
    public void acquireLease() {
        // BEGIN: com.azure.storage.file.datalake.specialized.DataLakeLeaseClient.acquireLease#int
        System.out.printf("Lease ID is %s%n", client.acquireLease(60));
        // END: com.azure.storage.file.datalake.specialized.DataLakeLeaseClient.acquireLease#int
    }

    /**
     * Code snippets for {@link DataLakeLeaseClient#renewLease()}
     */
    public void renewLease() {
        // BEGIN: com.azure.storage.file.datalake.specialized.DataLakeLeaseClient.renewLease
        System.out.printf("Renewed lease ID is %s%n", client.renewLease());
        // END: com.azure.storage.file.datalake.specialized.DataLakeLeaseClient.renewLease
    }

    /**
     * Code snippets for {@link DataLakeLeaseClient#releaseLease()}
     */
    public void releaseLease() {
        // BEGIN: com.azure.storage.file.datalake.specialized.DataLakeLeaseClient.releaseLease
        client.releaseLease();
        System.out.println("Release lease completed");
        // END: com.azure.storage.file.datalake.specialized.DataLakeLeaseClient.releaseLease
    }

    /**
     * Code snippets for {@link DataLakeLeaseClient#breakLease()}
     */
    public void breakLease() {
        // BEGIN: com.azure.storage.file.datalake.specialized.DataLakeLeaseClient.breakLease
        System.out.printf("The broken lease has %d seconds remaining on the lease", client.breakLease());
        // END: com.azure.storage.file.datalake.specialized.DataLakeLeaseClient.breakLease
    }

    /**
     * Code snippets for {@link DataLakeLeaseClient#changeLease(String)}
     */
    public void changeLease() {
        // BEGIN: com.azure.storage.file.datalake.specialized.DataLakeLeaseClient.changeLease#String
        System.out.printf("Changed lease ID is %s%n", client.changeLease("proposedId"));
        // END: com.azure.storage.file.datalake.specialized.DataLakeLeaseClient.changeLease#String
    }

    /**
     * Code snippets for {@link DataLakeLeaseClient#acquireLeaseWithResponse(int, RequestConditions, Duration, Context)}
     */
    public void acquireLeaseWithResponseCodeSnippets() {
        // BEGIN: com.azure.storage.file.datalake.specialized.DataLakeLeaseClient.acquireLeaseWithResponse#int-RequestConditions-Duration-Context
        // Optional HTTP request conditions that can be used to narrow the scope of the request.
        // The request conditions can be used to have the leasing request only succeed if the resource has been
        // modified and/or unmodified within a certain time frame and/or matches and/or doesn't match a specific ETag,
        // or any ETag.
        RequestConditions modifiedRequestConditions = yourOptionalRequestConditions;

        System.out.printf("Lease ID is %s%n", client
            .acquireLeaseWithResponse(60, modifiedRequestConditions, timeout, new Context(key, value))
            .getValue());
        // END: com.azure.storage.file.datalake.specialized.DataLakeLeaseClient.acquireLeaseWithResponse#int-RequestConditions-Duration-Context
    }

    /**
     * Code snippets for {@link DataLakeLeaseClient#renewLeaseWithResponse(RequestConditions, Duration, Context)}
     */
    public void renewLeaseWithResponseCodeSnippets() {
        // BEGIN: com.azure.storage.file.datalake.specialized.DataLakeLeaseClient.renewLeaseWithResponse#RequestConditions-Duration-Context
        // Optional HTTP request conditions that can be used to narrow the scope of the request.
        // The request conditions can be used to have the leasing request only succeed if the resource has been
        // modified and/or unmodified within a certain time frame and/or matches and/or doesn't match a specific ETag,
        // or any ETag.
        RequestConditions modifiedRequestConditions = yourOptionalRequestConditions;

        System.out.printf("Renewed lease ID is %s%n",
            client.renewLeaseWithResponse(modifiedRequestConditions, timeout, new Context(key, value))
                .getValue());
        // END: com.azure.storage.file.datalake.specialized.DataLakeLeaseClient.renewLeaseWithResponse#RequestConditions-Duration-Context
    }

    /**
     * Code snippets for {@link DataLakeLeaseClient#releaseLeaseWithResponse(RequestConditions, Duration, Context)}
     */
    public void releaseLeaseWithResponseCodeSnippets() {
        // BEGIN: com.azure.storage.file.datalake.specialized.DataLakeLeaseClient.releaseLeaseWithResponse#RequestConditions-Duration-Context
        // Optional HTTP request conditions that can be used to narrow the scope of the request.
        // The request conditions can be used to have the leasing request only succeed if the resource has been
        // modified and/or unmodified within a certain time frame and/or matches and/or doesn't match a specific ETag,
        // or any ETag.
        RequestConditions modifiedRequestConditions = yourOptionalRequestConditions;

        System.out.printf("Release lease completed with status %d%n",
            client.releaseLeaseWithResponse(modifiedRequestConditions, timeout, new Context(key, value))
                .getStatusCode());
        // END: com.azure.storage.file.datalake.specialized.DataLakeLeaseClient.releaseLeaseWithResponse#RequestConditions-Duration-Context
    }

    /**
     * Code snippets for {@link DataLakeLeaseClient#breakLeaseWithResponse(Integer, RequestConditions, Duration, Context)}
     */
    public void breakLeaseWithResponseCodeSnippets() {
        // BEGIN: com.azure.storage.file.datalake.specialized.DataLakeLeaseClient.breakLeaseWithResponse#Integer-RequestConditions-Duration-Context
        Integer retainLeaseInSeconds = 5;
        // Optional HTTP request conditions that can be used to narrow the scope of the request.
        // The request conditions can be used to have the leasing request only succeed if the resource has been
        // modified and/or unmodified within a certain time frame and/or matches and/or doesn't match a specific ETag,
        // or any ETag.
        RequestConditions modifiedRequestConditions = yourOptionalRequestConditions;

        System.out.printf("The broken lease has %d seconds remaining on the lease", client
            .breakLeaseWithResponse(retainLeaseInSeconds, modifiedRequestConditions, timeout, new Context(key, value))
            .getValue());
        // END: com.azure.storage.file.datalake.specialized.DataLakeLeaseClient.breakLeaseWithResponse#Integer-RequestConditions-Duration-Context
    }

    /**
     * Code snippets for {@link DataLakeLeaseClient#changeLeaseWithResponse(String, RequestConditions, Duration, Context)}
     */
    public void changeLeaseWithResponseCodeSnippets() {
        // BEGIN: com.azure.storage.file.datalake.specialized.DataLakeLeaseClient.changeLeaseWithResponse#String-RequestConditions-Duration-Context
        // Optional HTTP request conditions that can be used to narrow the scope of the request.
        // The request conditions can be used to have the leasing request only succeed if the resource has been
        // modified and/or unmodified within a certain time frame and/or matches and/or doesn't match a specific ETag,
        // or any ETag.
        RequestConditions modifiedRequestConditions = yourOptionalRequestConditions;

        System.out.printf("Changed lease ID is %s%n",
            client.changeLeaseWithResponse("proposedId", modifiedRequestConditions, timeout, new Context(key, value))
                .getValue());
        // END: com.azure.storage.file.datalake.specialized.DataLakeLeaseClient.changeLeaseWithResponse#String-RequestConditions-Duration-Context
    }
}
