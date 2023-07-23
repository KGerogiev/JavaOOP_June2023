package vehicleShop.models.worker;

public class SecondShift extends BaseWorker {

    private static final int INITIAL_STRENGTH = 70;

    public SecondShift(String name) {
        super(name, INITIAL_STRENGTH);
    }

   /* @Override
    public void working() {
        super.working();
        int currentStrength = this.getStrength();
        int additionalDecreaseStrength = currentStrength - 5;
        if (additionalDecreaseStrength < 0){
            additionalDecreaseStrength = 0;
        }
        this.setStrength(additionalDecreaseStrength);
    }*/
}
