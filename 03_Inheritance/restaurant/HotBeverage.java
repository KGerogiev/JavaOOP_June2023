package restaurant;

import java.math.BigDecimal;

public class HotBeverage extends Beverage {
    //extended fields: name, price, milliliters

    //constructor
    public HotBeverage(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }
}
