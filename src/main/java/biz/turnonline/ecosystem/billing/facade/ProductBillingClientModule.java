package biz.turnonline.ecosystem.billing.facade;

import biz.turnonline.ecosystem.billing.Billing;
import biz.turnonline.ecosystem.billing.BillingScopes;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.common.base.Strings;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import org.ctoolkit.restapi.client.AccessToken;
import org.ctoolkit.restapi.client.ApiToken;
import org.ctoolkit.restapi.client.RemoteServerErrorException;
import org.ctoolkit.restapi.client.UnauthorizedException;
import org.ctoolkit.restapi.client.googleapis.GoogleApiProxyFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Set;

/**
 * The Product Billing Client guice module as a default configuration.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class ProductBillingClientModule
        extends AbstractModule
{
    public static final String API_PREFIX = "billing";

    private static final Logger logger = LoggerFactory.getLogger( ProductBillingClientModule.class );

    private ApiToken<? extends HttpRequestInitializer> initialized;

    @Provides
    @Singleton
    Billing provideBilling( GoogleApiProxyFactory factory )
    {
        Set<String> scopes = BillingScopes.all();
        Billing.Builder builder;

        String applicationName = factory.getApplicationName( API_PREFIX );
        String endpointUrl = factory.getEndpointUrl( API_PREFIX );
        String serviceAccount = factory.getServiceAccountEmail( API_PREFIX );

        try
        {
            initialized = factory.authorize( scopes, null, API_PREFIX );
            HttpRequestInitializer credential = initialized.getCredential();

            builder = new Billing.Builder( factory.getHttpTransport(), factory.getJsonFactory(), credential );
            builder.setApplicationName( applicationName );

            if ( !Strings.isNullOrEmpty( endpointUrl ) )
            {
                builder.setRootUrl( endpointUrl );
            }
        }
        catch ( GeneralSecurityException e )
        {
            logger.error( "Scopes: " + scopes.toString()
                    + " Application name: " + applicationName
                    + " Service account: " + serviceAccount
                    + " Endpoint URL: " + endpointUrl, e );

            throw new UnauthorizedException( e.getMessage() );
        }
        catch ( IOException e )
        {
            logger.error( "Scopes: " + scopes.toString()
                    + " Application name: " + applicationName
                    + " Service account: " + serviceAccount
                    + " Endpoint URL: " + endpointUrl, e );

            throw new RemoteServerErrorException( e.getMessage() );
        }

        return builder.build();
    }

    @Provides
    @AccessToken( apiName = API_PREFIX )
    ApiToken.Data provideBillingApiTokenData( Billing client )
    {
        initialized.setServiceUrl( client.getBaseUrl() );
        return initialized.getTokenData();
    }
}
