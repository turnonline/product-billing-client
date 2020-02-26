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

package biz.turnonline.ecosystem.billing.facade.adaptee;

import biz.turnonline.ecosystem.billing.ProductBilling;
import biz.turnonline.ecosystem.billing.facade.ProductBillingClientModule;
import biz.turnonline.ecosystem.billing.model.Invoice;
import com.google.common.base.MoreObjects;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.NotFoundException;
import org.ctoolkit.restapi.client.adaptee.DownloadExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.MediaProvider;
import org.ctoolkit.restapi.client.adaptee.RestExecutorAdaptee;
import org.ctoolkit.restapi.client.adapter.AbstractGoogleClientAdaptee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * The {@link Invoice} adaptee implementation.
 *
 * @author <a href="mailto:aurel.medvegy@ctoolkit.org">Aurel Medvegy</a>
 */
@Singleton
public class InvoiceAdaptee
        extends AbstractGoogleClientAdaptee<ProductBilling>
        implements RestExecutorAdaptee<Invoice>, DownloadExecutorAdaptee<Invoice>
{
    private static final Logger logger = LoggerFactory.getLogger( InvoiceAdaptee.class );

    @Inject
    public InvoiceAdaptee( Provider<ProductBilling> client )
    {
        super( client );
    }

    @Override
    public Object prepareDelete( @Nonnull Identifier identifier ) throws IOException
    {
        Long orderId = identifier.getLong();
        Long invoiceId = identifier.child().getLong();
        return client().orders().invoices().delete( orderId, invoiceId );
    }

    @Override
    public Object executeDelete( @Nonnull Object request,
                                 @Nullable Map<String, Object> parameters,
                                 @Nullable Locale locale ) throws IOException
    {
        return execute( request, parameters );
    }

    @Override
    public Object prepareGet( @Nonnull Identifier identifier ) throws IOException
    {
        Long orderId = identifier.getLong();
        Long invoiceId = identifier.child().getLong();
        return client().orders().invoices().get( orderId, invoiceId );
    }

    @Override
    public Invoice executeGet( @Nonnull Object request,
                               @Nullable Map<String, Object> parameters,
                               @Nullable Locale locale ) throws IOException
    {
        return ( Invoice ) execute( request, parameters );
    }

    @Override
    public Object prepareInsert( @Nonnull Invoice resource,
                                 @Nullable Identifier parent,
                                 @Nullable MediaProvider provider ) throws IOException
    {
        if ( parent == null )
        {
            return client().invoices().insert( resource );
        }
        else
        {
            Long orderId = parent.getLong();
            return client().orders().invoices().insert( orderId, resource );
        }
    }

    @Override
    public Object executeInsert( @Nonnull Object request,
                                 @Nullable Map<String, Object> parameters,
                                 @Nullable Locale locale ) throws IOException
    {
        return execute( request, parameters );
    }

    @Override
    public Object prepareList( @Nullable Identifier parent ) throws IOException
    {
        if ( parent == null )
        {
            return client().invoices().list();
        }
        else
        {
            Long orderId = parent.getLong();
            return client().orders().invoices().list( orderId );
        }
    }

    @Override
    public List<Invoice> executeList( @Nonnull Object request,
                                      @Nullable Map<String, Object> parameters,
                                      @Nullable Locale locale,
                                      @Nullable Integer offset,
                                      @Nullable Integer limit,
                                      @Nullable String orderBy,
                                      @Nullable Boolean ascending ) throws IOException
    {
        fill( request, parameters );

        if ( request instanceof ProductBilling.Invoices.List )
        {
            ProductBilling.Invoices.List list = ( ProductBilling.Invoices.List ) request;

            if ( offset != null && offset > 0 )
            {
                list.setOffset( offset );
            }
            if ( limit != null && limit > 0 )
            {
                list.setLimit( limit );
            }

            return list.execute().getItems();

        }
        else if ( request instanceof ProductBilling.Orders.Invoices.List )
        {
            ProductBilling.Orders.Invoices.List list = ( ProductBilling.Orders.Invoices.List ) request;

            if ( offset != null && offset > 0 )
            {
                list.setOffset( offset );
            }
            if ( limit != null && limit > 0 )
            {
                list.setLimit( limit );
            }

            return list.execute().getItems();
        }
        else
        {
            String message = "Unsupported request " + request.getClass().getName()
                    + MoreObjects.toStringHelper( "Input" )
                    .add( "locale", locale )
                    .add( "offset", offset )
                    .add( "limit", limit )
                    .add( "orderBy", orderBy )
                    .add( "ascending", ascending )
                    .addValue( parameters )
                    .toString();

            throw new IllegalArgumentException( message );
        }
    }

    @Override
    public Object prepareUpdate( @Nonnull Invoice resource,
                                 @Nonnull Identifier identifier,
                                 @Nullable MediaProvider provider ) throws IOException
    {
        Long orderId = identifier.getLong();
        Long invoiceId = identifier.child().getLong();
        return client().orders().invoices().update( orderId, invoiceId, resource );
    }

    @Override
    public Object executeUpdate( @Nonnull Object request,
                                 @Nullable Map<String, Object> parameters,
                                 @Nullable Locale locale ) throws IOException
    {
        return execute( request, parameters );
    }

    /**
     * Renders invoice PDF in following format:
     * '{rootUrl}/storage/{ServicePath}/pdf/orders/{order_id}/invoices/{invoice_id}/{pin}'
     * If rootUrl ends with 'api/' that part will be removed.
     */
    @Override
    public URL prepareDownloadUrl( @Nonnull Identifier identifier,
                                   @Nullable String type,
                                   @Nullable Map<String, Object> parameters,
                                   @Nullable Locale locale )
    {
        Long orderId = identifier.getLong();
        Long invoiceId = identifier.child().getLong();
        String pin = identifier.child().child().getString();

        String rootUrl = client().getRootUrl();
        String servicePath = client().getServicePath();

        if ( rootUrl.endsWith( "api/" ) )
        {
            rootUrl = rootUrl.substring( 0, rootUrl.length() - 4 );
            if ( !rootUrl.endsWith( "/" ) )
            {
                rootUrl += "/";
            }
        }

        String baseUrl = rootUrl + "storage/" + servicePath;
        String fullUrl = baseUrl + "pdf/orders/" + orderId + "/invoices/" + invoiceId + "/" + pin;

        try
        {
            return new URL( fullUrl );
        }
        catch ( MalformedURLException e )
        {
            logger.error( "Download URL preparation has failed."
                    + MoreObjects.toStringHelper( "Full URL" )
                    .add( "Identifier", identifier.toString() )
                    .add( "type", type )
                    .add( "locale", locale )
                    .addValue( parameters )
                    .toString(), e );

            throw new NotFoundException( "URL '" + fullUrl + "' not found." );
        }
    }

    @Override
    public String getApiPrefix()
    {
        return ProductBillingClientModule.API_PREFIX;
    }
}
