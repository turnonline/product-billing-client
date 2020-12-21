/*
 * Copyright (c) 2020 TurnOnline.biz s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package biz.turnonline.ecosystem.billing.model;

import java.io.Serializable;

/**
 * Model definition for Expenditure.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class Expenditure
        implements Serializable
{
    private static final long serialVersionUID = -4535237770861212529L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    @com.google.api.client.json.JsonString
    private java.lang.Long bill;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String billNumber;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime dateOfIssue;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime dateOfTaxable;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private ExpenditurePayment payment;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private ExpenditurePricing pricing;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Supplier supplier;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String type;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Long getBill()
    {
        return bill;
    }

    /**
     * @param bill bill or {@code null} for none
     */
    public Expenditure setBill( java.lang.Long bill )
    {
        this.bill = bill;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getBillNumber()
    {
        return billNumber;
    }

    /**
     * @param billNumber billNumber or {@code null} for none
     */
    public Expenditure setBillNumber( java.lang.String billNumber )
    {
        this.billNumber = billNumber;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public com.google.api.client.util.DateTime getDateOfIssue()
    {
        return dateOfIssue;
    }

    /**
     * @param dateOfIssue dateOfIssue or {@code null} for none
     */
    public Expenditure setDateOfIssue( com.google.api.client.util.DateTime dateOfIssue )
    {
        this.dateOfIssue = dateOfIssue;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public com.google.api.client.util.DateTime getDateOfTaxable()
    {
        return dateOfTaxable;
    }

    /**
     * @param dateOfTaxable dateOfTaxable or {@code null} for none
     */
    public Expenditure setDateOfTaxable( com.google.api.client.util.DateTime dateOfTaxable )
    {
        this.dateOfTaxable = dateOfTaxable;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public ExpenditurePayment getPayment()
    {
        return payment;
    }

    /**
     * @param payment payment or {@code null} for none
     */
    public Expenditure setPayment( ExpenditurePayment payment )
    {
        this.payment = payment;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public ExpenditurePricing getPricing()
    {
        return pricing;
    }

    /**
     * @param pricing pricing or {@code null} for none
     */
    public Expenditure setPricing( ExpenditurePricing pricing )
    {
        this.pricing = pricing;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public Supplier getSupplier()
    {
        return supplier;
    }

    /**
     * @param supplier supplier or {@code null} for none
     */
    public Expenditure setSupplier( Supplier supplier )
    {
        this.supplier = supplier;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getType()
    {
        return type;
    }

    /**
     * @param type type or {@code null} for none
     */
    public Expenditure setType( java.lang.String type )
    {
        this.type = type;
        return this;
    }
}
