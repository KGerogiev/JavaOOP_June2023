package restaurant;

import java.math.BigDecimal;

public class Tea extends HotBeverage {
    //extended fields: name, price, milliliters

    //constructor
    public Tea(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }
}
