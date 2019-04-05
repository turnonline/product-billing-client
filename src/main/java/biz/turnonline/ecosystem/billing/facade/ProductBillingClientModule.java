package biz.turnonline.ecosystem.billing.facade;

import biz.turnonline.ecosystem.billing.ProductBilling;
import com.google.inject.AbstractModule;

/**
 * The Product Billing Client guice module as a default configuration.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class ProductBillingClientModule
        extends AbstractModule
{
    public static final String API_PREFIX = "billing";

    @Override
    protected void configure()
    {
        bind( ProductBilling.class ).toProvider( ProductBillingProvider.class );
    }
}
