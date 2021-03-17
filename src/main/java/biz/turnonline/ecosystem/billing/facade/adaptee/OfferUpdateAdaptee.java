package biz.turnonline.ecosystem.billing.facade.adaptee;

import biz.turnonline.ecosystem.billing.ProductBilling;
import biz.turnonline.ecosystem.billing.model.PureOffer;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.MediaProvider;
import org.ctoolkit.restapi.client.adapter.AbstractUpdateExecutorAdaptee;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Provider;
import java.io.IOException;

/**
 * The {@link PureOffer} PUT adaptee implementation.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class OfferUpdateAdaptee
        extends AbstractUpdateExecutorAdaptee<ProductBilling, PureOffer>
{
    @Inject
    public OfferUpdateAdaptee( Provider<ProductBilling> client )
    {
        super( client );
    }

    @Override
    public Object prepareUpdate( @Nonnull PureOffer resource,
                                 @Nonnull Identifier identifier,
                                 @Nullable MediaProvider provider ) throws IOException
    {
        return client().offers().update( identifier.getLong(), resource );
    }
}
