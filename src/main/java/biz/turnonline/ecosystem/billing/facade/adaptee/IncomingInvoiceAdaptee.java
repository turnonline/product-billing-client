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
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.DeleteExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.GetExecutorAdaptee;
import org.ctoolkit.restapi.client.adapter.AbstractGoogleClientAdaptee;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;

/**
 * The {@link IncomingInvoice} adaptee implementation.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
@Singleton
public class IncomingInvoiceAdaptee
        extends AbstractGoogleClientAdaptee<ProductBilling>
        implements GetExecutorAdaptee<IncomingInvoice>, DeleteExecutorAdaptee<IncomingInvoice>
{
    @Inject
    public IncomingInvoiceAdaptee( Provider<ProductBilling> client )
    {
        super( client );
    }

    @Override
    public Object prepareGet( @Nonnull Identifier identifier ) throws IOException
    {
        Long orderId = identifier.getLong();
        Long invoiceId = identifier.child().getLong();
        return client().purchases().orders().invoices().get( orderId, invoiceId );
    }

    @Override
    public IncomingInvoice executeGet( @Nonnull Object request,
                                       @Nullable Map<String, Object> parameters,
                                       @Nullable Locale locale ) throws IOException
    {
        return ( IncomingInvoice ) execute( request, parameters );
    }

    @Override
    public Object prepareDelete( @Nonnull Identifier identifier ) throws IOException
    {
        Long orderId = identifier.getLong();
        Long invoiceId = identifier.child().getLong();
        return client().purchases().orders().invoices().delete( orderId, invoiceId );
    }

    @Override
    public Object executeDelete( @Nonnull Object request,
                                 @Nullable Map<String, Object> parameters,
                                 @Nullable Locale locale ) throws IOException
    {
        return execute( request, parameters );
    }
}
