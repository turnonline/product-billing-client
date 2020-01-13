package biz.turnonline.ecosystem.billing.facade.adaptee;

import biz.turnonline.ecosystem.billing.ProductBilling;
import biz.turnonline.ecosystem.billing.model.PurchaseOrder;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adapter.AbstractGetExecutorAdaptee;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Provider;
import java.io.IOException;

/**
 * The {@link PurchaseOrder} GET adaptee implementation.
 *
 * @author <a href="mailto:aurel.medvegy@ctoolkit.org">Aurel Medvegy</a>
 */
public class PurchaseOrderGetAdaptee
        extends AbstractGetExecutorAdaptee<ProductBilling, PurchaseOrder>
{
    @Inject
    public PurchaseOrderGetAdaptee( Provider<ProductBilling> client )
    {
        super( client );
    }

    @Override
    public Object prepareGet( @Nonnull Identifier identifier ) throws IOException
    {
        return client().purchases().orders().get( identifier.getLong() );
    }
}
