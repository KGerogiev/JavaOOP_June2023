package PizzaCalories_04;

public class Topping {
    private String toppingType; //meat, veggies, cheese, or sauce  - Cannot place {name of invalid argument} on top of your pizza."
    private double weight;  //[1..50] - "{Topping type name} weight should be in the range [1..50].

    //methods
    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        switch (toppingType.toLowerCase()) {
            case "meat":
            case "veggies":
            case "cheese":
            case "sauce":
                this.toppingType = toppingType;
                break;
            default:
                throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 50) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException(this.toppingType + " weight should be in the range [1..50].");
        }
    }

    public double calculateCalories() {
        double coefTopping = 0;
        switch (this.toppingType.toLowerCase()) {
            case "meat":
                coefTopping = 1.2;
                break;
            case "veggies":
                coefTopping = 0.8;
                break;
            case "cheese":
                coefTopping = 1.1;
                break;
            case "sauce":
                coefTopping = 0.9;
                break;
        }
        return 2 * this.weight * coefTopping;
    }
}
