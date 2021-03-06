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
 * Model definition for PricingStructureTemplate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class PricingStructureTemplate
        implements Serializable
{
    private static final long serialVersionUID = 5931683003197236850L;

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
    private java.lang.Integer id;

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
    private java.util.List<PricingStructureTemplate> items;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer order;

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
    private java.lang.String unit;

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
    public PricingStructureTemplate setAmount( java.lang.Double amount )
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
    public PricingStructureTemplate setCheckedIn( java.lang.Boolean checkedIn )
    {
        this.checkedIn = checkedIn;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Integer getId()
    {
        return id;
    }

    /**
     * @param id id or {@code null} for none
     */
    public PricingStructureTemplate setId( java.lang.Integer id )
    {
        this.id = id;
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
    public PricingStructureTemplate setItemName( java.lang.String itemName )
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
    public PricingStructureTemplate setItemType( java.lang.String itemType )
    {
        this.itemType = itemType;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<PricingStructureTemplate> getItems()
    {
        return items;
    }

    /**
     * @param items items or {@code null} for none
     */
    public PricingStructureTemplate setItems( java.util.List<PricingStructureTemplate> items )
    {
        this.items = items;
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
    public PricingStructureTemplate setOrder( java.lang.Integer order )
    {
        this.order = order;
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
    public PricingStructureTemplate setPriceExclVat( java.lang.Double priceExclVat )
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
    public PricingStructureTemplate setSubsidiary( java.util.Map<String, java.lang.Object> subsidiary )
    {
        this.subsidiary = subsidiary;
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
    public PricingStructureTemplate setUnit( java.lang.String unit )
    {
        this.unit = unit;
        return this;
    }
}
