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
 * Model definition for ProductOverview.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class ProductOverview
        implements Serializable
{
    private static final long serialVersionUID = -6473243935324895930L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String about;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String category;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String productUrl;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean published;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String thumbnailUrl;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getAbout()
    {
        return about;
    }

    /**
     * @param about about or {@code null} for none
     */
    public ProductOverview setAbout( java.lang.String about )
    {
        this.about = about;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getCategory()
    {
        return category;
    }

    /**
     * @param category category or {@code null} for none
     */
    public ProductOverview setCategory( java.lang.String category )
    {
        this.category = category;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getProductUrl()
    {
        return productUrl;
    }

    /**
     * @param productUrl productUrl or {@code null} for none
     */
    public ProductOverview setProductUrl( java.lang.String productUrl )
    {
        this.productUrl = productUrl;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getPublished()
    {
        return published;
    }

    /**
     * @param published published or {@code null} for none
     */
    public ProductOverview setPublished( java.lang.Boolean published )
    {
        this.published = published;
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
    public ProductOverview setThumbnailUrl( java.lang.String thumbnailUrl )
    {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }
}
