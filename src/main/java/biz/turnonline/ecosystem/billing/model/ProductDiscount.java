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
 * Model definition for ProductDiscount.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class ProductDiscount
        implements Serializable
{
    private static final long serialVersionUID = -6450806576803241609L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> codes;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean enabled;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double off;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String rule;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String unit;

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getCodes()
    {
        return codes;
    }

    /**
     * @param codes codes or {@code null} for none
     */
    public ProductDiscount setCodes( java.util.List<java.lang.String> codes )
    {
        this.codes = codes;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getEnabled()
    {
        return enabled;
    }

    /**
     * @param enabled enabled or {@code null} for none
     */
    public ProductDiscount setEnabled( java.lang.Boolean enabled )
    {
        this.enabled = enabled;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getOff()
    {
        return off;
    }

    /**
     * @param off off or {@code null} for none
     */
    public ProductDiscount setOff( java.lang.Double off )
    {
        this.off = off;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getRule()
    {
        return rule;
    }

    /**
     * @param rule rule or {@code null} for none
     */
    public ProductDiscount setRule( java.lang.String rule )
    {
        this.rule = rule;
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
    public ProductDiscount setUnit( java.lang.String unit )
    {
        this.unit = unit;
        return this;
    }
}
