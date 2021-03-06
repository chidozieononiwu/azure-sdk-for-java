/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_12_01.QuotaCounterContract;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;
import com.microsoft.azure.management.apimanagement.v2019_12_01.QuotaCounterValueContractProperties;

class QuotaCounterContractImpl extends WrapperImpl<QuotaCounterContractInner> implements QuotaCounterContract {
    private final ApiManagementManager manager;
    private String resourceGroupName;
    private String serviceName;
    private String quotaCounterKey;
    private String quotaPeriodKey;

    QuotaCounterContractImpl(QuotaCounterContractInner inner,  ApiManagementManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }



    @Override
    public String counterKey() {
        return this.inner().counterKey();
    }

    @Override
    public DateTime periodEndTime() {
        return this.inner().periodEndTime();
    }

    @Override
    public String periodKey() {
        return this.inner().periodKey();
    }

    @Override
    public DateTime periodStartTime() {
        return this.inner().periodStartTime();
    }

    @Override
    public QuotaCounterValueContractProperties value() {
        return this.inner().value();
    }

}
