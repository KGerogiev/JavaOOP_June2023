package restaurant;

import java.math.BigDecimal;

public class Soup extends Starter {
    //extended fields: name, price, grams

    //constructor
    public Soup(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }
}
