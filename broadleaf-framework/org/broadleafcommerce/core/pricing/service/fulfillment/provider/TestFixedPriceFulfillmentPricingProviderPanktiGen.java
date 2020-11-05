package org.broadleafcommerce.core.pricing.service.fulfillment.provider;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestFixedPriceFulfillmentPricingProviderPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testCanCalculateCostForFulfillmentGroup1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.pricing.service.fulfillment.provider.FixedPriceFulfillmentPricingProvider/>";
        org.broadleafcommerce.core.pricing.service.fulfillment.provider.FixedPriceFulfillmentPricingProvider receivingObject = (org.broadleafcommerce.core.pricing.service.fulfillment.provider.FixedPriceFulfillmentPricingProvider) xStream.fromXML(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.pricing.service.fulfillment.provider.FixedPriceFulfillmentPricingProvider.canCalculateCostForFulfillmentGroup1-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsObjectStr = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.FulfillmentGroup paramObject1 = (org.broadleafcommerce.core.order.domain.FulfillmentGroup) paramObjects[0];
        org.broadleafcommerce.core.order.domain.FulfillmentOption paramObject2 = (org.broadleafcommerce.core.order.domain.FulfillmentOption) paramObjects[1];
        Assert.assertEquals(true, receivingObject.canCalculateCostForFulfillmentGroup(paramObject1, paramObject2));
    }

    @Test
    public void testCanCalculateCostForFulfillmentGroup2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.pricing.service.fulfillment.provider.FixedPriceFulfillmentPricingProvider/>";
        org.broadleafcommerce.core.pricing.service.fulfillment.provider.FixedPriceFulfillmentPricingProvider receivingObject = (org.broadleafcommerce.core.pricing.service.fulfillment.provider.FixedPriceFulfillmentPricingProvider) xStream.fromXML(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.broadleafcommerce.core.pricing.service.fulfillment.provider.FixedPriceFulfillmentPricingProvider.canCalculateCostForFulfillmentGroup2-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsObjectStr = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.FulfillmentGroup paramObject1 = (org.broadleafcommerce.core.order.domain.FulfillmentGroup) paramObjects[0];
        org.broadleafcommerce.core.order.domain.FulfillmentOption paramObject2 = (org.broadleafcommerce.core.order.domain.FulfillmentOption) paramObjects[1];
        Assert.assertEquals(true, receivingObject.canCalculateCostForFulfillmentGroup(paramObject1, paramObject2));
    }
}