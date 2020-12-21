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
 * Model definition for ProductInvoicing.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class ProductInvoicing
        implements Serializable
{
    private static final long serialVersionUID = -1825938252663448111L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String code;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private NumberSeries numberSeries;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer trialPeriod;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String unit;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getCode()
    {
        return code;
    }

    /**
     * @param code code or {@code null} for none
     */
    public ProductInvoicing setCode( java.lang.String code )
    {
        this.code = code;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public NumberSeries getNumberSeries()
    {
        return numberSeries;
    }

    /**
     * @param numberSeries numberSeries or {@code null} for none
     */
    public ProductInvoicing setNumberSeries( NumberSeries numberSeries )
    {
        this.numberSeries = numberSeries;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Integer getTrialPeriod()
    {
        return trialPeriod;
    }

    /**
     * @param trialPeriod trialPeriod or {@code null} for none
     */
    public ProductInvoicing setTrialPeriod( java.lang.Integer trialPeriod )
    {
        this.trialPeriod = trialPeriod;
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
    public ProductInvoicing setUnit( java.lang.String unit )
    {
        this.unit = unit;
        return this;
    }
}
