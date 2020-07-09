package com.codedifferently.stayready;
import java.util.HashMap;

public class CurrencyConversions{


    private CurrencyMethods methods;
    private HashMap convRates;

    public CurrencyConversions() {
        this.methods = new CurrencyMethods();
        this.convRates = new HashMap<String, Double>();
    }

    public static void main(String[] args) {
        CurrencyConversions converter = new CurrencyConversions();
        converter.initRateMap();

        

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
