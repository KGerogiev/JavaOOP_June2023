package PizzaCalories_04;

public class Dough {
    private String flourType; //white, wholegrain  -  Invalid type of dough.
    private String bakingTechnique; //crispy, chewy, or homemade   -  Invalid type of dough.
    private double weight; //[1..200]  -  "Dough weight should be in the range [1..200].

    //methods
    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        switch (flourType.toLowerCase()) {
            case "white":
            case "wholegrain":
                this.flourType = flourType;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        switch (bakingTechnique.toLowerCase()) {
            case "crispy":
            case "chewy":
            case "homemade":
                this.bakingTechnique = bakingTechnique;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 200) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }

    public double calculateCalories() {
        double coefFlour = 0;
        double coefBackingTecknique = 0;

        switch (this.flourType) {
            case "White":
                coefFlour = 1.5;
                break;
            case "Wholegrain":
                coefFlour = 1;
                break;
        }

        switch (this.bakingTechnique) {
            case "Crispy":
                coefBackingTecknique = 0.9;
                break;
            case "Chewy":
                coefBackingTecknique = 1.1;
                break;
            case "Homemade":
                coefBackingTecknique = 1;
                break;
        }
        return 2 * this.weight * coefFlour * coefBackingTecknique;
    }
}
