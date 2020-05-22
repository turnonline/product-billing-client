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

/**
 * Model definition for Expense.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class Expense
        extends com.google.api.client.json.GenericJson
{
    static
    {
        // hack to force ProGuard to consider PricingItem used, since otherwise it would be stripped out
        // see https://github.com/google/google-api-java-client/issues/543
        com.google.api.client.util.Data.nullOf( PricingItem.class );
    }

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Bill bill;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String billNumber;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String currency;

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
    private java.util.List<PricingItem> items;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private BillPayment payment;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String pin;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String servingUrl;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Creditor supplier;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double totalPrice;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double totalPriceExclVat;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double totalVatBase;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String type;

    /**
     * @return value or {@code null} for none
     */
    public Bill getBill()
    {
        return bill;
    }

    /**
     * @param bill bill or {@code null} for none
     */
    public Expense setBill( Bill bill )
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
    public Expense setBillNumber( java.lang.String billNumber )
    {
        this.billNumber = billNumber;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getCurrency()
    {
        return currency;
    }

    /**
     * @param currency currency or {@code null} for none
     */
    public Expense setCurrency( java.lang.String currency )
    {
        this.currency = currency;
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
    public Expense setDateOfIssue( com.google.api.client.util.DateTime dateOfIssue )
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
    public Expense setDateOfTaxable( com.google.api.client.util.DateTime dateOfTaxable )
    {
        this.dateOfTaxable = dateOfTaxable;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<PricingItem> getItems()
    {
        return items;
    }

    /**
     * @param items items or {@code null} for none
     */
    public Expense setItems( java.util.List<PricingItem> items )
    {
        this.items = items;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public BillPayment getPayment()
    {
        return payment;
    }

    /**
     * @param payment payment or {@code null} for none
     */
    public Expense setPayment( BillPayment payment )
    {
        this.payment = payment;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getPin()
    {
        return pin;
    }

    /**
     * @param pin pin or {@code null} for none
     */
    public Expense setPin( java.lang.String pin )
    {
        this.pin = pin;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getServingUrl()
    {
        return servingUrl;
    }

    /**
     * @param servingUrl servingUrl or {@code null} for none
     */
    public Expense setServingUrl( java.lang.String servingUrl )
    {
        this.servingUrl = servingUrl;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public Creditor getSupplier()
    {
        return supplier;
    }

    /**
     * @param supplier supplier or {@code null} for none
     */
    public Expense setSupplier( Creditor supplier )
    {
        this.supplier = supplier;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getTotalPrice()
    {
        return totalPrice;
    }

    /**
     * @param totalPrice totalPrice or {@code null} for none
     */
    public Expense setTotalPrice( java.lang.Double totalPrice )
    {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getTotalPriceExclVat()
    {
        return totalPriceExclVat;
    }

    /**
     * @param totalPriceExclVat totalPriceExclVat or {@code null} for none
     */
    public Expense setTotalPriceExclVat( java.lang.Double totalPriceExclVat )
    {
        this.totalPriceExclVat = totalPriceExclVat;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getTotalVatBase()
    {
        return totalVatBase;
    }

    /**
     * @param totalVatBase totalVatBase or {@code null} for none
     */
    public Expense setTotalVatBase( java.lang.Double totalVatBase )
    {
        this.totalVatBase = totalVatBase;
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
    public Expense setType( java.lang.String type )
    {
        this.type = type;
        return this;
    }

    @Override
    public Expense set( String fieldName, Object value )
    {
        return ( Expense ) super.set( fieldName, value );
    }

    @Override
    public Expense clone()
    {
        return ( Expense ) super.clone();
    }

}
