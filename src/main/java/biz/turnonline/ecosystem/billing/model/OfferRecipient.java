/*
 * Copyright (c) 2021 TurnOnline.biz s.r.o.
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
 * Model definition for OfferRecipient.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class OfferRecipient
        implements Serializable
{
    private static final long serialVersionUID = -8869739049068468584L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime accepted;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    @com.google.api.client.json.JsonString
    private java.lang.Long accountId;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String contactEmail;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String firstName;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String lastName;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String middleName;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    @com.google.api.client.json.JsonString
    private java.lang.Long offerId;

    /**
     * @return value or {@code null} for none
     */
    public com.google.api.client.util.DateTime getAccepted()
    {
        return accepted;
    }

    /**
     * @param accepted accepted or {@code null} for none
     */
    public OfferRecipient setAccepted( com.google.api.client.util.DateTime accepted )
    {
        this.accepted = accepted;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Long getAccountId()
    {
        return accountId;
    }

    /**
     * @param accountId accountId or {@code null} for none
     */
    public OfferRecipient setAccountId( java.lang.Long accountId )
    {
        this.accountId = accountId;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getContactEmail()
    {
        return contactEmail;
    }

    /**
     * @param contactEmail contactEmail or {@code null} for none
     */
    public OfferRecipient setContactEmail( java.lang.String contactEmail )
    {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getFirstName()
    {
        return firstName;
    }

    /**
     * @param firstName firstName or {@code null} for none
     */
    public OfferRecipient setFirstName( java.lang.String firstName )
    {
        this.firstName = firstName;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getLastName()
    {
        return lastName;
    }

    /**
     * @param lastName lastName or {@code null} for none
     */
    public OfferRecipient setLastName( java.lang.String lastName )
    {
        this.lastName = lastName;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getMiddleName()
    {
        return middleName;
    }

    /**
     * @param middleName middleName or {@code null} for none
     */
    public OfferRecipient setMiddleName( java.lang.String middleName )
    {
        this.middleName = middleName;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Long getOfferId()
    {
        return offerId;
    }

    /**
     * @param offerId offerId or {@code null} for none
     */
    public OfferRecipient setOfferId( java.lang.Long offerId )
    {
        this.offerId = offerId;
        return this;
    }
}
