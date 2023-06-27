package PizzaCalories_04;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;  //"Pizza name should be between 1 and 15 symbols.
    private Dough dough;
    private List<Topping> toppings;  //[0..10] - Number of toppings should be in range [0..10].

    //methods
    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.setToppings(numberOfToppings);
    }

    private void setName(String name) {
        if (!name.trim().isEmpty() && name.trim().length() <= 15) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setToppings(int countToppings) {
        if (countToppings >= 0 && countToppings <= 10) {
            this.toppings = new ArrayList<>(countToppings);
        } else {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories() {
        double calloriestDough = this.dough.calculateCalories();
        double calloriesToppings = 0;
        for (Topping topping : this.toppings) {
            calloriesToppings += topping.calculateCalories();
        }
        return calloriestDough + calloriesToppings;
    }
}
