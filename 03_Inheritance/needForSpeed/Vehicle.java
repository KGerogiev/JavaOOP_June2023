package needForSpeed;

public class Vehicle {
    //constant
    private static final double DEFAULT_FUEL_CONSUMPTION = 1.25;
    //fields
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    //constructor
    public Vehicle(double fuel, int horsePower) {
        this.setFuel(fuel);
        this.setHorsePower(horsePower);
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }

    //methods
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void drive(double kilometers){
        double consumedFuel = this.getFuelConsumption() * kilometers; //needed fuel

        if (this.fuel >= consumedFuel){
            this.setFuel(this.fuel - consumedFuel);
        }
    }
}
