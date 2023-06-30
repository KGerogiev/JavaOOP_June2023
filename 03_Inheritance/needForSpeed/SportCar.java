package needForSpeed;

public class SportCar extends Car {
    //extended fields: fuelConsumption, fuel, horsePower, default

    //constant
    private static final double DEFAULT_FUEL_CONSUMPTION = 10;

    //constructor
    public SportCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
