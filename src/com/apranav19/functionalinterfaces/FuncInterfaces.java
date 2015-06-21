package com.apranav19.functionalinterfaces;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * A driver program that creates a GBP To USD converter
 * Created by pranav on 6/21/15.
 */
public class FuncInterfaces {
    public static void main(String [] args){
        // Setup exchange rate
        final BigDecimal EXCHANGE_RATE = new BigDecimal(1.59);

        // Create a converter which computes the USD value
        GBPToUSDConverter converter = (pound) -> pound.multiply(EXCHANGE_RATE);

        // Let's convert an actual amount
        // We're using BigDecimal simply because it provides a neat way to round decimals
        BigDecimal pounds = new BigDecimal(49.99).round(new MathContext(4, RoundingMode.HALF_UP));
        BigDecimal dollars = converter.convert(pounds).round(new MathContext(4, RoundingMode.HALF_UP));

        System.out.println(pounds + " is equivalent to " + dollars + " dollars");
    }
}
