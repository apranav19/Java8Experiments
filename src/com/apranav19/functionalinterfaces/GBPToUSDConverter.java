package com.apranav19.functionalinterfaces;

import java.math.BigDecimal;

/**
 * A functional interface that allows you to convert
 * An amount in British Pounds (GBP) to US Dollars (USD)
 * Created by pranav on 6/21/15.
 */

public interface GBPToUSDConverter {
    /**
     * The abstract method that will be defined by a lambda expression
     * This method will be implemented to convert between the 2 currencies
     * @param pound - The amount in GBP to be converted
     * @return The amount in USD
     */
    public BigDecimal convert(BigDecimal pound);
}
