package solid.products.drink;

import solid.BaseProduct;

public class Lemonade extends BaseProduct {

    public static final double CALORIES_PER_100_GRAMS = 53.0;
    public static final double DENSITY = 0.7;

    private double milliliters;

    public Lemonade(double milliliters) {
        this.milliliters = milliliters;
    }

    public double getMilliliters() {
        return milliliters;
    }

    @Override
    public double getCalorie() {
        double grams = (this.getMilliliters()) * DENSITY;
        return (CALORIES_PER_100_GRAMS / 100) * grams;
    }

    @Override
    public double getAmountKG() {
        double litters = this.milliliters / 1000;
        return litters * DENSITY;
    }

}
