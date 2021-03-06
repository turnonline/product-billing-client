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
 * Model definition for InvoiceCollection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class InvoiceCollection
        implements Serializable
{
    private static final long serialVersionUID = -7009084579038877965L;

    static
    {
        // hack to force ProGuard to consider Invoice used, since otherwise it would be stripped out
        // see https://github.com/google/google-api-java-client/issues/543
        com.google.api.client.util.Data.nullOf( Invoice.class );
    }

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Invoice> items;

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<Invoice> getItems()
    {
        return items;
    }

    /**
     * @param items items or {@code null} for none
     */
    public InvoiceCollection setItems( java.util.List<Invoice> items )
    {
        this.items = items;
        return this;
    }
}
