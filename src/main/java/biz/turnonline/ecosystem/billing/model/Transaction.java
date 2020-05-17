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
    private java.lang.Double balance;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private TransactionBank bankAccount;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Bill bill;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double billAmount;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String billCurrency;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime completedAt;

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
    private java.lang.String key;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Merchant merchant;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String reference;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String status;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    @com.google.api.client.json.JsonString
    private java.lang.Long transactionId;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String type;

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
    public java.lang.Double getBalance()
    {
        return balance;
    }

    /**
     * @param balance balance or {@code null} for none
     */
    public Transaction setBalance( java.lang.Double balance )
    {
        this.balance = balance;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public TransactionBank getBankAccount()
    {
        return bankAccount;
    }

    /**
     * @param bankAccount bankAccount or {@code null} for none
     */
    public Transaction setBankAccount( TransactionBank bankAccount )
    {
        this.bankAccount = bankAccount;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public Bill getBill()
    {
        return bill;
    }

    /**
     * @param bill bill or {@code null} for none
     */
    public Transaction setBill( Bill bill )
    {
        this.bill = bill;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getBillAmount()
    {
        return billAmount;
    }

    /**
     * @param billAmount billAmount or {@code null} for none
     */
    public Transaction setBillAmount( java.lang.Double billAmount )
    {
        this.billAmount = billAmount;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getBillCurrency()
    {
        return billCurrency;
    }

    /**
     * @param billCurrency billCurrency or {@code null} for none
     */
    public Transaction setBillCurrency( java.lang.String billCurrency )
    {
        this.billCurrency = billCurrency;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public com.google.api.client.util.DateTime getCompletedAt()
    {
        return completedAt;
    }

    /**
     * @param completedAt completedAt or {@code null} for none
     */
    public Transaction setCompletedAt( com.google.api.client.util.DateTime completedAt )
    {
        this.completedAt = completedAt;
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

    /**
     * @return value or {@code null} for none
     */
    public Merchant getMerchant()
    {
        return merchant;
    }

    /**
     * @param merchant merchant or {@code null} for none
     */
    public Transaction setMerchant( Merchant merchant )
    {
        this.merchant = merchant;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getReference()
    {
        return reference;
    }

    /**
     * @param reference reference or {@code null} for none
     */
    public Transaction setReference( java.lang.String reference )
    {
        this.reference = reference;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getStatus()
    {
        return status;
    }

    /**
     * @param status status or {@code null} for none
     */
    public Transaction setStatus( java.lang.String status )
    {
        this.status = status;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Long getTransactionId()
    {
        return transactionId;
    }

    /**
     * @param transactionId transactionId or {@code null} for none
     */
    public Transaction setTransactionId( java.lang.Long transactionId )
    {
        this.transactionId = transactionId;
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
    public Transaction setType( java.lang.String type )
    {
        this.type = type;
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
