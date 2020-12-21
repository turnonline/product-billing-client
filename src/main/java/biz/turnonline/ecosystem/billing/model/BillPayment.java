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
 * Model definition for BillPayment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class BillPayment
        implements Serializable
{
    private static final long serialVersionUID = -2505356586222855754L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private BankAccount bankAccount;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime dueDate;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String key;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double totalAmount;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String type;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    @com.google.api.client.json.JsonString
    private java.lang.Long variableSymbol;

    /**
     * @return value or {@code null} for none
     */
    public BankAccount getBankAccount()
    {
        return bankAccount;
    }

    /**
     * @param bankAccount bankAccount or {@code null} for none
     */
    public BillPayment setBankAccount( BankAccount bankAccount )
    {
        this.bankAccount = bankAccount;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public com.google.api.client.util.DateTime getDueDate()
    {
        return dueDate;
    }

    /**
     * @param dueDate dueDate or {@code null} for none
     */
    public BillPayment setDueDate( com.google.api.client.util.DateTime dueDate )
    {
        this.dueDate = dueDate;
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
    public BillPayment setKey( java.lang.String key )
    {
        this.key = key;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getTotalAmount()
    {
        return totalAmount;
    }

    /**
     * @param totalAmount totalAmount or {@code null} for none
     */
    public BillPayment setTotalAmount( java.lang.Double totalAmount )
    {
        this.totalAmount = totalAmount;
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
    public BillPayment setType( java.lang.String type )
    {
        this.type = type;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Long getVariableSymbol()
    {
        return variableSymbol;
    }

    /**
     * @param variableSymbol variableSymbol or {@code null} for none
     */
    public BillPayment setVariableSymbol( java.lang.Long variableSymbol )
    {
        this.variableSymbol = variableSymbol;
        return this;
    }
}
