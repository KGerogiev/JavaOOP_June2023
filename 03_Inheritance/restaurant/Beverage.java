package restaurant;

import java.math.BigDecimal;

public class Beverage extends Product {
    //extended fields: name, price
    //field
    private double milliliters;

    //constructor
    public Beverage(String name, BigDecimal price, double milliliters) {
        super(name, price);
        this.setMilliliters(milliliters);
    }

    //methods
    public double getMilliliters() {
        return milliliters;
    }

    public void setMilliliters(double milliliters) {
        this.milliliters = milliliters;
    }
}
