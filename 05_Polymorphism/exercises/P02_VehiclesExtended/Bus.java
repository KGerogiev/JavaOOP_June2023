package P02_VehiclesExtended;

public class Bus extends Vehicle{

    public static final double AC_INCREASE_CONSUMPTION = 1.4;
    public final double INITIAL_CONSUMPTION;

    public Bus(double fuelQuantity, double consumption, int tankCapacity) {
        super(fuelQuantity, consumption, tankCapacity);
        INITIAL_CONSUMPTION = consumption;
    }

    @Override
    public void driveFull(double distance){
        super.setConsumption(super.getConsumption() + AC_INCREASE_CONSUMPTION);
        super.drive(distance);
        super.setConsumption(INITIAL_CONSUMPTION);
    }
}
