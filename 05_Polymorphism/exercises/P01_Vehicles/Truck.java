package P01_Vehicles;

public class Truck extends Vehicle {

    public static final double AC_INCREASE_CONSUMPTION = 1.6;
    public static final double REFUELING_LOST_COEFFICIENT = 0.95;

    public Truck(double fuelQuantity, double consumption) {
        super(fuelQuantity, consumption);
        super.setConsumption(consumption + AC_INCREASE_CONSUMPTION);
    }

    @Override
    public void refuel(double litters) {
        litters = litters * REFUELING_LOST_COEFFICIENT;
        super.refuel(litters);
    }
}




