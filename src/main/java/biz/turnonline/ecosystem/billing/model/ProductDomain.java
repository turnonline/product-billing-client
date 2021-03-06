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
 * Model definition for ProductDomain.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class ProductDomain
        implements Serializable
{
    private static final long serialVersionUID = -2747048789148520869L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String domain;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String name;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String subdomain;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String uri;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String url;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getDomain()
    {
        return domain;
    }

    /**
     * @param domain domain or {@code null} for none
     */
    public ProductDomain setDomain( java.lang.String domain )
    {
        this.domain = domain;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getName()
    {
        return name;
    }

    /**
     * @param name name or {@code null} for none
     */
    public ProductDomain setName( java.lang.String name )
    {
        this.name = name;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getSubdomain()
    {
        return subdomain;
    }

    /**
     * @param subdomain subdomain or {@code null} for none
     */
    public ProductDomain setSubdomain( java.lang.String subdomain )
    {
        this.subdomain = subdomain;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getUri()
    {
        return uri;
    }

    /**
     * @param uri uri or {@code null} for none
     */
    public ProductDomain setUri( java.lang.String uri )
    {
        this.uri = uri;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getUrl()
    {
        return url;
    }

    /**
     * @param url url or {@code null} for none
     */
    public ProductDomain setUrl( java.lang.String url )
    {
        this.url = url;
        return this;
    }
}
