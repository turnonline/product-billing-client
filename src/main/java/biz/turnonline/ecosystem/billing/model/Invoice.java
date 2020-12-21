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
 * Model definition for Invoice.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class Invoice
        implements Serializable
{
    private static final long serialVersionUID = 8242018485223018666L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime createdDate;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String currency;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Customer customer;

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
    private java.lang.String finalText;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    @com.google.api.client.json.JsonString
    private java.lang.Long id;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String introductoryText;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String invoiceNumber;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime modificationDate;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private NumberSeries numberSeries;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    @com.google.api.client.json.JsonString
    private java.lang.Long orderId;

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
    private BillPricing pricing;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String servingUrl;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String status;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String type;

    /**
     * @return value or {@code null} for none
     */
    public com.google.api.client.util.DateTime getCreatedDate()
    {
        return createdDate;
    }

    /**
     * @param createdDate createdDate or {@code null} for none
     */
    public Invoice setCreatedDate( com.google.api.client.util.DateTime createdDate )
    {
        this.createdDate = createdDate;
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
    public Invoice setCurrency( java.lang.String currency )
    {
        this.currency = currency;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public Customer getCustomer()
    {
        return customer;
    }

    /**
     * @param customer customer or {@code null} for none
     */
    public Invoice setCustomer( Customer customer )
    {
        this.customer = customer;
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
    public Invoice setDateOfIssue( com.google.api.client.util.DateTime dateOfIssue )
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
    public Invoice setDateOfTaxable( com.google.api.client.util.DateTime dateOfTaxable )
    {
        this.dateOfTaxable = dateOfTaxable;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getFinalText()
    {
        return finalText;
    }

    /**
     * @param finalText finalText or {@code null} for none
     */
    public Invoice setFinalText( java.lang.String finalText )
    {
        this.finalText = finalText;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Long getId()
    {
        return id;
    }

    /**
     * @param id id or {@code null} for none
     */
    public Invoice setId( java.lang.Long id )
    {
        this.id = id;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getIntroductoryText()
    {
        return introductoryText;
    }

    /**
     * @param introductoryText introductoryText or {@code null} for none
     */
    public Invoice setIntroductoryText( java.lang.String introductoryText )
    {
        this.introductoryText = introductoryText;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getInvoiceNumber()
    {
        return invoiceNumber;
    }

    /**
     * @param invoiceNumber invoiceNumber or {@code null} for none
     */
    public Invoice setInvoiceNumber( java.lang.String invoiceNumber )
    {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public com.google.api.client.util.DateTime getModificationDate()
    {
        return modificationDate;
    }

    /**
     * @param modificationDate modificationDate or {@code null} for none
     */
    public Invoice setModificationDate( com.google.api.client.util.DateTime modificationDate )
    {
        this.modificationDate = modificationDate;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public NumberSeries getNumberSeries()
    {
        return numberSeries;
    }

    /**
     * @param numberSeries numberSeries or {@code null} for none
     */
    public Invoice setNumberSeries( NumberSeries numberSeries )
    {
        this.numberSeries = numberSeries;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Long getOrderId()
    {
        return orderId;
    }

    /**
     * @param orderId orderId or {@code null} for none
     */
    public Invoice setOrderId( java.lang.Long orderId )
    {
        this.orderId = orderId;
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
    public Invoice setPayment( BillPayment payment )
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
    public Invoice setPin( java.lang.String pin )
    {
        this.pin = pin;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public BillPricing getPricing()
    {
        return pricing;
    }

    /**
     * @param pricing pricing or {@code null} for none
     */
    public Invoice setPricing( BillPricing pricing )
    {
        this.pricing = pricing;
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
    public Invoice setServingUrl( java.lang.String servingUrl )
    {
        this.servingUrl = servingUrl;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getStatus()
    {
        return status;
    }

    /**
     * @param status status or {@code null} for none
     */
    public Invoice setStatus( java.lang.String status )
    {
        this.status = status;
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
    public Invoice setType( java.lang.String type )
    {
        this.type = type;
        return this;
    }
}
