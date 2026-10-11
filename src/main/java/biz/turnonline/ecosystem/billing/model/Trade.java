/*
 * Copyright (c) 2026 TurnOnline.biz s.r.o.
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
 * Model definition for Trade.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class Trade
        implements Serializable
{
    private static final long serialVersionUID = -4532641790419551622L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String ean13;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String intrastat;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getEan13()
    {
        return ean13;
    }

    /**
     * @param ean13 ean13 or {@code null} for none
     */
    public Trade setEan13( java.lang.String ean13 )
    {
        this.ean13 = ean13;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getIntrastat()
    {
        return intrastat;
    }

    /**
     * @param intrastat intrastat or {@code null} for none
     */
    public Trade setIntrastat( java.lang.String intrastat )
    {
        this.intrastat = intrastat;
        return this;
    }
}
