package restaurant;

import java.math.BigDecimal;

public class Food extends Product{
    //extended fields: name, price
    //field
    private double grams;

    //constructor
    public Food(String name, BigDecimal price, double grams) {
        super(name, price);
        this.setGrams(grams);
    }

    //methods:
    public double getGrams() {
        return grams;
    }

    public void setGrams(double grams) {
        this.grams = grams;
    }
}
