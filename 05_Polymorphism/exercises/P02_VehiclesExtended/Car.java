package P02_VehiclesExtended;

public class Car extends Vehicle{

    public static final double AC_INCREASE_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double consumption, int tankCapacity) {
        super(fuelQuantity, consumption, tankCapacity);
        super.setConsumption(consumption + AC_INCREASE_CONSUMPTION);
    }


}
