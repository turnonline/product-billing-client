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
 * Model definition for ProductPricing.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class ProductPricing
        implements Serializable
{
    private static final long serialVersionUID = -852646183983215805L;

    static
    {
        // hack to force ProGuard to consider ProductDiscount used, since otherwise it would be stripped out
        // see https://github.com/google/google-api-java-client/issues/543
        com.google.api.client.util.Data.nullOf( ProductDiscount.class );
    }

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String currency;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<ProductDiscount> discounts;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean domesticDelivery;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private PricingItem items;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double priceExclVat;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.Map<String, java.lang.Object> subsidiary;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<PricingStructureTemplate> template;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String vat;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String vatEU;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String vatNonEU;

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
    public ProductPricing setCurrency( java.lang.String currency )
    {
        this.currency = currency;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<ProductDiscount> getDiscounts()
    {
        return discounts;
    }

    /**
     * @param discounts discounts or {@code null} for none
     */
    public ProductPricing setDiscounts( java.util.List<ProductDiscount> discounts )
    {
        this.discounts = discounts;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getDomesticDelivery()
    {
        return domesticDelivery;
    }

    /**
     * @param domesticDelivery domesticDelivery or {@code null} for none
     */
    public ProductPricing setDomesticDelivery( java.lang.Boolean domesticDelivery )
    {
        this.domesticDelivery = domesticDelivery;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public PricingItem getItems()
    {
        return items;
    }

    /**
     * @param items items or {@code null} for none
     */
    public ProductPricing setItems( PricingItem items )
    {
        this.items = items;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getPriceExclVat()
    {
        return priceExclVat;
    }

    /**
     * @param priceExclVat priceExclVat or {@code null} for none
     */
    public ProductPricing setPriceExclVat( java.lang.Double priceExclVat )
    {
        this.priceExclVat = priceExclVat;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.Map<String, java.lang.Object> getSubsidiary()
    {
        return subsidiary;
    }

    /**
     * @param subsidiary subsidiary or {@code null} for none
     */
    public ProductPricing setSubsidiary( java.util.Map<String, java.lang.Object> subsidiary )
    {
        this.subsidiary = subsidiary;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<PricingStructureTemplate> getTemplate()
    {
        return template;
    }

    /**
     * @param template template or {@code null} for none
     */
    public ProductPricing setTemplate( java.util.List<PricingStructureTemplate> template )
    {
        this.template = template;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getVat()
    {
        return vat;
    }

    /**
     * @param vat vat or {@code null} for none
     */
    public ProductPricing setVat( java.lang.String vat )
    {
        this.vat = vat;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getVatEU()
    {
        return vatEU;
    }

    /**
     * @param vatEU vatEU or {@code null} for none
     */
    public ProductPricing setVatEU( java.lang.String vatEU )
    {
        this.vatEU = vatEU;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getVatNonEU()
    {
        return vatNonEU;
    }

    /**
     * @param vatNonEU vatNonEU or {@code null} for none
     */
    public ProductPricing setVatNonEU( java.lang.String vatNonEU )
    {
        this.vatNonEU = vatNonEU;
        return this;
    }
}
