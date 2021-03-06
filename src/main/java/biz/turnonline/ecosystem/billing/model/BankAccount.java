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
 * Model definition for BankAccount.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class BankAccount
        implements Serializable
{
    private static final long serialVersionUID = -8763537022373892629L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String beneficiary;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String bic;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String currency;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String iban;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getBeneficiary()
    {
        return beneficiary;
    }

    /**
     * @param beneficiary beneficiary or {@code null} for none
     */
    public BankAccount setBeneficiary( java.lang.String beneficiary )
    {
        this.beneficiary = beneficiary;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getBic()
    {
        return bic;
    }

    /**
     * @param bic bic or {@code null} for none
     */
    public BankAccount setBic( java.lang.String bic )
    {
        this.bic = bic;
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
    public BankAccount setCurrency( java.lang.String currency )
    {
        this.currency = currency;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getIban()
    {
        return iban;
    }

    /**
     * @param iban iban or {@code null} for none
     */
    public BankAccount setIban( java.lang.String iban )
    {
        this.iban = iban;
        return this;
    }
}
