// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.Duration;
import java.util.Map;

/** Statistics for the queue. */
@Immutable
public final class RouterQueueStatistics {

    /*
     * Id of the queue these details are about.
     */
    @JsonProperty(value = "queueId")
    private String queueId;

    /*
     * Length of the queue: total number of enqueued jobs.
     */
    @JsonProperty(value = "length")
    private int length;

    /*
     * The estimated wait time of this queue rounded up to the nearest minute, grouped
     * by job priority
     */
    @JsonProperty(value = "estimatedWaitTimeMinutes")
    @JsonDeserialize(using = DurationMapDeserializer.class)
    @JsonSerialize(using = DurationMapSerializer.class)
    private Map<Integer, Duration> estimatedWaitTimes;

    /*
     * The wait time of the job that has been enqueued in this queue for the longest.
     */
    @JsonProperty(value = "longestJobWaitTimeMinutes")
    private Double longestJobWaitTimeMinutes;

    /**
     * Creates an instance of RouterQueueStatistics class.
     *
     * @param queueId the queueId value to set.
     * @param length the length value to set.
     */
    @JsonCreator
    private RouterQueueStatistics(
            @JsonProperty(value = "queueId") String queueId, @JsonProperty(value = "length") int length) {
        this.queueId = queueId;
        this.length = length;
    }

    /**
     * Get the queueId property: Id of the queue these details are about.
     *
     * @return the queueId value.
     */
    public String getQueueId() {
        return this.queueId;
    }

    /**
     * Get the length property: Length of the queue: total number of enqueued jobs.
     *
     * @return the length value.
     */
    public int getLength() {
        return this.length;
    }

    /**
     * Get the estimatedWaitTimeMinutes property: The estimated wait time of this queue rounded up to the nearest
     * minute, grouped by job priority.
     *
     * @return the estimatedWaitTimeMinutes value.
     */
    public Map<Integer, Duration> getEstimatedWaitTime() {
        return this.estimatedWaitTimes;
    }

    /**
     * Get the longestJobWaitTimeMinutes property: The wait time of the job that has been enqueued in this queue for the
     * longest.
     *
     * @return the longestJobWaitTimeMinutes value.
     */
    public Double getLongestJobWaitTimeMinutes() {
        return this.longestJobWaitTimeMinutes;
    }
}
