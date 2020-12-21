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
 * Model definition for Creditor.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class Creditor
        implements Serializable
{
    private static final long serialVersionUID = 18011086147363993L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    @com.google.api.client.json.JsonString
    private java.lang.Long account;

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
    private java.lang.String companyId;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private CreditorContactDetails contact;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String country;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double latitude;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String legalForm;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String logoServingUrl;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double longitude;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String postcode;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String street;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String taxId;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String vatId;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean vatPayer;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Long getAccount()
    {
        return account;
    }

    /**
     * @param account account or {@code null} for none
     */
    public Creditor setAccount( java.lang.Long account )
    {
        this.account = account;
        return this;
    }

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
    public Creditor setBusinessName( java.lang.String businessName )
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
    public Creditor setCity( java.lang.String city )
    {
        this.city = city;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getCompanyId()
    {
        return companyId;
    }

    /**
     * @param companyId companyId or {@code null} for none
     */
    public Creditor setCompanyId( java.lang.String companyId )
    {
        this.companyId = companyId;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public CreditorContactDetails getContact()
    {
        return contact;
    }

    /**
     * @param contact contact or {@code null} for none
     */
    public Creditor setContact( CreditorContactDetails contact )
    {
        this.contact = contact;
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
    public Creditor setCountry( java.lang.String country )
    {
        this.country = country;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getLatitude()
    {
        return latitude;
    }

    /**
     * @param latitude latitude or {@code null} for none
     */
    public Creditor setLatitude( java.lang.Double latitude )
    {
        this.latitude = latitude;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getLegalForm()
    {
        return legalForm;
    }

    /**
     * @param legalForm legalForm or {@code null} for none
     */
    public Creditor setLegalForm( java.lang.String legalForm )
    {
        this.legalForm = legalForm;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getLogoServingUrl()
    {
        return logoServingUrl;
    }

    /**
     * @param logoServingUrl logoServingUrl or {@code null} for none
     */
    public Creditor setLogoServingUrl( java.lang.String logoServingUrl )
    {
        this.logoServingUrl = logoServingUrl;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getLongitude()
    {
        return longitude;
    }

    /**
     * @param longitude longitude or {@code null} for none
     */
    public Creditor setLongitude( java.lang.Double longitude )
    {
        this.longitude = longitude;
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
    public Creditor setPostcode( java.lang.String postcode )
    {
        this.postcode = postcode;
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
    public Creditor setStreet( java.lang.String street )
    {
        this.street = street;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getTaxId()
    {
        return taxId;
    }

    /**
     * @param taxId taxId or {@code null} for none
     */
    public Creditor setTaxId( java.lang.String taxId )
    {
        this.taxId = taxId;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getVatId()
    {
        return vatId;
    }

    /**
     * @param vatId vatId or {@code null} for none
     */
    public Creditor setVatId( java.lang.String vatId )
    {
        this.vatId = vatId;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getVatPayer()
    {
        return vatPayer;
    }

    /**
     * @param vatPayer vatPayer or {@code null} for none
     */
    public Creditor setVatPayer( java.lang.Boolean vatPayer )
    {
        this.vatPayer = vatPayer;
        return this;
    }
}
