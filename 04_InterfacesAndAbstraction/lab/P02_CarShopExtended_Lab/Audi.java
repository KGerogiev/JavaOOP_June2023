package P02_CarShopExtended_Lab;

public class Audi extends CarImpl implements Rentable{

    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String countryProduced, Integer minRentDay, double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append(System.lineSeparator());
        sb.append(String.format("Minimum rental period of %d days. Price per day %f", this.minRentDay, this.pricePerDay));

        return sb.toString();
    }
}
