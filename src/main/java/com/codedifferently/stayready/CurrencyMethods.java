package com.codedifferently.stayready;
import java.util.HashMap;

public class CurrencyMethods {

    HashMap<String, Double> convRates = new HashMap();
    
    public double convertCurrency(double amount, double rate){
        //Pseudocode
        //We want to be able to take any dollar amount and use the
        //exchange rate formula to return that amount as the requested currency.
        //We'll need:
        // convertCurrency(double Amount, double Rate): double
        // getRateByName(String curr1, String curr2): double


        return amount * rate;
    }

    //getRateByName(String curr1, String curr2): Double

    public double getRate(String curr1, String curr2){
        initRateMap();
        return convRates.get(curr2)/convRates.get(curr1);
    }

    public void initRateMap(){
        convRates.put("USD", 1.00);
        convRates.put("EUR", 0.94 );
        convRates.put("GBP", 0.82);
        convRates.put("INR", 68.32);
        convRates.put("AUD", 1.35);
        convRates.put("CAD", 1.32);
        convRates.put("SGD", 1.43);
        convRates.put("CHF", 1.01);
        convRates.put("MYR", 4.47);
        convRates.put("JPY", 115.84);
        convRates.put("RMB", 6.92);
    }


}