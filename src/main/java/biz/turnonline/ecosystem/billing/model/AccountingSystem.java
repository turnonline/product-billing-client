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

/**
 * Model definition for AccountingSystem.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings( "javadoc" )
public final class AccountingSystem
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String company;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean disableGZip;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String password;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String type;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String url;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String username;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getCompany()
    {
        return company;
    }

    /**
     * @param company company or {@code null} for none
     */
    public AccountingSystem setCompany( java.lang.String company )
    {
        this.company = company;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getDisableGZip()
    {
        return disableGZip;
    }

    /**
     * @param disableGZip disableGZip or {@code null} for none
     */
    public AccountingSystem setDisableGZip( java.lang.Boolean disableGZip )
    {
        this.disableGZip = disableGZip;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getPassword()
    {
        return password;
    }

    /**
     * @param password password or {@code null} for none
     */
    public AccountingSystem setPassword( java.lang.String password )
    {
        this.password = password;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getType()
    {
        return type;
    }

    /**
     * @param type type or {@code null} for none
     */
    public AccountingSystem setType( java.lang.String type )
    {
        this.type = type;
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
    public AccountingSystem setUrl( java.lang.String url )
    {
        this.url = url;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getUsername()
    {
        return username;
    }

    /**
     * @param username username or {@code null} for none
     */
    public AccountingSystem setUsername( java.lang.String username )
    {
        this.username = username;
        return this;
    }

    @Override
    public AccountingSystem set( String fieldName, Object value )
    {
        return ( AccountingSystem ) super.set( fieldName, value );
    }

    @Override
    public AccountingSystem clone()
    {
        return ( AccountingSystem ) super.clone();
    }

}
