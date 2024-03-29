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
 * Model definition for ShippingDetails.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class ShippingDetails
        implements Serializable
{
    private static final long serialVersionUID = 1919178169185595020L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private PostalAddress address;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String carrier;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String code;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String externalId;

    /**
     * @return value or {@code null} for none
     */
    public PostalAddress getAddress()
    {
        return address;
    }

    /**
     * @param address address or {@code null} for none
     */
    public ShippingDetails setAddress( PostalAddress address )
    {
        this.address = address;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getCarrier()
    {
        return carrier;
    }

    /**
     * @param carrier carrier or {@code null} for none
     */
    public ShippingDetails setCarrier( java.lang.String carrier )
    {
        this.carrier = carrier;
        return this;
    }

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
    public ShippingDetails setCode( java.lang.String code )
    {
        this.code = code;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getExternalId()
    {
        return externalId;
    }

    /**
     * @param externalId externalId or {@code null} for none
     */
    public ShippingDetails setExternalId( java.lang.String externalId )
    {
        this.externalId = externalId;
        return this;
    }
}
