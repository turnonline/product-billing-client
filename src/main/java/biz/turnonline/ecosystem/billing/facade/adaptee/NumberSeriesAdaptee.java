package biz.turnonline.ecosystem.billing.facade.adaptee;

import biz.turnonline.ecosystem.billing.ProductBilling;
import biz.turnonline.ecosystem.billing.model.NumberSeries;
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
 * The {@link NumberSeries} adaptee implementation.
 *
 * @author <a href="mailto:aurel.medvegy@ctoolkit.org">Aurel Medvegy</a>
 */
@Singleton
public class NumberSeriesAdaptee
        extends AbstractGoogleClientAdaptee<ProductBilling>
        implements ListExecutorAdaptee<NumberSeries>
{
    @Inject
    public NumberSeriesAdaptee( Provider<ProductBilling> client )
    {
        super( client );
    }

    @Override
    public Object prepareList( @Nullable Identifier parentKey ) throws IOException
    {
        return client().numberSeries().list();
    }

    @Override
    public List<NumberSeries> executeList( @Nonnull Object request,
                                           @Nullable Map<String, Object> parameters,
                                           @Nullable Locale locale,
                                           @Nullable Integer start,
                                           @Nullable Integer length,
                                           @Nullable String orderBy,
                                           @Nullable Boolean ascending ) throws IOException
    {
        ProductBilling.NumberSeries.List list = ( ProductBilling.NumberSeries.List ) request;
        fill( request, parameters );
        return list.execute().getItems();
    }
}
