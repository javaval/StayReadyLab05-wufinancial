package com.codedifferently.stayready;

import org.junit.Test;
import org.junit.Assert;

public class CurrencyConversionTest{
    @Test
    public void USDToEURTest(){
        //Given
        CurrencyMethods conv = new CurrencyMethods();
        conv.initRateMap();
        double USD = 150.0;
        double expected = 141.0;
        //When
        double actual = conv.fromUSD(USD, "EUR");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }


    @Test
    public void EURtoUSDTest(){
        //Given
        CurrencyMethods conv = new CurrencyMethods();
        conv.initRateMap();
        double EUR = 150.0;
        double expected = 150.0;
        //When
        double actual = Math.round(conv.fromUSD(EUR, "USD"));
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void EURtoGBPTest(){
        //Given
        CurrencyMethods conv = new CurrencyMethods();
        conv.initRateMap();
        double EUR = 150.0;
        double expected = 123.0;
        //When
        double actual = Math.round(conv.fromUSD(EUR, "GBP"));
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }
    

    @Test
    public void GBPtoINRTest(){
        //Given
        CurrencyMethods conv = new CurrencyMethods();
        conv.initRateMap();
        double GBP = 150.0;
        double expected = 10248.0;
        //When
        double actual = Math.round(conv.fromUSD(GBP, "INR"));
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void INRtoCADTest(){
        CurrencyMethods conv = new CurrencyMethods();
        conv.initRateMap();
        double INR = 150.0;
        double expected = 198.0;
        //When
        double actual = conv.fromUSD(INR, "CAD");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void CADtoSGDTest(){
        //Given
        CurrencyMethods conv = new CurrencyMethods();
        conv.initRateMap();
        double INR = 150.0;
        double expected = 198.0;
        //When
        double actual = conv.fromUSD(INR, "CAD");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void SGDtoCHFTest(){
         //Given
         CurrencyMethods conv = new CurrencyMethods();
         conv.initRateMap();
         double SGD = 150.0;
         double expected = 151.5;
         //When
         double actual = conv.fromUSD(SGD, "CHF");
         //Then
         Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void CHFtoMYRTest(){
        //Given
        CurrencyMethods conv = new CurrencyMethods();
        conv.initRateMap();
        double CHF = 150.0;
        double expected = 670.5;
        //When
        double actual = conv.fromUSD(CHF, "MYR");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void MYRtoJPYTest(){
        //Given
        CurrencyMethods conv = new CurrencyMethods();
        conv.initRateMap();
        double MYR = 150.0;
        double expected = 17376.0;
        //When
        double actual = conv.fromUSD(MYR, "JPY");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void JPYtoRMBTest(){
        //Given
        CurrencyMethods conv = new CurrencyMethods();
        conv.initRateMap();
        double JPY = 150.0;
        double expected = 1038.0;
        //When
        double actual = conv.fromUSD(JPY, "RMB");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }


}
