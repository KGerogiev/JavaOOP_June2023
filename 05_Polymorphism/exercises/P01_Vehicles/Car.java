package P01_Vehicles;

public class Car extends Vehicle{

    public static final double AC_INCREASE_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double consumption) {
        super(fuelQuantity, consumption);
        super.setConsumption(consumption + AC_INCREASE_CONSUMPTION);
    }


}
