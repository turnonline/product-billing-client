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
 * Model definition for IncomingInvoice.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class IncomingInvoice
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime createdDate;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Creditor creditor;

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
    @com.google.api.client.json.JsonString
    private java.lang.Long id;

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
    @com.google.api.client.json.JsonString
    private java.lang.Long orderId;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private InvoicePayment payment;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String pin;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private InvoicePricing pricing;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String servingUrl;

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
    public IncomingInvoice setCreatedDate( com.google.api.client.util.DateTime createdDate )
    {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public Creditor getCreditor()
    {
        return creditor;
    }

    /**
     * @param creditor creditor or {@code null} for none
     */
    public IncomingInvoice setCreditor( Creditor creditor )
    {
        this.creditor = creditor;
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
    public IncomingInvoice setCurrency( java.lang.String currency )
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
    public IncomingInvoice setDateOfIssue( com.google.api.client.util.DateTime dateOfIssue )
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
    public IncomingInvoice setDateOfTaxable( com.google.api.client.util.DateTime dateOfTaxable )
    {
        this.dateOfTaxable = dateOfTaxable;
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
    public IncomingInvoice setId( java.lang.Long id )
    {
        this.id = id;
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
    public IncomingInvoice setInvoiceNumber( java.lang.String invoiceNumber )
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
    public IncomingInvoice setModificationDate( com.google.api.client.util.DateTime modificationDate )
    {
        this.modificationDate = modificationDate;
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
    public IncomingInvoice setOrderId( java.lang.Long orderId )
    {
        this.orderId = orderId;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public InvoicePayment getPayment()
    {
        return payment;
    }

    /**
     * @param payment payment or {@code null} for none
     */
    public IncomingInvoice setPayment( InvoicePayment payment )
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
    public IncomingInvoice setPin( java.lang.String pin )
    {
        this.pin = pin;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public InvoicePricing getPricing()
    {
        return pricing;
    }

    /**
     * @param pricing pricing or {@code null} for none
     */
    public IncomingInvoice setPricing( InvoicePricing pricing )
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
    public IncomingInvoice setServingUrl( java.lang.String servingUrl )
    {
        this.servingUrl = servingUrl;
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
    public IncomingInvoice setType( java.lang.String type )
    {
        this.type = type;
        return this;
    }

    @Override
    public IncomingInvoice set( String fieldName, Object value )
    {
        return ( IncomingInvoice ) super.set( fieldName, value );
    }

    @Override
    public IncomingInvoice clone()
    {
        return ( IncomingInvoice ) super.clone();
    }

}
