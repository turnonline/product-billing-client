package biz.turnonline.ecosystem.billing.facade.adaptee;

import biz.turnonline.ecosystem.billing.ProductBilling;
import biz.turnonline.ecosystem.billing.model.PurchaseRequest;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.MediaProvider;
import org.ctoolkit.restapi.client.adapter.AbstractInsertExecutorAdaptee;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Provider;
import java.io.IOException;

/**
 * The {@link PurchaseRequest} POST adaptee implementation.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class PurchaseRequestInsertAdaptee
        extends AbstractInsertExecutorAdaptee<ProductBilling, PurchaseRequest>
{
    @Inject
    public PurchaseRequestInsertAdaptee( Provider<ProductBilling> client )
    {
        super( client );
    }

    @Override
    public Object prepareInsert( @Nonnull PurchaseRequest resource,
                                 @Nullable Identifier parentKey,
                                 @Nullable MediaProvider provider ) throws IOException
    {
        if ( parentKey == null || !parentKey.isLong() )
        {
            throw new IllegalArgumentException( "Unexpected [" + parentKey + "] Offer ID identification" );
        }
        else
        {
            return client().offers().purchase( parentKey.getLong(), resource );
        }
    }
}
