package solid.products.food;

import solid.BaseProduct;

public class Chips extends BaseProduct {

    private final static double CALORIES_PER_100_GRAMS = 529;
    private double grams;


    public Chips(double grams) {
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
