// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input for the task that validates connection to Azure SQL Database Managed Instance. */
@Fluent
public final class ConnectToTargetSqlMITaskInput {
    /*
     * Connection information for target SQL Server
     */
    @JsonProperty(value = "targetConnectionInfo", required = true)
    private SqlConnectionInfo targetConnectionInfo;

    /** Creates an instance of ConnectToTargetSqlMITaskInput class. */
    public ConnectToTargetSqlMITaskInput() {
    }

    /**
     * Get the targetConnectionInfo property: Connection information for target SQL Server.
     *
     * @return the targetConnectionInfo value.
     */
    public SqlConnectionInfo targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    /**
     * Set the targetConnectionInfo property: Connection information for target SQL Server.
     *
     * @param targetConnectionInfo the targetConnectionInfo value to set.
     * @return the ConnectToTargetSqlMITaskInput object itself.
     */
    public ConnectToTargetSqlMITaskInput withTargetConnectionInfo(SqlConnectionInfo targetConnectionInfo) {
        this.targetConnectionInfo = targetConnectionInfo;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetConnectionInfo() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetConnectionInfo in model ConnectToTargetSqlMITaskInput"));
        } else {
            targetConnectionInfo().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ConnectToTargetSqlMITaskInput.class);
}
