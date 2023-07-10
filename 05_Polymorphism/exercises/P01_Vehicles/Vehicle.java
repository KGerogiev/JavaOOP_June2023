package P01_Vehicles;

import java.text.DecimalFormat;

public class Vehicle implements movable{

    private double fuelQuantity;
    private double consumption; //litters per km

    public Vehicle(double fuelQuantity, double consumption) {
        this.fuelQuantity = fuelQuantity;
        this.consumption = consumption;
    }

    public void drive(double distance){
        double fuelNeeded = this.getConsumption() * distance;

        if (this.getFuelQuantity() >= fuelNeeded){
            this.setFuelQuantity(this.getFuelQuantity() - fuelNeeded);
            DecimalFormat df = new DecimalFormat("##.##");
            System.out.printf("%s travelled %s km%n", this.getClass().getSimpleName(), df.format(distance));
        } else {
            System.out.println(this.getClass().getSimpleName() + " needs refueling");
        }

    }

    public void refuel(double litters){
      this.setFuelQuantity(this.getFuelQuantity() + litters);
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.getFuelQuantity());
    }
}
