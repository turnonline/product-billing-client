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
 * Model definition for Transaction.
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
public final class Transaction
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double amount;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean credit;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String currency;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String form;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String key;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getAmount()
    {
        return amount;
    }

    /**
     * @param amount amount or {@code null} for none
     */
    public Transaction setAmount( java.lang.Double amount )
    {
        this.amount = amount;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCredit()
    {
        return credit;
    }

    /**
     * @param credit credit or {@code null} for none
     */
    public Transaction setCredit( java.lang.Boolean credit )
    {
        this.credit = credit;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getCurrency()
    {
        return currency;
    }

    /**
     * @param currency currency or {@code null} for none
     */
    public Transaction setCurrency( java.lang.String currency )
    {
        this.currency = currency;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getForm()
    {
        return form;
    }

    /**
     * @param form form or {@code null} for none
     */
    public Transaction setForm( java.lang.String form )
    {
        this.form = form;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getKey()
    {
        return key;
    }

    /**
     * @param key key or {@code null} for none
     */
    public Transaction setKey( java.lang.String key )
    {
        this.key = key;
        return this;
    }

    @Override
    public Transaction set( String fieldName, Object value )
    {
        return ( Transaction ) super.set( fieldName, value );
    }

    @Override
    public Transaction clone()
    {
        return ( Transaction ) super.clone();
    }

}
