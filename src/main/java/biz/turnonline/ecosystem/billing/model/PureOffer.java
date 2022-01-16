/*
 * Copyright (c) 2022 TurnOnline.biz s.r.o.
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
 * Model definition for PureOffer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class PureOffer
        implements Serializable
{
    private static final long serialVersionUID = 6059370632761917071L;

    static
    {
        // hack to force ProGuard to consider OfferItem used, since otherwise it would be stripped out
        // see https://github.com/google/google-api-java-client/issues/543
        com.google.api.client.util.Data.nullOf( OfferItem.class );
    }

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private OfferCustomer customer;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime expiration;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer expirationDays;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<OfferItem> items;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean multipleRecipients;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String picture;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String snippet;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String title;

    /**
     * @return value or {@code null} for none
     */
    public OfferCustomer getCustomer()
    {
        return customer;
    }

    /**
     * @param customer customer or {@code null} for none
     */
    public PureOffer setCustomer( OfferCustomer customer )
    {
        this.customer = customer;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public com.google.api.client.util.DateTime getExpiration()
    {
        return expiration;
    }

    /**
     * @param expiration expiration or {@code null} for none
     */
    public PureOffer setExpiration( com.google.api.client.util.DateTime expiration )
    {
        this.expiration = expiration;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Integer getExpirationDays()
    {
        return expirationDays;
    }

    /**
     * @param expirationDays expirationDays or {@code null} for none
     */
    public PureOffer setExpirationDays( java.lang.Integer expirationDays )
    {
        this.expirationDays = expirationDays;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<OfferItem> getItems()
    {
        return items;
    }

    /**
     * @param items items or {@code null} for none
     */
    public PureOffer setItems( java.util.List<OfferItem> items )
    {
        this.items = items;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getMultipleRecipients()
    {
        return multipleRecipients;
    }

    /**
     * @param multipleRecipients multipleRecipients or {@code null} for none
     */
    public PureOffer setMultipleRecipients( java.lang.Boolean multipleRecipients )
    {
        this.multipleRecipients = multipleRecipients;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getPicture()
    {
        return picture;
    }

    /**
     * @param picture picture or {@code null} for none
     */
    public PureOffer setPicture( java.lang.String picture )
    {
        this.picture = picture;
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
    public PureOffer setSnippet( java.lang.String snippet )
    {
        this.snippet = snippet;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getTitle()
    {
        return title;
    }

    /**
     * @param title title or {@code null} for none
     */
    public PureOffer setTitle( java.lang.String title )
    {
        this.title = title;
        return this;
    }
}
