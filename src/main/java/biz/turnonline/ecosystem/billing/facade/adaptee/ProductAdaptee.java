package biz.turnonline.ecosystem.billing.facade.adaptee;

import biz.turnonline.ecosystem.billing.ProductBilling;
import biz.turnonline.ecosystem.billing.model.Product;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.MediaProvider;
import org.ctoolkit.restapi.client.adaptee.RestExecutorAdaptee;
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
 * The {@link Product} adaptee implementation.
 *
 * @author <a href="mailto:aurel.medvegy@ctoolkit.org">Aurel Medvegy</a>
 */
@Singleton
public class ProductAdaptee
        extends AbstractGoogleClientAdaptee<ProductBilling>
        implements RestExecutorAdaptee<Product>
{
    @Inject
    public ProductAdaptee( ProductBilling client )
    {
        super( client );
    }

    @Override
    public Object prepareDelete( @Nonnull Identifier identifier ) throws IOException
    {
        return client().products().delete( identifier.getLong() );
    }

    @Override
    public Object executeDelete( @Nonnull Object request,
                                 @Nullable Map<String, Object> parameters,
                                 @Nullable Locale locale ) throws IOException
    {
        return execute( request, parameters );
    }

    @Override
    public Object prepareGet( @Nonnull Identifier identifier ) throws IOException
    {
        return client().products().get( identifier.getLong() );
    }

    @Override
    public Product executeGet( @Nonnull Object request,
                               @Nullable Map<String, Object> parameters,
                               @Nullable Locale locale ) throws IOException
    {
        return ( Product ) execute( request, parameters );
    }

    @Override
    public Object prepareInsert( @Nonnull Product resource,
                                 @Nullable Identifier parentKey,
                                 @Nullable MediaProvider provider ) throws IOException
    {
        return client().products().insert( resource );
    }

    @Override
    public Object executeInsert( @Nonnull Object request,
                                 @Nullable Map<String, Object> parameters,
                                 @Nullable Locale locale ) throws IOException
    {
        return execute( request, parameters );
    }

    @Override
    public Object prepareList( @Nullable Identifier parentKey ) throws IOException
    {
        return client().products().list();
    }

    @Override
    public List<Product> executeList( @Nonnull Object request,
                                      @Nullable Map<String, Object> parameters,
                                      @Nullable Locale locale,
                                      @Nullable Integer offset,
                                      @Nullable Integer limit,
                                      @Nullable String orderBy,
                                      @Nullable Boolean ascending ) throws IOException
    {
        ProductBilling.Products.List list = ( ProductBilling.Products.List ) request;

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

    @Override
    public Object prepareUpdate( @Nonnull Product resource,
                                 @Nonnull Identifier identifier,
                                 @Nullable MediaProvider provider ) throws IOException
    {
        return client().products().update( identifier.getLong(), resource );
    }

    @Override
    public Object executeUpdate( @Nonnull Object request,
                                 @Nullable Map<String, Object> parameters,
                                 @Nullable Locale locale ) throws IOException
    {
        return execute( request, parameters );
    }
}
