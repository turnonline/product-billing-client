/*
 * Copyright (c) 2021 TurnOnline.biz s.r.o.
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
 * Model definition for ExchangeRate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class ExchangeRate
        implements Serializable
{
    private static final long serialVersionUID = 4409900623445130404L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private ExchangeAmount fee;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private ExchangeAmount from;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double rate;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime rateDate;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private ExchangeAmount to;

    /**
     * @return value or {@code null} for none
     */
    public ExchangeAmount getFee()
    {
        return fee;
    }

    /**
     * @param fee fee or {@code null} for none
     */
    public ExchangeRate setFee( ExchangeAmount fee )
    {
        this.fee = fee;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public ExchangeAmount getFrom()
    {
        return from;
    }

    /**
     * @param from from or {@code null} for none
     */
    public ExchangeRate setFrom( ExchangeAmount from )
    {
        this.from = from;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getRate()
    {
        return rate;
    }

    /**
     * @param rate rate or {@code null} for none
     */
    public ExchangeRate setRate( java.lang.Double rate )
    {
        this.rate = rate;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public com.google.api.client.util.DateTime getRateDate()
    {
        return rateDate;
    }

    /**
     * @param rateDate rateDate or {@code null} for none
     */
    public ExchangeRate setRateDate( com.google.api.client.util.DateTime rateDate )
    {
        this.rateDate = rateDate;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public ExchangeAmount getTo()
    {
        return to;
    }

    /**
     * @param to to or {@code null} for none
     */
    public ExchangeRate setTo( ExchangeAmount to )
    {
        this.to = to;
        return this;
    }
}
