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
 * Model definition for Pricing.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings( "javadoc" )
public final class Pricing
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
    private java.lang.Boolean appliedReverseCharge;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private PricingCustomer customer;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean discountApplied;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean discountDefined;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<PricingItem> items;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double noDiscountTotalPrice;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double noDiscountTotalPriceExclVat;

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
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getAppliedReverseCharge()
    {
        return appliedReverseCharge;
    }

    /**
     * @param appliedReverseCharge appliedReverseCharge or {@code null} for none
     */
    public Pricing setAppliedReverseCharge( java.lang.Boolean appliedReverseCharge )
    {
        this.appliedReverseCharge = appliedReverseCharge;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public PricingCustomer getCustomer()
    {
        return customer;
    }

    /**
     * @param customer customer or {@code null} for none
     */
    public Pricing setCustomer( PricingCustomer customer )
    {
        this.customer = customer;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getDiscountApplied()
    {
        return discountApplied;
    }

    /**
     * @param discountApplied discountApplied or {@code null} for none
     */
    public Pricing setDiscountApplied( java.lang.Boolean discountApplied )
    {
        this.discountApplied = discountApplied;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getDiscountDefined()
    {
        return discountDefined;
    }

    /**
     * @param discountDefined discountDefined or {@code null} for none
     */
    public Pricing setDiscountDefined( java.lang.Boolean discountDefined )
    {
        this.discountDefined = discountDefined;
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
    public Pricing setItems( java.util.List<PricingItem> items )
    {
        this.items = items;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getNoDiscountTotalPrice()
    {
        return noDiscountTotalPrice;
    }

    /**
     * @param noDiscountTotalPrice noDiscountTotalPrice or {@code null} for none
     */
    public Pricing setNoDiscountTotalPrice( java.lang.Double noDiscountTotalPrice )
    {
        this.noDiscountTotalPrice = noDiscountTotalPrice;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getNoDiscountTotalPriceExclVat()
    {
        return noDiscountTotalPriceExclVat;
    }

    /**
     * @param noDiscountTotalPriceExclVat noDiscountTotalPriceExclVat or {@code null} for none
     */
    public Pricing setNoDiscountTotalPriceExclVat( java.lang.Double noDiscountTotalPriceExclVat )
    {
        this.noDiscountTotalPriceExclVat = noDiscountTotalPriceExclVat;
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
    public Pricing setTotalPrice( java.lang.Double totalPrice )
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
    public Pricing setTotalPriceExclVat( java.lang.Double totalPriceExclVat )
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
    public Pricing setTotalVatBase( java.lang.Double totalVatBase )
    {
        this.totalVatBase = totalVatBase;
        return this;
    }

    @Override
    public Pricing set( String fieldName, Object value )
    {
        return ( Pricing ) super.set( fieldName, value );
    }

    @Override
    public Pricing clone()
    {
        return ( Pricing ) super.clone();
    }

}
