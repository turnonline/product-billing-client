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
 * Model definition for Product.
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
public final class Product
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
    private Event event;

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
    private ProductInvoicing invoicing;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String itemName;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private ProductMetaFields metaFields;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime modificationDate;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private ProductOverview overview;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private ProductPricing pricing;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private ProductPublishing publishing;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String snippet;

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
    public Product setCreatedDate( com.google.api.client.util.DateTime createdDate )
    {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public Event getEvent()
    {
        return event;
    }

    /**
     * @param event event or {@code null} for none
     */
    public Product setEvent( Event event )
    {
        this.event = event;
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
    public Product setId( java.lang.Long id )
    {
        this.id = id;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public ProductInvoicing getInvoicing()
    {
        return invoicing;
    }

    /**
     * @param invoicing invoicing or {@code null} for none
     */
    public Product setInvoicing( ProductInvoicing invoicing )
    {
        this.invoicing = invoicing;
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
    public Product setItemName( java.lang.String itemName )
    {
        this.itemName = itemName;
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
    public Product setMetaFields( ProductMetaFields metaFields )
    {
        this.metaFields = metaFields;
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
    public Product setModificationDate( com.google.api.client.util.DateTime modificationDate )
    {
        this.modificationDate = modificationDate;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public ProductOverview getOverview()
    {
        return overview;
    }

    /**
     * @param overview overview or {@code null} for none
     */
    public Product setOverview( ProductOverview overview )
    {
        this.overview = overview;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public ProductPricing getPricing()
    {
        return pricing;
    }

    /**
     * @param pricing pricing or {@code null} for none
     */
    public Product setPricing( ProductPricing pricing )
    {
        this.pricing = pricing;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public ProductPublishing getPublishing()
    {
        return publishing;
    }

    /**
     * @param publishing publishing or {@code null} for none
     */
    public Product setPublishing( ProductPublishing publishing )
    {
        this.publishing = publishing;
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
    public Product setSnippet( java.lang.String snippet )
    {
        this.snippet = snippet;
        return this;
    }

    @Override
    public Product set( String fieldName, Object value )
    {
        return ( Product ) super.set( fieldName, value );
    }

    @Override
    public Product clone()
    {
        return ( Product ) super.clone();
    }

}
