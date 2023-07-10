package P02_VehiclesExtended;

public class Truck extends Vehicle {

    public static final double AC_INCREASE_CONSUMPTION = 1.6;
    public static final double REFUELING_LOST_COEFFICIENT = 0.95;

    public Truck(double fuelQuantity, double consumption, int tankCapacity) {
        super(fuelQuantity, consumption, tankCapacity);
        super.setConsumption(consumption + AC_INCREASE_CONSUMPTION);
    }

    @Override
    public void refuel(double litters) {
        litters = litters * REFUELING_LOST_COEFFICIENT;
        super.refuel(litters);
    }
}




