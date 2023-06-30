package needForSpeed;

public class RaceMotorcycle extends Motorcycle {
    //extended fields: fuelConsumption, fuel, horsePower, default

    //constant
    private static final double DEFAULT_FUEL_CONSUMPTION = 8;

    //constructor
    public RaceMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
