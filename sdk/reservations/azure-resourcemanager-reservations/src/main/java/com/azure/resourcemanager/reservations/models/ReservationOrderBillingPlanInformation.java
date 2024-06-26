// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.List;

/** Information describing the type of billing plan for this reservation. */
@Fluent
public final class ReservationOrderBillingPlanInformation {
    /*
     * Amount of money to be paid for the Order. Tax is not included.
     */
    @JsonProperty(value = "pricingCurrencyTotal")
    private Price pricingCurrencyTotal;

    /*
     * Date when the billing plan has started.
     */
    @JsonProperty(value = "startDate")
    private LocalDate startDate;

    /*
     * For recurring billing plans, indicates the date when next payment will be processed. Null when total is paid
     * off.
     */
    @JsonProperty(value = "nextPaymentDueDate")
    private LocalDate nextPaymentDueDate;

    /*
     * The transactions property.
     */
    @JsonProperty(value = "transactions")
    private List<PaymentDetail> transactions;

    /** Creates an instance of ReservationOrderBillingPlanInformation class. */
    public ReservationOrderBillingPlanInformation() {
    }

    /**
     * Get the pricingCurrencyTotal property: Amount of money to be paid for the Order. Tax is not included.
     *
     * @return the pricingCurrencyTotal value.
     */
    public Price pricingCurrencyTotal() {
        return this.pricingCurrencyTotal;
    }

    /**
     * Set the pricingCurrencyTotal property: Amount of money to be paid for the Order. Tax is not included.
     *
     * @param pricingCurrencyTotal the pricingCurrencyTotal value to set.
     * @return the ReservationOrderBillingPlanInformation object itself.
     */
    public ReservationOrderBillingPlanInformation withPricingCurrencyTotal(Price pricingCurrencyTotal) {
        this.pricingCurrencyTotal = pricingCurrencyTotal;
        return this;
    }

    /**
     * Get the startDate property: Date when the billing plan has started.
     *
     * @return the startDate value.
     */
    public LocalDate startDate() {
        return this.startDate;
    }

    /**
     * Set the startDate property: Date when the billing plan has started.
     *
     * @param startDate the startDate value to set.
     * @return the ReservationOrderBillingPlanInformation object itself.
     */
    public ReservationOrderBillingPlanInformation withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get the nextPaymentDueDate property: For recurring billing plans, indicates the date when next payment will be
     * processed. Null when total is paid off.
     *
     * @return the nextPaymentDueDate value.
     */
    public LocalDate nextPaymentDueDate() {
        return this.nextPaymentDueDate;
    }

    /**
     * Set the nextPaymentDueDate property: For recurring billing plans, indicates the date when next payment will be
     * processed. Null when total is paid off.
     *
     * @param nextPaymentDueDate the nextPaymentDueDate value to set.
     * @return the ReservationOrderBillingPlanInformation object itself.
     */
    public ReservationOrderBillingPlanInformation withNextPaymentDueDate(LocalDate nextPaymentDueDate) {
        this.nextPaymentDueDate = nextPaymentDueDate;
        return this;
    }

    /**
     * Get the transactions property: The transactions property.
     *
     * @return the transactions value.
     */
    public List<PaymentDetail> transactions() {
        return this.transactions;
    }

    /**
     * Set the transactions property: The transactions property.
     *
     * @param transactions the transactions value to set.
     * @return the ReservationOrderBillingPlanInformation object itself.
     */
    public ReservationOrderBillingPlanInformation withTransactions(List<PaymentDetail> transactions) {
        this.transactions = transactions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pricingCurrencyTotal() != null) {
            pricingCurrencyTotal().validate();
        }
        if (transactions() != null) {
            transactions().forEach(e -> e.validate());
        }
    }
}
