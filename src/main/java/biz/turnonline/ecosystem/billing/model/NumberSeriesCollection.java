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
 * on 2018-10-26 at 17:24:17 UTC
 * Modify at your own risk.
 */

package biz.turnonline.ecosystem.billing.model;

/**
 * Model definition for NumberSeriesCollection.
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
public final class NumberSeriesCollection
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<NumberSeries> items;

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<NumberSeries> getItems()
    {
        return items;
    }

    /**
     * @param items items or {@code null} for none
     */
    public NumberSeriesCollection setItems( java.util.List<NumberSeries> items )
    {
        this.items = items;
        return this;
    }

    @Override
    public NumberSeriesCollection set( String fieldName, Object value )
    {
        return ( NumberSeriesCollection ) super.set( fieldName, value );
    }

    @Override
    public NumberSeriesCollection clone()
    {
        return ( NumberSeriesCollection ) super.clone();
    }

}
