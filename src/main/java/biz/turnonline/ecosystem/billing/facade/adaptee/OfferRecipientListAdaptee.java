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
import biz.turnonline.ecosystem.billing.model.OfferRecipient;
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
 * The {@link OfferRecipient} LIST adaptee implementation.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
@Singleton
public class OfferRecipientListAdaptee
        extends AbstractGoogleClientAdaptee<ProductBilling>
        implements ListExecutorAdaptee<OfferRecipient>
{
    @Inject
    public OfferRecipientListAdaptee( Provider<ProductBilling> client )
    {
        super( client );
    }

    @Override
    public Object prepareList( @Nullable Identifier parentKey ) throws IOException
    {
        if ( parentKey == null )
        {
            throw new IllegalArgumentException( "Offer ID expected as an identification" );
        }
        else
        {
            return client().offers().recipients().list( parentKey.getLong() );
        }
    }

    @Override
    public List<OfferRecipient> executeList( @Nonnull Object request,
                                             @Nullable Map<String, Object> parameters,
                                             @Nullable Locale locale,
                                             @Nullable Integer offset,
                                             @Nullable Integer limit,
                                             @Nullable String orderBy,
                                             @Nullable Boolean ascending ) throws IOException
    {
        ProductBilling.Offers.Recipients.List list = ( ProductBilling.Offers.Recipients.List ) request;

        if ( offset != null && offset > 0 )
        {
            list.setOffset( offset );
        }
        if ( limit != null && limit > 0 )
        {
            list.setLimit( limit );
        }

        fill( request, parameters );
        return list.execute().getItems();
    }
}
