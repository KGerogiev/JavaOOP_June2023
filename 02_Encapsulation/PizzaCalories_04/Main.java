package PizzaCalories_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaData = scanner.nextLine().split("\\s+");  //Pizza {pizzaName} {numberOfToppings
        String[] doughData = scanner.nextLine().split("\\s+");  //Dough {flourType} {bakingTechnique} {weightInGrams}

        String pizzaName = pizzaData[1];
        int numberOfToppings = Integer.parseInt(pizzaData[2]);
        String flourType = doughData[1];
        String backingTechnique = doughData[2];
        double weight = Double.parseDouble(doughData[3]);

        Pizza pizza = new Pizza(pizzaName, numberOfToppings);
        Dough dough = new Dough(flourType, backingTechnique, weight);
        pizza.setDough(dough);

        String addTopping = scanner.nextLine();

        while (!addTopping.equals("END")) {
            //Topping {toppingType} {weightInGrams}
            String[] toppingData = addTopping.split("\\s+");
            String toppingType = toppingData[1];
            double weightTopping = Double.parseDouble(toppingData[2]);

            Topping topping = new Topping(toppingType, weightTopping);
            pizza.addTopping(topping);

            addTopping = scanner.nextLine();
        }

        System.out.println(pizza.getName() + " - " + pizza.getOverallCalories());
    }
}
