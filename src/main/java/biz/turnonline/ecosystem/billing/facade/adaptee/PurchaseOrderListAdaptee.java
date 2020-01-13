package biz.turnonline.ecosystem.billing.facade.adaptee;

import biz.turnonline.ecosystem.billing.ProductBilling;
import biz.turnonline.ecosystem.billing.model.PurchaseOrder;
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
 * The {@link PurchaseOrder} LIST adaptee implementation.
 *
 * @author <a href="mailto:aurel.medvegy@ctoolkit.org">Aurel Medvegy</a>
 */
@Singleton
public class PurchaseOrderListAdaptee
        extends AbstractGoogleClientAdaptee<ProductBilling>
        implements ListExecutorAdaptee<PurchaseOrder>

{
    @Inject
    public PurchaseOrderListAdaptee( Provider<ProductBilling> client )
    {
        super( client );
    }

    @Override
    public Object prepareList( @Nullable Identifier parentKey ) throws IOException
    {
        return client().purchases().orders().list();
    }

    @Override
    public List<PurchaseOrder> executeList( @Nonnull Object request,
                                            @Nullable Map<String, Object> parameters,
                                            @Nullable Locale locale,
                                            @Nullable Integer offset,
                                            @Nullable Integer limit,
                                            @Nullable String orderBy,
                                            @Nullable Boolean ascending ) throws IOException
    {
        ProductBilling.Purchases.Orders.List list = ( ProductBilling.Purchases.Orders.List ) request;

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
