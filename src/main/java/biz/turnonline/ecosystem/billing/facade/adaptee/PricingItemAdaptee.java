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
import biz.turnonline.ecosystem.billing.model.PricingItem;
import com.google.common.base.MoreObjects;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.MediaProvider;
import org.ctoolkit.restapi.client.adaptee.RestExecutorAdaptee;
import org.ctoolkit.restapi.client.adapter.AbstractGoogleClientAdaptee;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * The {@link PricingItem} adaptee implementation.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
@Singleton
public class PricingItemAdaptee
        extends AbstractGoogleClientAdaptee<ProductBilling>
        implements RestExecutorAdaptee<PricingItem>
{
    @Inject
    public PricingItemAdaptee( Provider<ProductBilling> client )
    {
        super( client );
    }

    @Override
    public Object prepareDelete( @Nonnull Identifier identifier ) throws IOException
    {
        Long orderId = identifier.getLong();
        Long invoiceId = null;
        Long itemId;

        if ( identifier.child().hasChild() )
        {
            invoiceId = identifier.child().getLong();
            itemId = identifier.child().child().getLong();
        }
        else
        {
            itemId = identifier.child().getLong();
        }

        if ( invoiceId == null )
        {
            // DELETE /orders/{order_id}/items/{item_id}
            return client().orders().items().delete( orderId, itemId );
        }
        else
        {
            // DELETE /orders/{order_id}/invoices/{invoice_id}/items/{item_id}
            return client().orders().invoices().items().delete( orderId, invoiceId, itemId );
        }
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
        Long invoiceId = null;
        Long itemId;

        if ( identifier.child().hasChild() )
        {
            invoiceId = identifier.child().getLong();
            itemId = identifier.child().child().getLong();
        }
        else
        {
            itemId = identifier.child().getLong();
        }

        if ( invoiceId == null )
        {
            // GET /orders/{order_id}/items/{item_id}
            return client().orders().items().get( orderId, itemId );
        }
        else
        {
            // GET /orders/{order_id}/invoices/{invoice_id}/items/{item_id}
            return client().orders().invoices().items().get( orderId, invoiceId, itemId );
        }
    }

    @Override
    public PricingItem executeGet( @Nonnull Object request,
                                   @Nullable Map<String, Object> parameters,
                                   @Nullable Locale locale ) throws IOException
    {
        return ( PricingItem ) execute( request, parameters );
    }

    @Override
    public Object prepareInsert( @Nonnull PricingItem resource,
                                 @Nullable Identifier parent,
                                 @Nullable MediaProvider provider ) throws IOException
    {
        if ( parent == null )
        {
            throw new IllegalArgumentException( "Parent identifier for "
                    + PricingItem.class.getSimpleName()
                    + " is being expected, either for '/orders/{order_id}/items'" +
                    " or '/orders/{order_id}/invoices/{invoice_id}/items'" );
        }

        Long orderId = parent.getLong();
        Long invoiceId = null;

        if ( parent.hasChild() )
        {
            invoiceId = parent.child().getLong();
        }

        if ( invoiceId == null )
        {
            // POST /orders/{order_id}/items
            return client().orders().items().insert( orderId, resource );
        }
        else
        {
            // POST /orders/{order_id}/invoices/{invoice_id}/items
            return client().orders().invoices().items().insert( orderId, invoiceId, resource );
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
            throw new IllegalArgumentException( "Parent identifier for "
                    + PricingItem.class.getSimpleName()
                    + " is being expected, either for '/orders/{order_id}/items'" +
                    " or '/orders/{order_id}/invoices/{invoice_id}/items'" );
        }

        Long orderId = parent.getLong();
        Long invoiceId = null;
        if ( parent.hasChild() )
        {
            invoiceId = parent.child().getLong();
        }

        if ( invoiceId == null )
        {
            // GET list order items /orders/{order_id}/items
            return client().orders().items().list( orderId );
        }
        else
        {
            // GET list of invoice items /orders/{order_id}/invoices/{invoice_id}/items
            return client().orders().invoices().items().list( orderId, invoiceId );
        }
    }

    @Override
    public List<PricingItem> executeList( @Nonnull Object request,
                                          @Nullable Map<String, Object> parameters,
                                          @Nullable Locale locale,
                                          @Nullable Integer offset,
                                          @Nullable Integer limit,
                                          @Nullable String orderBy,
                                          @Nullable Boolean ascending ) throws IOException
    {
        if ( request instanceof ProductBilling.Orders.Items.List )
        {
            ProductBilling.Orders.Items.List list = ( ProductBilling.Orders.Items.List ) request;
            fill( request, parameters );
            return list.execute().getItems();
        }
        else if ( request instanceof ProductBilling.Orders.Invoices.Items.List )
        {
            ProductBilling.Orders.Invoices.Items.List list = ( ProductBilling.Orders.Invoices.Items.List ) request;
            fill( request, parameters );
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
    public Object prepareUpdate( @Nonnull PricingItem resource,
                                 @Nonnull Identifier identifier,
                                 @Nullable MediaProvider provider ) throws IOException
    {
        Long orderId = identifier.getLong();
        Long invoiceId = null;
        Long itemId;

        if ( identifier.child().hasChild() )
        {
            invoiceId = identifier.child().getLong();
            itemId = identifier.child().child().getLong();
        }
        else
        {
            itemId = identifier.child().getLong();
        }

        if ( invoiceId == null )
        {
            // PUT /orders/{order_id}/items/{item_id}
            return client().orders().items().update( orderId, itemId, resource );
        }
        else
        {
            // PUT /orders/{order_id}/invoices/{invoice_id}/items/{item_id}
            return client().orders().invoices().items().update( orderId, invoiceId, itemId, resource );
        }
    }

    @Override
    public Object executeUpdate( @Nonnull Object request,
                                 @Nullable Map<String, Object> parameters,
                                 @Nullable Locale locale ) throws IOException
    {
        return execute( request, parameters );
    }
}
