package biz.turnonline.ecosystem.billing.facade.adaptee;

import biz.turnonline.ecosystem.billing.ProductBilling;
import biz.turnonline.ecosystem.billing.model.Pricing;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.MediaProvider;
import org.ctoolkit.restapi.client.adapter.AbstractInsertExecutorAdaptee;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import java.io.IOException;

/**
 * The {@link Pricing} adaptee implementation.
 *
 * @author <a href="mailto:aurel.medvegy@ctoolkit.org">Aurel Medvegy</a>
 */
@Singleton
public class PricingAdaptee
        extends AbstractInsertExecutorAdaptee<ProductBilling, Pricing>
{
    @Inject
    public PricingAdaptee( Provider<ProductBilling> client )
    {
        super( client );
    }

    @Override
    public Object prepareInsert( @Nonnull Pricing resource,
                                 @Nullable Identifier parentKey,
                                 @Nullable MediaProvider provider ) throws IOException
    {
        return client().prices().insert( resource );
    }
}
