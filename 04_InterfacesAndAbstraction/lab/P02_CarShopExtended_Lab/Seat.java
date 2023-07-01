package P02_CarShopExtended_Lab;

public class Seat extends CarImpl implements Sellable{

    private double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append(System.lineSeparator());
        sb.append(String.format("%s sells for %f", this.getModel(), this.getPrice()));

        return sb.toString();
    }
}
