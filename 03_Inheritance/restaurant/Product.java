package restaurant;

import java.math.BigDecimal;

public class Product {
    //fields
    private String name;
    private BigDecimal price;

    //constructor
    public Product(String name, BigDecimal price) {
        this.setName(name);
        this.setPrice(price);
    }

    //methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
