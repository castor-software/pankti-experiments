package org.apache.pdfbox.util;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestSmallMapPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testSize1() {
        String receivingXML = "<org.apache.pdfbox.util.SmallMap><mapArr><org.apache.pdfbox.cos.COSName><direct>false</direct><name>Length</name><hashCode>-2022496506</hashCode></org.apache.pdfbox.cos.COSName><org.apache.pdfbox.cos.COSInteger><direct>false</direct><value>593</value></org.apache.pdfbox.cos.COSInteger><org.apache.pdfbox.cos.COSName><direct>false</direct><name>Filter</name><hashCode>2104342424</hashCode></org.apache.pdfbox.cos.COSName><org.apache.pdfbox.cos.COSName><direct>true</direct><name>FlateDecode</name><hashCode>1578622202</hashCode></org.apache.pdfbox.cos.COSName></mapArr></org.apache.pdfbox.util.SmallMap>";
        SmallMap receivingObject = (SmallMap) xStream.fromXML(receivingXML);
        String returnedXML = "<int>2</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(returnedObject, receivingObject.size());
    }

    @Test
    public void testSize2() {
        String receivingXML = "<org.apache.pdfbox.util.SmallMap><mapArr><org.apache.pdfbox.cos.COSName><direct>false</direct><name>Length</name><hashCode>-2022496506</hashCode></org.apache.pdfbox.cos.COSName><org.apache.pdfbox.cos.COSInteger><direct>false</direct><value>714</value></org.apache.pdfbox.cos.COSInteger><org.apache.pdfbox.cos.COSName><direct>false</direct><name>Filter</name><hashCode>2104342424</hashCode></org.apache.pdfbox.cos.COSName><org.apache.pdfbox.cos.COSName><direct>true</direct><name>FlateDecode</name><hashCode>1578622202</hashCode></org.apache.pdfbox.cos.COSName></mapArr></org.apache.pdfbox.util.SmallMap>";
        SmallMap receivingObject = (SmallMap) xStream.fromXML(receivingXML);
        String returnedXML = "<int>2</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(returnedObject, receivingObject.size());
    }

    @Test
    public void testSize3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.util.SmallMap.size3-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            SmallMap receivingObject = (SmallMap) xStream.fromXML(receivingXML);
            String returnedXML = "<int>6</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.size());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testSize4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.util.SmallMap.size4-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            SmallMap receivingObject = (SmallMap) xStream.fromXML(receivingXML);
            String returnedXML = "<int>6</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.size());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }
}