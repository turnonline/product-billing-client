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
 * Model definition for Order.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class Order
        implements Serializable
{
    private static final long serialVersionUID = 537661813139673004L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime beginOn;

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
    private ShippingDetails delivery;

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
    private java.lang.String invoiceType;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Invoice> invoices;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<PricingItem> items;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime lastBillingDate;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime modificationDate;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime nextBillingDate;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer numberOfDays;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String periodicity;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String status;

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
    private java.lang.Double totalVatAmount;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double totalVatBase;

    /**
     * @return value or {@code null} for none
     */
    public com.google.api.client.util.DateTime getBeginOn()
    {
        return beginOn;
    }

    /**
     * @param beginOn beginOn or {@code null} for none
     */
    public Order setBeginOn( com.google.api.client.util.DateTime beginOn )
    {
        this.beginOn = beginOn;
        return this;
    }

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
    public Order setCreatedDate( com.google.api.client.util.DateTime createdDate )
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
    public Order setCurrency( java.lang.String currency )
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
    public Order setCustomer( Customer customer )
    {
        this.customer = customer;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public ShippingDetails getDelivery()
    {
        return delivery;
    }

    /**
     * @param delivery delivery or {@code null} for none
     */
    public Order setDelivery( ShippingDetails delivery )
    {
        this.delivery = delivery;
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
    public Order setId( java.lang.Long id )
    {
        this.id = id;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getInvoiceType()
    {
        return invoiceType;
    }

    /**
     * @param invoiceType invoiceType or {@code null} for none
     */
    public Order setInvoiceType( java.lang.String invoiceType )
    {
        this.invoiceType = invoiceType;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<Invoice> getInvoices()
    {
        return invoices;
    }

    /**
     * @param invoices invoices or {@code null} for none
     */
    public Order setInvoices( java.util.List<Invoice> invoices )
    {
        this.invoices = invoices;
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
    public Order setItems( java.util.List<PricingItem> items )
    {
        this.items = items;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public com.google.api.client.util.DateTime getLastBillingDate()
    {
        return lastBillingDate;
    }

    /**
     * @param lastBillingDate lastBillingDate or {@code null} for none
     */
    public Order setLastBillingDate( com.google.api.client.util.DateTime lastBillingDate )
    {
        this.lastBillingDate = lastBillingDate;
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
    public Order setModificationDate( com.google.api.client.util.DateTime modificationDate )
    {
        this.modificationDate = modificationDate;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public com.google.api.client.util.DateTime getNextBillingDate()
    {
        return nextBillingDate;
    }

    /**
     * @param nextBillingDate nextBillingDate or {@code null} for none
     */
    public Order setNextBillingDate( com.google.api.client.util.DateTime nextBillingDate )
    {
        this.nextBillingDate = nextBillingDate;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Integer getNumberOfDays()
    {
        return numberOfDays;
    }

    /**
     * @param numberOfDays numberOfDays or {@code null} for none
     */
    public Order setNumberOfDays( java.lang.Integer numberOfDays )
    {
        this.numberOfDays = numberOfDays;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getPeriodicity()
    {
        return periodicity;
    }

    /**
     * @param periodicity periodicity or {@code null} for none
     */
    public Order setPeriodicity( java.lang.String periodicity )
    {
        this.periodicity = periodicity;
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
    public Order setStatus( java.lang.String status )
    {
        this.status = status;
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
    public Order setTotalPrice( java.lang.Double totalPrice )
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
    public Order setTotalPriceExclVat( java.lang.Double totalPriceExclVat )
    {
        this.totalPriceExclVat = totalPriceExclVat;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getTotalVatAmount()
    {
        return totalVatAmount;
    }

    /**
     * @param totalVatAmount totalVatAmount or {@code null} for none
     */
    public Order setTotalVatAmount( java.lang.Double totalVatAmount )
    {
        this.totalVatAmount = totalVatAmount;
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
    public Order setTotalVatBase( java.lang.Double totalVatBase )
    {
        this.totalVatBase = totalVatBase;
        return this;
    }
}
