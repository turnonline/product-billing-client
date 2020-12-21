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
 * Model definition for ProductPicture.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class ProductPicture
        implements Serializable
{
    private static final long serialVersionUID = -5078777959882482828L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer order;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String servingUrl;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String storageName;

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
    public ProductPicture setOrder( java.lang.Integer order )
    {
        this.order = order;
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
    public ProductPicture setServingUrl( java.lang.String servingUrl )
    {
        this.servingUrl = servingUrl;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getStorageName()
    {
        return storageName;
    }

    /**
     * @param storageName storageName or {@code null} for none
     */
    public ProductPicture setStorageName( java.lang.String storageName )
    {
        this.storageName = storageName;
        return this;
    }
}
