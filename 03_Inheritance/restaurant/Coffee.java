package restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage {
    //extended fields: name, price, milliliters

    //constant
    private static final double COFFEE_MILLILITERS = 50;
    private static final BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.50);

    //fields
    private double caffeine;

    //constructor
    public Coffee(String name, double caffeine) {
        super(name, COFFEE_PRICE, COFFEE_MILLILITERS);
        this.setCaffeine(caffeine);
    }

    //methods
    public double getCaffeine() {
        return caffeine;
    }

    public void setCaffeine(double caffeine) {
        this.caffeine = caffeine;
    }
}
