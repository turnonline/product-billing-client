package biz.turnonline.ecosystem.billing.facade.adaptee;

import biz.turnonline.ecosystem.billing.ProductBilling;
import biz.turnonline.ecosystem.billing.model.SelectedPickupPoint;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.MediaProvider;
import org.ctoolkit.restapi.client.adapter.AbstractUpdateExecutorAdaptee;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Provider;
import java.io.IOException;

/**
 * The {@link SelectedPickupPoint} PUT adaptee implementation.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class OrderPickupPointUpdateAdaptee
        extends AbstractUpdateExecutorAdaptee<ProductBilling, SelectedPickupPoint>
{
    @Inject
    public OrderPickupPointUpdateAdaptee( Provider<ProductBilling> client )
    {
        super( client );
    }

    @Override
    public Object prepareUpdate( @Nonnull SelectedPickupPoint resource,
                                 @Nonnull Identifier identifier,
                                 @Nullable MediaProvider provider ) throws IOException
    {
        return client().orders().pickupPoint( identifier.getLong(), resource );
    }
}
