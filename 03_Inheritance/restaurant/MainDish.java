package restaurant;

import java.math.BigDecimal;

public class MainDish extends Food {
    //extended fields: name, price, grams

    //constructor
    public MainDish(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }
}
