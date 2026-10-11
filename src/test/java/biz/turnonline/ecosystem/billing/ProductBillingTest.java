/*
 * Copyright (c) 2026 TurnOnline.biz s.r.o.
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

package biz.turnonline.ecosystem.billing;

import biz.turnonline.ecosystem.billing.model.CompleteOffer;
import biz.turnonline.ecosystem.billing.model.PartnerMetadata;
import biz.turnonline.ecosystem.billing.model.Product;
import biz.turnonline.ecosystem.billing.model.SendOfferRequest;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.json.Json;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.client.testing.http.MockHttpTransport;
import com.google.api.client.testing.http.MockLowLevelHttpRequest;
import com.google.api.client.testing.http.MockLowLevelHttpResponse;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

/**
 * The model fields and methods added to match {@code swagger2.json}.
 */
public class ProductBillingTest
{
    private String method;

    private MockLowLevelHttpRequest request;

    @Test
    public void productParsesBreadcrumbPartnerAndPublishingSummary() throws IOException
    {
        String json = "{"
                + "\"breadcrumb\":[\"Home\",\"Toys\"],"
                + "\"partner\":{\"id\":\"P-1\","
                + "\"logistics\":{\"width\":10.5,\"height\":2.0,\"depth\":3.0,\"weight\":0.4},"
                + "\"trade\":{\"ean13\":\"8588000000001\",\"intrastat\":\"95030070\"},"
                + "\"pricing\":{\"retailPrice\":19.9,\"wholesalePrice\":11.0,\"marketPrice\":21.5}},"
                + "\"publishing\":{\"generateSummary\":true},"
                + "\"metaFields\":{\"values\":{\"color\":{\"name\":\"red\"}}}"
                + "}";

        Product product = GsonFactory.getDefaultInstance().fromString( json, Product.class );

        assertThat( product.getBreadcrumb() ).containsExactly( "Home", "Toys" ).inOrder();

        PartnerMetadata partner = product.getPartner();
        assertThat( partner.getId() ).isEqualTo( "P-1" );
        assertThat( partner.getLogistics().getWidth() ).isEqualTo( 10.5 );
        assertThat( partner.getLogistics().getHeight() ).isEqualTo( 2.0 );
        assertThat( partner.getLogistics().getDepth() ).isEqualTo( 3.0 );
        assertThat( partner.getLogistics().getWeight() ).isEqualTo( 0.4 );
        assertThat( partner.getTrade().getEan13() ).isEqualTo( "8588000000001" );
        assertThat( partner.getTrade().getIntrastat() ).isEqualTo( "95030070" );
        assertThat( partner.getPricing().getRetailPrice() ).isEqualTo( 19.9 );
        assertThat( partner.getPricing().getWholesalePrice() ).isEqualTo( 11.0 );
        assertThat( partner.getPricing().getMarketPrice() ).isEqualTo( 21.5 );

        assertThat( product.getPublishing().getGenerateSummary() ).isTrue();

        Object color = product.getMetaFields().getValues().get( "color" );
        assertWithMessage( "Meta field value of an object type" )
                .that( ( Map<?, ?> ) color )
                .containsEntry( "name", "red" );
    }

    @Test
    public void offersSendPostsCustomerIdToOfferPath() throws IOException
    {
        MockHttpTransport transport = new MockHttpTransport()
        {
            @Override
            public LowLevelHttpRequest buildRequest( String method, String url )
            {
                ProductBillingTest.this.method = method;
                request = new MockLowLevelHttpRequest( url );
                request.setResponse( new MockLowLevelHttpResponse()
                        .setContentType( Json.MEDIA_TYPE )
                        .setContent( "{\"id\":\"7\"}" ) );
                return request;
            }
        };

        ProductBilling billing = new ProductBilling.Builder( transport, GsonFactory.getDefaultInstance(), null )
                .setApplicationName( "test" )
                .build();

        CompleteOffer offer = billing.offers()
                .send( 7L, new SendOfferRequest().setCustomerId( 42L ) )
                .execute();

        assertThat( method ).isEqualTo( "POST" );
        assertThat( request.getUrl() ).isEqualTo( ProductBilling.DEFAULT_BASE_URL + "offers/7/send" );
        assertThat( request.getContentAsString() ).isEqualTo( "{\"customerId\":\"42\"}" );
        assertThat( offer.getId() ).isEqualTo( 7L );
    }
}
