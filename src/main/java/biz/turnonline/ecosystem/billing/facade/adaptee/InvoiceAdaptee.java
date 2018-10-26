package biz.turnonline.ecosystem.billing.facade.adaptee;

import biz.turnonline.ecosystem.billing.Billing;
import biz.turnonline.ecosystem.billing.model.Invoice;
import com.google.common.base.MoreObjects;
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
 * The {@link Invoice} adaptee implementation.
 *
 * @author <a href="mailto:aurel.medvegy@ctoolkit.org">Aurel Medvegy</a>
 */
@Singleton
public class InvoiceAdaptee
        extends AbstractGoogleClientAdaptee<Billing>
        implements RestExecutorAdaptee<Invoice>
{
    @Inject
    public InvoiceAdaptee( Billing client )
    {
        super( client );
    }

    @Override
    public Object prepareDelete( @Nonnull Identifier identifier ) throws IOException
    {
        Long orderId = identifier.getLong();
        Long invoiceId = identifier.child().getLong();
        return client().orders().invoices().delete( orderId, invoiceId );
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
        Long orderId = identifier.getLong();
        Long invoiceId = identifier.child().getLong();
        return client().orders().invoices().get( orderId, invoiceId );
    }

    @Override
    public Invoice executeGet( @Nonnull Object request,
                               @Nullable Map<String, Object> parameters,
                               @Nullable Locale locale ) throws IOException
    {
        return ( Invoice ) execute( request, parameters );
    }

    @Override
    public Object prepareInsert( @Nonnull Invoice resource,
                                 @Nullable Identifier parent,
                                 @Nullable MediaProvider provider ) throws IOException
    {
        if ( parent == null )
        {
            return client().invoices().insert( resource );
        }
        else
        {
            Long orderId = parent.getLong();
            return client().orders().invoices().insert( orderId, resource );
        }
    }

    @Override
    public Object executeInsert( @Nonnull Object request,
                                 @Nullable Map<String, Object> parameters,
                                 @Nullable Locale locale ) throws IOException
    {
        return execute( request, parameters );
    }

    @Override
    public Object prepareList( @Nullable Identifier parent ) throws IOException
    {
        if ( parent == null )
        {
            return client().invoices().list();
        }
        else
        {
            Long orderId = parent.getLong();
            return client().orders().invoices().list( orderId );
        }
    }

    @Override
    public List<Invoice> executeList( @Nonnull Object request,
                                      @Nullable Map<String, Object> parameters,
                                      @Nullable Locale locale,
                                      @Nullable Integer offset,
                                      @Nullable Integer limit,
                                      @Nullable String orderBy,
                                      @Nullable Boolean ascending ) throws IOException
    {
        fill( request, parameters );

        if ( request instanceof Billing.Invoices.List )
        {
            Billing.Invoices.List list = ( Billing.Invoices.List ) request;

            if ( offset != null && offset > 0 )
            {
                list.setOffset( offset );
            }
            if ( limit != null && limit > 0 )
            {
                list.setLimit( limit );
            }

            return list.execute().getItems();

        }
        else if ( request instanceof Billing.Orders.Invoices.List )
        {
            Billing.Orders.Invoices.List list = ( Billing.Orders.Invoices.List ) request;

            if ( offset != null && offset > 0 )
            {
                list.setOffset( offset );
            }
            if ( limit != null && limit > 0 )
            {
                list.setLimit( limit );
            }

            return list.execute().getItems();
        }
        else
        {
            String message = "Unsupported request " + request.getClass().getName()
                    + MoreObjects.toStringHelper( "Input" )
                    .add( "locale", locale )
                    .add( "offset", offset )
                    .add( "limit", limit )
                    .add( "orderBy", orderBy )
                    .add( "ascending", ascending )
                    .addValue( parameters )
                    .toString();

            throw new IllegalArgumentException( message );
        }
    }

    @Override
    public Object prepareUpdate( @Nonnull Invoice resource,
                                 @Nonnull Identifier identifier,
                                 @Nullable MediaProvider provider ) throws IOException
    {
        Long orderId = identifier.getLong();
        Long invoiceId = identifier.child().getLong();
        return client().orders().invoices().update( orderId, invoiceId, resource );
    }

    @Override
    public Object executeUpdate( @Nonnull Object request,
                                 @Nullable Map<String, Object> parameters,
                                 @Nullable Locale locale ) throws IOException
    {
        return execute( request, parameters );
    }
}
