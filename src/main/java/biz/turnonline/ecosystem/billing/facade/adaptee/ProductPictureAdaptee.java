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
import biz.turnonline.ecosystem.billing.model.ProductPicture;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adapter.AbstractDeleteExecutorAdaptee;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import java.io.IOException;

/**
 * The {@link ProductPicture} adaptee implementation.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
@Singleton
public class ProductPictureAdaptee
        extends AbstractDeleteExecutorAdaptee<ProductBilling, ProductPicture>
{
    @Inject
    public ProductPictureAdaptee( Provider<ProductBilling> client )
    {
        super( client );
    }

    @Override
    public Object prepareDelete( @Nonnull Identifier identifier ) throws IOException
    {
        Long id = identifier.getLong();
        Integer order = identifier.child().getLong().intValue();
        return client().products().publishing().pictures().delete( id, order );
    }
}
