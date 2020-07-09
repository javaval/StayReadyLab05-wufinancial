/*
 *@Author: Valerie Andy
 *
*/

package com.codedifferently.stayready;

import org.junit.Test;
import org.junit.Assert;


public class CurrencyConversionTest {

    @Test
    public void USDToEURTest(){
        CurrencyMethods cm = new CurrencyMethods();
        double USD = 15000.0;
        double expected = 14100.0;
        double actual = cm.convertCurrency(USD, cm.getRate("USD", "EUR  "));
        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void EURToGBPTest(){
        CurrencyMethods cm = new CurrencyMethods();
        double EUR = 15000.0;
        double expected = 13085.10;
        double actual = cm.convertCurrency(EUR, cm.getRate("EUR", "GBP"));
        Assert.assertEquals(expected, actual, 0.01);


    }

    @Test
    public void GBPToINRTest(){

    }

    @Test
    public void INRToCADTest(){

    }

    @Test
    public void CADToSGDTest(){

    }

    @Test
    public void SGDToCHFTest(){

    }

    @Test
    public void CHFToMYRTest(){

    }

    @Test
    public void MYRToJPYTest(){

    }

    @Test
    public void JPYToRMBTest(){

    }
}