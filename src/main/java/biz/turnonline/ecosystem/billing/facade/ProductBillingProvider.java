package biz.turnonline.ecosystem.billing.facade;

import biz.turnonline.ecosystem.billing.ProductBilling;
import biz.turnonline.ecosystem.billing.ProductBillingScopes;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.common.base.Strings;
import org.ctoolkit.restapi.client.adapter.ClientApiProvider;
import org.ctoolkit.restapi.client.adapter.GoogleApiProxyFactory;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Collection;

import static biz.turnonline.ecosystem.billing.facade.ProductBillingClientModule.API_PREFIX;

/**
 * The {@link ProductBilling} API client implementation.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
@Singleton
class ProductBillingProvider
        extends ClientApiProvider<ProductBilling>
{
    @Inject
    ProductBillingProvider( @Nonnull GoogleApiProxyFactory factory )
    {
        super( factory );
    }

    @Override
    protected Collection<String> defaultScopes()
    {
        return ProductBillingScopes.all();
    }

    @Override
    protected String api()
    {
        return API_PREFIX;
    }

    @Override
    protected ProductBilling build( @Nonnull GoogleApiProxyFactory factory,
                                    @Nonnull HttpTransport transport,
                                    @Nonnull JsonFactory jsonFactory,
                                    @Nonnull HttpRequestInitializer credential,
                                    @Nonnull String api )
    {
        String applicationName = factory.getApplicationName( api );
        String endpointUrl = factory.getEndpointUrl( api );

        ProductBilling.Builder builder = new ProductBilling.Builder( transport, jsonFactory, credential );
        builder.setApplicationName( applicationName );

        if ( !Strings.isNullOrEmpty( endpointUrl ) )
        {
            builder.setRootUrl( endpointUrl );
        }

        return builder.build();
    }
}
