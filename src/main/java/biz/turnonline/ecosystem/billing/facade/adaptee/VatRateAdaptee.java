package biz.turnonline.ecosystem.billing.facade.adaptee;

import biz.turnonline.ecosystem.billing.Billing;
import biz.turnonline.ecosystem.billing.model.VatRate;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.ListExecutorAdaptee;
import org.ctoolkit.restapi.client.adapter.AbstractGoogleClientAdaptee;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * The {@link VatRate} adaptee implementation.
 *
 * @author <a href="mailto:aurel.medvegy@ctoolkit.org">Aurel Medvegy</a>
 */
@Singleton
public class VatRateAdaptee
        extends AbstractGoogleClientAdaptee<Billing>
        implements ListExecutorAdaptee<VatRate>
{
    @Inject
    public VatRateAdaptee( Billing client )
    {
        super( client );
    }

    @Override
    public Object prepareList( @Nullable Identifier parentKey ) throws IOException
    {
        return client().vatRates().list();
    }

    @Override
    public List<VatRate> executeList( @Nonnull Object request,
                                      @Nullable Map<String, Object> parameters,
                                      @Nullable Locale locale,
                                      @Nullable Integer start,
                                      @Nullable Integer length,
                                      @Nullable String orderBy,
                                      @Nullable Boolean ascending ) throws IOException
    {
        Billing.VatRates.List list = ( Billing.VatRates.List ) request;
        fill( request, parameters );
        return list.execute().getItems();
    }
}
