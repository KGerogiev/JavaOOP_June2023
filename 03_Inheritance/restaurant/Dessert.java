package restaurant;

import java.math.BigDecimal;

public class Dessert extends Food {
    //extended fields: name, price, grams

    //field
    private double calories;

    //constructor
    public Dessert(String name, BigDecimal price, double grams, double calories) {
        super(name, price, grams);
        this.setCalories(calories);
    }

    //methods
    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}
