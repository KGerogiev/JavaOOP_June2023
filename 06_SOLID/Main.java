package solid;

import solid.products.drink.Coke;
import solid.products.drink.Lemonade;
import solid.products.food.Chips;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<BaseProduct> products = new ArrayList<>();

        BaseProduct coke = new Coke(10);
        Lemonade lemonade = new Lemonade(10);

        Chips chips = new Chips(10);

        products.add(coke);
        products.add(lemonade);
        products.add(chips);

       Printer printer = new Printer(products);
        printer.printSum();
        printer.printAverage();
        printer.printAmountKG();
        printer.printAverageAmount();

    }
}
