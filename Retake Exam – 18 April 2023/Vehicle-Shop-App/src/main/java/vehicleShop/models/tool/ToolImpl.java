package vehicleShop.models.tool;

import vehicleShop.common.ExceptionMessages;

import java.util.concurrent.ExecutionException;

public class ToolImpl implements Tool {
    private int power;

    public ToolImpl(int power) {
        this.setPower(power);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power < 0){
            throw new IllegalArgumentException(ExceptionMessages.TOOL_POWER_LESS_THAN_ZERO);
        }
        this.power = power;
    }

    @Override
    public void decreasesPower() {
        int currentPower = this.getPower();
        int decreasedPower = currentPower - 5;
        if (decreasedPower < 0){
            decreasedPower = 0;
        }
        this.setPower(decreasedPower);
    }

    @Override
    public boolean isUnfit() {
        return this.getPower() <= 0;
    }
}
