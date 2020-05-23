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
 * Model definition for Supplier.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class Supplier
        extends com.google.api.client.json.GenericJson
{
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
    private java.lang.String country;

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
     * @return value or {@code null} for none
     */
    public java.lang.String getBusinessName()
    {
        return businessName;
    }

    /**
     * @param businessName businessName or {@code null} for none
     */
    public Supplier setBusinessName( java.lang.String businessName )
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
    public Supplier setCity( java.lang.String city )
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
    public Supplier setCompanyId( java.lang.String companyId )
    {
        this.companyId = companyId;
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
    public Supplier setCountry( java.lang.String country )
    {
        this.country = country;
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
    public Supplier setPostcode( java.lang.String postcode )
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
    public Supplier setStreet( java.lang.String street )
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
    public Supplier setTaxId( java.lang.String taxId )
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
    public Supplier setVatId( java.lang.String vatId )
    {
        this.vatId = vatId;
        return this;
    }

    @Override
    public Supplier set( String fieldName, Object value )
    {
        return ( Supplier ) super.set( fieldName, value );
    }

    @Override
    public Supplier clone()
    {
        return ( Supplier ) super.clone();
    }

}
