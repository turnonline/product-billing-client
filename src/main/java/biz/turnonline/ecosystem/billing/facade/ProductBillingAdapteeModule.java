/*
 * Copyright (c) 2020 TurnOnline.biz s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package biz.turnonline.ecosystem.billing.facade;

import biz.turnonline.ecosystem.billing.facade.adaptee.AccountingSystemAdaptee;
import biz.turnonline.ecosystem.billing.facade.adaptee.BillingUnitAdaptee;
import biz.turnonline.ecosystem.billing.facade.adaptee.ExpenditureAdaptee;
import biz.turnonline.ecosystem.billing.facade.adaptee.IncomingInvoiceAdaptee;
import biz.turnonline.ecosystem.billing.facade.adaptee.IncomingInvoiceListAdaptee;
import biz.turnonline.ecosystem.billing.facade.adaptee.InvoiceAdaptee;
import biz.turnonline.ecosystem.billing.facade.adaptee.NumberSeriesAdaptee;
import biz.turnonline.ecosystem.billing.facade.adaptee.OrderAdaptee;
import biz.turnonline.ecosystem.billing.facade.adaptee.PricingAdaptee;
import biz.turnonline.ecosystem.billing.facade.adaptee.PricingItemAdaptee;
import biz.turnonline.ecosystem.billing.facade.adaptee.ProductAdaptee;
import biz.turnonline.ecosystem.billing.facade.adaptee.ProductPictureAdaptee;
import biz.turnonline.ecosystem.billing.facade.adaptee.ProductPublishingAdaptee;
import biz.turnonline.ecosystem.billing.facade.adaptee.PurchaseOrderDeleteAdaptee;
import biz.turnonline.ecosystem.billing.facade.adaptee.PurchaseOrderGetAdaptee;
import biz.turnonline.ecosystem.billing.facade.adaptee.PurchaseOrderListAdaptee;
import biz.turnonline.ecosystem.billing.facade.adaptee.TransactionAdaptee;
import biz.turnonline.ecosystem.billing.facade.adaptee.VatRateAdaptee;
import biz.turnonline.ecosystem.billing.model.AccountingSystem;
import biz.turnonline.ecosystem.billing.model.BillingUnit;
import biz.turnonline.ecosystem.billing.model.Expenditure;
import biz.turnonline.ecosystem.billing.model.IncomingInvoice;
import biz.turnonline.ecosystem.billing.model.Invoice;
import biz.turnonline.ecosystem.billing.model.NumberSeries;
import biz.turnonline.ecosystem.billing.model.Order;
import biz.turnonline.ecosystem.billing.model.Pricing;
import biz.turnonline.ecosystem.billing.model.PricingItem;
import biz.turnonline.ecosystem.billing.model.Product;
import biz.turnonline.ecosystem.billing.model.ProductPicture;
import biz.turnonline.ecosystem.billing.model.ProductPublishing;
import biz.turnonline.ecosystem.billing.model.PurchaseOrder;
import biz.turnonline.ecosystem.billing.model.Transaction;
import biz.turnonline.ecosystem.billing.model.VatRate;
import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import org.ctoolkit.restapi.client.adaptee.DeleteExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.DownloadExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.GetExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.InsertExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.ListExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.UpdateExecutorAdaptee;

/**
 * The product billing guice default adaptee configuration.
 *
 * @author <a href="mailto:aurel.medvegy@ctoolkit.org">Aurel Medvegy</a>
 */
