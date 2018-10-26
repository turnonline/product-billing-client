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
 * Model definition for VatRate.
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
public final class VatRate
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String code;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String domicile;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String label;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String locale;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getCode()
    {
        return code;
    }

    /**
     * @param code code or {@code null} for none
     */
    public VatRate setCode( java.lang.String code )
    {
        this.code = code;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getDomicile()
    {
        return domicile;
    }

    /**
     * @param domicile domicile or {@code null} for none
     */
    public VatRate setDomicile( java.lang.String domicile )
    {
        this.domicile = domicile;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getLabel()
    {
        return label;
    }

    /**
     * @param label label or {@code null} for none
     */
    public VatRate setLabel( java.lang.String label )
    {
        this.label = label;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getLocale()
    {
        return locale;
    }

    /**
     * @param locale locale or {@code null} for none
     */
    public VatRate setLocale( java.lang.String locale )
    {
        this.locale = locale;
        return this;
    }

    @Override
    public VatRate set( String fieldName, Object value )
    {
        return ( VatRate ) super.set( fieldName, value );
    }

    @Override
    public VatRate clone()
    {
        return ( VatRate ) super.clone();
    }

}
