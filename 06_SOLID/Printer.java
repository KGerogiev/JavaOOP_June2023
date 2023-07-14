package solid;

import java.util.List;

public class Printer {
    private static final String SUM = "Sum: %f";
    private static final String AVERAGE = "Average: %f";

    private List<BaseProduct> products;

    public Printer(List<BaseProduct> products) {
        this.products = products;
    }


    public void printSum() {
        CalorieCalculator calorieCalculator = new CalorieCalculator(this.products);
        System.out.println(calorieCalculator.sum());
    }

    public void printAverage() {
        CalorieCalculator calorieCalculator = new CalorieCalculator(this.products);
        System.out.printf((AVERAGE) + "%n", calorieCalculator.average());
    }

    public void printAmountKG(){
        QuantityCalculator quantityCalculator = new QuantityCalculator(this.products);
        System.out.println(quantityCalculator.getAmountKG());
    }

    public void printAverageAmount(){
        QuantityCalculator quantityCalculator = new QuantityCalculator(this.products);
        System.out.println(quantityCalculator.getAmountKG() / this.products.size());
    }
}
