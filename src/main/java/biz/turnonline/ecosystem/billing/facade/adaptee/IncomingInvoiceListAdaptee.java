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
import biz.turnonline.ecosystem.billing.model.IncomingInvoice;
import com.google.common.base.MoreObjects;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.ListExecutorAdaptee;
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
 * The {@link IncomingInvoice} LIST adaptee implementation.
 *
 * @author <a href="mailto:aurel.medvegy@ctoolkit.org">Aurel Medvegy</a>
 */
@Singleton
public class IncomingInvoiceListAdaptee
        extends AbstractGoogleClientAdaptee<ProductBilling>
        implements ListExecutorAdaptee<IncomingInvoice>
{
    @Inject
    public IncomingInvoiceListAdaptee( Provider<ProductBilling> client )
    {
        super( client );
    }

    @Override
    public Object prepareList( @Nullable Identifier parent ) throws IOException
    {
        if ( parent == null )
        {
            return client().purchases().invoices().list();
        }
        else
        {
            return client().purchases().orders().invoices().list( parent.getLong() );
        }
    }

    @Override
    public List<IncomingInvoice> executeList( @Nonnull Object request,
                                              @Nullable Map<String, Object> parameters,
                                              @Nullable Locale locale,
                                              @Nullable Integer offset,
                                              @Nullable Integer limit,
                                              @Nullable String orderBy,
                                              @Nullable Boolean ascending ) throws IOException
    {
        fill( request, parameters );

        if ( request instanceof ProductBilling.Purchases.Invoices.List )
        {
            ProductBilling.Purchases.Invoices.List list = ( ProductBilling.Purchases.Invoices.List ) request;

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
        else if ( request instanceof ProductBilling.Purchases.Orders.Invoices.List )
        {
            ProductBilling.Purchases.Orders.Invoices.List list = ( ProductBilling.Purchases.Orders.Invoices.List ) request;

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
}
