/*
 * Copyright (c) 2023 TurnOnline.biz s.r.o.
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
 * Model definition for PostalAddress.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class PostalAddress
        implements Serializable
{
    private static final long serialVersionUID = 5966756440438277807L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String businessName;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String city;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String country;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String firstName;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String lastName;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String postcode;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String prefix;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String street;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String suffix;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getBusinessName()
    {
        return businessName;
    }

    /**
     * @param businessName businessName or {@code null} for none
     */
    public PostalAddress setBusinessName( java.lang.String businessName )
    {
        this.businessName = businessName;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getCity()
    {
        return city;
    }

    /**
     * @param city city or {@code null} for none
     */
    public PostalAddress setCity( java.lang.String city )
    {
        this.city = city;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getCountry()
    {
        return country;
    }

    /**
     * @param country country or {@code null} for none
     */
    public PostalAddress setCountry( java.lang.String country )
    {
        this.country = country;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getFirstName()
    {
        return firstName;
    }

    /**
     * @param firstName firstName or {@code null} for none
     */
    public PostalAddress setFirstName( java.lang.String firstName )
    {
        this.firstName = firstName;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getLastName()
    {
        return lastName;
    }

    /**
     * @param lastName lastName or {@code null} for none
     */
    public PostalAddress setLastName( java.lang.String lastName )
    {
        this.lastName = lastName;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getPostcode()
    {
        return postcode;
    }

    /**
     * @param postcode postcode or {@code null} for none
     */
    public PostalAddress setPostcode( java.lang.String postcode )
    {
        this.postcode = postcode;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getPrefix()
    {
        return prefix;
    }

    /**
     * @param prefix prefix or {@code null} for none
     */
    public PostalAddress setPrefix( java.lang.String prefix )
    {
        this.prefix = prefix;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getStreet()
    {
        return street;
    }

    /**
     * @param street street or {@code null} for none
     */
    public PostalAddress setStreet( java.lang.String street )
    {
        this.street = street;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getSuffix()
    {
        return suffix;
    }

    /**
     * @param suffix suffix or {@code null} for none
     */
    public PostalAddress setSuffix( java.lang.String suffix )
    {
        this.suffix = suffix;
        return this;
    }
}
