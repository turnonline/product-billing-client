/*
 * Copyright (c) 2021 TurnOnline.biz s.r.o.
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

package biz.turnonline.ecosystem.billing;

/**
 * Service definition for ProductBilling (v1).
 *
 * <p>
 * TurnOnline.biz Ecosystem Product Billing microservice. Order, product, and invoice management system with support of the product purchases between business accounts.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://turnon.cloud/docs/billing.turnon.cloud/1" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link ProductBillingRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @author Google, Inc.
 * @since 1.3
 */
@SuppressWarnings( "javadoc" )
public class ProductBilling
        extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient
{

    /**
     * The default encoded root URL of the service. This is determined when the library is generated
     * and normally should not be changed.
     *
     * @since 1.7
     */
    public static final String DEFAULT_ROOT_URL = "https://product-billing-dot-turn-online-eu.ew.r.appspot.com/api/";

    /**
     * The default encoded service path of the service. This is determined when the library is
     * generated and normally should not be changed.
     *
     * @since 1.7
     */
    public static final String DEFAULT_SERVICE_PATH = "billing/v1/";

    /**
     * The default encoded batch path of the service. This is determined when the library is
     * generated and normally should not be changed.
     *
     * @since 1.23
     */
    public static final String DEFAULT_BATCH_PATH = "batch";

    /**
     * The default encoded base URL of the service. This is determined when the library is generated
     * and normally should not be changed.
     */
    public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

    // Note: Leave this static initializer at the top of the file.
    static
    {
        com.google.api.client.util.Preconditions.checkState(
                com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
                        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
                "You are currently running with version %s of google-api-client. " +
                        "You need at least version 1.15 of google-api-client to run version " +
                        "1.25.0 of the TurnOnline.biz Product Billing library.", com.google.api.client.googleapis.GoogleUtils.VERSION );
    }

    /**
     * Constructor.
     *
     * <p>
     * Use {@link Builder} if you need to specify any of the optional parameters.
     * </p>
     *
     * @param transport              HTTP transport, which should normally be:
     *                               <ul>
     *                               <li>Google App Engine:
     *                               {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *                               <li>Android: {@code newCompatibleTransport} from
     *                               {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *                               <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *                               </li>
     *                               </ul>
     * @param jsonFactory            JSON factory, which may be:
     *                               <ul>
     *                               <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *                               <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *                               <li>Android Honeycomb or higher:
     *                               {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *                               </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public ProductBilling( com.google.api.client.http.HttpTransport transport,
                           com.google.api.client.json.JsonFactory jsonFactory,
                           com.google.api.client.http.HttpRequestInitializer httpRequestInitializer )
    {
        this( new Builder( transport, jsonFactory, httpRequestInitializer ) );
    }

    /**
     * @param builder builder
     */
    ProductBilling( Builder builder )
    {
        super( builder );
    }

    @Override
    protected void initialize( com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest )
            throws java.io.IOException
    {
        super.initialize( httpClientRequest );
    }

    /**
     * An accessor for creating requests from the BillingUnits collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code ProductBilling billing = new ProductBilling(...);}
     *   {@code ProductBilling.BillingUnits.List request = billing.billingUnits().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public BillingUnits billingUnits()
    {
        return new BillingUnits();
    }

    /**
     * An accessor for creating requests from the Categories collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code ProductBilling billing = new ProductBilling(...);}
     *   {@code ProductBilling.Categories.List request = billing.categories().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Categories categories()
    {
        return new Categories();
    }

    /**
     * An accessor for creating requests from the Configs collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code ProductBilling billing = new ProductBilling(...);}
     *   {@code ProductBilling.Configs.List request = billing.configs().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Configs configs()
    {
        return new Configs();
    }

    /**
     * An accessor for creating requests from the Invoices collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code ProductBilling billing = new ProductBilling(...);}
     *   {@code ProductBilling.Invoices.List request = billing.invoices().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Invoices invoices()
    {
        return new Invoices();
    }

    /**
     * An accessor for creating requests from the NumberSeries collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code ProductBilling billing = new ProductBilling(...);}
     *   {@code ProductBilling.NumberSeries.List request = billing.numberSeries().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public NumberSeries numberSeries()
    {
        return new NumberSeries();
    }

    /**
     * An accessor for creating requests from the Offers collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code ProductBilling billing = new ProductBilling(...);}
     *   {@code ProductBilling.Offers.List request = billing.offers().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Offers offers()
    {
        return new Offers();
    }

    /**
     * An accessor for creating requests from the Orders collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code ProductBilling billing = new ProductBilling(...);}
     *   {@code ProductBilling.Orders.List request = billing.orders().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Orders orders()
    {
        return new Orders();
    }

    /**
     * An accessor for creating requests from the Prices collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code ProductBilling billing = new ProductBilling(...);}
     *   {@code ProductBilling.Prices.List request = billing.prices().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Prices prices()
    {
        return new Prices();
    }

    /**
     * An accessor for creating requests from the Products collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code ProductBilling billing = new ProductBilling(...);}
     *   {@code ProductBilling.Products.List request = billing.products().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Products products()
    {
        return new Products();
    }

    /**
     * An accessor for creating requests from the Purchases collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code ProductBilling billing = new ProductBilling(...);}
     *   {@code ProductBilling.Purchases.List request = billing.purchases().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Purchases purchases()
    {
        return new Purchases();
    }

    /**
     * An accessor for creating requests from the Transactions collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code ProductBilling billing = new ProductBilling(...);}
     *   {@code ProductBilling.Transactions.List request = billing.transactions().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Transactions transactions()
    {
        return new Transactions();
    }

    /**
     * An accessor for creating requests from the VatRates collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code ProductBilling billing = new ProductBilling(...);}
     *   {@code ProductBilling.VatRates.List request = billing.vatRates().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public VatRates vatRates()
    {
        return new VatRates();
    }

    /**
     * Builder for {@link ProductBilling}.
     *
     * <p>
     * Implementation is not thread-safe.
     * </p>
     *
     * @since 1.3.0
     */
    public static final class Builder
            extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder
    {

        /**
         * Returns an instance of a new builder.
         *
         * @param transport              HTTP transport, which should normally be:
         *                               <ul>
         *                               <li>Google App Engine:
         *                               {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
         *                               <li>Android: {@code newCompatibleTransport} from
         *                               {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
         *                               <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
         *                               </li>
         *                               </ul>
         * @param jsonFactory            JSON factory, which may be:
         *                               <ul>
         *                               <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
         *                               <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
         *                               <li>Android Honeycomb or higher:
         *                               {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
         *                               </ul>
         * @param httpRequestInitializer HTTP request initializer or {@code null} for none
         * @since 1.7
         */
        public Builder( com.google.api.client.http.HttpTransport transport,
                        com.google.api.client.json.JsonFactory jsonFactory,
                        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer )
        {
            super(
                    transport,
                    jsonFactory,
                    DEFAULT_ROOT_URL,
                    DEFAULT_SERVICE_PATH,
                    httpRequestInitializer,
                    false );
            setBatchPath( DEFAULT_BATCH_PATH );
        }

        /**
         * Builds a new instance of {@link ProductBilling}.
         */
        @Override
        public ProductBilling build()
        {
            return new ProductBilling( this );
        }

        @Override
        public Builder setRootUrl( String rootUrl )
        {
            return ( Builder ) super.setRootUrl( rootUrl );
        }

        @Override
        public Builder setServicePath( String servicePath )
        {
            return ( Builder ) super.setServicePath( servicePath );
        }

        @Override
        public Builder setBatchPath( String batchPath )
        {
            return ( Builder ) super.setBatchPath( batchPath );
        }

        @Override
        public Builder setHttpRequestInitializer( com.google.api.client.http.HttpRequestInitializer httpRequestInitializer )
        {
            return ( Builder ) super.setHttpRequestInitializer( httpRequestInitializer );
        }

        @Override
        public Builder setApplicationName( String applicationName )
        {
            return ( Builder ) super.setApplicationName( applicationName );
        }

        @Override
        public Builder setSuppressPatternChecks( boolean suppressPatternChecks )
        {
            return ( Builder ) super.setSuppressPatternChecks( suppressPatternChecks );
        }

        @Override
        public Builder setSuppressRequiredParameterChecks( boolean suppressRequiredParameterChecks )
        {
            return ( Builder ) super.setSuppressRequiredParameterChecks( suppressRequiredParameterChecks );
        }

        @Override
        public Builder setSuppressAllChecks( boolean suppressAllChecks )
        {
            return ( Builder ) super.setSuppressAllChecks( suppressAllChecks );
        }

        /**
         * Set the {@link ProductBillingRequestInitializer}.
         *
         * @since 1.12
         */
        public Builder setProductBillingRequestInitializer(
                ProductBillingRequestInitializer productbillingRequestInitializer )
        {
            return ( Builder ) super.setGoogleClientRequestInitializer( productbillingRequestInitializer );
        }

        @Override
        public Builder setGoogleClientRequestInitializer(
                com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer )
        {
            return ( Builder ) super.setGoogleClientRequestInitializer( googleClientRequestInitializer );
        }
    }

    /**
     * The "billing_units" collection of methods.
     */
    public class BillingUnits
    {

        /**
         * Create a request for the method "billing_units.list".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link List#execute()} method to invoke the remote operation.
         *
         * @return the request
         */
        public List list() throws java.io.IOException
        {
            List result = new List();
            initialize( result );
            return result;
        }

        public class List
                extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.BillingUnitCollection>
        {

            private static final String REST_PATH = "codebook/billing-units";

            /**
             * Create a request for the method "billing_units.list".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
             * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
             * called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @since 1.13
             */
            protected List()
            {
                super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.BillingUnitCollection.class );
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
            {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
            {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public List setAlt( java.lang.String alt )
            {
                return ( List ) super.setAlt( alt );
            }

            @Override
            public List setFields( java.lang.String fields )
            {
                return ( List ) super.setFields( fields );
            }

            @Override
            public List setKey( java.lang.String key )
            {
                return ( List ) super.setKey( key );
            }

            @Override
            public List setOauthToken( java.lang.String oauthToken )
            {
                return ( List ) super.setOauthToken( oauthToken );
            }

            @Override
            public List setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( List ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public List setQuotaUser( java.lang.String quotaUser )
            {
                return ( List ) super.setQuotaUser( quotaUser );
            }

            @Override
            public List setUserIp( java.lang.String userIp )
            {
                return ( List ) super.setUserIp( userIp );
            }

            @Override
            public List set( String parameterName, Object value )
            {
                return ( List ) super.set( parameterName, value );
            }
        }

    }

    /**
     * The "categories" collection of methods.
     */
    public class Categories
    {

        /**
         * Create a request for the method "categories.list".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link List#execute()} method to invoke the remote operation.
         *
         * @return the request
         */
        public List list() throws java.io.IOException
        {
            List result = new List();
            initialize( result );
            return result;
        }

        public class List
                extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.CategoryCollection>
        {

            private static final String REST_PATH = "codebook/categories";

            /**
             * Create a request for the method "categories.list".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
             * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
             * called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @since 1.13
             */
            protected List()
            {
                super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.CategoryCollection.class );
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
            {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
            {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public List setAlt( java.lang.String alt )
            {
                return ( List ) super.setAlt( alt );
            }

            @Override
            public List setFields( java.lang.String fields )
            {
                return ( List ) super.setFields( fields );
            }

            @Override
            public List setKey( java.lang.String key )
            {
                return ( List ) super.setKey( key );
            }

            @Override
            public List setOauthToken( java.lang.String oauthToken )
            {
                return ( List ) super.setOauthToken( oauthToken );
            }

            @Override
            public List setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( List ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public List setQuotaUser( java.lang.String quotaUser )
            {
                return ( List ) super.setQuotaUser( quotaUser );
            }

            @Override
            public List setUserIp( java.lang.String userIp )
            {
                return ( List ) super.setUserIp( userIp );
            }

            @Override
            public List set( String parameterName, Object value )
            {
                return ( List ) super.set( parameterName, value );
            }
        }

    }

    /**
     * The "configs" collection of methods.
     */
    public class Configs
    {

        /**
         * Create a request for the method "configs.delete".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link Delete#execute()} method to invoke the remote operation.
         *
         * @param profileName
         * @return the request
         */
        public Delete delete( java.lang.String profileName ) throws java.io.IOException
        {
            Delete result = new Delete( profileName );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "configs.update".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link Update#execute()} method to invoke the remote operation.
         *
         * @param profileName
         * @param content     the {@link biz.turnonline.ecosystem.billing.model.AccountingSystem}
         * @return the request
         */
        public Update update( java.lang.String profileName,
                              biz.turnonline.ecosystem.billing.model.AccountingSystem content )
                throws java.io.IOException
        {
            Update result = new Update( profileName, content );
            initialize( result );
            return result;
        }

        public class Delete
                extends ProductBillingRequest<Void>
        {

            private static final String REST_PATH = "configs/{profile_name}";

            @com.google.api.client.util.Key( "profile_name" )
            private java.lang.String profileName;

            /**
             * Create a request for the method "configs.delete".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link Delete#execute()} method to invoke the remote operation. <p> {@link
             * Delete#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param profileName
             * @since 1.13
             */
            protected Delete( java.lang.String profileName )
            {
                super( ProductBilling.this, "DELETE", REST_PATH, null, Void.class );
                this.profileName = com.google.api.client.util.Preconditions.checkNotNull( profileName, "Required parameter profileName must be specified." );
            }

            @Override
            public Delete setAlt( java.lang.String alt )
            {
                return ( Delete ) super.setAlt( alt );
            }

            @Override
            public Delete setFields( java.lang.String fields )
            {
                return ( Delete ) super.setFields( fields );
            }

            @Override
            public Delete setKey( java.lang.String key )
            {
                return ( Delete ) super.setKey( key );
            }

            @Override
            public Delete setOauthToken( java.lang.String oauthToken )
            {
                return ( Delete ) super.setOauthToken( oauthToken );
            }

            @Override
            public Delete setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Delete ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Delete setQuotaUser( java.lang.String quotaUser )
            {
                return ( Delete ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Delete setUserIp( java.lang.String userIp )
            {
                return ( Delete ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.String getProfileName()
            {
                return profileName;
            }

            public Delete setProfileName( java.lang.String profileName )
            {
                this.profileName = profileName;
                return this;
            }

            @Override
            public Delete set( String parameterName, Object value )
            {
                return ( Delete ) super.set( parameterName, value );
            }
        }

        public class Update
                extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.AccountingSystem>
        {

            private static final String REST_PATH = "configs/{profile_name}";

            @com.google.api.client.util.Key( "profile_name" )
            private java.lang.String profileName;

            /**
             * Create a request for the method "configs.update".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link Update#execute()} method to invoke the remote operation. <p> {@link
             * Update#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param profileName
             * @param content     the {@link biz.turnonline.ecosystem.billing.model.AccountingSystem}
             * @since 1.13
             */
            protected Update( java.lang.String profileName,
                              biz.turnonline.ecosystem.billing.model.AccountingSystem content )
            {
                super( ProductBilling.this, "PUT", REST_PATH, content, biz.turnonline.ecosystem.billing.model.AccountingSystem.class );
                this.profileName = com.google.api.client.util.Preconditions.checkNotNull( profileName, "Required parameter profileName must be specified." );
            }

            @Override
            public Update setAlt( java.lang.String alt )
            {
                return ( Update ) super.setAlt( alt );
            }

            @Override
            public Update setFields( java.lang.String fields )
            {
                return ( Update ) super.setFields( fields );
            }

            @Override
            public Update setKey( java.lang.String key )
            {
                return ( Update ) super.setKey( key );
            }

            @Override
            public Update setOauthToken( java.lang.String oauthToken )
            {
                return ( Update ) super.setOauthToken( oauthToken );
            }

            @Override
            public Update setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Update ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Update setQuotaUser( java.lang.String quotaUser )
            {
                return ( Update ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Update setUserIp( java.lang.String userIp )
            {
                return ( Update ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.String getProfileName()
            {
                return profileName;
            }

            public Update setProfileName( java.lang.String profileName )
            {
                this.profileName = profileName;
                return this;
            }

            @Override
            public Update set( String parameterName, Object value )
            {
                return ( Update ) super.set( parameterName, value );
            }
        }

    }

    /**
     * The "invoices" collection of methods.
     */
    public class Invoices
    {

        /**
         * Create a request for the method "invoices.insert".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link Insert#execute()} method to invoke the remote operation.
         *
         * @param content the {@link biz.turnonline.ecosystem.billing.model.Invoice}
         * @return the request
         */
        public Insert insert( biz.turnonline.ecosystem.billing.model.Invoice content ) throws java.io.IOException
        {
            Insert result = new Insert( content );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "invoices.list".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link List#execute()} method to invoke the remote operation.
         *
         * @return the request
         */
        public List list() throws java.io.IOException
        {
            List result = new List();
            initialize( result );
            return result;
        }

        public class Insert
                extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.Invoice>
        {

            private static final String REST_PATH = "invoices";

            /**
             * Create a request for the method "invoices.insert".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link Insert#execute()} method to invoke the remote operation. <p> {@link
             * Insert#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param content the {@link biz.turnonline.ecosystem.billing.model.Invoice}
             * @since 1.13
             */
            protected Insert( biz.turnonline.ecosystem.billing.model.Invoice content )
            {
                super( ProductBilling.this, "POST", REST_PATH, content, biz.turnonline.ecosystem.billing.model.Invoice.class );
            }

            @Override
            public Insert setAlt( java.lang.String alt )
            {
                return ( Insert ) super.setAlt( alt );
            }

            @Override
            public Insert setFields( java.lang.String fields )
            {
                return ( Insert ) super.setFields( fields );
            }

            @Override
            public Insert setKey( java.lang.String key )
            {
                return ( Insert ) super.setKey( key );
            }

            @Override
            public Insert setOauthToken( java.lang.String oauthToken )
            {
                return ( Insert ) super.setOauthToken( oauthToken );
            }

            @Override
            public Insert setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Insert ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Insert setQuotaUser( java.lang.String quotaUser )
            {
                return ( Insert ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Insert setUserIp( java.lang.String userIp )
            {
                return ( Insert ) super.setUserIp( userIp );
            }

            @Override
            public Insert set( String parameterName, Object value )
            {
                return ( Insert ) super.set( parameterName, value );
            }
        }

        public class List
                extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.InvoiceCollection>
        {

            private static final String REST_PATH = "invoices";

            @com.google.api.client.util.Key
            private java.lang.Integer limit;

            @com.google.api.client.util.Key
            private java.lang.Boolean lightList;

            @com.google.api.client.util.Key
            private java.lang.Integer offset;

            /**
             * Create a request for the method "invoices.list".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
             * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
             * called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @since 1.13
             */
            protected List()
            {
                super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.InvoiceCollection.class );
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
            {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
            {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public List setAlt( java.lang.String alt )
            {
                return ( List ) super.setAlt( alt );
            }

            @Override
            public List setFields( java.lang.String fields )
            {
                return ( List ) super.setFields( fields );
            }

            @Override
            public List setKey( java.lang.String key )
            {
                return ( List ) super.setKey( key );
            }

            @Override
            public List setOauthToken( java.lang.String oauthToken )
            {
                return ( List ) super.setOauthToken( oauthToken );
            }

            @Override
            public List setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( List ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public List setQuotaUser( java.lang.String quotaUser )
            {
                return ( List ) super.setQuotaUser( quotaUser );
            }

            @Override
            public List setUserIp( java.lang.String userIp )
            {
                return ( List ) super.setUserIp( userIp );
            }

            /**
             * [ default: 10]
             * [
             */
            public java.lang.Integer getLimit()
            {
                return limit;
            }

            public List setLimit( java.lang.Integer limit )
            {
                this.limit = limit;
                return this;
            }

            /**
             * [ default: false]
             * [
             */
            public java.lang.Boolean getLightList()
            {
                return lightList;
            }

            /**
             * Convenience method that returns only {@link Boolean#TRUE} or {@link Boolean#FALSE}.
             *
             * <p>
             * Boolean properties can have four possible values:
             * {@code null}, {@link com.google.api.client.util.Data#NULL_BOOLEAN}, {@link Boolean#TRUE}
             * or {@link Boolean#FALSE}.
             * </p>
             *
             * <p>
             * This method returns {@link Boolean#TRUE} if the default of the property is {@link Boolean#TRUE}
             * and it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
             * {@link Boolean#FALSE} is returned if the default of the property is {@link Boolean#FALSE} and
             * it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
             * </p>
             *
             * <p>
             *
             * </p>
             */
            public boolean isLightList()
            {
                if ( lightList == null || lightList == com.google.api.client.util.Data.NULL_BOOLEAN )
                {
                    return false;
                }
                return lightList;
            }

            public List setLightList( java.lang.Boolean lightList )
            {
                this.lightList = lightList;
                return this;
            }

            /**
             * [ default: 0]
             * [
             */
            public java.lang.Integer getOffset()
            {
                return offset;
            }

            public List setOffset( java.lang.Integer offset )
            {
                this.offset = offset;
                return this;
            }

            @Override
            public List set( String parameterName, Object value )
            {
                return ( List ) super.set( parameterName, value );
            }
        }

    }

    /**
     * The "number_series" collection of methods.
     */
    public class NumberSeries
    {

        /**
         * Create a request for the method "number_series.list".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link List#execute()} method to invoke the remote operation.
         *
         * @return the request
         */
        public List list() throws java.io.IOException
        {
            List result = new List();
            initialize( result );
            return result;
        }

        public class List
                extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.NumberSeriesCollection>
        {

            private static final String REST_PATH = "codebook/number-series";

            /**
             * Create a request for the method "number_series.list".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
             * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
             * called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @since 1.13
             */
            protected List()
            {
                super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.NumberSeriesCollection.class );
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
            {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
            {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public List setAlt( java.lang.String alt )
            {
                return ( List ) super.setAlt( alt );
            }

            @Override
            public List setFields( java.lang.String fields )
            {
                return ( List ) super.setFields( fields );
            }

            @Override
            public List setKey( java.lang.String key )
            {
                return ( List ) super.setKey( key );
            }

            @Override
            public List setOauthToken( java.lang.String oauthToken )
            {
                return ( List ) super.setOauthToken( oauthToken );
            }

            @Override
            public List setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( List ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public List setQuotaUser( java.lang.String quotaUser )
            {
                return ( List ) super.setQuotaUser( quotaUser );
            }

            @Override
            public List setUserIp( java.lang.String userIp )
            {
                return ( List ) super.setUserIp( userIp );
            }

            @Override
            public List set( String parameterName, Object value )
            {
                return ( List ) super.set( parameterName, value );
            }
        }

    }

    /**
     * The "offers" collection of methods.
     */
    public class Offers
    {

        /**
         * Create a request for the method "offers.accept".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link Accept#execute()} method to invoke the remote operation.
         *
         * @param offerId
         * @return the request
         */
        public Accept accept( java.lang.Long offerId ) throws java.io.IOException
        {
            Accept result = new Accept( offerId );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "offers.delete".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link Delete#execute()} method to invoke the remote operation.
         *
         * @param offerId
         * @return the request
         */
        public Delete delete( java.lang.Long offerId ) throws java.io.IOException
        {
            Delete result = new Delete( offerId );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "offers.get".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link Get#execute()} method to invoke the remote operation.
         *
         * @param offerId
         * @return the request
         */
        public Get get( java.lang.Long offerId ) throws java.io.IOException
        {
            Get result = new Get( offerId );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "offers.list".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link List#execute()} method to invoke the remote operation.
         *
         * @return the request
         */
        public List list() throws java.io.IOException
        {
            List result = new List();
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "offers.update".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link Update#execute()} method to invoke the remote operation.
         *
         * @param orderId
         * @param content the {@link biz.turnonline.ecosystem.billing.model.PureOffer}
         * @return the request
         */
        public Update update( java.lang.Long orderId, biz.turnonline.ecosystem.billing.model.PureOffer content )
                throws java.io.IOException
        {
            Update result = new Update( orderId, content );
            initialize( result );
            return result;
        }

        /**
         * An accessor for creating requests from the Recipients collection.
         *
         * <p>The typical use is:</p>
         * <pre>
         *   {@code ProductBilling billing = new ProductBilling(...);}
         *   {@code ProductBilling.Recipients.List request = billing.recipients().list(parameters ...)}
         * </pre>
         *
         * @return the resource collection
         */
        public Recipients recipients()
        {
            return new Recipients();
        }

        public class Accept
                extends ProductBillingRequest<Void>
        {

            private static final String REST_PATH = "offers/{offer_id}/accept";

            @com.google.api.client.util.Key( "offer_id" )
            private java.lang.Long offerId;

            /**
             * Create a request for the method "offers.accept".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link Accept#execute()} method to invoke the remote operation. <p> {@link
             * Accept#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param offerId
             * @since 1.13
             */
            protected Accept( java.lang.Long offerId )
            {
                super( ProductBilling.this, "PUT", REST_PATH, null, Void.class );
                this.offerId = com.google.api.client.util.Preconditions.checkNotNull( offerId, "Required parameter offerId must be specified." );
            }

            @Override
            public Accept setAlt( java.lang.String alt )
            {
                return ( Accept ) super.setAlt( alt );
            }

            @Override
            public Accept setFields( java.lang.String fields )
            {
                return ( Accept ) super.setFields( fields );
            }

            @Override
            public Accept setKey( java.lang.String key )
            {
                return ( Accept ) super.setKey( key );
            }

            @Override
            public Accept setOauthToken( java.lang.String oauthToken )
            {
                return ( Accept ) super.setOauthToken( oauthToken );
            }

            @Override
            public Accept setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Accept ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Accept setQuotaUser( java.lang.String quotaUser )
            {
                return ( Accept ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Accept setUserIp( java.lang.String userIp )
            {
                return ( Accept ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getOfferId()
            {
                return offerId;
            }

            public Accept setOfferId( java.lang.Long offerId )
            {
                this.offerId = offerId;
                return this;
            }

            @Override
            public Accept set( String parameterName, Object value )
            {
                return ( Accept ) super.set( parameterName, value );
            }
        }

        public class Delete
                extends ProductBillingRequest<Void>
        {

            private static final String REST_PATH = "offers/{offer_id}";

            @com.google.api.client.util.Key( "offer_id" )
            private java.lang.Long offerId;

            /**
             * Create a request for the method "offers.delete".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link Delete#execute()} method to invoke the remote operation. <p> {@link
             * Delete#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param offerId
             * @since 1.13
             */
            protected Delete( java.lang.Long offerId )
            {
                super( ProductBilling.this, "DELETE", REST_PATH, null, Void.class );
                this.offerId = com.google.api.client.util.Preconditions.checkNotNull( offerId, "Required parameter offerId must be specified." );
            }

            @Override
            public Delete setAlt( java.lang.String alt )
            {
                return ( Delete ) super.setAlt( alt );
            }

            @Override
            public Delete setFields( java.lang.String fields )
            {
                return ( Delete ) super.setFields( fields );
            }

            @Override
            public Delete setKey( java.lang.String key )
            {
                return ( Delete ) super.setKey( key );
            }

            @Override
            public Delete setOauthToken( java.lang.String oauthToken )
            {
                return ( Delete ) super.setOauthToken( oauthToken );
            }

            @Override
            public Delete setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Delete ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Delete setQuotaUser( java.lang.String quotaUser )
            {
                return ( Delete ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Delete setUserIp( java.lang.String userIp )
            {
                return ( Delete ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getOfferId()
            {
                return offerId;
            }

            public Delete setOfferId( java.lang.Long offerId )
            {
                this.offerId = offerId;
                return this;
            }

            @Override
            public Delete set( String parameterName, Object value )
            {
                return ( Delete ) super.set( parameterName, value );
            }
        }

        public class Get
                extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.CompleteOffer>
        {

            private static final String REST_PATH = "offers/{offer_id}";

            @com.google.api.client.util.Key( "offer_id" )
            private java.lang.Long offerId;

            /**
             * Create a request for the method "offers.get".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
             * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
             * called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param offerId
             * @since 1.13
             */
            protected Get( java.lang.Long offerId )
            {
                super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.CompleteOffer.class );
                this.offerId = com.google.api.client.util.Preconditions.checkNotNull( offerId, "Required parameter offerId must be specified." );
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
            {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
            {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public Get setAlt( java.lang.String alt )
            {
                return ( Get ) super.setAlt( alt );
            }

            @Override
            public Get setFields( java.lang.String fields )
            {
                return ( Get ) super.setFields( fields );
            }

            @Override
            public Get setKey( java.lang.String key )
            {
                return ( Get ) super.setKey( key );
            }

            @Override
            public Get setOauthToken( java.lang.String oauthToken )
            {
                return ( Get ) super.setOauthToken( oauthToken );
            }

            @Override
            public Get setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Get ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Get setQuotaUser( java.lang.String quotaUser )
            {
                return ( Get ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Get setUserIp( java.lang.String userIp )
            {
                return ( Get ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getOfferId()
            {
                return offerId;
            }

            public Get setOfferId( java.lang.Long offerId )
            {
                this.offerId = offerId;
                return this;
            }

            @Override
            public Get set( String parameterName, Object value )
            {
                return ( Get ) super.set( parameterName, value );
            }
        }

        public class List
                extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.OfferListItemCollection>
        {

            private static final String REST_PATH = "offers";

            @com.google.api.client.util.Key
            private java.lang.Boolean incoming;

            @com.google.api.client.util.Key
            private java.lang.Integer limit;

            @com.google.api.client.util.Key
            private java.lang.Long customerId;

            @com.google.api.client.util.Key
            private java.lang.Integer offset;

            /**
             * Create a request for the method "offers.list".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
             * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
             * called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @since 1.13
             */
            protected List()
            {
                super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.OfferListItemCollection.class );
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
            {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
            {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public List setAlt( java.lang.String alt )
            {
                return ( List ) super.setAlt( alt );
            }

            @Override
            public List setFields( java.lang.String fields )
            {
                return ( List ) super.setFields( fields );
            }

            @Override
            public List setKey( java.lang.String key )
            {
                return ( List ) super.setKey( key );
            }

            @Override
            public List setOauthToken( java.lang.String oauthToken )
            {
                return ( List ) super.setOauthToken( oauthToken );
            }

            @Override
            public List setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( List ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public List setQuotaUser( java.lang.String quotaUser )
            {
                return ( List ) super.setQuotaUser( quotaUser );
            }

            @Override
            public List setUserIp( java.lang.String userIp )
            {
                return ( List ) super.setUserIp( userIp );
            }

            /**
             * [ default: false]
             * [
             */
            public java.lang.Boolean getIncoming()
            {
                return incoming;
            }

            /**
             * Convenience method that returns only {@link Boolean#TRUE} or {@link Boolean#FALSE}.
             *
             * <p>
             * Boolean properties can have four possible values:
             * {@code null}, {@link com.google.api.client.util.Data#NULL_BOOLEAN}, {@link Boolean#TRUE}
             * or {@link Boolean#FALSE}.
             * </p>
             *
             * <p>
             * This method returns {@link Boolean#TRUE} if the default of the property is {@link Boolean#TRUE}
             * and it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
             * {@link Boolean#FALSE} is returned if the default of the property is {@link Boolean#FALSE} and
             * it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
             * </p>
             *
             * <p>
             *
             * </p>
             */
            public boolean isIncoming()
            {
                if ( incoming == null || incoming == com.google.api.client.util.Data.NULL_BOOLEAN )
                {
                    return false;
                }
                return incoming;
            }

            public List setIncoming( java.lang.Boolean incoming )
            {
                this.incoming = incoming;
                return this;
            }

            /**
             * [ default: 10]
             * [
             */
            public java.lang.Integer getLimit()
            {
                return limit;
            }

            public List setLimit( java.lang.Integer limit )
            {
                this.limit = limit;
                return this;
            }

            /**
             *
             */
            public java.lang.Long getCustomerId()
            {
                return customerId;
            }

            public List setCustomerId( java.lang.Long customerId )
            {
                this.customerId = customerId;
                return this;
            }

            /**
             * [ default: 0]
             * [
             */
            public java.lang.Integer getOffset()
            {
                return offset;
            }

            public List setOffset( java.lang.Integer offset )
            {
                this.offset = offset;
                return this;
            }

            @Override
            public List set( String parameterName, Object value )
            {
                return ( List ) super.set( parameterName, value );
            }
        }

        public class Update
                extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.CompleteOffer>
        {

            private static final String REST_PATH = "offers/{order_id}";

            @com.google.api.client.util.Key( "order_id" )
            private java.lang.Long orderId;

            /**
             * Create a request for the method "offers.update".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link Update#execute()} method to invoke the remote operation. <p> {@link
             * Update#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param orderId
             * @param content the {@link biz.turnonline.ecosystem.billing.model.PureOffer}
             * @since 1.13
             */
            protected Update( java.lang.Long orderId, biz.turnonline.ecosystem.billing.model.PureOffer content )
            {
                super( ProductBilling.this, "PUT", REST_PATH, content, biz.turnonline.ecosystem.billing.model.CompleteOffer.class );
                this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
            }

            @Override
            public Update setAlt( java.lang.String alt )
            {
                return ( Update ) super.setAlt( alt );
            }

            @Override
            public Update setFields( java.lang.String fields )
            {
                return ( Update ) super.setFields( fields );
            }

            @Override
            public Update setKey( java.lang.String key )
            {
                return ( Update ) super.setKey( key );
            }

            @Override
            public Update setOauthToken( java.lang.String oauthToken )
            {
                return ( Update ) super.setOauthToken( oauthToken );
            }

            @Override
            public Update setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Update ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Update setQuotaUser( java.lang.String quotaUser )
            {
                return ( Update ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Update setUserIp( java.lang.String userIp )
            {
                return ( Update ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getOrderId()
            {
                return orderId;
            }

            public Update setOrderId( java.lang.Long orderId )
            {
                this.orderId = orderId;
                return this;
            }

            @Override
            public Update set( String parameterName, Object value )
            {
                return ( Update ) super.set( parameterName, value );
            }
        }

        /**
         * The "recipients" collection of methods.
         */
        public class Recipients
        {

            /**
             * Create a request for the method "recipients.count".
             * <p>
             * This request holds the parameters needed by the billing server.  After setting any optional
             * parameters, call the {@link Count#execute()} method to invoke the remote operation.
             *
             * @param offerId
             * @return the request
             */
            public Count count( java.lang.Long offerId ) throws java.io.IOException
            {
                Count result = new Count( offerId );
                initialize( result );
                return result;
            }

            /**
             * Create a request for the method "recipients.list".
             * <p>
             * This request holds the parameters needed by the billing server.  After setting any optional
             * parameters, call the {@link List#execute()} method to invoke the remote operation.
             *
             * @param offerId
             * @return the request
             */
            public List list( java.lang.Long offerId ) throws java.io.IOException
            {
                List result = new List( offerId );
                initialize( result );
                return result;
            }

            public class Count
                    extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.NumberOfRecipients>
            {

                private static final String REST_PATH = "offers/{offer_id}/recipients/count";

                @com.google.api.client.util.Key( "offer_id" )
                private java.lang.Long offerId;

                /**
                 * Create a request for the method "recipients.count".
                 * <p>
                 * This request holds the parameters needed by the the billing server.  After setting any optional
                 * parameters, call the {@link Count#execute()} method to invoke the remote operation. <p> {@link
                 * Count#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
                 * be called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @param offerId
                 * @since 1.13
                 */
                protected Count( java.lang.Long offerId )
                {
                    super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.NumberOfRecipients.class );
                    this.offerId = com.google.api.client.util.Preconditions.checkNotNull( offerId, "Required parameter offerId must be specified." );
                }

                @Override
                public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
                {
                    return super.executeUsingHead();
                }

                @Override
                public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
                {
                    return super.buildHttpRequestUsingHead();
                }

                @Override
                public Count setAlt( java.lang.String alt )
                {
                    return ( Count ) super.setAlt( alt );
                }

                @Override
                public Count setFields( java.lang.String fields )
                {
                    return ( Count ) super.setFields( fields );
                }

                @Override
                public Count setKey( java.lang.String key )
                {
                    return ( Count ) super.setKey( key );
                }

                @Override
                public Count setOauthToken( java.lang.String oauthToken )
                {
                    return ( Count ) super.setOauthToken( oauthToken );
                }

                @Override
                public Count setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( Count ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public Count setQuotaUser( java.lang.String quotaUser )
                {
                    return ( Count ) super.setQuotaUser( quotaUser );
                }

                @Override
                public Count setUserIp( java.lang.String userIp )
                {
                    return ( Count ) super.setUserIp( userIp );
                }

                /**
                 *
                 */
                public java.lang.Long getOfferId()
                {
                    return offerId;
                }

                public Count setOfferId( java.lang.Long offerId )
                {
                    this.offerId = offerId;
                    return this;
                }

                @Override
                public Count set( String parameterName, Object value )
                {
                    return ( Count ) super.set( parameterName, value );
                }
            }

            public class List
                    extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.OfferRecipientCollection>
            {

                private static final String REST_PATH = "offers/{offer_id}/recipients";

                @com.google.api.client.util.Key( "offer_id" )
                private java.lang.Long offerId;

                @com.google.api.client.util.Key
                private java.lang.Integer limit;

                @com.google.api.client.util.Key
                private java.lang.Integer offset;

                /**
                 * Create a request for the method "recipients.list".
                 * <p>
                 * This request holds the parameters needed by the the billing server.  After setting any optional
                 * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
                 * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
                 * called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @param offerId
                 * @since 1.13
                 */
                protected List( java.lang.Long offerId )
                {
                    super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.OfferRecipientCollection.class );
                    this.offerId = com.google.api.client.util.Preconditions.checkNotNull( offerId, "Required parameter offerId must be specified." );
                }

                @Override
                public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
                {
                    return super.executeUsingHead();
                }

                @Override
                public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
                {
                    return super.buildHttpRequestUsingHead();
                }

                @Override
                public List setAlt( java.lang.String alt )
                {
                    return ( List ) super.setAlt( alt );
                }

                @Override
                public List setFields( java.lang.String fields )
                {
                    return ( List ) super.setFields( fields );
                }

                @Override
                public List setKey( java.lang.String key )
                {
                    return ( List ) super.setKey( key );
                }

                @Override
                public List setOauthToken( java.lang.String oauthToken )
                {
                    return ( List ) super.setOauthToken( oauthToken );
                }

                @Override
                public List setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( List ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public List setQuotaUser( java.lang.String quotaUser )
                {
                    return ( List ) super.setQuotaUser( quotaUser );
                }

                @Override
                public List setUserIp( java.lang.String userIp )
                {
                    return ( List ) super.setUserIp( userIp );
                }

                /**
                 *
                 */
                public java.lang.Long getOfferId()
                {
                    return offerId;
                }

                public List setOfferId( java.lang.Long offerId )
                {
                    this.offerId = offerId;
                    return this;
                }

                /**
                 * [ default: 100]
                 * [
                 */
                public java.lang.Integer getLimit()
                {
                    return limit;
                }

                public List setLimit( java.lang.Integer limit )
                {
                    this.limit = limit;
                    return this;
                }

                /**
                 * [ default: 0]
                 * [
                 */
                public java.lang.Integer getOffset()
                {
                    return offset;
                }

                public List setOffset( java.lang.Integer offset )
                {
                    this.offset = offset;
                    return this;
                }

                @Override
                public List set( String parameterName, Object value )
                {
                    return ( List ) super.set( parameterName, value );
                }
            }

        }
    }

    /**
     * The "orders" collection of methods.
     */
    public class Orders
    {

        /**
         * Create a request for the method "orders.delete".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link Delete#execute()} method to invoke the remote operation.
         *
         * @param orderId
         * @return the request
         */
        public Delete delete( java.lang.Long orderId ) throws java.io.IOException
        {
            Delete result = new Delete( orderId );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "orders.get".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link Get#execute()} method to invoke the remote operation.
         *
         * @param orderId
         * @return the request
         */
        public Get get( java.lang.Long orderId ) throws java.io.IOException
        {
            Get result = new Get( orderId );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "orders.insert".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link Insert#execute()} method to invoke the remote operation.
         *
         * @param content the {@link biz.turnonline.ecosystem.billing.model.Order}
         * @return the request
         */
        public Insert insert( biz.turnonline.ecosystem.billing.model.Order content ) throws java.io.IOException
        {
            Insert result = new Insert( content );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "orders.list".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link List#execute()} method to invoke the remote operation.
         *
         * @return the request
         */
        public List list() throws java.io.IOException
        {
            List result = new List();
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "orders.update".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link Update#execute()} method to invoke the remote operation.
         *
         * @param orderId
         * @param content the {@link biz.turnonline.ecosystem.billing.model.Order}
         * @return the request
         */
        public Update update( java.lang.Long orderId, biz.turnonline.ecosystem.billing.model.Order content )
                throws java.io.IOException
        {
            Update result = new Update( orderId, content );
            initialize( result );
            return result;
        }

        /**
         * An accessor for creating requests from the Invoices collection.
         *
         * <p>The typical use is:</p>
         * <pre>
         *   {@code ProductBilling billing = new ProductBilling(...);}
         *   {@code ProductBilling.Invoices.List request = billing.invoices().list(parameters ...)}
         * </pre>
         *
         * @return the resource collection
         */
        public Invoices invoices()
        {
            return new Invoices();
        }

        /**
         * An accessor for creating requests from the Items collection.
         *
         * <p>The typical use is:</p>
         * <pre>
         *   {@code ProductBilling billing = new ProductBilling(...);}
         *   {@code ProductBilling.Items.List request = billing.items().list(parameters ...)}
         * </pre>
         *
         * @return the resource collection
         */
        public Items items()
        {
            return new Items();
        }

        /**
         * An accessor for creating requests from the Status collection.
         *
         * <p>The typical use is:</p>
         * <pre>
         *   {@code ProductBilling billing = new ProductBilling(...);}
         *   {@code ProductBilling.Status.List request = billing.status().list(parameters ...)}
         * </pre>
         *
         * @return the resource collection
         */
        public Status status()
        {
            return new Status();
        }

        public class Delete
                extends ProductBillingRequest<Void>
        {

            private static final String REST_PATH = "orders/{order_id}";

            @com.google.api.client.util.Key( "order_id" )
            private java.lang.Long orderId;

            /**
             * Create a request for the method "orders.delete".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link Delete#execute()} method to invoke the remote operation. <p> {@link
             * Delete#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param orderId
             * @since 1.13
             */
            protected Delete( java.lang.Long orderId )
            {
                super( ProductBilling.this, "DELETE", REST_PATH, null, Void.class );
                this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
            }

            @Override
            public Delete setAlt( java.lang.String alt )
            {
                return ( Delete ) super.setAlt( alt );
            }

            @Override
            public Delete setFields( java.lang.String fields )
            {
                return ( Delete ) super.setFields( fields );
            }

            @Override
            public Delete setKey( java.lang.String key )
            {
                return ( Delete ) super.setKey( key );
            }

            @Override
            public Delete setOauthToken( java.lang.String oauthToken )
            {
                return ( Delete ) super.setOauthToken( oauthToken );
            }

            @Override
            public Delete setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Delete ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Delete setQuotaUser( java.lang.String quotaUser )
            {
                return ( Delete ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Delete setUserIp( java.lang.String userIp )
            {
                return ( Delete ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getOrderId()
            {
                return orderId;
            }

            public Delete setOrderId( java.lang.Long orderId )
            {
                this.orderId = orderId;
                return this;
            }

            @Override
            public Delete set( String parameterName, Object value )
            {
                return ( Delete ) super.set( parameterName, value );
            }
        }

        public class Get
                extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.Order>
        {

            private static final String REST_PATH = "orders/{order_id}";

            @com.google.api.client.util.Key( "order_id" )
            private java.lang.Long orderId;

            @com.google.api.client.util.Key
            private java.lang.Integer invoices;

            /**
             * Create a request for the method "orders.get".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
             * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
             * called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param orderId
             * @since 1.13
             */
            protected Get( java.lang.Long orderId )
            {
                super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.Order.class );
                this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
            {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
            {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public Get setAlt( java.lang.String alt )
            {
                return ( Get ) super.setAlt( alt );
            }

            @Override
            public Get setFields( java.lang.String fields )
            {
                return ( Get ) super.setFields( fields );
            }

            @Override
            public Get setKey( java.lang.String key )
            {
                return ( Get ) super.setKey( key );
            }

            @Override
            public Get setOauthToken( java.lang.String oauthToken )
            {
                return ( Get ) super.setOauthToken( oauthToken );
            }

            @Override
            public Get setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Get ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Get setQuotaUser( java.lang.String quotaUser )
            {
                return ( Get ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Get setUserIp( java.lang.String userIp )
            {
                return ( Get ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getOrderId()
            {
                return orderId;
            }

            public Get setOrderId( java.lang.Long orderId )
            {
                this.orderId = orderId;
                return this;
            }

            /**
             *
             */
            public java.lang.Integer getInvoices()
            {
                return invoices;
            }

            public Get setInvoices( java.lang.Integer invoices )
            {
                this.invoices = invoices;
                return this;
            }

            @Override
            public Get set( String parameterName, Object value )
            {
                return ( Get ) super.set( parameterName, value );
            }
        }

        public class Insert
                extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.Order>
        {

            private static final String REST_PATH = "orders";

            /**
             * Create a request for the method "orders.insert".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link Insert#execute()} method to invoke the remote operation. <p> {@link
             * Insert#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param content the {@link biz.turnonline.ecosystem.billing.model.Order}
             * @since 1.13
             */
            protected Insert( biz.turnonline.ecosystem.billing.model.Order content )
            {
                super( ProductBilling.this, "POST", REST_PATH, content, biz.turnonline.ecosystem.billing.model.Order.class );
            }

            @Override
            public Insert setAlt( java.lang.String alt )
            {
                return ( Insert ) super.setAlt( alt );
            }

            @Override
            public Insert setFields( java.lang.String fields )
            {
                return ( Insert ) super.setFields( fields );
            }

            @Override
            public Insert setKey( java.lang.String key )
            {
                return ( Insert ) super.setKey( key );
            }

            @Override
            public Insert setOauthToken( java.lang.String oauthToken )
            {
                return ( Insert ) super.setOauthToken( oauthToken );
            }

            @Override
            public Insert setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Insert ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Insert setQuotaUser( java.lang.String quotaUser )
            {
                return ( Insert ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Insert setUserIp( java.lang.String userIp )
            {
                return ( Insert ) super.setUserIp( userIp );
            }

            @Override
            public Insert set( String parameterName, Object value )
            {
                return ( Insert ) super.set( parameterName, value );
            }
        }

        public class List
                extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.OrderCollection>
        {

            private static final String REST_PATH = "orders";

            @com.google.api.client.util.Key
            private java.lang.Integer limit;

            @com.google.api.client.util.Key
            private java.lang.Boolean lightList;

            @com.google.api.client.util.Key
            private java.lang.Integer offset;

            /**
             * Create a request for the method "orders.list".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
             * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
             * called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @since 1.13
             */
            protected List()
            {
                super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.OrderCollection.class );
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
            {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
            {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public List setAlt( java.lang.String alt )
            {
                return ( List ) super.setAlt( alt );
            }

            @Override
            public List setFields( java.lang.String fields )
            {
                return ( List ) super.setFields( fields );
            }

            @Override
            public List setKey( java.lang.String key )
            {
                return ( List ) super.setKey( key );
            }

            @Override
            public List setOauthToken( java.lang.String oauthToken )
            {
                return ( List ) super.setOauthToken( oauthToken );
            }

            @Override
            public List setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( List ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public List setQuotaUser( java.lang.String quotaUser )
            {
                return ( List ) super.setQuotaUser( quotaUser );
            }

            @Override
            public List setUserIp( java.lang.String userIp )
            {
                return ( List ) super.setUserIp( userIp );
            }

            /**
             * [ default: 10]
             * [
             */
            public java.lang.Integer getLimit()
            {
                return limit;
            }

            public List setLimit( java.lang.Integer limit )
            {
                this.limit = limit;
                return this;
            }

            /**
             * [ default: false]
             * [
             */
            public java.lang.Boolean getLightList()
            {
                return lightList;
            }

            /**
             * Convenience method that returns only {@link Boolean#TRUE} or {@link Boolean#FALSE}.
             *
             * <p>
             * Boolean properties can have four possible values:
             * {@code null}, {@link com.google.api.client.util.Data#NULL_BOOLEAN}, {@link Boolean#TRUE}
             * or {@link Boolean#FALSE}.
             * </p>
             *
             * <p>
             * This method returns {@link Boolean#TRUE} if the default of the property is {@link Boolean#TRUE}
             * and it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
             * {@link Boolean#FALSE} is returned if the default of the property is {@link Boolean#FALSE} and
             * it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
             * </p>
             *
             * <p>
             *
             * </p>
             */
            public boolean isLightList()
            {
                if ( lightList == null || lightList == com.google.api.client.util.Data.NULL_BOOLEAN )
                {
                    return false;
                }
                return lightList;
            }

            public List setLightList( java.lang.Boolean lightList )
            {
                this.lightList = lightList;
                return this;
            }

            /**
             * [ default: 0]
             * [
             */
            public java.lang.Integer getOffset()
            {
                return offset;
            }

            public List setOffset( java.lang.Integer offset )
            {
                this.offset = offset;
                return this;
            }

            @Override
            public List set( String parameterName, Object value )
            {
                return ( List ) super.set( parameterName, value );
            }
        }

        public class Update
                extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.Order>
        {

            private static final String REST_PATH = "orders/{order_id}";

            @com.google.api.client.util.Key( "order_id" )
            private java.lang.Long orderId;

            /**
             * Create a request for the method "orders.update".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link Update#execute()} method to invoke the remote operation. <p> {@link
             * Update#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param orderId
             * @param content the {@link biz.turnonline.ecosystem.billing.model.Order}
             * @since 1.13
             */
            protected Update( java.lang.Long orderId, biz.turnonline.ecosystem.billing.model.Order content )
            {
                super( ProductBilling.this, "PUT", REST_PATH, content, biz.turnonline.ecosystem.billing.model.Order.class );
                this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
            }

            @Override
            public Update setAlt( java.lang.String alt )
            {
                return ( Update ) super.setAlt( alt );
            }

            @Override
            public Update setFields( java.lang.String fields )
            {
                return ( Update ) super.setFields( fields );
            }

            @Override
            public Update setKey( java.lang.String key )
            {
                return ( Update ) super.setKey( key );
            }

            @Override
            public Update setOauthToken( java.lang.String oauthToken )
            {
                return ( Update ) super.setOauthToken( oauthToken );
            }

            @Override
            public Update setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Update ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Update setQuotaUser( java.lang.String quotaUser )
            {
                return ( Update ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Update setUserIp( java.lang.String userIp )
            {
                return ( Update ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getOrderId()
            {
                return orderId;
            }

            public Update setOrderId( java.lang.Long orderId )
            {
                this.orderId = orderId;
                return this;
            }

            @Override
            public Update set( String parameterName, Object value )
            {
                return ( Update ) super.set( parameterName, value );
            }
        }

        /**
         * The "invoices" collection of methods.
         */
        public class Invoices
        {

            /**
             * Create a request for the method "invoices.delete".
             * <p>
             * This request holds the parameters needed by the billing server.  After setting any optional
             * parameters, call the {@link Delete#execute()} method to invoke the remote operation.
             *
             * @param orderId
             * @param invoiceId
             * @return the request
             */
            public Delete delete( java.lang.Long orderId, java.lang.Long invoiceId ) throws java.io.IOException
            {
                Delete result = new Delete( orderId, invoiceId );
                initialize( result );
                return result;
            }

            /**
             * Create a request for the method "invoices.get".
             * <p>
             * This request holds the parameters needed by the billing server.  After setting any optional
             * parameters, call the {@link Get#execute()} method to invoke the remote operation.
             *
             * @param orderId
             * @param invoiceId
             * @return the request
             */
            public Get get( java.lang.Long orderId, java.lang.Long invoiceId ) throws java.io.IOException
            {
                Get result = new Get( orderId, invoiceId );
                initialize( result );
                return result;
            }

            /**
             * Create a request for the method "invoices.insert".
             * <p>
             * This request holds the parameters needed by the billing server.  After setting any optional
             * parameters, call the {@link Insert#execute()} method to invoke the remote operation.
             *
             * @param orderId
             * @param content the {@link biz.turnonline.ecosystem.billing.model.Invoice}
             * @return the request
             */
            public Insert insert( java.lang.Long orderId, biz.turnonline.ecosystem.billing.model.Invoice content )
                    throws java.io.IOException
            {
                Insert result = new Insert( orderId, content );
                initialize( result );
                return result;
            }

            /**
             * Create a request for the method "invoices.list".
             * <p>
             * This request holds the parameters needed by the billing server.  After setting any optional
             * parameters, call the {@link List#execute()} method to invoke the remote operation.
             *
             * @param orderId
             * @return the request
             */
            public List list( java.lang.Long orderId ) throws java.io.IOException
            {
                List result = new List( orderId );
                initialize( result );
                return result;
            }

            /**
             * Create a request for the method "invoices.update".
             * <p>
             * This request holds the parameters needed by the billing server.  After setting any optional
             * parameters, call the {@link Update#execute()} method to invoke the remote operation.
             *
             * @param orderId
             * @param invoiceId
             * @param content   the {@link biz.turnonline.ecosystem.billing.model.Invoice}
             * @return the request
             */
            public Update update( java.lang.Long orderId,
                                  java.lang.Long invoiceId,
                                  biz.turnonline.ecosystem.billing.model.Invoice content ) throws java.io.IOException
            {
                Update result = new Update( orderId, invoiceId, content );
                initialize( result );
                return result;
            }

            /**
             * An accessor for creating requests from the Items collection.
             *
             * <p>The typical use is:</p>
             * <pre>
             *   {@code ProductBilling billing = new ProductBilling(...);}
             *   {@code ProductBilling.Items.List request = billing.items().list(parameters ...)}
             * </pre>
             *
             * @return the resource collection
             */
            public Items items()
            {
                return new Items();
            }

            /**
             * An accessor for creating requests from the Status collection.
             *
             * <p>The typical use is:</p>
             * <pre>
             *   {@code ProductBilling billing = new ProductBilling(...);}
             *   {@code ProductBilling.Status.List request = billing.status().list(parameters ...)}
             * </pre>
             *
             * @return the resource collection
             */
            public Status status()
            {
                return new Status();
            }

            public class Delete
                    extends ProductBillingRequest<Void>
            {

                private static final String REST_PATH = "orders/{order_id}/invoices/{invoice_id}";

                @com.google.api.client.util.Key( "order_id" )
                private java.lang.Long orderId;

                @com.google.api.client.util.Key( "invoice_id" )
                private java.lang.Long invoiceId;

                /**
                 * Create a request for the method "invoices.delete".
                 * <p>
                 * This request holds the parameters needed by the the billing server.  After setting any optional
                 * parameters, call the {@link Delete#execute()} method to invoke the remote operation. <p> {@link
                 * Delete#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
                 * be called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @param orderId
                 * @param invoiceId
                 * @since 1.13
                 */
                protected Delete( java.lang.Long orderId, java.lang.Long invoiceId )
                {
                    super( ProductBilling.this, "DELETE", REST_PATH, null, Void.class );
                    this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                    this.invoiceId = com.google.api.client.util.Preconditions.checkNotNull( invoiceId, "Required parameter invoiceId must be specified." );
                }

                @Override
                public Delete setAlt( java.lang.String alt )
                {
                    return ( Delete ) super.setAlt( alt );
                }

                @Override
                public Delete setFields( java.lang.String fields )
                {
                    return ( Delete ) super.setFields( fields );
                }

                @Override
                public Delete setKey( java.lang.String key )
                {
                    return ( Delete ) super.setKey( key );
                }

                @Override
                public Delete setOauthToken( java.lang.String oauthToken )
                {
                    return ( Delete ) super.setOauthToken( oauthToken );
                }

                @Override
                public Delete setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( Delete ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public Delete setQuotaUser( java.lang.String quotaUser )
                {
                    return ( Delete ) super.setQuotaUser( quotaUser );
                }

                @Override
                public Delete setUserIp( java.lang.String userIp )
                {
                    return ( Delete ) super.setUserIp( userIp );
                }

                /**
                 *
                 */
                public java.lang.Long getOrderId()
                {
                    return orderId;
                }

                public Delete setOrderId( java.lang.Long orderId )
                {
                    this.orderId = orderId;
                    return this;
                }

                /**
                 *
                 */
                public java.lang.Long getInvoiceId()
                {
                    return invoiceId;
                }

                public Delete setInvoiceId( java.lang.Long invoiceId )
                {
                    this.invoiceId = invoiceId;
                    return this;
                }

                @Override
                public Delete set( String parameterName, Object value )
                {
                    return ( Delete ) super.set( parameterName, value );
                }
            }

            public class Get
                    extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.Invoice>
            {

                private static final String REST_PATH = "orders/{order_id}/invoices/{invoice_id}";

                @com.google.api.client.util.Key( "order_id" )
                private java.lang.Long orderId;

                @com.google.api.client.util.Key( "invoice_id" )
                private java.lang.Long invoiceId;

                /**
                 * Create a request for the method "invoices.get".
                 * <p>
                 * This request holds the parameters needed by the the billing server.  After setting any optional
                 * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
                 * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
                 * called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @param orderId
                 * @param invoiceId
                 * @since 1.13
                 */
                protected Get( java.lang.Long orderId, java.lang.Long invoiceId )
                {
                    super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.Invoice.class );
                    this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                    this.invoiceId = com.google.api.client.util.Preconditions.checkNotNull( invoiceId, "Required parameter invoiceId must be specified." );
                }

                @Override
                public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
                {
                    return super.executeUsingHead();
                }

                @Override
                public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
                {
                    return super.buildHttpRequestUsingHead();
                }

                @Override
                public Get setAlt( java.lang.String alt )
                {
                    return ( Get ) super.setAlt( alt );
                }

                @Override
                public Get setFields( java.lang.String fields )
                {
                    return ( Get ) super.setFields( fields );
                }

                @Override
                public Get setKey( java.lang.String key )
                {
                    return ( Get ) super.setKey( key );
                }

                @Override
                public Get setOauthToken( java.lang.String oauthToken )
                {
                    return ( Get ) super.setOauthToken( oauthToken );
                }

                @Override
                public Get setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( Get ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public Get setQuotaUser( java.lang.String quotaUser )
                {
                    return ( Get ) super.setQuotaUser( quotaUser );
                }

                @Override
                public Get setUserIp( java.lang.String userIp )
                {
                    return ( Get ) super.setUserIp( userIp );
                }

                /**
                 *
                 */
                public java.lang.Long getOrderId()
                {
                    return orderId;
                }

                public Get setOrderId( java.lang.Long orderId )
                {
                    this.orderId = orderId;
                    return this;
                }

                /**
                 *
                 */
                public java.lang.Long getInvoiceId()
                {
                    return invoiceId;
                }

                public Get setInvoiceId( java.lang.Long invoiceId )
                {
                    this.invoiceId = invoiceId;
                    return this;
                }

                @Override
                public Get set( String parameterName, Object value )
                {
                    return ( Get ) super.set( parameterName, value );
                }
            }

            public class Insert
                    extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.Invoice>
            {

                private static final String REST_PATH = "orders/{order_id}/invoices";

                @com.google.api.client.util.Key( "order_id" )
                private java.lang.Long orderId;

                /**
                 * Create a request for the method "invoices.insert".
                 * <p>
                 * This request holds the parameters needed by the the billing server.  After setting any optional
                 * parameters, call the {@link Insert#execute()} method to invoke the remote operation. <p> {@link
                 * Insert#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
                 * be called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @param orderId
                 * @param content the {@link biz.turnonline.ecosystem.billing.model.Invoice}
                 * @since 1.13
                 */
                protected Insert( java.lang.Long orderId, biz.turnonline.ecosystem.billing.model.Invoice content )
                {
                    super( ProductBilling.this, "POST", REST_PATH, content, biz.turnonline.ecosystem.billing.model.Invoice.class );
                    this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                }

                @Override
                public Insert setAlt( java.lang.String alt )
                {
                    return ( Insert ) super.setAlt( alt );
                }

                @Override
                public Insert setFields( java.lang.String fields )
                {
                    return ( Insert ) super.setFields( fields );
                }

                @Override
                public Insert setKey( java.lang.String key )
                {
                    return ( Insert ) super.setKey( key );
                }

                @Override
                public Insert setOauthToken( java.lang.String oauthToken )
                {
                    return ( Insert ) super.setOauthToken( oauthToken );
                }

                @Override
                public Insert setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( Insert ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public Insert setQuotaUser( java.lang.String quotaUser )
                {
                    return ( Insert ) super.setQuotaUser( quotaUser );
                }

                @Override
                public Insert setUserIp( java.lang.String userIp )
                {
                    return ( Insert ) super.setUserIp( userIp );
                }

                /**
                 *
                 */
                public java.lang.Long getOrderId()
                {
                    return orderId;
                }

                public Insert setOrderId( java.lang.Long orderId )
                {
                    this.orderId = orderId;
                    return this;
                }

                @Override
                public Insert set( String parameterName, Object value )
                {
                    return ( Insert ) super.set( parameterName, value );
                }
            }

            public class List
                    extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.InvoiceCollection>
            {

                private static final String REST_PATH = "orders/{order_id}/invoices";

                @com.google.api.client.util.Key( "order_id" )
                private java.lang.Long orderId;

                @com.google.api.client.util.Key
                private java.lang.Boolean lightList;

                @com.google.api.client.util.Key
                private java.lang.Integer offset;

                @com.google.api.client.util.Key
                private java.lang.Integer limit;

                /**
                 * Create a request for the method "invoices.list".
                 * <p>
                 * This request holds the parameters needed by the the billing server.  After setting any optional
                 * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
                 * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
                 * called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @param orderId
                 * @since 1.13
                 */
                protected List( java.lang.Long orderId )
                {
                    super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.InvoiceCollection.class );
                    this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                }

                @Override
                public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
                {
                    return super.executeUsingHead();
                }

                @Override
                public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
                {
                    return super.buildHttpRequestUsingHead();
                }

                @Override
                public List setAlt( java.lang.String alt )
                {
                    return ( List ) super.setAlt( alt );
                }

                @Override
                public List setFields( java.lang.String fields )
                {
                    return ( List ) super.setFields( fields );
                }

                @Override
                public List setKey( java.lang.String key )
                {
                    return ( List ) super.setKey( key );
                }

                @Override
                public List setOauthToken( java.lang.String oauthToken )
                {
                    return ( List ) super.setOauthToken( oauthToken );
                }

                @Override
                public List setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( List ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public List setQuotaUser( java.lang.String quotaUser )
                {
                    return ( List ) super.setQuotaUser( quotaUser );
                }

                @Override
                public List setUserIp( java.lang.String userIp )
                {
                    return ( List ) super.setUserIp( userIp );
                }

                /**
                 *
                 */
                public java.lang.Long getOrderId()
                {
                    return orderId;
                }

                public List setOrderId( java.lang.Long orderId )
                {
                    this.orderId = orderId;
                    return this;
                }

                /**
                 * [ default: false]
                 * [
                 */
                public java.lang.Boolean getLightList()
                {
                    return lightList;
                }

                /**
                 * Convenience method that returns only {@link Boolean#TRUE} or {@link Boolean#FALSE}.
                 *
                 * <p>
                 * Boolean properties can have four possible values:
                 * {@code null}, {@link com.google.api.client.util.Data#NULL_BOOLEAN}, {@link Boolean#TRUE}
                 * or {@link Boolean#FALSE}.
                 * </p>
                 *
                 * <p>
                 * This method returns {@link Boolean#TRUE} if the default of the property is {@link Boolean#TRUE}
                 * and it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
                 * {@link Boolean#FALSE} is returned if the default of the property is {@link Boolean#FALSE} and
                 * it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
                 * </p>
                 *
                 * <p>
                 *
                 * </p>
                 */
                public boolean isLightList()
                {
                    if ( lightList == null || lightList == com.google.api.client.util.Data.NULL_BOOLEAN )
                    {
                        return false;
                    }
                    return lightList;
                }

                public List setLightList( java.lang.Boolean lightList )
                {
                    this.lightList = lightList;
                    return this;
                }

                /**
                 * [ default: 0]
                 * [
                 */
                public java.lang.Integer getOffset()
                {
                    return offset;
                }

                public List setOffset( java.lang.Integer offset )
                {
                    this.offset = offset;
                    return this;
                }

                /**
                 * [ default: 10]
                 * [
                 */
                public java.lang.Integer getLimit()
                {
                    return limit;
                }

                public List setLimit( java.lang.Integer limit )
                {
                    this.limit = limit;
                    return this;
                }

                @Override
                public List set( String parameterName, Object value )
                {
                    return ( List ) super.set( parameterName, value );
                }
            }

            public class Update
                    extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.Invoice>
            {

                private static final String REST_PATH = "orders/{order_id}/invoices/{invoice_id}";

                @com.google.api.client.util.Key( "order_id" )
                private java.lang.Long orderId;

                @com.google.api.client.util.Key( "invoice_id" )
                private java.lang.Long invoiceId;

                /**
                 * Create a request for the method "invoices.update".
                 * <p>
                 * This request holds the parameters needed by the the billing server.  After setting any optional
                 * parameters, call the {@link Update#execute()} method to invoke the remote operation. <p> {@link
                 * Update#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
                 * be called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @param orderId
                 * @param invoiceId
                 * @param content   the {@link biz.turnonline.ecosystem.billing.model.Invoice}
                 * @since 1.13
                 */
                protected Update( java.lang.Long orderId,
                                  java.lang.Long invoiceId,
                                  biz.turnonline.ecosystem.billing.model.Invoice content )
                {
                    super( ProductBilling.this, "PUT", REST_PATH, content, biz.turnonline.ecosystem.billing.model.Invoice.class );
                    this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                    this.invoiceId = com.google.api.client.util.Preconditions.checkNotNull( invoiceId, "Required parameter invoiceId must be specified." );
                }

                @Override
                public Update setAlt( java.lang.String alt )
                {
                    return ( Update ) super.setAlt( alt );
                }

                @Override
                public Update setFields( java.lang.String fields )
                {
                    return ( Update ) super.setFields( fields );
                }

                @Override
                public Update setKey( java.lang.String key )
                {
                    return ( Update ) super.setKey( key );
                }

                @Override
                public Update setOauthToken( java.lang.String oauthToken )
                {
                    return ( Update ) super.setOauthToken( oauthToken );
                }

                @Override
                public Update setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( Update ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public Update setQuotaUser( java.lang.String quotaUser )
                {
                    return ( Update ) super.setQuotaUser( quotaUser );
                }

                @Override
                public Update setUserIp( java.lang.String userIp )
                {
                    return ( Update ) super.setUserIp( userIp );
                }

                /**
                 *
                 */
                public java.lang.Long getOrderId()
                {
                    return orderId;
                }

                public Update setOrderId( java.lang.Long orderId )
                {
                    this.orderId = orderId;
                    return this;
                }

                /**
                 *
                 */
                public java.lang.Long getInvoiceId()
                {
                    return invoiceId;
                }

                public Update setInvoiceId( java.lang.Long invoiceId )
                {
                    this.invoiceId = invoiceId;
                    return this;
                }

                @Override
                public Update set( String parameterName, Object value )
                {
                    return ( Update ) super.set( parameterName, value );
                }
            }

            /**
             * The "items" collection of methods.
             */
            public class Items
            {

                /**
                 * Create a request for the method "items.delete".
                 * <p>
                 * This request holds the parameters needed by the billing server.  After setting any optional
                 * parameters, call the {@link Delete#execute()} method to invoke the remote operation.
                 *
                 * @param orderId
                 * @param invoiceId
                 * @param itemId
                 * @return the request
                 */
                public Delete delete( java.lang.Long orderId, java.lang.Long invoiceId, java.lang.Long itemId )
                        throws java.io.IOException
                {
                    Delete result = new Delete( orderId, invoiceId, itemId );
                    initialize( result );
                    return result;
                }

                /**
                 * Create a request for the method "items.get".
                 * <p>
                 * This request holds the parameters needed by the billing server.  After setting any optional
                 * parameters, call the {@link Get#execute()} method to invoke the remote operation.
                 *
                 * @param orderId
                 * @param invoiceId
                 * @param itemId
                 * @return the request
                 */
                public Get get( java.lang.Long orderId, java.lang.Long invoiceId, java.lang.Long itemId )
                        throws java.io.IOException
                {
                    Get result = new Get( orderId, invoiceId, itemId );
                    initialize( result );
                    return result;
                }

                /**
                 * Create a request for the method "items.insert".
                 * <p>
                 * This request holds the parameters needed by the billing server.  After setting any optional
                 * parameters, call the {@link Insert#execute()} method to invoke the remote operation.
                 *
                 * @param orderId
                 * @param invoiceId
                 * @param content   the {@link biz.turnonline.ecosystem.billing.model.PricingItem}
                 * @return the request
                 */
                public Insert insert( java.lang.Long orderId,
                                      java.lang.Long invoiceId,
                                      biz.turnonline.ecosystem.billing.model.PricingItem content )
                        throws java.io.IOException
                {
                    Insert result = new Insert( orderId, invoiceId, content );
                    initialize( result );
                    return result;
                }

                /**
                 * Create a request for the method "items.list".
                 * <p>
                 * This request holds the parameters needed by the billing server.  After setting any optional
                 * parameters, call the {@link List#execute()} method to invoke the remote operation.
                 *
                 * @param orderId
                 * @param invoiceId
                 * @return the request
                 */
                public List list( java.lang.Long orderId, java.lang.Long invoiceId ) throws java.io.IOException
                {
                    List result = new List( orderId, invoiceId );
                    initialize( result );
                    return result;
                }

                /**
                 * Create a request for the method "items.update".
                 * <p>
                 * This request holds the parameters needed by the billing server.  After setting any optional
                 * parameters, call the {@link Update#execute()} method to invoke the remote operation.
                 *
                 * @param orderId
                 * @param invoiceId
                 * @param itemId
                 * @param content   the {@link biz.turnonline.ecosystem.billing.model.PricingItem}
                 * @return the request
                 */
                public Update update( java.lang.Long orderId,
                                      java.lang.Long invoiceId,
                                      java.lang.Long itemId,
                                      biz.turnonline.ecosystem.billing.model.PricingItem content )
                        throws java.io.IOException
                {
                    Update result = new Update( orderId, invoiceId, itemId, content );
                    initialize( result );
                    return result;
                }

                public class Delete
                        extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.Pricing>
                {

                    private static final String REST_PATH = "orders/{order_id}/invoices/{invoice_id}/items/{item_id}";

                    @com.google.api.client.util.Key( "order_id" )
                    private java.lang.Long orderId;

                    @com.google.api.client.util.Key( "invoice_id" )
                    private java.lang.Long invoiceId;

                    @com.google.api.client.util.Key( "item_id" )
                    private java.lang.Long itemId;

                    /**
                     * Create a request for the method "items.delete".
                     * <p>
                     * This request holds the parameters needed by the the billing server.  After setting any optional
                     * parameters, call the {@link Delete#execute()} method to invoke the remote operation. <p> {@link
                     * Delete#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
                     * be called to initialize this instance immediately after invoking the constructor. </p>
                     *
                     * @param orderId
                     * @param invoiceId
                     * @param itemId
                     * @since 1.13
                     */
                    protected Delete( java.lang.Long orderId, java.lang.Long invoiceId, java.lang.Long itemId )
                    {
                        super( ProductBilling.this, "DELETE", REST_PATH, null, biz.turnonline.ecosystem.billing.model.Pricing.class );
                        this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                        this.invoiceId = com.google.api.client.util.Preconditions.checkNotNull( invoiceId, "Required parameter invoiceId must be specified." );
                        this.itemId = com.google.api.client.util.Preconditions.checkNotNull( itemId, "Required parameter itemId must be specified." );
                    }

                    @Override
                    public Delete setAlt( java.lang.String alt )
                    {
                        return ( Delete ) super.setAlt( alt );
                    }

                    @Override
                    public Delete setFields( java.lang.String fields )
                    {
                        return ( Delete ) super.setFields( fields );
                    }

                    @Override
                    public Delete setKey( java.lang.String key )
                    {
                        return ( Delete ) super.setKey( key );
                    }

                    @Override
                    public Delete setOauthToken( java.lang.String oauthToken )
                    {
                        return ( Delete ) super.setOauthToken( oauthToken );
                    }

                    @Override
                    public Delete setPrettyPrint( java.lang.Boolean prettyPrint )
                    {
                        return ( Delete ) super.setPrettyPrint( prettyPrint );
                    }

                    @Override
                    public Delete setQuotaUser( java.lang.String quotaUser )
                    {
                        return ( Delete ) super.setQuotaUser( quotaUser );
                    }

                    @Override
                    public Delete setUserIp( java.lang.String userIp )
                    {
                        return ( Delete ) super.setUserIp( userIp );
                    }

                    /**
                     *
                     */
                    public java.lang.Long getOrderId()
                    {
                        return orderId;
                    }

                    public Delete setOrderId( java.lang.Long orderId )
                    {
                        this.orderId = orderId;
                        return this;
                    }

                    /**
                     *
                     */
                    public java.lang.Long getInvoiceId()
                    {
                        return invoiceId;
                    }

                    public Delete setInvoiceId( java.lang.Long invoiceId )
                    {
                        this.invoiceId = invoiceId;
                        return this;
                    }

                    /**
                     *
                     */
                    public java.lang.Long getItemId()
                    {
                        return itemId;
                    }

                    public Delete setItemId( java.lang.Long itemId )
                    {
                        this.itemId = itemId;
                        return this;
                    }

                    @Override
                    public Delete set( String parameterName, Object value )
                    {
                        return ( Delete ) super.set( parameterName, value );
                    }
                }

                public class Get
                        extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.PricingItem>
                {

                    private static final String REST_PATH = "orders/{order_id}/invoices/{invoice_id}/items/{item_id}";

                    @com.google.api.client.util.Key( "order_id" )
                    private java.lang.Long orderId;

                    @com.google.api.client.util.Key( "invoice_id" )
                    private java.lang.Long invoiceId;

                    @com.google.api.client.util.Key( "item_id" )
                    private java.lang.Long itemId;

                    /**
                     * Create a request for the method "items.get".
                     * <p>
                     * This request holds the parameters needed by the the billing server.  After setting any optional
                     * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
                     * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
                     * called to initialize this instance immediately after invoking the constructor. </p>
                     *
                     * @param orderId
                     * @param invoiceId
                     * @param itemId
                     * @since 1.13
                     */
                    protected Get( java.lang.Long orderId, java.lang.Long invoiceId, java.lang.Long itemId )
                    {
                        super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.PricingItem.class );
                        this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                        this.invoiceId = com.google.api.client.util.Preconditions.checkNotNull( invoiceId, "Required parameter invoiceId must be specified." );
                        this.itemId = com.google.api.client.util.Preconditions.checkNotNull( itemId, "Required parameter itemId must be specified." );
                    }

                    @Override
                    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
                    {
                        return super.executeUsingHead();
                    }

                    @Override
                    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
                    {
                        return super.buildHttpRequestUsingHead();
                    }

                    @Override
                    public Get setAlt( java.lang.String alt )
                    {
                        return ( Get ) super.setAlt( alt );
                    }

                    @Override
                    public Get setFields( java.lang.String fields )
                    {
                        return ( Get ) super.setFields( fields );
                    }

                    @Override
                    public Get setKey( java.lang.String key )
                    {
                        return ( Get ) super.setKey( key );
                    }

                    @Override
                    public Get setOauthToken( java.lang.String oauthToken )
                    {
                        return ( Get ) super.setOauthToken( oauthToken );
                    }

                    @Override
                    public Get setPrettyPrint( java.lang.Boolean prettyPrint )
                    {
                        return ( Get ) super.setPrettyPrint( prettyPrint );
                    }

                    @Override
                    public Get setQuotaUser( java.lang.String quotaUser )
                    {
                        return ( Get ) super.setQuotaUser( quotaUser );
                    }

                    @Override
                    public Get setUserIp( java.lang.String userIp )
                    {
                        return ( Get ) super.setUserIp( userIp );
                    }

                    /**
                     *
                     */
                    public java.lang.Long getOrderId()
                    {
                        return orderId;
                    }

                    public Get setOrderId( java.lang.Long orderId )
                    {
                        this.orderId = orderId;
                        return this;
                    }

                    /**
                     *
                     */
                    public java.lang.Long getInvoiceId()
                    {
                        return invoiceId;
                    }

                    public Get setInvoiceId( java.lang.Long invoiceId )
                    {
                        this.invoiceId = invoiceId;
                        return this;
                    }

                    /**
                     *
                     */
                    public java.lang.Long getItemId()
                    {
                        return itemId;
                    }

                    public Get setItemId( java.lang.Long itemId )
                    {
                        this.itemId = itemId;
                        return this;
                    }

                    @Override
                    public Get set( String parameterName, Object value )
                    {
                        return ( Get ) super.set( parameterName, value );
                    }
                }

                public class Insert
                        extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.Pricing>
                {

                    private static final String REST_PATH = "orders/{order_id}/invoices/{invoice_id}/items";

                    @com.google.api.client.util.Key( "order_id" )
                    private java.lang.Long orderId;

                    @com.google.api.client.util.Key( "invoice_id" )
                    private java.lang.Long invoiceId;

                    /**
                     * Create a request for the method "items.insert".
                     * <p>
                     * This request holds the parameters needed by the the billing server.  After setting any optional
                     * parameters, call the {@link Insert#execute()} method to invoke the remote operation. <p> {@link
                     * Insert#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
                     * be called to initialize this instance immediately after invoking the constructor. </p>
                     *
                     * @param orderId
                     * @param invoiceId
                     * @param content   the {@link biz.turnonline.ecosystem.billing.model.PricingItem}
                     * @since 1.13
                     */
                    protected Insert( java.lang.Long orderId,
                                      java.lang.Long invoiceId,
                                      biz.turnonline.ecosystem.billing.model.PricingItem content )
                    {
                        super( ProductBilling.this, "POST", REST_PATH, content, biz.turnonline.ecosystem.billing.model.Pricing.class );
                        this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                        this.invoiceId = com.google.api.client.util.Preconditions.checkNotNull( invoiceId, "Required parameter invoiceId must be specified." );
                    }

                    @Override
                    public Insert setAlt( java.lang.String alt )
                    {
                        return ( Insert ) super.setAlt( alt );
                    }

                    @Override
                    public Insert setFields( java.lang.String fields )
                    {
                        return ( Insert ) super.setFields( fields );
                    }

                    @Override
                    public Insert setKey( java.lang.String key )
                    {
                        return ( Insert ) super.setKey( key );
                    }

                    @Override
                    public Insert setOauthToken( java.lang.String oauthToken )
                    {
                        return ( Insert ) super.setOauthToken( oauthToken );
                    }

                    @Override
                    public Insert setPrettyPrint( java.lang.Boolean prettyPrint )
                    {
                        return ( Insert ) super.setPrettyPrint( prettyPrint );
                    }

                    @Override
                    public Insert setQuotaUser( java.lang.String quotaUser )
                    {
                        return ( Insert ) super.setQuotaUser( quotaUser );
                    }

                    @Override
                    public Insert setUserIp( java.lang.String userIp )
                    {
                        return ( Insert ) super.setUserIp( userIp );
                    }

                    /**
                     *
                     */
                    public java.lang.Long getOrderId()
                    {
                        return orderId;
                    }

                    public Insert setOrderId( java.lang.Long orderId )
                    {
                        this.orderId = orderId;
                        return this;
                    }

                    /**
                     *
                     */
                    public java.lang.Long getInvoiceId()
                    {
                        return invoiceId;
                    }

                    public Insert setInvoiceId( java.lang.Long invoiceId )
                    {
                        this.invoiceId = invoiceId;
                        return this;
                    }

                    @Override
                    public Insert set( String parameterName, Object value )
                    {
                        return ( Insert ) super.set( parameterName, value );
                    }
                }

                public class List
                        extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.PricingItemCollection>
                {

                    private static final String REST_PATH = "orders/{order_id}/invoices/{invoice_id}/items";

                    @com.google.api.client.util.Key( "order_id" )
                    private java.lang.Long orderId;

                    @com.google.api.client.util.Key( "invoice_id" )
                    private java.lang.Long invoiceId;

                    /**
                     * Create a request for the method "items.list".
                     * <p>
                     * This request holds the parameters needed by the the billing server.  After setting any optional
                     * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
                     * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
                     * called to initialize this instance immediately after invoking the constructor. </p>
                     *
                     * @param orderId
                     * @param invoiceId
                     * @since 1.13
                     */
                    protected List( java.lang.Long orderId, java.lang.Long invoiceId )
                    {
                        super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.PricingItemCollection.class );
                        this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                        this.invoiceId = com.google.api.client.util.Preconditions.checkNotNull( invoiceId, "Required parameter invoiceId must be specified." );
                    }

                    @Override
                    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
                    {
                        return super.executeUsingHead();
                    }

                    @Override
                    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
                    {
                        return super.buildHttpRequestUsingHead();
                    }

                    @Override
                    public List setAlt( java.lang.String alt )
                    {
                        return ( List ) super.setAlt( alt );
                    }

                    @Override
                    public List setFields( java.lang.String fields )
                    {
                        return ( List ) super.setFields( fields );
                    }

                    @Override
                    public List setKey( java.lang.String key )
                    {
                        return ( List ) super.setKey( key );
                    }

                    @Override
                    public List setOauthToken( java.lang.String oauthToken )
                    {
                        return ( List ) super.setOauthToken( oauthToken );
                    }

                    @Override
                    public List setPrettyPrint( java.lang.Boolean prettyPrint )
                    {
                        return ( List ) super.setPrettyPrint( prettyPrint );
                    }

                    @Override
                    public List setQuotaUser( java.lang.String quotaUser )
                    {
                        return ( List ) super.setQuotaUser( quotaUser );
                    }

                    @Override
                    public List setUserIp( java.lang.String userIp )
                    {
                        return ( List ) super.setUserIp( userIp );
                    }

                    /**
                     *
                     */
                    public java.lang.Long getOrderId()
                    {
                        return orderId;
                    }

                    public List setOrderId( java.lang.Long orderId )
                    {
                        this.orderId = orderId;
                        return this;
                    }

                    /**
                     *
                     */
                    public java.lang.Long getInvoiceId()
                    {
                        return invoiceId;
                    }

                    public List setInvoiceId( java.lang.Long invoiceId )
                    {
                        this.invoiceId = invoiceId;
                        return this;
                    }

                    @Override
                    public List set( String parameterName, Object value )
                    {
                        return ( List ) super.set( parameterName, value );
                    }
                }

                public class Update
                        extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.Pricing>
                {

                    private static final String REST_PATH = "orders/{order_id}/invoices/{invoice_id}/items/{item_id}";

                    @com.google.api.client.util.Key( "order_id" )
                    private java.lang.Long orderId;

                    @com.google.api.client.util.Key( "invoice_id" )
                    private java.lang.Long invoiceId;

                    @com.google.api.client.util.Key( "item_id" )
                    private java.lang.Long itemId;

                    /**
                     * Create a request for the method "items.update".
                     * <p>
                     * This request holds the parameters needed by the the billing server.  After setting any optional
                     * parameters, call the {@link Update#execute()} method to invoke the remote operation. <p> {@link
                     * Update#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
                     * be called to initialize this instance immediately after invoking the constructor. </p>
                     *
                     * @param orderId
                     * @param invoiceId
                     * @param itemId
                     * @param content   the {@link biz.turnonline.ecosystem.billing.model.PricingItem}
                     * @since 1.13
                     */
                    protected Update( java.lang.Long orderId,
                                      java.lang.Long invoiceId,
                                      java.lang.Long itemId,
                                      biz.turnonline.ecosystem.billing.model.PricingItem content )
                    {
                        super( ProductBilling.this, "PUT", REST_PATH, content, biz.turnonline.ecosystem.billing.model.Pricing.class );
                        this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                        this.invoiceId = com.google.api.client.util.Preconditions.checkNotNull( invoiceId, "Required parameter invoiceId must be specified." );
                        this.itemId = com.google.api.client.util.Preconditions.checkNotNull( itemId, "Required parameter itemId must be specified." );
                    }

                    @Override
                    public Update setAlt( java.lang.String alt )
                    {
                        return ( Update ) super.setAlt( alt );
                    }

                    @Override
                    public Update setFields( java.lang.String fields )
                    {
                        return ( Update ) super.setFields( fields );
                    }

                    @Override
                    public Update setKey( java.lang.String key )
                    {
                        return ( Update ) super.setKey( key );
                    }

                    @Override
                    public Update setOauthToken( java.lang.String oauthToken )
                    {
                        return ( Update ) super.setOauthToken( oauthToken );
                    }

                    @Override
                    public Update setPrettyPrint( java.lang.Boolean prettyPrint )
                    {
                        return ( Update ) super.setPrettyPrint( prettyPrint );
                    }

                    @Override
                    public Update setQuotaUser( java.lang.String quotaUser )
                    {
                        return ( Update ) super.setQuotaUser( quotaUser );
                    }

                    @Override
                    public Update setUserIp( java.lang.String userIp )
                    {
                        return ( Update ) super.setUserIp( userIp );
                    }

                    /**
                     *
                     */
                    public java.lang.Long getOrderId()
                    {
                        return orderId;
                    }

                    public Update setOrderId( java.lang.Long orderId )
                    {
                        this.orderId = orderId;
                        return this;
                    }

                    /**
                     *
                     */
                    public java.lang.Long getInvoiceId()
                    {
                        return invoiceId;
                    }

                    public Update setInvoiceId( java.lang.Long invoiceId )
                    {
                        this.invoiceId = invoiceId;
                        return this;
                    }

                    /**
                     *
                     */
                    public java.lang.Long getItemId()
                    {
                        return itemId;
                    }

                    public Update setItemId( java.lang.Long itemId )
                    {
                        this.itemId = itemId;
                        return this;
                    }

                    @Override
                    public Update set( String parameterName, Object value )
                    {
                        return ( Update ) super.set( parameterName, value );
                    }
                }

            }

            /**
             * The "status" collection of methods.
             */
            public class Status
            {

                /**
                 * Create a request for the method "status.get".
                 * <p>
                 * This request holds the parameters needed by the billing server.  After setting any optional
                 * parameters, call the {@link Get#execute()} method to invoke the remote operation.
                 *
                 * @param orderId
                 * @param invoiceId
                 * @return the request
                 */
                public Get get( java.lang.Long orderId, java.lang.Long invoiceId ) throws java.io.IOException
                {
                    Get result = new Get( orderId, invoiceId );
                    initialize( result );
                    return result;
                }

                public class Get
                        extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.InvoiceStatus>
                {

                    private static final String REST_PATH = "orders/{order_id}/invoices/{invoice_id}/status";

                    @com.google.api.client.util.Key( "order_id" )
                    private java.lang.Long orderId;

                    @com.google.api.client.util.Key( "invoice_id" )
                    private java.lang.Long invoiceId;

                    /**
                     * Create a request for the method "status.get".
                     * <p>
                     * This request holds the parameters needed by the the billing server.  After setting any optional
                     * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
                     * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
                     * called to initialize this instance immediately after invoking the constructor. </p>
                     *
                     * @param orderId
                     * @param invoiceId
                     * @since 1.13
                     */
                    protected Get( java.lang.Long orderId, java.lang.Long invoiceId )
                    {
                        super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.InvoiceStatus.class );
                        this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                        this.invoiceId = com.google.api.client.util.Preconditions.checkNotNull( invoiceId, "Required parameter invoiceId must be specified." );
                    }

                    @Override
                    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
                    {
                        return super.executeUsingHead();
                    }

                    @Override
                    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
                    {
                        return super.buildHttpRequestUsingHead();
                    }

                    @Override
                    public Get setAlt( java.lang.String alt )
                    {
                        return ( Get ) super.setAlt( alt );
                    }

                    @Override
                    public Get setFields( java.lang.String fields )
                    {
                        return ( Get ) super.setFields( fields );
                    }

                    @Override
                    public Get setKey( java.lang.String key )
                    {
                        return ( Get ) super.setKey( key );
                    }

                    @Override
                    public Get setOauthToken( java.lang.String oauthToken )
                    {
                        return ( Get ) super.setOauthToken( oauthToken );
                    }

                    @Override
                    public Get setPrettyPrint( java.lang.Boolean prettyPrint )
                    {
                        return ( Get ) super.setPrettyPrint( prettyPrint );
                    }

                    @Override
                    public Get setQuotaUser( java.lang.String quotaUser )
                    {
                        return ( Get ) super.setQuotaUser( quotaUser );
                    }

                    @Override
                    public Get setUserIp( java.lang.String userIp )
                    {
                        return ( Get ) super.setUserIp( userIp );
                    }

                    /**
                     *
                     */
                    public java.lang.Long getOrderId()
                    {
                        return orderId;
                    }

                    public Get setOrderId( java.lang.Long orderId )
                    {
                        this.orderId = orderId;
                        return this;
                    }

                    /**
                     *
                     */
                    public java.lang.Long getInvoiceId()
                    {
                        return invoiceId;
                    }

                    public Get setInvoiceId( java.lang.Long invoiceId )
                    {
                        this.invoiceId = invoiceId;
                        return this;
                    }

                    @Override
                    public Get set( String parameterName, Object value )
                    {
                        return ( Get ) super.set( parameterName, value );
                    }
                }

            }
        }

        /**
         * The "items" collection of methods.
         */
        public class Items
        {

            /**
             * Create a request for the method "items.delete".
             * <p>
             * This request holds the parameters needed by the billing server.  After setting any optional
             * parameters, call the {@link Delete#execute()} method to invoke the remote operation.
             *
             * @param orderId
             * @param itemId
             * @return the request
             */
            public Delete delete( java.lang.Long orderId, java.lang.Long itemId ) throws java.io.IOException
            {
                Delete result = new Delete( orderId, itemId );
                initialize( result );
                return result;
            }

            /**
             * Create a request for the method "items.get".
             * <p>
             * This request holds the parameters needed by the billing server.  After setting any optional
             * parameters, call the {@link Get#execute()} method to invoke the remote operation.
             *
             * @param orderId
             * @param itemId
             * @return the request
             */
            public Get get( java.lang.Long orderId, java.lang.Long itemId ) throws java.io.IOException
            {
                Get result = new Get( orderId, itemId );
                initialize( result );
                return result;
            }

            /**
             * Create a request for the method "items.insert".
             * <p>
             * This request holds the parameters needed by the billing server.  After setting any optional
             * parameters, call the {@link Insert#execute()} method to invoke the remote operation.
             *
             * @param orderId
             * @param content the {@link biz.turnonline.ecosystem.billing.model.PricingItem}
             * @return the request
             */
            public Insert insert( java.lang.Long orderId, biz.turnonline.ecosystem.billing.model.PricingItem content )
                    throws java.io.IOException
            {
                Insert result = new Insert( orderId, content );
                initialize( result );
                return result;
            }

            /**
             * Create a request for the method "items.list".
             * <p>
             * This request holds the parameters needed by the billing server.  After setting any optional
             * parameters, call the {@link List#execute()} method to invoke the remote operation.
             *
             * @param orderId
             * @return the request
             */
            public List list( java.lang.Long orderId ) throws java.io.IOException
            {
                List result = new List( orderId );
                initialize( result );
                return result;
            }

            /**
             * Create a request for the method "items.update".
             * <p>
             * This request holds the parameters needed by the billing server.  After setting any optional
             * parameters, call the {@link Update#execute()} method to invoke the remote operation.
             *
             * @param orderId
             * @param itemId
             * @param content the {@link biz.turnonline.ecosystem.billing.model.PricingItem}
             * @return the request
             */
            public Update update( java.lang.Long orderId,
                                  java.lang.Long itemId,
                                  biz.turnonline.ecosystem.billing.model.PricingItem content )
                    throws java.io.IOException
            {
                Update result = new Update( orderId, itemId, content );
                initialize( result );
                return result;
            }

            public class Delete
                    extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.Pricing>
            {

                private static final String REST_PATH = "orders/{order_id}/items/{item_id}";

                @com.google.api.client.util.Key( "order_id" )
                private java.lang.Long orderId;

                @com.google.api.client.util.Key( "item_id" )
                private java.lang.Long itemId;

                /**
                 * Create a request for the method "items.delete".
                 * <p>
                 * This request holds the parameters needed by the the billing server.  After setting any optional
                 * parameters, call the {@link Delete#execute()} method to invoke the remote operation. <p> {@link
                 * Delete#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
                 * be called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @param orderId
                 * @param itemId
                 * @since 1.13
                 */
                protected Delete( java.lang.Long orderId, java.lang.Long itemId )
                {
                    super( ProductBilling.this, "DELETE", REST_PATH, null, biz.turnonline.ecosystem.billing.model.Pricing.class );
                    this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                    this.itemId = com.google.api.client.util.Preconditions.checkNotNull( itemId, "Required parameter itemId must be specified." );
                }

                @Override
                public Delete setAlt( java.lang.String alt )
                {
                    return ( Delete ) super.setAlt( alt );
                }

                @Override
                public Delete setFields( java.lang.String fields )
                {
                    return ( Delete ) super.setFields( fields );
                }

                @Override
                public Delete setKey( java.lang.String key )
                {
                    return ( Delete ) super.setKey( key );
                }

                @Override
                public Delete setOauthToken( java.lang.String oauthToken )
                {
                    return ( Delete ) super.setOauthToken( oauthToken );
                }

                @Override
                public Delete setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( Delete ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public Delete setQuotaUser( java.lang.String quotaUser )
                {
                    return ( Delete ) super.setQuotaUser( quotaUser );
                }

                @Override
                public Delete setUserIp( java.lang.String userIp )
                {
                    return ( Delete ) super.setUserIp( userIp );
                }

                /**
                 *
                 */
                public java.lang.Long getOrderId()
                {
                    return orderId;
                }

                public Delete setOrderId( java.lang.Long orderId )
                {
                    this.orderId = orderId;
                    return this;
                }

                /**
                 *
                 */
                public java.lang.Long getItemId()
                {
                    return itemId;
                }

                public Delete setItemId( java.lang.Long itemId )
                {
                    this.itemId = itemId;
                    return this;
                }

                @Override
                public Delete set( String parameterName, Object value )
                {
                    return ( Delete ) super.set( parameterName, value );
                }
            }

            public class Get
                    extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.PricingItem>
            {

                private static final String REST_PATH = "orders/{order_id}/items/{item_id}";

                @com.google.api.client.util.Key( "order_id" )
                private java.lang.Long orderId;

                @com.google.api.client.util.Key( "item_id" )
                private java.lang.Long itemId;

                /**
                 * Create a request for the method "items.get".
                 * <p>
                 * This request holds the parameters needed by the the billing server.  After setting any optional
                 * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
                 * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
                 * called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @param orderId
                 * @param itemId
                 * @since 1.13
                 */
                protected Get( java.lang.Long orderId, java.lang.Long itemId )
                {
                    super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.PricingItem.class );
                    this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                    this.itemId = com.google.api.client.util.Preconditions.checkNotNull( itemId, "Required parameter itemId must be specified." );
                }

                @Override
                public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
                {
                    return super.executeUsingHead();
                }

                @Override
                public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
                {
                    return super.buildHttpRequestUsingHead();
                }

                @Override
                public Get setAlt( java.lang.String alt )
                {
                    return ( Get ) super.setAlt( alt );
                }

                @Override
                public Get setFields( java.lang.String fields )
                {
                    return ( Get ) super.setFields( fields );
                }

                @Override
                public Get setKey( java.lang.String key )
                {
                    return ( Get ) super.setKey( key );
                }

                @Override
                public Get setOauthToken( java.lang.String oauthToken )
                {
                    return ( Get ) super.setOauthToken( oauthToken );
                }

                @Override
                public Get setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( Get ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public Get setQuotaUser( java.lang.String quotaUser )
                {
                    return ( Get ) super.setQuotaUser( quotaUser );
                }

                @Override
                public Get setUserIp( java.lang.String userIp )
                {
                    return ( Get ) super.setUserIp( userIp );
                }

                /**
                 *
                 */
                public java.lang.Long getOrderId()
                {
                    return orderId;
                }

                public Get setOrderId( java.lang.Long orderId )
                {
                    this.orderId = orderId;
                    return this;
                }

                /**
                 *
                 */
                public java.lang.Long getItemId()
                {
                    return itemId;
                }

                public Get setItemId( java.lang.Long itemId )
                {
                    this.itemId = itemId;
                    return this;
                }

                @Override
                public Get set( String parameterName, Object value )
                {
                    return ( Get ) super.set( parameterName, value );
                }
            }

            public class Insert
                    extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.Pricing>
            {

                private static final String REST_PATH = "orders/{order_id}/items";

                @com.google.api.client.util.Key( "order_id" )
                private java.lang.Long orderId;

                /**
                 * Create a request for the method "items.insert".
                 * <p>
                 * This request holds the parameters needed by the the billing server.  After setting any optional
                 * parameters, call the {@link Insert#execute()} method to invoke the remote operation. <p> {@link
                 * Insert#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
                 * be called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @param orderId
                 * @param content the {@link biz.turnonline.ecosystem.billing.model.PricingItem}
                 * @since 1.13
                 */
                protected Insert( java.lang.Long orderId, biz.turnonline.ecosystem.billing.model.PricingItem content )
                {
                    super( ProductBilling.this, "POST", REST_PATH, content, biz.turnonline.ecosystem.billing.model.Pricing.class );
                    this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                }

                @Override
                public Insert setAlt( java.lang.String alt )
                {
                    return ( Insert ) super.setAlt( alt );
                }

                @Override
                public Insert setFields( java.lang.String fields )
                {
                    return ( Insert ) super.setFields( fields );
                }

                @Override
                public Insert setKey( java.lang.String key )
                {
                    return ( Insert ) super.setKey( key );
                }

                @Override
                public Insert setOauthToken( java.lang.String oauthToken )
                {
                    return ( Insert ) super.setOauthToken( oauthToken );
                }

                @Override
                public Insert setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( Insert ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public Insert setQuotaUser( java.lang.String quotaUser )
                {
                    return ( Insert ) super.setQuotaUser( quotaUser );
                }

                @Override
                public Insert setUserIp( java.lang.String userIp )
                {
                    return ( Insert ) super.setUserIp( userIp );
                }

                /**
                 *
                 */
                public java.lang.Long getOrderId()
                {
                    return orderId;
                }

                public Insert setOrderId( java.lang.Long orderId )
                {
                    this.orderId = orderId;
                    return this;
                }

                @Override
                public Insert set( String parameterName, Object value )
                {
                    return ( Insert ) super.set( parameterName, value );
                }
            }

            public class List
                    extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.PricingItemCollection>
            {

                private static final String REST_PATH = "orders/{order_id}/items";

                @com.google.api.client.util.Key( "order_id" )
                private java.lang.Long orderId;

                /**
                 * Create a request for the method "items.list".
                 * <p>
                 * This request holds the parameters needed by the the billing server.  After setting any optional
                 * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
                 * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
                 * called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @param orderId
                 * @since 1.13
                 */
                protected List( java.lang.Long orderId )
                {
                    super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.PricingItemCollection.class );
                    this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                }

                @Override
                public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
                {
                    return super.executeUsingHead();
                }

                @Override
                public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
                {
                    return super.buildHttpRequestUsingHead();
                }

                @Override
                public List setAlt( java.lang.String alt )
                {
                    return ( List ) super.setAlt( alt );
                }

                @Override
                public List setFields( java.lang.String fields )
                {
                    return ( List ) super.setFields( fields );
                }

                @Override
                public List setKey( java.lang.String key )
                {
                    return ( List ) super.setKey( key );
                }

                @Override
                public List setOauthToken( java.lang.String oauthToken )
                {
                    return ( List ) super.setOauthToken( oauthToken );
                }

                @Override
                public List setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( List ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public List setQuotaUser( java.lang.String quotaUser )
                {
                    return ( List ) super.setQuotaUser( quotaUser );
                }

                @Override
                public List setUserIp( java.lang.String userIp )
                {
                    return ( List ) super.setUserIp( userIp );
                }

                /**
                 *
                 */
                public java.lang.Long getOrderId()
                {
                    return orderId;
                }

                public List setOrderId( java.lang.Long orderId )
                {
                    this.orderId = orderId;
                    return this;
                }

                @Override
                public List set( String parameterName, Object value )
                {
                    return ( List ) super.set( parameterName, value );
                }
            }

            public class Update
                    extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.Pricing>
            {

                private static final String REST_PATH = "orders/{order_id}/items/{item_id}";

                @com.google.api.client.util.Key( "order_id" )
                private java.lang.Long orderId;

                @com.google.api.client.util.Key( "item_id" )
                private java.lang.Long itemId;

                /**
                 * Create a request for the method "items.update".
                 * <p>
                 * This request holds the parameters needed by the the billing server.  After setting any optional
                 * parameters, call the {@link Update#execute()} method to invoke the remote operation. <p> {@link
                 * Update#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
                 * be called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @param orderId
                 * @param itemId
                 * @param content the {@link biz.turnonline.ecosystem.billing.model.PricingItem}
                 * @since 1.13
                 */
                protected Update( java.lang.Long orderId,
                                  java.lang.Long itemId,
                                  biz.turnonline.ecosystem.billing.model.PricingItem content )
                {
                    super( ProductBilling.this, "PUT", REST_PATH, content, biz.turnonline.ecosystem.billing.model.Pricing.class );
                    this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                    this.itemId = com.google.api.client.util.Preconditions.checkNotNull( itemId, "Required parameter itemId must be specified." );
                }

                @Override
                public Update setAlt( java.lang.String alt )
                {
                    return ( Update ) super.setAlt( alt );
                }

                @Override
                public Update setFields( java.lang.String fields )
                {
                    return ( Update ) super.setFields( fields );
                }

                @Override
                public Update setKey( java.lang.String key )
                {
                    return ( Update ) super.setKey( key );
                }

                @Override
                public Update setOauthToken( java.lang.String oauthToken )
                {
                    return ( Update ) super.setOauthToken( oauthToken );
                }

                @Override
                public Update setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( Update ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public Update setQuotaUser( java.lang.String quotaUser )
                {
                    return ( Update ) super.setQuotaUser( quotaUser );
                }

                @Override
                public Update setUserIp( java.lang.String userIp )
                {
                    return ( Update ) super.setUserIp( userIp );
                }

                /**
                 *
                 */
                public java.lang.Long getOrderId()
                {
                    return orderId;
                }

                public Update setOrderId( java.lang.Long orderId )
                {
                    this.orderId = orderId;
                    return this;
                }

                /**
                 *
                 */
                public java.lang.Long getItemId()
                {
                    return itemId;
                }

                public Update setItemId( java.lang.Long itemId )
                {
                    this.itemId = itemId;
                    return this;
                }

                @Override
                public Update set( String parameterName, Object value )
                {
                    return ( Update ) super.set( parameterName, value );
                }
            }

        }

        /**
         * The "status" collection of methods.
         */
        public class Status
        {

            /**
             * Create a request for the method "status.get".
             * <p>
             * This request holds the parameters needed by the billing server.  After setting any optional
             * parameters, call the {@link Get#execute()} method to invoke the remote operation.
             *
             * @param orderId
             * @return the request
             */
            public Get get( java.lang.Long orderId ) throws java.io.IOException
            {
                Get result = new Get( orderId );
                initialize( result );
                return result;
            }

            /**
             * Create a request for the method "status.update".
             * <p>
             * This request holds the parameters needed by the billing server.  After setting any optional
             * parameters, call the {@link Update#execute()} method to invoke the remote operation.
             *
             * @param orderId
             * @param content the {@link biz.turnonline.ecosystem.billing.model.OrderStatus}
             * @return the request
             */
            public Update update( java.lang.Long orderId, biz.turnonline.ecosystem.billing.model.OrderStatus content )
                    throws java.io.IOException
            {
                Update result = new Update( orderId, content );
                initialize( result );
                return result;
            }

            public class Get
                    extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.OrderStatus>
            {

                private static final String REST_PATH = "orders/{order_id}/status";

                @com.google.api.client.util.Key( "order_id" )
                private java.lang.Long orderId;

                /**
                 * Create a request for the method "status.get".
                 * <p>
                 * This request holds the parameters needed by the the billing server.  After setting any optional
                 * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
                 * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
                 * called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @param orderId
                 * @since 1.13
                 */
                protected Get( java.lang.Long orderId )
                {
                    super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.OrderStatus.class );
                    this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                }

                @Override
                public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
                {
                    return super.executeUsingHead();
                }

                @Override
                public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
                {
                    return super.buildHttpRequestUsingHead();
                }

                @Override
                public Get setAlt( java.lang.String alt )
                {
                    return ( Get ) super.setAlt( alt );
                }

                @Override
                public Get setFields( java.lang.String fields )
                {
                    return ( Get ) super.setFields( fields );
                }

                @Override
                public Get setKey( java.lang.String key )
                {
                    return ( Get ) super.setKey( key );
                }

                @Override
                public Get setOauthToken( java.lang.String oauthToken )
                {
                    return ( Get ) super.setOauthToken( oauthToken );
                }

                @Override
                public Get setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( Get ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public Get setQuotaUser( java.lang.String quotaUser )
                {
                    return ( Get ) super.setQuotaUser( quotaUser );
                }

                @Override
                public Get setUserIp( java.lang.String userIp )
                {
                    return ( Get ) super.setUserIp( userIp );
                }

                /**
                 *
                 */
                public java.lang.Long getOrderId()
                {
                    return orderId;
                }

                public Get setOrderId( java.lang.Long orderId )
                {
                    this.orderId = orderId;
                    return this;
                }

                @Override
                public Get set( String parameterName, Object value )
                {
                    return ( Get ) super.set( parameterName, value );
                }
            }

            public class Update
                    extends ProductBillingRequest<Void>
            {

                private static final String REST_PATH = "orders/{order_id}/status";

                @com.google.api.client.util.Key( "order_id" )
                private java.lang.Long orderId;

                /**
                 * Create a request for the method "status.update".
                 * <p>
                 * This request holds the parameters needed by the the billing server.  After setting any optional
                 * parameters, call the {@link Update#execute()} method to invoke the remote operation. <p> {@link
                 * Update#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
                 * be called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @param orderId
                 * @param content the {@link biz.turnonline.ecosystem.billing.model.OrderStatus}
                 * @since 1.13
                 */
                protected Update( java.lang.Long orderId, biz.turnonline.ecosystem.billing.model.OrderStatus content )
                {
                    super( ProductBilling.this, "PUT", REST_PATH, content, Void.class );
                    this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                }

                @Override
                public Update setAlt( java.lang.String alt )
                {
                    return ( Update ) super.setAlt( alt );
                }

                @Override
                public Update setFields( java.lang.String fields )
                {
                    return ( Update ) super.setFields( fields );
                }

                @Override
                public Update setKey( java.lang.String key )
                {
                    return ( Update ) super.setKey( key );
                }

                @Override
                public Update setOauthToken( java.lang.String oauthToken )
                {
                    return ( Update ) super.setOauthToken( oauthToken );
                }

                @Override
                public Update setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( Update ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public Update setQuotaUser( java.lang.String quotaUser )
                {
                    return ( Update ) super.setQuotaUser( quotaUser );
                }

                @Override
                public Update setUserIp( java.lang.String userIp )
                {
                    return ( Update ) super.setUserIp( userIp );
                }

                /**
                 *
                 */
                public java.lang.Long getOrderId()
                {
                    return orderId;
                }

                public Update setOrderId( java.lang.Long orderId )
                {
                    this.orderId = orderId;
                    return this;
                }

                @Override
                public Update set( String parameterName, Object value )
                {
                    return ( Update ) super.set( parameterName, value );
                }
            }

        }
    }

    /**
     * The "prices" collection of methods.
     */
    public class Prices
    {

        /**
         * Create a request for the method "prices.insert".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link Insert#execute()} method to invoke the remote operation.
         *
         * @param content the {@link biz.turnonline.ecosystem.billing.model.Pricing}
         * @return the request
         */
        public Insert insert( biz.turnonline.ecosystem.billing.model.Pricing content ) throws java.io.IOException
        {
            Insert result = new Insert( content );
            initialize( result );
            return result;
        }

        public class Insert
                extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.Pricing>
        {

            private static final String REST_PATH = "prices";

            /**
             * Create a request for the method "prices.insert".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link Insert#execute()} method to invoke the remote operation. <p> {@link
             * Insert#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param content the {@link biz.turnonline.ecosystem.billing.model.Pricing}
             * @since 1.13
             */
            protected Insert( biz.turnonline.ecosystem.billing.model.Pricing content )
            {
                super( ProductBilling.this, "POST", REST_PATH, content, biz.turnonline.ecosystem.billing.model.Pricing.class );
            }

            @Override
            public Insert setAlt( java.lang.String alt )
            {
                return ( Insert ) super.setAlt( alt );
            }

            @Override
            public Insert setFields( java.lang.String fields )
            {
                return ( Insert ) super.setFields( fields );
            }

            @Override
            public Insert setKey( java.lang.String key )
            {
                return ( Insert ) super.setKey( key );
            }

            @Override
            public Insert setOauthToken( java.lang.String oauthToken )
            {
                return ( Insert ) super.setOauthToken( oauthToken );
            }

            @Override
            public Insert setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Insert ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Insert setQuotaUser( java.lang.String quotaUser )
            {
                return ( Insert ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Insert setUserIp( java.lang.String userIp )
            {
                return ( Insert ) super.setUserIp( userIp );
            }

            @Override
            public Insert set( String parameterName, Object value )
            {
                return ( Insert ) super.set( parameterName, value );
            }
        }

    }

    /**
     * The "products" collection of methods.
     */
    public class Products
    {

        /**
         * Create a request for the method "products.delete".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link Delete#execute()} method to invoke the remote operation.
         *
         * @param productId
         * @return the request
         */
        public Delete delete( java.lang.Long productId ) throws java.io.IOException
        {
            Delete result = new Delete( productId );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "products.get".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link Get#execute()} method to invoke the remote operation.
         *
         * @param productId
         * @return the request
         */
        public Get get( java.lang.Long productId ) throws java.io.IOException
        {
            Get result = new Get( productId );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "products.insert".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link Insert#execute()} method to invoke the remote operation.
         *
         * @param content the {@link biz.turnonline.ecosystem.billing.model.Product}
         * @return the request
         */
        public Insert insert( biz.turnonline.ecosystem.billing.model.Product content ) throws java.io.IOException
        {
            Insert result = new Insert( content );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "products.list".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link List#execute()} method to invoke the remote operation.
         *
         * @return the request
         */
        public List list() throws java.io.IOException
        {
            List result = new List();
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "products.update".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link Update#execute()} method to invoke the remote operation.
         *
         * @param productId
         * @param content   the {@link biz.turnonline.ecosystem.billing.model.Product}
         * @return the request
         */
        public Update update( java.lang.Long productId, biz.turnonline.ecosystem.billing.model.Product content )
                throws java.io.IOException
        {
            Update result = new Update( productId, content );
            initialize( result );
            return result;
        }

        /**
         * An accessor for creating requests from the Publishing collection.
         *
         * <p>The typical use is:</p>
         * <pre>
         *   {@code ProductBilling billing = new ProductBilling(...);}
         *   {@code ProductBilling.Publishing.List request = billing.publishing().list(parameters ...)}
         * </pre>
         *
         * @return the resource collection
         */
        public Publishing publishing()
        {
            return new Publishing();
        }

        public class Delete
                extends ProductBillingRequest<Void>
        {

            private static final String REST_PATH = "products/{product_id}";

            @com.google.api.client.util.Key( "product_id" )
            private java.lang.Long productId;

            /**
             * Create a request for the method "products.delete".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link Delete#execute()} method to invoke the remote operation. <p> {@link
             * Delete#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param productId
             * @since 1.13
             */
            protected Delete( java.lang.Long productId )
            {
                super( ProductBilling.this, "DELETE", REST_PATH, null, Void.class );
                this.productId = com.google.api.client.util.Preconditions.checkNotNull( productId, "Required parameter productId must be specified." );
            }

            @Override
            public Delete setAlt( java.lang.String alt )
            {
                return ( Delete ) super.setAlt( alt );
            }

            @Override
            public Delete setFields( java.lang.String fields )
            {
                return ( Delete ) super.setFields( fields );
            }

            @Override
            public Delete setKey( java.lang.String key )
            {
                return ( Delete ) super.setKey( key );
            }

            @Override
            public Delete setOauthToken( java.lang.String oauthToken )
            {
                return ( Delete ) super.setOauthToken( oauthToken );
            }

            @Override
            public Delete setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Delete ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Delete setQuotaUser( java.lang.String quotaUser )
            {
                return ( Delete ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Delete setUserIp( java.lang.String userIp )
            {
                return ( Delete ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getProductId()
            {
                return productId;
            }

            public Delete setProductId( java.lang.Long productId )
            {
                this.productId = productId;
                return this;
            }

            @Override
            public Delete set( String parameterName, Object value )
            {
                return ( Delete ) super.set( parameterName, value );
            }
        }

        public class Get
                extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.Product>
        {

            private static final String REST_PATH = "products/{product_id}";

            @com.google.api.client.util.Key( "product_id" )
            private java.lang.Long productId;

            /**
             * Create a request for the method "products.get".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
             * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
             * called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param productId
             * @since 1.13
             */
            protected Get( java.lang.Long productId )
            {
                super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.Product.class );
                this.productId = com.google.api.client.util.Preconditions.checkNotNull( productId, "Required parameter productId must be specified." );
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
            {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
            {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public Get setAlt( java.lang.String alt )
            {
                return ( Get ) super.setAlt( alt );
            }

            @Override
            public Get setFields( java.lang.String fields )
            {
                return ( Get ) super.setFields( fields );
            }

            @Override
            public Get setKey( java.lang.String key )
            {
                return ( Get ) super.setKey( key );
            }

            @Override
            public Get setOauthToken( java.lang.String oauthToken )
            {
                return ( Get ) super.setOauthToken( oauthToken );
            }

            @Override
            public Get setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Get ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Get setQuotaUser( java.lang.String quotaUser )
            {
                return ( Get ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Get setUserIp( java.lang.String userIp )
            {
                return ( Get ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getProductId()
            {
                return productId;
            }

            public Get setProductId( java.lang.Long productId )
            {
                this.productId = productId;
                return this;
            }

            @Override
            public Get set( String parameterName, Object value )
            {
                return ( Get ) super.set( parameterName, value );
            }
        }

        public class Insert
                extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.Product>
        {

            private static final String REST_PATH = "products";

            /**
             * Create a request for the method "products.insert".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link Insert#execute()} method to invoke the remote operation. <p> {@link
             * Insert#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param content the {@link biz.turnonline.ecosystem.billing.model.Product}
             * @since 1.13
             */
            protected Insert( biz.turnonline.ecosystem.billing.model.Product content )
            {
                super( ProductBilling.this, "POST", REST_PATH, content, biz.turnonline.ecosystem.billing.model.Product.class );
            }

            @Override
            public Insert setAlt( java.lang.String alt )
            {
                return ( Insert ) super.setAlt( alt );
            }

            @Override
            public Insert setFields( java.lang.String fields )
            {
                return ( Insert ) super.setFields( fields );
            }

            @Override
            public Insert setKey( java.lang.String key )
            {
                return ( Insert ) super.setKey( key );
            }

            @Override
            public Insert setOauthToken( java.lang.String oauthToken )
            {
                return ( Insert ) super.setOauthToken( oauthToken );
            }

            @Override
            public Insert setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Insert ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Insert setQuotaUser( java.lang.String quotaUser )
            {
                return ( Insert ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Insert setUserIp( java.lang.String userIp )
            {
                return ( Insert ) super.setUserIp( userIp );
            }

            @Override
            public Insert set( String parameterName, Object value )
            {
                return ( Insert ) super.set( parameterName, value );
            }
        }

        public class List
                extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.ProductCollection>
        {

            private static final String REST_PATH = "products";

            @com.google.api.client.util.Key
            private java.lang.Integer limit;

            @com.google.api.client.util.Key
            private java.lang.Boolean lightList;

            @com.google.api.client.util.Key
            private java.lang.Integer offset;

            /**
             * Create a request for the method "products.list".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
             * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
             * called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @since 1.13
             */
            protected List()
            {
                super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.ProductCollection.class );
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
            {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
            {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public List setAlt( java.lang.String alt )
            {
                return ( List ) super.setAlt( alt );
            }

            @Override
            public List setFields( java.lang.String fields )
            {
                return ( List ) super.setFields( fields );
            }

            @Override
            public List setKey( java.lang.String key )
            {
                return ( List ) super.setKey( key );
            }

            @Override
            public List setOauthToken( java.lang.String oauthToken )
            {
                return ( List ) super.setOauthToken( oauthToken );
            }

            @Override
            public List setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( List ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public List setQuotaUser( java.lang.String quotaUser )
            {
                return ( List ) super.setQuotaUser( quotaUser );
            }

            @Override
            public List setUserIp( java.lang.String userIp )
            {
                return ( List ) super.setUserIp( userIp );
            }

            /**
             * [ default: 10]
             * [
             */
            public java.lang.Integer getLimit()
            {
                return limit;
            }

            public List setLimit( java.lang.Integer limit )
            {
                this.limit = limit;
                return this;
            }

            /**
             * [ default: false]
             * [
             */
            public java.lang.Boolean getLightList()
            {
                return lightList;
            }

            /**
             * Convenience method that returns only {@link Boolean#TRUE} or {@link Boolean#FALSE}.
             *
             * <p>
             * Boolean properties can have four possible values:
             * {@code null}, {@link com.google.api.client.util.Data#NULL_BOOLEAN}, {@link Boolean#TRUE}
             * or {@link Boolean#FALSE}.
             * </p>
             *
             * <p>
             * This method returns {@link Boolean#TRUE} if the default of the property is {@link Boolean#TRUE}
             * and it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
             * {@link Boolean#FALSE} is returned if the default of the property is {@link Boolean#FALSE} and
             * it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
             * </p>
             *
             * <p>
             *
             * </p>
             */
            public boolean isLightList()
            {
                if ( lightList == null || lightList == com.google.api.client.util.Data.NULL_BOOLEAN )
                {
                    return false;
                }
                return lightList;
            }

            public List setLightList( java.lang.Boolean lightList )
            {
                this.lightList = lightList;
                return this;
            }

            /**
             * [ default: 0]
             * [
             */
            public java.lang.Integer getOffset()
            {
                return offset;
            }

            public List setOffset( java.lang.Integer offset )
            {
                this.offset = offset;
                return this;
            }

            @Override
            public List set( String parameterName, Object value )
            {
                return ( List ) super.set( parameterName, value );
            }
        }

        public class Update
                extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.Product>
        {

            private static final String REST_PATH = "products/{product_id}";

            @com.google.api.client.util.Key( "product_id" )
            private java.lang.Long productId;

            /**
             * Create a request for the method "products.update".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link Update#execute()} method to invoke the remote operation. <p> {@link
             * Update#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param productId
             * @param content   the {@link biz.turnonline.ecosystem.billing.model.Product}
             * @since 1.13
             */
            protected Update( java.lang.Long productId, biz.turnonline.ecosystem.billing.model.Product content )
            {
                super( ProductBilling.this, "PUT", REST_PATH, content, biz.turnonline.ecosystem.billing.model.Product.class );
                this.productId = com.google.api.client.util.Preconditions.checkNotNull( productId, "Required parameter productId must be specified." );
            }

            @Override
            public Update setAlt( java.lang.String alt )
            {
                return ( Update ) super.setAlt( alt );
            }

            @Override
            public Update setFields( java.lang.String fields )
            {
                return ( Update ) super.setFields( fields );
            }

            @Override
            public Update setKey( java.lang.String key )
            {
                return ( Update ) super.setKey( key );
            }

            @Override
            public Update setOauthToken( java.lang.String oauthToken )
            {
                return ( Update ) super.setOauthToken( oauthToken );
            }

            @Override
            public Update setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Update ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Update setQuotaUser( java.lang.String quotaUser )
            {
                return ( Update ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Update setUserIp( java.lang.String userIp )
            {
                return ( Update ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getProductId()
            {
                return productId;
            }

            public Update setProductId( java.lang.Long productId )
            {
                this.productId = productId;
                return this;
            }

            @Override
            public Update set( String parameterName, Object value )
            {
                return ( Update ) super.set( parameterName, value );
            }
        }

        /**
         * The "publishing" collection of methods.
         */
        public class Publishing
        {

            /**
             * Create a request for the method "publishing.delete".
             * <p>
             * This request holds the parameters needed by the billing server.  After setting any optional
             * parameters, call the {@link Delete#execute()} method to invoke the remote operation.
             *
             * @param productId
             * @return the request
             */
            public Delete delete( java.lang.Long productId ) throws java.io.IOException
            {
                Delete result = new Delete( productId );
                initialize( result );
                return result;
            }

            /**
             * Create a request for the method "publishing.get".
             * <p>
             * This request holds the parameters needed by the billing server.  After setting any optional
             * parameters, call the {@link Get#execute()} method to invoke the remote operation.
             *
             * @param productId
             * @return the request
             */
            public Get get( java.lang.Long productId ) throws java.io.IOException
            {
                Get result = new Get( productId );
                initialize( result );
                return result;
            }

            /**
             * Create a request for the method "publishing.update".
             * <p>
             * This request holds the parameters needed by the billing server.  After setting any optional
             * parameters, call the {@link Update#execute()} method to invoke the remote operation.
             *
             * @param productId
             * @param content   the {@link biz.turnonline.ecosystem.billing.model.ProductPublishing}
             * @return the request
             */
            public Update update( java.lang.Long productId,
                                  biz.turnonline.ecosystem.billing.model.ProductPublishing content )
                    throws java.io.IOException
            {
                Update result = new Update( productId, content );
                initialize( result );
                return result;
            }

            /**
             * An accessor for creating requests from the Pictures collection.
             *
             * <p>The typical use is:</p>
             * <pre>
             *   {@code ProductBilling billing = new ProductBilling(...);}
             *   {@code ProductBilling.Pictures.List request = billing.pictures().list(parameters ...)}
             * </pre>
             *
             * @return the resource collection
             */
            public Pictures pictures()
            {
                return new Pictures();
            }

            public class Delete
                    extends ProductBillingRequest<Void>
            {

                private static final String REST_PATH = "products/{product_id}/publishing";

                @com.google.api.client.util.Key( "product_id" )
                private java.lang.Long productId;

                /**
                 * Create a request for the method "publishing.delete".
                 * <p>
                 * This request holds the parameters needed by the the billing server.  After setting any optional
                 * parameters, call the {@link Delete#execute()} method to invoke the remote operation. <p> {@link
                 * Delete#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
                 * be called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @param productId
                 * @since 1.13
                 */
                protected Delete( java.lang.Long productId )
                {
                    super( ProductBilling.this, "DELETE", REST_PATH, null, Void.class );
                    this.productId = com.google.api.client.util.Preconditions.checkNotNull( productId, "Required parameter productId must be specified." );
                }

                @Override
                public Delete setAlt( java.lang.String alt )
                {
                    return ( Delete ) super.setAlt( alt );
                }

                @Override
                public Delete setFields( java.lang.String fields )
                {
                    return ( Delete ) super.setFields( fields );
                }

                @Override
                public Delete setKey( java.lang.String key )
                {
                    return ( Delete ) super.setKey( key );
                }

                @Override
                public Delete setOauthToken( java.lang.String oauthToken )
                {
                    return ( Delete ) super.setOauthToken( oauthToken );
                }

                @Override
                public Delete setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( Delete ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public Delete setQuotaUser( java.lang.String quotaUser )
                {
                    return ( Delete ) super.setQuotaUser( quotaUser );
                }

                @Override
                public Delete setUserIp( java.lang.String userIp )
                {
                    return ( Delete ) super.setUserIp( userIp );
                }

                /**
                 *
                 */
                public java.lang.Long getProductId()
                {
                    return productId;
                }

                public Delete setProductId( java.lang.Long productId )
                {
                    this.productId = productId;
                    return this;
                }

                @Override
                public Delete set( String parameterName, Object value )
                {
                    return ( Delete ) super.set( parameterName, value );
                }
            }

            public class Get
                    extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.ProductPublishing>
            {

                private static final String REST_PATH = "products/{product_id}/publishing";

                @com.google.api.client.util.Key( "product_id" )
                private java.lang.Long productId;

                /**
                 * Create a request for the method "publishing.get".
                 * <p>
                 * This request holds the parameters needed by the the billing server.  After setting any optional
                 * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
                 * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
                 * called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @param productId
                 * @since 1.13
                 */
                protected Get( java.lang.Long productId )
                {
                    super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.ProductPublishing.class );
                    this.productId = com.google.api.client.util.Preconditions.checkNotNull( productId, "Required parameter productId must be specified." );
                }

                @Override
                public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
                {
                    return super.executeUsingHead();
                }

                @Override
                public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
                {
                    return super.buildHttpRequestUsingHead();
                }

                @Override
                public Get setAlt( java.lang.String alt )
                {
                    return ( Get ) super.setAlt( alt );
                }

                @Override
                public Get setFields( java.lang.String fields )
                {
                    return ( Get ) super.setFields( fields );
                }

                @Override
                public Get setKey( java.lang.String key )
                {
                    return ( Get ) super.setKey( key );
                }

                @Override
                public Get setOauthToken( java.lang.String oauthToken )
                {
                    return ( Get ) super.setOauthToken( oauthToken );
                }

                @Override
                public Get setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( Get ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public Get setQuotaUser( java.lang.String quotaUser )
                {
                    return ( Get ) super.setQuotaUser( quotaUser );
                }

                @Override
                public Get setUserIp( java.lang.String userIp )
                {
                    return ( Get ) super.setUserIp( userIp );
                }

                /**
                 *
                 */
                public java.lang.Long getProductId()
                {
                    return productId;
                }

                public Get setProductId( java.lang.Long productId )
                {
                    this.productId = productId;
                    return this;
                }

                @Override
                public Get set( String parameterName, Object value )
                {
                    return ( Get ) super.set( parameterName, value );
                }
            }

            public class Update
                    extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.ProductPublishing>
            {

                private static final String REST_PATH = "products/{product_id}/publishing";

                @com.google.api.client.util.Key( "product_id" )
                private java.lang.Long productId;

                /**
                 * Create a request for the method "publishing.update".
                 * <p>
                 * This request holds the parameters needed by the the billing server.  After setting any optional
                 * parameters, call the {@link Update#execute()} method to invoke the remote operation. <p> {@link
                 * Update#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
                 * be called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @param productId
                 * @param content   the {@link biz.turnonline.ecosystem.billing.model.ProductPublishing}
                 * @since 1.13
                 */
                protected Update( java.lang.Long productId,
                                  biz.turnonline.ecosystem.billing.model.ProductPublishing content )
                {
                    super( ProductBilling.this, "PUT", REST_PATH, content, biz.turnonline.ecosystem.billing.model.ProductPublishing.class );
                    this.productId = com.google.api.client.util.Preconditions.checkNotNull( productId, "Required parameter productId must be specified." );
                }

                @Override
                public Update setAlt( java.lang.String alt )
                {
                    return ( Update ) super.setAlt( alt );
                }

                @Override
                public Update setFields( java.lang.String fields )
                {
                    return ( Update ) super.setFields( fields );
                }

                @Override
                public Update setKey( java.lang.String key )
                {
                    return ( Update ) super.setKey( key );
                }

                @Override
                public Update setOauthToken( java.lang.String oauthToken )
                {
                    return ( Update ) super.setOauthToken( oauthToken );
                }

                @Override
                public Update setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( Update ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public Update setQuotaUser( java.lang.String quotaUser )
                {
                    return ( Update ) super.setQuotaUser( quotaUser );
                }

                @Override
                public Update setUserIp( java.lang.String userIp )
                {
                    return ( Update ) super.setUserIp( userIp );
                }

                /**
                 *
                 */
                public java.lang.Long getProductId()
                {
                    return productId;
                }

                public Update setProductId( java.lang.Long productId )
                {
                    this.productId = productId;
                    return this;
                }

                @Override
                public Update set( String parameterName, Object value )
                {
                    return ( Update ) super.set( parameterName, value );
                }
            }

            /**
             * The "pictures" collection of methods.
             */
            public class Pictures
            {

                /**
                 * Create a request for the method "pictures.delete".
                 * <p>
                 * This request holds the parameters needed by the billing server.  After setting any optional
                 * parameters, call the {@link Delete#execute()} method to invoke the remote operation.
                 *
                 * @param productId
                 * @param order
                 * @return the request
                 */
                public Delete delete( java.lang.Long productId, java.lang.Integer order ) throws java.io.IOException
                {
                    Delete result = new Delete( productId, order );
                    initialize( result );
                    return result;
                }

                public class Delete
                        extends ProductBillingRequest<Void>
                {

                    private static final String REST_PATH = "products/{product_id}/publishing/pictures/{order}";

                    @com.google.api.client.util.Key( "product_id" )
                    private java.lang.Long productId;

                    @com.google.api.client.util.Key
                    private java.lang.Integer order;

                    /**
                     * Create a request for the method "pictures.delete".
                     * <p>
                     * This request holds the parameters needed by the the billing server.  After setting any optional
                     * parameters, call the {@link Delete#execute()} method to invoke the remote operation. <p> {@link
                     * Delete#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
                     * be called to initialize this instance immediately after invoking the constructor. </p>
                     *
                     * @param productId
                     * @param order
                     * @since 1.13
                     */
                    protected Delete( java.lang.Long productId, java.lang.Integer order )
                    {
                        super( ProductBilling.this, "DELETE", REST_PATH, null, Void.class );
                        this.productId = com.google.api.client.util.Preconditions.checkNotNull( productId, "Required parameter productId must be specified." );
                        this.order = com.google.api.client.util.Preconditions.checkNotNull( order, "Required parameter order must be specified." );
                    }

                    @Override
                    public Delete setAlt( java.lang.String alt )
                    {
                        return ( Delete ) super.setAlt( alt );
                    }

                    @Override
                    public Delete setFields( java.lang.String fields )
                    {
                        return ( Delete ) super.setFields( fields );
                    }

                    @Override
                    public Delete setKey( java.lang.String key )
                    {
                        return ( Delete ) super.setKey( key );
                    }

                    @Override
                    public Delete setOauthToken( java.lang.String oauthToken )
                    {
                        return ( Delete ) super.setOauthToken( oauthToken );
                    }

                    @Override
                    public Delete setPrettyPrint( java.lang.Boolean prettyPrint )
                    {
                        return ( Delete ) super.setPrettyPrint( prettyPrint );
                    }

                    @Override
                    public Delete setQuotaUser( java.lang.String quotaUser )
                    {
                        return ( Delete ) super.setQuotaUser( quotaUser );
                    }

                    @Override
                    public Delete setUserIp( java.lang.String userIp )
                    {
                        return ( Delete ) super.setUserIp( userIp );
                    }

                    /**
                     *
                     */
                    public java.lang.Long getProductId()
                    {
                        return productId;
                    }

                    public Delete setProductId( java.lang.Long productId )
                    {
                        this.productId = productId;
                        return this;
                    }

                    /**
                     *
                     */
                    public java.lang.Integer getOrder()
                    {
                        return order;
                    }

                    public Delete setOrder( java.lang.Integer order )
                    {
                        this.order = order;
                        return this;
                    }

                    @Override
                    public Delete set( String parameterName, Object value )
                    {
                        return ( Delete ) super.set( parameterName, value );
                    }
                }

            }
        }
    }

    /**
     * The "purchases" collection of methods.
     */
    public class Purchases
    {

        /**
         * Create a request for the method "purchases.insert".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link Insert#execute()} method to invoke the remote operation.
         *
         * @param content the {@link biz.turnonline.ecosystem.billing.model.Expenditure}
         * @return the request
         */
        public Insert insert( biz.turnonline.ecosystem.billing.model.Expenditure content ) throws java.io.IOException
        {
            Insert result = new Insert( content );
            initialize( result );
            return result;
        }

        /**
         * An accessor for creating requests from the Expenses collection.
         *
         * <p>The typical use is:</p>
         * <pre>
         *   {@code ProductBilling billing = new ProductBilling(...);}
         *   {@code ProductBilling.Expenses.List request = billing.expenses().list(parameters ...)}
         * </pre>
         *
         * @return the resource collection
         */
        public Expenses expenses()
        {
            return new Expenses();
        }

        /**
         * An accessor for creating requests from the Orders collection.
         *
         * <p>The typical use is:</p>
         * <pre>
         *   {@code ProductBilling billing = new ProductBilling(...);}
         *   {@code ProductBilling.Orders.List request = billing.orders().list(parameters ...)}
         * </pre>
         *
         * @return the resource collection
         */
        public Orders orders()
        {
            return new Orders();
        }

        public class Insert
                extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.Bill>
        {

            private static final String REST_PATH = "purchases";

            /**
             * Create a request for the method "purchases.insert".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link Insert#execute()} method to invoke the remote operation. <p> {@link
             * Insert#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param content the {@link biz.turnonline.ecosystem.billing.model.Expenditure}
             * @since 1.13
             */
            protected Insert( biz.turnonline.ecosystem.billing.model.Expenditure content )
            {
                super( ProductBilling.this, "POST", REST_PATH, content, biz.turnonline.ecosystem.billing.model.Bill.class );
            }

            @Override
            public Insert setAlt( java.lang.String alt )
            {
                return ( Insert ) super.setAlt( alt );
            }

            @Override
            public Insert setFields( java.lang.String fields )
            {
                return ( Insert ) super.setFields( fields );
            }

            @Override
            public Insert setKey( java.lang.String key )
            {
                return ( Insert ) super.setKey( key );
            }

            @Override
            public Insert setOauthToken( java.lang.String oauthToken )
            {
                return ( Insert ) super.setOauthToken( oauthToken );
            }

            @Override
            public Insert setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Insert ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Insert setQuotaUser( java.lang.String quotaUser )
            {
                return ( Insert ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Insert setUserIp( java.lang.String userIp )
            {
                return ( Insert ) super.setUserIp( userIp );
            }

            @Override
            public Insert set( String parameterName, Object value )
            {
                return ( Insert ) super.set( parameterName, value );
            }
        }

        /**
         * The "expenses" collection of methods.
         */
        public class Expenses
        {

            /**
             * Create a request for the method "expenses.list".
             * <p>
             * This request holds the parameters needed by the billing server.  After setting any optional
             * parameters, call the {@link List#execute()} method to invoke the remote operation.
             *
             * @return the request
             */
            public List list() throws java.io.IOException
            {
                List result = new List();
                initialize( result );
                return result;
            }

            public class List
                    extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.ExpenseCollection>
            {

                private static final String REST_PATH = "purchases/expenses";

                @com.google.api.client.util.Key
                private java.lang.Integer limit;

                @com.google.api.client.util.Key
                private java.lang.Boolean lightList;

                @com.google.api.client.util.Key
                private java.lang.Integer offset;

                @com.google.api.client.util.Key
                private java.lang.Long orderId;

                /**
                 * Create a request for the method "expenses.list".
                 * <p>
                 * This request holds the parameters needed by the the billing server.  After setting any optional
                 * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
                 * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
                 * called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @since 1.13
                 */
                protected List()
                {
                    super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.ExpenseCollection.class );
                }

                @Override
                public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
                {
                    return super.executeUsingHead();
                }

                @Override
                public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
                {
                    return super.buildHttpRequestUsingHead();
                }

                @Override
                public List setAlt( java.lang.String alt )
                {
                    return ( List ) super.setAlt( alt );
                }

                @Override
                public List setFields( java.lang.String fields )
                {
                    return ( List ) super.setFields( fields );
                }

                @Override
                public List setKey( java.lang.String key )
                {
                    return ( List ) super.setKey( key );
                }

                @Override
                public List setOauthToken( java.lang.String oauthToken )
                {
                    return ( List ) super.setOauthToken( oauthToken );
                }

                @Override
                public List setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( List ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public List setQuotaUser( java.lang.String quotaUser )
                {
                    return ( List ) super.setQuotaUser( quotaUser );
                }

                @Override
                public List setUserIp( java.lang.String userIp )
                {
                    return ( List ) super.setUserIp( userIp );
                }

                /**
                 * [ default: 10]
                 * [
                 */
                public java.lang.Integer getLimit()
                {
                    return limit;
                }

                public List setLimit( java.lang.Integer limit )
                {
                    this.limit = limit;
                    return this;
                }

                /**
                 * [ default: false]
                 * [
                 */
                public java.lang.Boolean getLightList()
                {
                    return lightList;
                }

                /**
                 * Convenience method that returns only {@link Boolean#TRUE} or {@link Boolean#FALSE}.
                 *
                 * <p>
                 * Boolean properties can have four possible values:
                 * {@code null}, {@link com.google.api.client.util.Data#NULL_BOOLEAN}, {@link Boolean#TRUE}
                 * or {@link Boolean#FALSE}.
                 * </p>
                 *
                 * <p>
                 * This method returns {@link Boolean#TRUE} if the default of the property is {@link Boolean#TRUE}
                 * and it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
                 * {@link Boolean#FALSE} is returned if the default of the property is {@link Boolean#FALSE} and
                 * it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
                 * </p>
                 *
                 * <p>
                 *
                 * </p>
                 */
                public boolean isLightList()
                {
                    if ( lightList == null || lightList == com.google.api.client.util.Data.NULL_BOOLEAN )
                    {
                        return false;
                    }
                    return lightList;
                }

                public List setLightList( java.lang.Boolean lightList )
                {
                    this.lightList = lightList;
                    return this;
                }

                /**
                 * [ default: 0]
                 * [
                 */
                public java.lang.Integer getOffset()
                {
                    return offset;
                }

                public List setOffset( java.lang.Integer offset )
                {
                    this.offset = offset;
                    return this;
                }

                /**
                 *
                 */
                public java.lang.Long getOrderId()
                {
                    return orderId;
                }

                public List setOrderId( java.lang.Long orderId )
                {
                    this.orderId = orderId;
                    return this;
                }

                @Override
                public List set( String parameterName, Object value )
                {
                    return ( List ) super.set( parameterName, value );
                }
            }

        }

        /**
         * The "orders" collection of methods.
         */
        public class Orders
        {

            /**
             * Create a request for the method "orders.delete".
             * <p>
             * This request holds the parameters needed by the billing server.  After setting any optional
             * parameters, call the {@link Delete#execute()} method to invoke the remote operation.
             *
             * @param orderId
             * @return the request
             */
            public Delete delete( java.lang.Long orderId ) throws java.io.IOException
            {
                Delete result = new Delete( orderId );
                initialize( result );
                return result;
            }

            /**
             * Create a request for the method "orders.get".
             * <p>
             * This request holds the parameters needed by the billing server.  After setting any optional
             * parameters, call the {@link Get#execute()} method to invoke the remote operation.
             *
             * @param orderId
             * @return the request
             */
            public Get get( java.lang.Long orderId ) throws java.io.IOException
            {
                Get result = new Get( orderId );
                initialize( result );
                return result;
            }

            /**
             * Create a request for the method "orders.list".
             * <p>
             * This request holds the parameters needed by the billing server.  After setting any optional
             * parameters, call the {@link List#execute()} method to invoke the remote operation.
             *
             * @return the request
             */
            public List list() throws java.io.IOException
            {
                List result = new List();
                initialize( result );
                return result;
            }

            /**
             * An accessor for creating requests from the Invoices collection.
             *
             * <p>The typical use is:</p>
             * <pre>
             *   {@code ProductBilling billing = new ProductBilling(...);}
             *   {@code ProductBilling.Invoices.List request = billing.invoices().list(parameters ...)}
             * </pre>
             *
             * @return the resource collection
             */
            public Invoices invoices()
            {
                return new Invoices();
            }

            public class Delete
                    extends ProductBillingRequest<Void>
            {

                private static final String REST_PATH = "purchases/orders/{order_id}";

                @com.google.api.client.util.Key( "order_id" )
                private java.lang.Long orderId;

                /**
                 * Create a request for the method "orders.delete".
                 * <p>
                 * This request holds the parameters needed by the the billing server.  After setting any optional
                 * parameters, call the {@link Delete#execute()} method to invoke the remote operation. <p> {@link
                 * Delete#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
                 * be called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @param orderId
                 * @since 1.13
                 */
                protected Delete( java.lang.Long orderId )
                {
                    super( ProductBilling.this, "DELETE", REST_PATH, null, Void.class );
                    this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                }

                @Override
                public Delete setAlt( java.lang.String alt )
                {
                    return ( Delete ) super.setAlt( alt );
                }

                @Override
                public Delete setFields( java.lang.String fields )
                {
                    return ( Delete ) super.setFields( fields );
                }

                @Override
                public Delete setKey( java.lang.String key )
                {
                    return ( Delete ) super.setKey( key );
                }

                @Override
                public Delete setOauthToken( java.lang.String oauthToken )
                {
                    return ( Delete ) super.setOauthToken( oauthToken );
                }

                @Override
                public Delete setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( Delete ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public Delete setQuotaUser( java.lang.String quotaUser )
                {
                    return ( Delete ) super.setQuotaUser( quotaUser );
                }

                @Override
                public Delete setUserIp( java.lang.String userIp )
                {
                    return ( Delete ) super.setUserIp( userIp );
                }

                /**
                 *
                 */
                public java.lang.Long getOrderId()
                {
                    return orderId;
                }

                public Delete setOrderId( java.lang.Long orderId )
                {
                    this.orderId = orderId;
                    return this;
                }

                @Override
                public Delete set( String parameterName, Object value )
                {
                    return ( Delete ) super.set( parameterName, value );
                }
            }

            public class Get
                    extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.PurchaseOrder>
            {

                private static final String REST_PATH = "purchases/orders/{order_id}";

                @com.google.api.client.util.Key( "order_id" )
                private java.lang.Long orderId;

                @com.google.api.client.util.Key
                private java.lang.Integer invoices;

                /**
                 * Create a request for the method "orders.get".
                 * <p>
                 * This request holds the parameters needed by the the billing server.  After setting any optional
                 * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
                 * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
                 * called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @param orderId
                 * @since 1.13
                 */
                protected Get( java.lang.Long orderId )
                {
                    super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.PurchaseOrder.class );
                    this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                }

                @Override
                public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
                {
                    return super.executeUsingHead();
                }

                @Override
                public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
                {
                    return super.buildHttpRequestUsingHead();
                }

                @Override
                public Get setAlt( java.lang.String alt )
                {
                    return ( Get ) super.setAlt( alt );
                }

                @Override
                public Get setFields( java.lang.String fields )
                {
                    return ( Get ) super.setFields( fields );
                }

                @Override
                public Get setKey( java.lang.String key )
                {
                    return ( Get ) super.setKey( key );
                }

                @Override
                public Get setOauthToken( java.lang.String oauthToken )
                {
                    return ( Get ) super.setOauthToken( oauthToken );
                }

                @Override
                public Get setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( Get ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public Get setQuotaUser( java.lang.String quotaUser )
                {
                    return ( Get ) super.setQuotaUser( quotaUser );
                }

                @Override
                public Get setUserIp( java.lang.String userIp )
                {
                    return ( Get ) super.setUserIp( userIp );
                }

                /**
                 *
                 */
                public java.lang.Long getOrderId()
                {
                    return orderId;
                }

                public Get setOrderId( java.lang.Long orderId )
                {
                    this.orderId = orderId;
                    return this;
                }

                /**
                 *
                 */
                public java.lang.Integer getInvoices()
                {
                    return invoices;
                }

                public Get setInvoices( java.lang.Integer invoices )
                {
                    this.invoices = invoices;
                    return this;
                }

                @Override
                public Get set( String parameterName, Object value )
                {
                    return ( Get ) super.set( parameterName, value );
                }
            }

            public class List
                    extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.PurchaseOrderCollection>
            {

                private static final String REST_PATH = "purchases/orders";

                @com.google.api.client.util.Key
                private java.lang.Integer limit;

                @com.google.api.client.util.Key
                private java.lang.Boolean lightList;

                @com.google.api.client.util.Key
                private java.lang.Integer offset;

                /**
                 * Create a request for the method "orders.list".
                 * <p>
                 * This request holds the parameters needed by the the billing server.  After setting any optional
                 * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
                 * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
                 * called to initialize this instance immediately after invoking the constructor. </p>
                 *
                 * @since 1.13
                 */
                protected List()
                {
                    super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.PurchaseOrderCollection.class );
                }

                @Override
                public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
                {
                    return super.executeUsingHead();
                }

                @Override
                public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
                {
                    return super.buildHttpRequestUsingHead();
                }

                @Override
                public List setAlt( java.lang.String alt )
                {
                    return ( List ) super.setAlt( alt );
                }

                @Override
                public List setFields( java.lang.String fields )
                {
                    return ( List ) super.setFields( fields );
                }

                @Override
                public List setKey( java.lang.String key )
                {
                    return ( List ) super.setKey( key );
                }

                @Override
                public List setOauthToken( java.lang.String oauthToken )
                {
                    return ( List ) super.setOauthToken( oauthToken );
                }

                @Override
                public List setPrettyPrint( java.lang.Boolean prettyPrint )
                {
                    return ( List ) super.setPrettyPrint( prettyPrint );
                }

                @Override
                public List setQuotaUser( java.lang.String quotaUser )
                {
                    return ( List ) super.setQuotaUser( quotaUser );
                }

                @Override
                public List setUserIp( java.lang.String userIp )
                {
                    return ( List ) super.setUserIp( userIp );
                }

                /**
                 * [ default: 10]
                 * [
                 */
                public java.lang.Integer getLimit()
                {
                    return limit;
                }

                public List setLimit( java.lang.Integer limit )
                {
                    this.limit = limit;
                    return this;
                }

                /**
                 * [ default: false]
                 * [
                 */
                public java.lang.Boolean getLightList()
                {
                    return lightList;
                }

                /**
                 * Convenience method that returns only {@link Boolean#TRUE} or {@link Boolean#FALSE}.
                 *
                 * <p>
                 * Boolean properties can have four possible values:
                 * {@code null}, {@link com.google.api.client.util.Data#NULL_BOOLEAN}, {@link Boolean#TRUE}
                 * or {@link Boolean#FALSE}.
                 * </p>
                 *
                 * <p>
                 * This method returns {@link Boolean#TRUE} if the default of the property is {@link Boolean#TRUE}
                 * and it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
                 * {@link Boolean#FALSE} is returned if the default of the property is {@link Boolean#FALSE} and
                 * it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
                 * </p>
                 *
                 * <p>
                 *
                 * </p>
                 */
                public boolean isLightList()
                {
                    if ( lightList == null || lightList == com.google.api.client.util.Data.NULL_BOOLEAN )
                    {
                        return false;
                    }
                    return lightList;
                }

                public List setLightList( java.lang.Boolean lightList )
                {
                    this.lightList = lightList;
                    return this;
                }

                /**
                 * [ default: 0]
                 * [
                 */
                public java.lang.Integer getOffset()
                {
                    return offset;
                }

                public List setOffset( java.lang.Integer offset )
                {
                    this.offset = offset;
                    return this;
                }

                @Override
                public List set( String parameterName, Object value )
                {
                    return ( List ) super.set( parameterName, value );
                }
            }

            /**
             * The "invoices" collection of methods.
             */
            public class Invoices
            {

                /**
                 * Create a request for the method "invoices.delete".
                 * <p>
                 * This request holds the parameters needed by the billing server.  After setting any optional
                 * parameters, call the {@link Delete#execute()} method to invoke the remote operation.
                 *
                 * @param orderId
                 * @param invoiceId
                 * @return the request
                 */
                public Delete delete( java.lang.Long orderId, java.lang.Long invoiceId ) throws java.io.IOException
                {
                    Delete result = new Delete( orderId, invoiceId );
                    initialize( result );
                    return result;
                }

                /**
                 * Create a request for the method "invoices.get".
                 * <p>
                 * This request holds the parameters needed by the billing server.  After setting any optional
                 * parameters, call the {@link Get#execute()} method to invoke the remote operation.
                 *
                 * @param orderId
                 * @param invoiceId
                 * @return the request
                 */
                public Get get( java.lang.Long orderId, java.lang.Long invoiceId ) throws java.io.IOException
                {
                    Get result = new Get( orderId, invoiceId );
                    initialize( result );
                    return result;
                }

                /**
                 * Create a request for the method "invoices.list".
                 * <p>
                 * This request holds the parameters needed by the billing server.  After setting any optional
                 * parameters, call the {@link List#execute()} method to invoke the remote operation.
                 *
                 * @param orderId
                 * @return the request
                 */
                public List list( java.lang.Long orderId ) throws java.io.IOException
                {
                    List result = new List( orderId );
                    initialize( result );
                    return result;
                }

                public class Delete
                        extends ProductBillingRequest<Void>
                {

                    private static final String REST_PATH = "purchases/orders/{order_id}/invoices/{invoice_id}";

                    @com.google.api.client.util.Key( "order_id" )
                    private java.lang.Long orderId;

                    @com.google.api.client.util.Key( "invoice_id" )
                    private java.lang.Long invoiceId;

                    /**
                     * Create a request for the method "invoices.delete".
                     * <p>
                     * This request holds the parameters needed by the the billing server.  After setting any optional
                     * parameters, call the {@link Delete#execute()} method to invoke the remote operation. <p> {@link
                     * Delete#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
                     * be called to initialize this instance immediately after invoking the constructor. </p>
                     *
                     * @param orderId
                     * @param invoiceId
                     * @since 1.13
                     */
                    protected Delete( java.lang.Long orderId, java.lang.Long invoiceId )
                    {
                        super( ProductBilling.this, "DELETE", REST_PATH, null, Void.class );
                        this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                        this.invoiceId = com.google.api.client.util.Preconditions.checkNotNull( invoiceId, "Required parameter invoiceId must be specified." );
                    }

                    @Override
                    public Delete setAlt( java.lang.String alt )
                    {
                        return ( Delete ) super.setAlt( alt );
                    }

                    @Override
                    public Delete setFields( java.lang.String fields )
                    {
                        return ( Delete ) super.setFields( fields );
                    }

                    @Override
                    public Delete setKey( java.lang.String key )
                    {
                        return ( Delete ) super.setKey( key );
                    }

                    @Override
                    public Delete setOauthToken( java.lang.String oauthToken )
                    {
                        return ( Delete ) super.setOauthToken( oauthToken );
                    }

                    @Override
                    public Delete setPrettyPrint( java.lang.Boolean prettyPrint )
                    {
                        return ( Delete ) super.setPrettyPrint( prettyPrint );
                    }

                    @Override
                    public Delete setQuotaUser( java.lang.String quotaUser )
                    {
                        return ( Delete ) super.setQuotaUser( quotaUser );
                    }

                    @Override
                    public Delete setUserIp( java.lang.String userIp )
                    {
                        return ( Delete ) super.setUserIp( userIp );
                    }

                    /**
                     *
                     */
                    public java.lang.Long getOrderId()
                    {
                        return orderId;
                    }

                    public Delete setOrderId( java.lang.Long orderId )
                    {
                        this.orderId = orderId;
                        return this;
                    }

                    /**
                     *
                     */
                    public java.lang.Long getInvoiceId()
                    {
                        return invoiceId;
                    }

                    public Delete setInvoiceId( java.lang.Long invoiceId )
                    {
                        this.invoiceId = invoiceId;
                        return this;
                    }

                    @Override
                    public Delete set( String parameterName, Object value )
                    {
                        return ( Delete ) super.set( parameterName, value );
                    }
                }

                public class Get
                        extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.IncomingInvoice>
                {

                    private static final String REST_PATH = "purchases/orders/{order_id}/invoices/{invoice_id}";

                    @com.google.api.client.util.Key( "order_id" )
                    private java.lang.Long orderId;

                    @com.google.api.client.util.Key( "invoice_id" )
                    private java.lang.Long invoiceId;

                    /**
                     * Create a request for the method "invoices.get".
                     * <p>
                     * This request holds the parameters needed by the the billing server.  After setting any optional
                     * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
                     * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
                     * called to initialize this instance immediately after invoking the constructor. </p>
                     *
                     * @param orderId
                     * @param invoiceId
                     * @since 1.13
                     */
                    protected Get( java.lang.Long orderId, java.lang.Long invoiceId )
                    {
                        super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.IncomingInvoice.class );
                        this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                        this.invoiceId = com.google.api.client.util.Preconditions.checkNotNull( invoiceId, "Required parameter invoiceId must be specified." );
                    }

                    @Override
                    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
                    {
                        return super.executeUsingHead();
                    }

                    @Override
                    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
                    {
                        return super.buildHttpRequestUsingHead();
                    }

                    @Override
                    public Get setAlt( java.lang.String alt )
                    {
                        return ( Get ) super.setAlt( alt );
                    }

                    @Override
                    public Get setFields( java.lang.String fields )
                    {
                        return ( Get ) super.setFields( fields );
                    }

                    @Override
                    public Get setKey( java.lang.String key )
                    {
                        return ( Get ) super.setKey( key );
                    }

                    @Override
                    public Get setOauthToken( java.lang.String oauthToken )
                    {
                        return ( Get ) super.setOauthToken( oauthToken );
                    }

                    @Override
                    public Get setPrettyPrint( java.lang.Boolean prettyPrint )
                    {
                        return ( Get ) super.setPrettyPrint( prettyPrint );
                    }

                    @Override
                    public Get setQuotaUser( java.lang.String quotaUser )
                    {
                        return ( Get ) super.setQuotaUser( quotaUser );
                    }

                    @Override
                    public Get setUserIp( java.lang.String userIp )
                    {
                        return ( Get ) super.setUserIp( userIp );
                    }

                    /**
                     *
                     */
                    public java.lang.Long getOrderId()
                    {
                        return orderId;
                    }

                    public Get setOrderId( java.lang.Long orderId )
                    {
                        this.orderId = orderId;
                        return this;
                    }

                    /**
                     *
                     */
                    public java.lang.Long getInvoiceId()
                    {
                        return invoiceId;
                    }

                    public Get setInvoiceId( java.lang.Long invoiceId )
                    {
                        this.invoiceId = invoiceId;
                        return this;
                    }

                    @Override
                    public Get set( String parameterName, Object value )
                    {
                        return ( Get ) super.set( parameterName, value );
                    }
                }

                public class List
                        extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.IncomingInvoiceCollection>
                {

                    private static final String REST_PATH = "purchases/orders/{order_id}/invoices";

                    @com.google.api.client.util.Key( "order_id" )
                    private java.lang.Long orderId;

                    @com.google.api.client.util.Key
                    private java.lang.Boolean lightList;

                    @com.google.api.client.util.Key
                    private java.lang.Integer offset;

                    @com.google.api.client.util.Key
                    private java.lang.Integer limit;

                    /**
                     * Create a request for the method "invoices.list".
                     * <p>
                     * This request holds the parameters needed by the the billing server.  After setting any optional
                     * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
                     * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
                     * called to initialize this instance immediately after invoking the constructor. </p>
                     *
                     * @param orderId
                     * @since 1.13
                     */
                    protected List( java.lang.Long orderId )
                    {
                        super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.IncomingInvoiceCollection.class );
                        this.orderId = com.google.api.client.util.Preconditions.checkNotNull( orderId, "Required parameter orderId must be specified." );
                    }

                    @Override
                    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
                    {
                        return super.executeUsingHead();
                    }

                    @Override
                    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
                    {
                        return super.buildHttpRequestUsingHead();
                    }

                    @Override
                    public List setAlt( java.lang.String alt )
                    {
                        return ( List ) super.setAlt( alt );
                    }

                    @Override
                    public List setFields( java.lang.String fields )
                    {
                        return ( List ) super.setFields( fields );
                    }

                    @Override
                    public List setKey( java.lang.String key )
                    {
                        return ( List ) super.setKey( key );
                    }

                    @Override
                    public List setOauthToken( java.lang.String oauthToken )
                    {
                        return ( List ) super.setOauthToken( oauthToken );
                    }

                    @Override
                    public List setPrettyPrint( java.lang.Boolean prettyPrint )
                    {
                        return ( List ) super.setPrettyPrint( prettyPrint );
                    }

                    @Override
                    public List setQuotaUser( java.lang.String quotaUser )
                    {
                        return ( List ) super.setQuotaUser( quotaUser );
                    }

                    @Override
                    public List setUserIp( java.lang.String userIp )
                    {
                        return ( List ) super.setUserIp( userIp );
                    }

                    /**
                     *
                     */
                    public java.lang.Long getOrderId()
                    {
                        return orderId;
                    }

                    public List setOrderId( java.lang.Long orderId )
                    {
                        this.orderId = orderId;
                        return this;
                    }

                    /**
                     * [ default: false]
                     * [
                     */
                    public java.lang.Boolean getLightList()
                    {
                        return lightList;
                    }

                    /**
                     * Convenience method that returns only {@link Boolean#TRUE} or {@link Boolean#FALSE}.
                     *
                     * <p>
                     * Boolean properties can have four possible values:
                     * {@code null}, {@link com.google.api.client.util.Data#NULL_BOOLEAN}, {@link Boolean#TRUE}
                     * or {@link Boolean#FALSE}.
                     * </p>
                     *
                     * <p>
                     * This method returns {@link Boolean#TRUE} if the default of the property is {@link Boolean#TRUE}
                     * and it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
                     * {@link Boolean#FALSE} is returned if the default of the property is {@link Boolean#FALSE} and
                     * it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
                     * </p>
                     *
                     * <p>
                     *
                     * </p>
                     */
                    public boolean isLightList()
                    {
                        if ( lightList == null || lightList == com.google.api.client.util.Data.NULL_BOOLEAN )
                        {
                            return false;
                        }
                        return lightList;
                    }

                    public List setLightList( java.lang.Boolean lightList )
                    {
                        this.lightList = lightList;
                        return this;
                    }

                    /**
                     * [ default: 0]
                     * [
                     */
                    public java.lang.Integer getOffset()
                    {
                        return offset;
                    }

                    public List setOffset( java.lang.Integer offset )
                    {
                        this.offset = offset;
                        return this;
                    }

                    /**
                     * [ default: 10]
                     * [
                     */
                    public java.lang.Integer getLimit()
                    {
                        return limit;
                    }

                    public List setLimit( java.lang.Integer limit )
                    {
                        this.limit = limit;
                        return this;
                    }

                    @Override
                    public List set( String parameterName, Object value )
                    {
                        return ( List ) super.set( parameterName, value );
                    }
                }

            }
        }
    }

    /**
     * The "transactions" collection of methods.
     */
    public class Transactions
    {

        /**
         * Create a request for the method "transactions.get".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link Get#execute()} method to invoke the remote operation.
         *
         * @param transactionId
         * @return the request
         */
        public Get get( java.lang.Long transactionId ) throws java.io.IOException
        {
            Get result = new Get( transactionId );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "transactions.insert".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link Insert#execute()} method to invoke the remote operation.
         *
         * @param content the {@link biz.turnonline.ecosystem.billing.model.Transaction}
         * @return the request
         */
        public Insert insert( biz.turnonline.ecosystem.billing.model.Transaction content ) throws java.io.IOException
        {
            Insert result = new Insert( content );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "transactions.list".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link List#execute()} method to invoke the remote operation.
         *
         * @return the request
         */
        public List list() throws java.io.IOException
        {
            List result = new List();
            initialize( result );
            return result;
        }

        public class Get
                extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.Transaction>
        {

            private static final String REST_PATH = "transactions/{transaction_id}";

            @com.google.api.client.util.Key( "transaction_id" )
            private java.lang.Long transactionId;

            /**
             * Create a request for the method "transactions.get".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
             * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
             * called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param transactionId
             * @since 1.13
             */
            protected Get( java.lang.Long transactionId )
            {
                super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.Transaction.class );
                this.transactionId = com.google.api.client.util.Preconditions.checkNotNull( transactionId, "Required parameter transactionId must be specified." );
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
            {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
            {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public Get setAlt( java.lang.String alt )
            {
                return ( Get ) super.setAlt( alt );
            }

            @Override
            public Get setFields( java.lang.String fields )
            {
                return ( Get ) super.setFields( fields );
            }

            @Override
            public Get setKey( java.lang.String key )
            {
                return ( Get ) super.setKey( key );
            }

            @Override
            public Get setOauthToken( java.lang.String oauthToken )
            {
                return ( Get ) super.setOauthToken( oauthToken );
            }

            @Override
            public Get setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Get ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Get setQuotaUser( java.lang.String quotaUser )
            {
                return ( Get ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Get setUserIp( java.lang.String userIp )
            {
                return ( Get ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getTransactionId()
            {
                return transactionId;
            }

            public Get setTransactionId( java.lang.Long transactionId )
            {
                this.transactionId = transactionId;
                return this;
            }

            @Override
            public Get set( String parameterName, Object value )
            {
                return ( Get ) super.set( parameterName, value );
            }
        }

        public class Insert
                extends ProductBillingRequest<Void>
        {

            private static final String REST_PATH = "transactions";

            /**
             * Create a request for the method "transactions.insert".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link Insert#execute()} method to invoke the remote operation. <p> {@link
             * Insert#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param content the {@link biz.turnonline.ecosystem.billing.model.Transaction}
             * @since 1.13
             */
            protected Insert( biz.turnonline.ecosystem.billing.model.Transaction content )
            {
                super( ProductBilling.this, "POST", REST_PATH, content, Void.class );
            }

            @Override
            public Insert setAlt( java.lang.String alt )
            {
                return ( Insert ) super.setAlt( alt );
            }

            @Override
            public Insert setFields( java.lang.String fields )
            {
                return ( Insert ) super.setFields( fields );
            }

            @Override
            public Insert setKey( java.lang.String key )
            {
                return ( Insert ) super.setKey( key );
            }

            @Override
            public Insert setOauthToken( java.lang.String oauthToken )
            {
                return ( Insert ) super.setOauthToken( oauthToken );
            }

            @Override
            public Insert setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Insert ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Insert setQuotaUser( java.lang.String quotaUser )
            {
                return ( Insert ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Insert setUserIp( java.lang.String userIp )
            {
                return ( Insert ) super.setUserIp( userIp );
            }

            @Override
            public Insert set( String parameterName, Object value )
            {
                return ( Insert ) super.set( parameterName, value );
            }
        }

        public class List
                extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.TransactionCollection>
        {

            private static final String REST_PATH = "transactions";

            @com.google.api.client.util.Key
            private java.lang.String type;

            @com.google.api.client.util.Key
            private java.lang.Integer limit;

            @com.google.api.client.util.Key
            private java.lang.Long billId;

            @com.google.api.client.util.Key
            private java.lang.Integer offset;

            @com.google.api.client.util.Key
            private java.lang.String operation;

            @com.google.api.client.util.Key
            private java.lang.Long invoiceId;

            @com.google.api.client.util.Key
            private java.lang.Long orderId;

            /**
             * Create a request for the method "transactions.list".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
             * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
             * called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @since 1.13
             */
            protected List()
            {
                super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.TransactionCollection.class );
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
            {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
            {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public List setAlt( java.lang.String alt )
            {
                return ( List ) super.setAlt( alt );
            }

            @Override
            public List setFields( java.lang.String fields )
            {
                return ( List ) super.setFields( fields );
            }

            @Override
            public List setKey( java.lang.String key )
            {
                return ( List ) super.setKey( key );
            }

            @Override
            public List setOauthToken( java.lang.String oauthToken )
            {
                return ( List ) super.setOauthToken( oauthToken );
            }

            @Override
            public List setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( List ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public List setQuotaUser( java.lang.String quotaUser )
            {
                return ( List ) super.setQuotaUser( quotaUser );
            }

            @Override
            public List setUserIp( java.lang.String userIp )
            {
                return ( List ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.String getType()
            {
                return type;
            }

            public List setType( java.lang.String type )
            {
                this.type = type;
                return this;
            }

            /**
             * [ default: 20]
             * [
             */
            public java.lang.Integer getLimit()
            {
                return limit;
            }

            public List setLimit( java.lang.Integer limit )
            {
                this.limit = limit;
                return this;
            }

            /**
             *
             */
            public java.lang.Long getBillId()
            {
                return billId;
            }

            public List setBillId( java.lang.Long billId )
            {
                this.billId = billId;
                return this;
            }

            /**
             * [ default: 0]
             * [
             */
            public java.lang.Integer getOffset()
            {
                return offset;
            }

            public List setOffset( java.lang.Integer offset )
            {
                this.offset = offset;
                return this;
            }

            /**
             * [ default: both]
             * [
             */
            public java.lang.String getOperation()
            {
                return operation;
            }

            public List setOperation( java.lang.String operation )
            {
                this.operation = operation;
                return this;
            }

            /**
             *
             */
            public java.lang.Long getInvoiceId()
            {
                return invoiceId;
            }

            public List setInvoiceId( java.lang.Long invoiceId )
            {
                this.invoiceId = invoiceId;
                return this;
            }

            /**
             *
             */
            public java.lang.Long getOrderId()
            {
                return orderId;
            }

            public List setOrderId( java.lang.Long orderId )
            {
                this.orderId = orderId;
                return this;
            }

            @Override
            public List set( String parameterName, Object value )
            {
                return ( List ) super.set( parameterName, value );
            }
        }

    }

    /**
     * The "vat_rates" collection of methods.
     */
    public class VatRates
    {

        /**
         * Create a request for the method "vat_rates.list".
         * <p>
         * This request holds the parameters needed by the billing server.  After setting any optional
         * parameters, call the {@link List#execute()} method to invoke the remote operation.
         *
         * @return the request
         */
        public List list() throws java.io.IOException
        {
            List result = new List();
            initialize( result );
            return result;
        }

        public class List
                extends ProductBillingRequest<biz.turnonline.ecosystem.billing.model.VatRateCollection>
        {

            private static final String REST_PATH = "codebook/vat-rates";

            @com.google.api.client.util.Key
            private java.lang.String domicile;

            /**
             * Create a request for the method "vat_rates.list".
             * <p>
             * This request holds the parameters needed by the the billing server.  After setting any optional
             * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
             * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
             * called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @since 1.13
             */
            protected List()
            {
                super( ProductBilling.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.billing.model.VatRateCollection.class );
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
            {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
            {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public List setAlt( java.lang.String alt )
            {
                return ( List ) super.setAlt( alt );
            }

            @Override
            public List setFields( java.lang.String fields )
            {
                return ( List ) super.setFields( fields );
            }

            @Override
            public List setKey( java.lang.String key )
            {
                return ( List ) super.setKey( key );
            }

            @Override
            public List setOauthToken( java.lang.String oauthToken )
            {
                return ( List ) super.setOauthToken( oauthToken );
            }

            @Override
            public List setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( List ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public List setQuotaUser( java.lang.String quotaUser )
            {
                return ( List ) super.setQuotaUser( quotaUser );
            }

            @Override
            public List setUserIp( java.lang.String userIp )
            {
                return ( List ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.String getDomicile()
            {
                return domicile;
            }

            public List setDomicile( java.lang.String domicile )
            {
                this.domicile = domicile;
                return this;
            }

            @Override
            public List set( String parameterName, Object value )
            {
                return ( List ) super.set( parameterName, value );
            }
        }

    }
}
