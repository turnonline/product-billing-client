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
 * Model definition for PricingItem.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class PricingItem
        implements Serializable
{
    private static final long serialVersionUID = 3294834273227211635L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double amount;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean checkedIn;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String currency;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean discountApplied;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String discountCode;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean discountCodeDefined;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean discountDefined;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double finalPrice;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double finalPriceExclVat;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double finalValueAddedTax;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String finalVat;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double finalVatAmount;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double finalVatBase;

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
    private java.lang.String inline;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String itemName;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String itemType;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String itemUrl;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<PricingItem> items;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private ProductMetaFields metaFields;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer order;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String parentKey;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double priceExclVat;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private PricingProduct product;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String snippet;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.Map<String, java.lang.Object> subsidiary;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String thumbnailUrl;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String unit;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double valueAddedTax;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String vat;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getAmount()
    {
        return amount;
    }

    /**
     * @param amount amount or {@code null} for none
     */
    public PricingItem setAmount( java.lang.Double amount )
    {
        this.amount = amount;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCheckedIn()
    {
        return checkedIn;
    }

    /**
     * @param checkedIn checkedIn or {@code null} for none
     */
    public PricingItem setCheckedIn( java.lang.Boolean checkedIn )
    {
        this.checkedIn = checkedIn;
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
    public PricingItem setCurrency( java.lang.String currency )
    {
        this.currency = currency;
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
    public PricingItem setDiscountApplied( java.lang.Boolean discountApplied )
    {
        this.discountApplied = discountApplied;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getDiscountCode()
    {
        return discountCode;
    }

    /**
     * @param discountCode discountCode or {@code null} for none
     */
    public PricingItem setDiscountCode( java.lang.String discountCode )
    {
        this.discountCode = discountCode;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getDiscountCodeDefined()
    {
        return discountCodeDefined;
    }

    /**
     * @param discountCodeDefined discountCodeDefined or {@code null} for none
     */
    public PricingItem setDiscountCodeDefined( java.lang.Boolean discountCodeDefined )
    {
        this.discountCodeDefined = discountCodeDefined;
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
    public PricingItem setDiscountDefined( java.lang.Boolean discountDefined )
    {
        this.discountDefined = discountDefined;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getFinalPrice()
    {
        return finalPrice;
    }

    /**
     * @param finalPrice finalPrice or {@code null} for none
     */
    public PricingItem setFinalPrice( java.lang.Double finalPrice )
    {
        this.finalPrice = finalPrice;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getFinalPriceExclVat()
    {
        return finalPriceExclVat;
    }

    /**
     * @param finalPriceExclVat finalPriceExclVat or {@code null} for none
     */
    public PricingItem setFinalPriceExclVat( java.lang.Double finalPriceExclVat )
    {
        this.finalPriceExclVat = finalPriceExclVat;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getFinalValueAddedTax()
    {
        return finalValueAddedTax;
    }

    /**
     * @param finalValueAddedTax finalValueAddedTax or {@code null} for none
     */
    public PricingItem setFinalValueAddedTax( java.lang.Double finalValueAddedTax )
    {
        this.finalValueAddedTax = finalValueAddedTax;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getFinalVat()
    {
        return finalVat;
    }

    /**
     * @param finalVat finalVat or {@code null} for none
     */
    public PricingItem setFinalVat( java.lang.String finalVat )
    {
        this.finalVat = finalVat;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getFinalVatAmount()
    {
        return finalVatAmount;
    }

    /**
     * @param finalVatAmount finalVatAmount or {@code null} for none
     */
    public PricingItem setFinalVatAmount( java.lang.Double finalVatAmount )
    {
        this.finalVatAmount = finalVatAmount;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getFinalVatBase()
    {
        return finalVatBase;
    }

    /**
     * @param finalVatBase finalVatBase or {@code null} for none
     */
    public PricingItem setFinalVatBase( java.lang.Double finalVatBase )
    {
        this.finalVatBase = finalVatBase;
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
    public PricingItem setId( java.lang.Long id )
    {
        this.id = id;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getInline()
    {
        return inline;
    }

    /**
     * @param inline inline or {@code null} for none
     */
    public PricingItem setInline( java.lang.String inline )
    {
        this.inline = inline;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getItemName()
    {
        return itemName;
    }

    /**
     * @param itemName itemName or {@code null} for none
     */
    public PricingItem setItemName( java.lang.String itemName )
    {
        this.itemName = itemName;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getItemType()
    {
        return itemType;
    }

    /**
     * @param itemType itemType or {@code null} for none
     */
    public PricingItem setItemType( java.lang.String itemType )
    {
        this.itemType = itemType;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getItemUrl()
    {
        return itemUrl;
    }

    /**
     * @param itemUrl itemUrl or {@code null} for none
     */
    public PricingItem setItemUrl( java.lang.String itemUrl )
    {
        this.itemUrl = itemUrl;
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
    public PricingItem setItems( java.util.List<PricingItem> items )
    {
        this.items = items;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public ProductMetaFields getMetaFields()
    {
        return metaFields;
    }

    /**
     * @param metaFields metaFields or {@code null} for none
     */
    public PricingItem setMetaFields( ProductMetaFields metaFields )
    {
        this.metaFields = metaFields;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Integer getOrder()
    {
        return order;
    }

    /**
     * @param order order or {@code null} for none
     */
    public PricingItem setOrder( java.lang.Integer order )
    {
        this.order = order;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getParentKey()
    {
        return parentKey;
    }

    /**
     * @param parentKey parentKey or {@code null} for none
     */
    public PricingItem setParentKey( java.lang.String parentKey )
    {
        this.parentKey = parentKey;
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
    public PricingItem setPriceExclVat( java.lang.Double priceExclVat )
    {
        this.priceExclVat = priceExclVat;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public PricingProduct getProduct()
    {
        return product;
    }

    /**
     * @param product product or {@code null} for none
     */
    public PricingItem setProduct( PricingProduct product )
    {
        this.product = product;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getSnippet()
    {
        return snippet;
    }

    /**
     * @param snippet snippet or {@code null} for none
     */
    public PricingItem setSnippet( java.lang.String snippet )
    {
        this.snippet = snippet;
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
    public PricingItem setSubsidiary( java.util.Map<String, java.lang.Object> subsidiary )
    {
        this.subsidiary = subsidiary;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getThumbnailUrl()
    {
        return thumbnailUrl;
    }

    /**
     * @param thumbnailUrl thumbnailUrl or {@code null} for none
     */
    public PricingItem setThumbnailUrl( java.lang.String thumbnailUrl )
    {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getUnit()
    {
        return unit;
    }

    /**
     * @param unit unit or {@code null} for none
     */
    public PricingItem setUnit( java.lang.String unit )
    {
        this.unit = unit;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getValueAddedTax()
    {
        return valueAddedTax;
    }

    /**
     * @param valueAddedTax valueAddedTax or {@code null} for none
     */
    public PricingItem setValueAddedTax( java.lang.Double valueAddedTax )
    {
        this.valueAddedTax = valueAddedTax;
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
    public PricingItem setVat( java.lang.String vat )
    {
        this.vat = vat;
        return this;
    }
}
