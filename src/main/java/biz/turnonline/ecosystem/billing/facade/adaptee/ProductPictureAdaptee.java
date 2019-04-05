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
 * @author <a href="mailto:aurel.medvegy@ctoolkit.org">Aurel Medvegy</a>
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
