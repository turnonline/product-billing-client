/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2018-10-08 17:45:39 UTC)
 * on 2018-10-24 at 14:55:34 UTC
 * Modify at your own risk.
 */

package biz.turnonline.ecosystem.billing.model;

/**
 * Model definition for Invoice.
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
public final class Invoice
        extends com.google.api.client.json.GenericJson
{

    static
    {
        // hack to force ProGuard to consider PricingItem used, since otherwise it would be stripped out
        // see https://github.com/google/google-api-java-client/issues/543
        com.google.api.client.util.Data.nullOf( PricingItem.class );
    }

    static
    {
        // hack to force ProGuard to consider Deduction used, since otherwise it would be stripped out
        // see https://github.com/google/google-api-java-client/issues/543
        com.google.api.client.util.Data.nullOf( Deduction.class );
    }

    static
    {
        // hack to force ProGuard to consider Deduction used, since otherwise it would be stripped out
        // see https://github.com/google/google-api-java-client/issues/543
        com.google.api.client.util.Data.nullOf( Deduction.class );
    }

    static
    {
        // hack to force ProGuard to consider Transaction used, since otherwise it would be stripped out
        // see https://github.com/google/google-api-java-client/issues/543
        com.google.api.client.util.Data.nullOf( Transaction.class );
    }

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double amountPay;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private BankAccount bankAccount;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String currency;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Customer customer;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime dateOfIssue;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime dateOfTaxable;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime dueDate;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String finalText;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String formOfPayment;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    @com.google.api.client.json.JsonString
    private java.lang.Long id;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String introductoryText;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String invoiceNumber;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<PricingItem> items;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private NumberSeries numberSeries;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String paymentKey;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String rounding;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String servingUrl;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Deduction> settlements;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String status;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Deduction> tlements;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double totalPrice;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double totalPriceExclVat;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double totalVatBase;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Transaction> transactions;

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
    public java.lang.Double getAmountPay()
    {
        return amountPay;
    }

    /**
     * @param amountPay amountPay or {@code null} for none
     */
    public Invoice setAmountPay( java.lang.Double amountPay )
    {
        this.amountPay = amountPay;
        return this;
    }

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
    public Invoice setBankAccount( BankAccount bankAccount )
    {
        this.bankAccount = bankAccount;
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
    public Invoice setCurrency( java.lang.String currency )
    {
        this.currency = currency;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public Customer getCustomer()
    {
        return customer;
    }

    /**
     * @param customer customer or {@code null} for none
     */
    public Invoice setCustomer( Customer customer )
    {
        this.customer = customer;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public com.google.api.client.util.DateTime getDateOfIssue()
    {
        return dateOfIssue;
    }

    /**
     * @param dateOfIssue dateOfIssue or {@code null} for none
     */
    public Invoice setDateOfIssue( com.google.api.client.util.DateTime dateOfIssue )
    {
        this.dateOfIssue = dateOfIssue;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public com.google.api.client.util.DateTime getDateOfTaxable()
    {
        return dateOfTaxable;
    }

    /**
     * @param dateOfTaxable dateOfTaxable or {@code null} for none
     */
    public Invoice setDateOfTaxable( com.google.api.client.util.DateTime dateOfTaxable )
    {
        this.dateOfTaxable = dateOfTaxable;
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
    public Invoice setDueDate( com.google.api.client.util.DateTime dueDate )
    {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getFinalText()
    {
        return finalText;
    }

    /**
     * @param finalText finalText or {@code null} for none
     */
    public Invoice setFinalText( java.lang.String finalText )
    {
        this.finalText = finalText;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getFormOfPayment()
    {
        return formOfPayment;
    }

    /**
     * @param formOfPayment formOfPayment or {@code null} for none
     */
    public Invoice setFormOfPayment( java.lang.String formOfPayment )
    {
        this.formOfPayment = formOfPayment;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Long getId()
    {
        return id;
    }

    /**
     * @param id id or {@code null} for none
     */
    public Invoice setId( java.lang.Long id )
    {
        this.id = id;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getIntroductoryText()
    {
        return introductoryText;
    }

    /**
     * @param introductoryText introductoryText or {@code null} for none
     */
    public Invoice setIntroductoryText( java.lang.String introductoryText )
    {
        this.introductoryText = introductoryText;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getInvoiceNumber()
    {
        return invoiceNumber;
    }

    /**
     * @param invoiceNumber invoiceNumber or {@code null} for none
     */
    public Invoice setInvoiceNumber( java.lang.String invoiceNumber )
    {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<PricingItem> getItems()
    {
        return items;
    }

    /**
     * @param items items or {@code null} for none
     */
    public Invoice setItems( java.util.List<PricingItem> items )
    {
        this.items = items;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public NumberSeries getNumberSeries()
    {
        return numberSeries;
    }

    /**
     * @param numberSeries numberSeries or {@code null} for none
     */
    public Invoice setNumberSeries( NumberSeries numberSeries )
    {
        this.numberSeries = numberSeries;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getPaymentKey()
    {
        return paymentKey;
    }

    /**
     * @param paymentKey paymentKey or {@code null} for none
     */
    public Invoice setPaymentKey( java.lang.String paymentKey )
    {
        this.paymentKey = paymentKey;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getRounding()
    {
        return rounding;
    }

    /**
     * @param rounding rounding or {@code null} for none
     */
    public Invoice setRounding( java.lang.String rounding )
    {
        this.rounding = rounding;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getServingUrl()
    {
        return servingUrl;
    }

    /**
     * @param servingUrl servingUrl or {@code null} for none
     */
    public Invoice setServingUrl( java.lang.String servingUrl )
    {
        this.servingUrl = servingUrl;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<Deduction> getSettlements()
    {
        return settlements;
    }

    /**
     * @param settlements settlements or {@code null} for none
     */
    public Invoice setSettlements( java.util.List<Deduction> settlements )
    {
        this.settlements = settlements;
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
    public Invoice setStatus( java.lang.String status )
    {
        this.status = status;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<Deduction> getTlements()
    {
        return tlements;
    }

    /**
     * @param tlements tlements or {@code null} for none
     */
    public Invoice setTlements( java.util.List<Deduction> tlements )
    {
        this.tlements = tlements;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getTotalPrice()
    {
        return totalPrice;
    }

    /**
     * @param totalPrice totalPrice or {@code null} for none
     */
    public Invoice setTotalPrice( java.lang.Double totalPrice )
    {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getTotalPriceExclVat()
    {
        return totalPriceExclVat;
    }

    /**
     * @param totalPriceExclVat totalPriceExclVat or {@code null} for none
     */
    public Invoice setTotalPriceExclVat( java.lang.Double totalPriceExclVat )
    {
        this.totalPriceExclVat = totalPriceExclVat;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getTotalVatBase()
    {
        return totalVatBase;
    }

    /**
     * @param totalVatBase totalVatBase or {@code null} for none
     */
    public Invoice setTotalVatBase( java.lang.Double totalVatBase )
    {
        this.totalVatBase = totalVatBase;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<Transaction> getTransactions()
    {
        return transactions;
    }

    /**
     * @param transactions transactions or {@code null} for none
     */
    public Invoice setTransactions( java.util.List<Transaction> transactions )
    {
        this.transactions = transactions;
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
    public Invoice setType( java.lang.String type )
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
    public Invoice setVariableSymbol( java.lang.Long variableSymbol )
    {
        this.variableSymbol = variableSymbol;
        return this;
    }

    @Override
    public Invoice set( String fieldName, Object value )
    {
        return ( Invoice ) super.set( fieldName, value );
    }

    @Override
    public Invoice clone()
    {
        return ( Invoice ) super.clone();
    }

}
