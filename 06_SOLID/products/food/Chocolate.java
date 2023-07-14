package solid.products.food;

import solid.BaseProduct;

public class Chocolate extends BaseProduct {

    public static final double CALORIES_PER_100_GRAMS = 575.0;

    private double grams;

    public Chocolate(double grams) {
        this.grams = grams;
    }

    public double getGrams() {
        return grams;
    }

    @Override
    public double getCalorie() {
        return (CALORIES_PER_100_GRAMS / 100) * (this.getGrams());
    }

    @Override
    public double getAmountKG() {
        return this.grams / 1000;
    }

}
