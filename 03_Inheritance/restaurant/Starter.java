package restaurant;

import java.math.BigDecimal;

public class Starter extends Food {
    //extended fields: name, price, grams

    //constructor
    public Starter(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }
}
