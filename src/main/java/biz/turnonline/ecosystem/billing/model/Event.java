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
 * Model definition for Event.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Product Billing. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class Event
        implements Serializable
{
    private static final long serialVersionUID = 3058252169902568229L;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private EventBegin begin;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime deadline;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private EventEnd end;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private EventLocation location;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer seats;

    /**
     * @return value or {@code null} for none
     */
    public EventBegin getBegin()
    {
        return begin;
    }

    /**
     * @param begin begin or {@code null} for none
     */
    public Event setBegin( EventBegin begin )
    {
        this.begin = begin;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public com.google.api.client.util.DateTime getDeadline()
    {
        return deadline;
    }

    /**
     * @param deadline deadline or {@code null} for none
     */
    public Event setDeadline( com.google.api.client.util.DateTime deadline )
    {
        this.deadline = deadline;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public EventEnd getEnd()
    {
        return end;
    }

    /**
     * @param end end or {@code null} for none
     */
    public Event setEnd( EventEnd end )
    {
        this.end = end;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public EventLocation getLocation()
    {
        return location;
    }

    /**
     * @param location location or {@code null} for none
     */
    public Event setLocation( EventLocation location )
    {
        this.location = location;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Integer getSeats()
    {
        return seats;
    }

    /**
     * @param seats seats or {@code null} for none
     */
    public Event setSeats( java.lang.Integer seats )
    {
        this.seats = seats;
        return this;
    }
}
