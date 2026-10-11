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
 * Model definition for PartnerMetadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class PartnerMetadata
        implements Serializable
{
    private static final long serialVersionUID = -9171860622848950717L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String id;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Logistics logistics;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private PartnerPricing pricing;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Trade trade;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getId()
    {
        return id;
    }

    /**
     * @param id id or {@code null} for none
     */
    public PartnerMetadata setId( java.lang.String id )
    {
        this.id = id;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public Logistics getLogistics()
    {
        return logistics;
    }

    /**
     * @param logistics logistics or {@code null} for none
     */
    public PartnerMetadata setLogistics( Logistics logistics )
    {
        this.logistics = logistics;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public PartnerPricing getPricing()
    {
        return pricing;
    }

    /**
     * @param pricing pricing or {@code null} for none
     */
    public PartnerMetadata setPricing( PartnerPricing pricing )
    {
        this.pricing = pricing;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public Trade getTrade()
    {
        return trade;
    }

    /**
     * @param trade trade or {@code null} for none
     */
    public PartnerMetadata setTrade( Trade trade )
    {
        this.trade = trade;
        return this;
    }
}
