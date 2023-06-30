package restaurant;

import java.math.BigDecimal;

public class Cake extends Dessert {
    //extended fields: name, price, grams, calories

    //constants
    private static final double CAKE_GRAMS = 250;
    private static final double CAKE_CALORIES = 1000;
    private static final BigDecimal CAKE_PRICE = new BigDecimal(5);

    //constructor
    public Cake(String name) {
        super(name, CAKE_PRICE, CAKE_GRAMS, CAKE_CALORIES);
    }
}
