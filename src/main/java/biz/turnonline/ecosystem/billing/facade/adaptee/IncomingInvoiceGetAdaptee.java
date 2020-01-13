package biz.turnonline.ecosystem.billing.facade.adaptee;

import biz.turnonline.ecosystem.billing.ProductBilling;
import biz.turnonline.ecosystem.billing.model.IncomingInvoice;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adapter.AbstractGetExecutorAdaptee;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Provider;
import java.io.IOException;

/**
 * The {@link IncomingInvoice} GET adaptee implementation.
 *
 * @author <a href="mailto:aurel.medvegy@ctoolkit.org">Aurel Medvegy</a>
 */
public class IncomingInvoiceGetAdaptee
        extends AbstractGetExecutorAdaptee<ProductBilling, IncomingInvoice>
{
    @Inject
    public IncomingInvoiceGetAdaptee( Provider<ProductBilling> client )
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
}