public class ProductBillingAdapteeModule
        extends AbstractModule
{
    @Override
    protected void configure()
    {
        // Product
        bind( new TypeLiteral<GetExecutorAdaptee<Product>>()
        {
        } ).to( ProductAdaptee.class );

        bind( new TypeLiteral<ListExecutorAdaptee<Product>>()
        {
        } ).to( ProductAdaptee.class );

        bind( new TypeLiteral<InsertExecutorAdaptee<Product>>()
        {
        } ).to( ProductAdaptee.class );

        bind( new TypeLiteral<UpdateExecutorAdaptee<Product>>()
        {
        } ).to( ProductAdaptee.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<Product>>()
        {
        } ).to( ProductAdaptee.class );

        // ProductPublishing
        bind( new TypeLiteral<GetExecutorAdaptee<ProductPublishing>>()
        {
        } ).to( ProductPublishingAdaptee.class );

        bind( new TypeLiteral<UpdateExecutorAdaptee<ProductPublishing>>()
        {
        } ).to( ProductPublishingAdaptee.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<ProductPublishing>>()
        {
        } ).to( ProductPublishingAdaptee.class );

        // ProductPicture
        bind( new TypeLiteral<DeleteExecutorAdaptee<ProductPicture>>()
        {
        } ).to( ProductPictureAdaptee.class );

        // NumberSeries
        bind( new TypeLiteral<ListExecutorAdaptee<NumberSeries>>()
        {
        } ).to( NumberSeriesAdaptee.class );

        // VatRate
        bind( new TypeLiteral<ListExecutorAdaptee<VatRate>>()
        {
        } ).to( VatRateAdaptee.class );

        // BillingUnit
        bind( new TypeLiteral<ListExecutorAdaptee<BillingUnit>>()
        {
        } ).to( BillingUnitAdaptee.class );

        // Order
        bind( new TypeLiteral<GetExecutorAdaptee<Order>>()
        {
        } ).to( OrderAdaptee.class );

        bind( new TypeLiteral<ListExecutorAdaptee<Order>>()
        {
        } ).to( OrderAdaptee.class );

        bind( new TypeLiteral<InsertExecutorAdaptee<Order>>()
        {
        } ).to( OrderAdaptee.class );

        bind( new TypeLiteral<UpdateExecutorAdaptee<Order>>()
        {
        } ).to( OrderAdaptee.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<Order>>()
        {
        } ).to( OrderAdaptee.class );

        // Purchase Order
        bind( new TypeLiteral<GetExecutorAdaptee<PurchaseOrder>>()
        {
        } ).to( PurchaseOrderGetAdaptee.class );

        bind( new TypeLiteral<ListExecutorAdaptee<PurchaseOrder>>()
        {
        } ).to( PurchaseOrderListAdaptee.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<PurchaseOrder>>()
        {
        } ).to( PurchaseOrderDeleteAdaptee.class );


        // Invoice
        bind( new TypeLiteral<GetExecutorAdaptee<Invoice>>()
        {
        } ).to( InvoiceAdaptee.class );

        bind( new TypeLiteral<ListExecutorAdaptee<Invoice>>()
        {
        } ).to( InvoiceAdaptee.class );

        bind( new TypeLiteral<InsertExecutorAdaptee<Invoice>>()
        {
        } ).to( InvoiceAdaptee.class );

        bind( new TypeLiteral<UpdateExecutorAdaptee<Invoice>>()
        {
        } ).to( InvoiceAdaptee.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<Invoice>>()
        {
        } ).to( InvoiceAdaptee.class );

        bind( new TypeLiteral<DownloadExecutorAdaptee<Invoice>>()
        {
        } ).to( InvoiceAdaptee.class );

        // Incoming Invoice
        bind( new TypeLiteral<GetExecutorAdaptee<IncomingInvoice>>()
        {
        } ).to( IncomingInvoiceAdaptee.class );

        bind( new TypeLiteral<ListExecutorAdaptee<IncomingInvoice>>()
        {
        } ).to( IncomingInvoiceListAdaptee.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<IncomingInvoice>>()
        {
        } ).to( IncomingInvoiceAdaptee.class );

        // PricingItem
        bind( new TypeLiteral<GetExecutorAdaptee<PricingItem>>()
        {
        } ).to( PricingItemAdaptee.class );

        bind( new TypeLiteral<ListExecutorAdaptee<PricingItem>>()
        {
        } ).to( PricingItemAdaptee.class );

        bind( new TypeLiteral<InsertExecutorAdaptee<PricingItem>>()
        {
        } ).to( PricingItemAdaptee.class );

        bind( new TypeLiteral<UpdateExecutorAdaptee<PricingItem>>()
        {
        } ).to( PricingItemAdaptee.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<PricingItem>>()
        {
        } ).to( PricingItemAdaptee.class );

        // Pricing
        bind( new TypeLiteral<InsertExecutorAdaptee<Pricing>>()
        {
        } ).to( PricingAdaptee.class );

        // AccountingSystem
        bind( new TypeLiteral<UpdateExecutorAdaptee<AccountingSystem>>()
        {
        } ).to( AccountingSystemAdaptee.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<AccountingSystem>>()
        {
        } ).to( AccountingSystemAdaptee.class );

        // Transaction
        bind( new TypeLiteral<InsertExecutorAdaptee<Transaction>>()
        {
        } ).to( TransactionAdaptee.class );

        // Expense
        bind( new TypeLiteral<InsertExecutorAdaptee<Expenditure>>()
        {
        } ).to( ExpenditureAdaptee.class );
    }
}
