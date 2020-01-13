package biz.turnonline.ecosystem.billing.facade.adaptee;

import biz.turnonline.ecosystem.billing.ProductBilling;
import biz.turnonline.ecosystem.billing.model.PurchaseOrder;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adapter.AbstractDeleteExecutorAdaptee;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Provider;
import java.io.IOException;

/**
 * The {@link PurchaseOrder} DELETE adaptee implementation.
 *
 * @author <a href="mailto:aurel.medvegy@ctoolkit.org">Aurel Medvegy</a>
 */
public class PurchaseOrderDeleteAdaptee
        extends AbstractDeleteExecutorAdaptee<ProductBilling, PurchaseOrder>
{
    @Inject
    public PurchaseOrderDeleteAdaptee( Provider<ProductBilling> client )
    {
        super( client );
    }

    @Override
    public Object prepareDelete( @Nonnull Identifier identifier ) throws IOException
    {
        return client().purchases().orders().delete( identifier.getLong() );
    }
}
