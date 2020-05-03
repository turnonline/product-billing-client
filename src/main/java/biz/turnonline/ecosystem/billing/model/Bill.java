/*
 * Copyright (c) 2020 TurnOnline.biz s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package biz.turnonline.ecosystem.billing.model;

/**
 * Model definition for Bill.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class Bill
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    @com.google.api.client.json.JsonString
    private java.lang.Long invoice;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    @com.google.api.client.json.JsonString
    private java.lang.Long order;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    @com.google.api.client.json.JsonString
    private java.lang.Long receipt;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Long getInvoice()
    {
        return invoice;
    }

    /**
     * @param invoice invoice or {@code null} for none
     */
    public Bill setInvoice( java.lang.Long invoice )
    {
        this.invoice = invoice;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Long getOrder()
    {
        return order;
    }

    /**
     * @param order order or {@code null} for none
     */
    public Bill setOrder( java.lang.Long order )
    {
        this.order = order;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Long getReceipt()
    {
        return receipt;
    }

    /**
     * @param receipt receipt or {@code null} for none
     */
    public Bill setReceipt( java.lang.Long receipt )
    {
        this.receipt = receipt;
        return this;
    }

    @Override
    public Bill set( String fieldName, Object value )
    {
        return ( Bill ) super.set( fieldName, value );
    }

    @Override
    public Bill clone()
    {
        return ( Bill ) super.clone();
    }

}
