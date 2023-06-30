package needForSpeed;

public class Car extends Vehicle {
    //extended fields: fuelConsumption, fuel, horsePower, default

    //constant
    private static final double DEFAULT_FUEL_CONSUMPTION = 3;

    //constructor
    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
