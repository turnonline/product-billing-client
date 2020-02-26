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
 * Model definition for ProductPublishing.
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
public final class ProductPublishing
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private ProductDomain at;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean comingSoon;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime createdDate;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String description;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean facebookLike;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean googlePlus;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean linkedInShare;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime modificationDate;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<ProductPicture> pictures;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean published;

    /**
     * @return value or {@code null} for none
     */
    public ProductDomain getAt()
    {
        return at;
    }

    /**
     * @param at at or {@code null} for none
     */
    public ProductPublishing setAt( ProductDomain at )
    {
        this.at = at;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getComingSoon()
    {
        return comingSoon;
    }

    /**
     * @param comingSoon comingSoon or {@code null} for none
     */
    public ProductPublishing setComingSoon( java.lang.Boolean comingSoon )
    {
        this.comingSoon = comingSoon;
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
    public ProductPublishing setCreatedDate( com.google.api.client.util.DateTime createdDate )
    {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getDescription()
    {
        return description;
    }

    /**
     * @param description description or {@code null} for none
     */
    public ProductPublishing setDescription( java.lang.String description )
    {
        this.description = description;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getFacebookLike()
    {
        return facebookLike;
    }

    /**
     * @param facebookLike facebookLike or {@code null} for none
     */
    public ProductPublishing setFacebookLike( java.lang.Boolean facebookLike )
    {
        this.facebookLike = facebookLike;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getGooglePlus()
    {
        return googlePlus;
    }

    /**
     * @param googlePlus googlePlus or {@code null} for none
     */
    public ProductPublishing setGooglePlus( java.lang.Boolean googlePlus )
    {
        this.googlePlus = googlePlus;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getLinkedInShare()
    {
        return linkedInShare;
    }

    /**
     * @param linkedInShare linkedInShare or {@code null} for none
     */
    public ProductPublishing setLinkedInShare( java.lang.Boolean linkedInShare )
    {
        this.linkedInShare = linkedInShare;
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
    public ProductPublishing setModificationDate( com.google.api.client.util.DateTime modificationDate )
    {
        this.modificationDate = modificationDate;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<ProductPicture> getPictures()
    {
        return pictures;
    }

    /**
     * @param pictures pictures or {@code null} for none
     */
    public ProductPublishing setPictures( java.util.List<ProductPicture> pictures )
    {
        this.pictures = pictures;
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
    public ProductPublishing setPublished( java.lang.Boolean published )
    {
        this.published = published;
        return this;
    }

    @Override
    public ProductPublishing set( String fieldName, Object value )
    {
        return ( ProductPublishing ) super.set( fieldName, value );
    }

    @Override
    public ProductPublishing clone()
    {
        return ( ProductPublishing ) super.clone();
    }

}
