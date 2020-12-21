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
 * Model definition for NumberSeries.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class NumberSeries
        implements Serializable
{
    private static final long serialVersionUID = -1353242672780634248L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String code;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Increment increment;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime modificationDate;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String symbol;

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
    public NumberSeries setCode( java.lang.String code )
    {
        this.code = code;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public Increment getIncrement()
    {
        return increment;
    }

    /**
     * @param increment increment or {@code null} for none
     */
    public NumberSeries setIncrement( Increment increment )
    {
        this.increment = increment;
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
    public NumberSeries setModificationDate( com.google.api.client.util.DateTime modificationDate )
    {
        this.modificationDate = modificationDate;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getSymbol()
    {
        return symbol;
    }

    /**
     * @param symbol symbol or {@code null} for none
     */
    public NumberSeries setSymbol( java.lang.String symbol )
    {
        this.symbol = symbol;
        return this;
    }
}
