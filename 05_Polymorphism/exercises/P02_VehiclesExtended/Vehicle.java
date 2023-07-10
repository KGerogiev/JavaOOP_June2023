package P02_VehiclesExtended;

import java.text.DecimalFormat;

public class Vehicle implements movable{

    public final int TANK_CAPACITY;
    private double fuelQuantity;
    private double consumption; //litters per km

    public Vehicle(double fuelQuantity, double consumption, int tankCapacity) {
        this.setFuelQuantity(fuelQuantity);
        this.setConsumption(consumption);
        this.TANK_CAPACITY = tankCapacity;
    }

    public void drive(double distance) {

        double fuelNeeded = this.getConsumption() * distance;

        if (this.getFuelQuantity() >= fuelNeeded) {
            this.setFuelQuantity(this.getFuelQuantity() - fuelNeeded);
            DecimalFormat df = new DecimalFormat("##.##");
            System.out.printf("%s travelled %s km%n", this.getClass().getSimpleName(), df.format(distance));
        } else {
            System.out.println(this.getClass().getSimpleName() + " needs refueling");
        }

    }

    public void refuel(double litters) {
        if (litters <= 0){
           System.out.println("Fuel must be a positive number");
           return;
        }
        double availableSpace = this.TANK_CAPACITY - this.getFuelQuantity();
        if (litters <= availableSpace) {
            this.setFuelQuantity(this.getFuelQuantity() + litters);
        } else {
            System.out.println("Cannot fit fuel in tank");
        }
    }

    @Override
    public void driveFull(double distance) {
        this.drive(distance);
    }


    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        /*if (fuelQuantity > 0) {*/
            this.fuelQuantity = fuelQuantity;
       /* } else {
            System.out.println("Fuel must be a positive number");
        }*/
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
