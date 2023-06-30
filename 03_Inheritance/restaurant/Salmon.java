package restaurant;

import java.math.BigDecimal;

public class Salmon extends MainDish {
    //extended fields: name, price, grams

    //constant
    private static final double SALMON_GRAMS = 22;

    //constructor
    public Salmon(String name, BigDecimal price) {
        super(name, price, SALMON_GRAMS);
    }
}
