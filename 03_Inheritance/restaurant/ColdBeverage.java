package restaurant;

import java.math.BigDecimal;

public class ColdBeverage extends Beverage {
    //extended fields: name, price, milliliters

    //constructor
    public ColdBeverage(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }
}
