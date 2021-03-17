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
 * Model definition for BillPricing.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class BillPricing
        implements Serializable
{
    private static final long serialVersionUID = -6024316421018997492L;

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
    private java.util.List<PricingItem> items;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String rounding;

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
    public java.util.List<PricingItem> getItems()
    {
        return items;
    }

    /**
     * @param items items or {@code null} for none
     */
    public BillPricing setItems( java.util.List<PricingItem> items )
    {
        this.items = items;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getRounding()
    {
        return rounding;
    }

    /**
     * @param rounding rounding or {@code null} for none
     */
    public BillPricing setRounding( java.lang.String rounding )
    {
        this.rounding = rounding;
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
    public BillPricing setTotalPrice( java.lang.Double totalPrice )
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
    public BillPricing setTotalPriceExclVat( java.lang.Double totalPriceExclVat )
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
    public BillPricing setTotalVatAmount( java.lang.Double totalVatAmount )
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
    public BillPricing setTotalVatBase( java.lang.Double totalVatBase )
    {
        this.totalVatBase = totalVatBase;
        return this;
    }
}
