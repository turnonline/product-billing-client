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
 * Model definition for Logistics.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class Logistics
        implements Serializable
{
    private static final long serialVersionUID = -7786462734284738295L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double depth;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double height;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double weight;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double width;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getDepth()
    {
        return depth;
    }

    /**
     * @param depth depth or {@code null} for none
     */
    public Logistics setDepth( java.lang.Double depth )
    {
        this.depth = depth;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getHeight()
    {
        return height;
    }

    /**
     * @param height height or {@code null} for none
     */
    public Logistics setHeight( java.lang.Double height )
    {
        this.height = height;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getWeight()
    {
        return weight;
    }

    /**
     * @param weight weight or {@code null} for none
     */
    public Logistics setWeight( java.lang.Double weight )
    {
        this.weight = weight;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getWidth()
    {
        return width;
    }

    /**
     * @param width width or {@code null} for none
     */
    public Logistics setWidth( java.lang.Double width )
    {
        this.width = width;
        return this;
    }
}
