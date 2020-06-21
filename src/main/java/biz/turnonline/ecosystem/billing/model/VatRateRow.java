/*
 * Copyright (c) 2020 TurnOnline.biz s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package biz.turnonline.ecosystem.billing.model;

/**
 * Model definition for VatRateRow.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class VatRateRow
        extends com.google.api.client.json.GenericJson
{
    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double priceInclVat;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double vat;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double vatBase;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double vatRate;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getPriceInclVat()
    {
        return priceInclVat;
    }

    /**
     * @param priceInclVat priceInclVat or {@code null} for none
     */
    public VatRateRow setPriceInclVat( java.lang.Double priceInclVat )
    {
        this.priceInclVat = priceInclVat;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getVat()
    {
        return vat;
    }

    /**
     * @param vat vat or {@code null} for none
     */
    public VatRateRow setVat( java.lang.Double vat )
    {
        this.vat = vat;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getVatBase()
    {
        return vatBase;
    }

    /**
     * @param vatBase vatBase or {@code null} for none
     */
    public VatRateRow setVatBase( java.lang.Double vatBase )
    {
        this.vatBase = vatBase;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getVatRate()
    {
        return vatRate;
    }

    /**
     * @param vatRate vatRate or {@code null} for none
     */
    public VatRateRow setVatRate( java.lang.Double vatRate )
    {
        this.vatRate = vatRate;
        return this;
    }

    @Override
    public VatRateRow set( String fieldName, Object value )
    {
        return ( VatRateRow ) super.set( fieldName, value );
    }

    @Override
    public VatRateRow clone()
    {
        return ( VatRateRow ) super.clone();
    }
}
