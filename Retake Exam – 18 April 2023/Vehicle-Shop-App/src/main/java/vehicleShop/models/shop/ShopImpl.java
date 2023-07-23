package vehicleShop.models.shop;

import vehicleShop.models.tool.Tool;
import vehicleShop.models.tool.ToolImpl;
import vehicleShop.models.vehicle.Vehicle;
import vehicleShop.models.worker.Worker;

import java.util.Collection;
import java.util.List;

public class ShopImpl implements Shop{


    @Override
    public void make(Vehicle vehicle, Worker worker) {
        //списък с инструментите
        Collection<Tool> tools = worker.getTools();


        while (tools.iterator().hasNext() && worker.canWork() && !vehicle.reached()){

            Tool currentTool = tools.iterator().next();

            currentTool.decreasesPower();
            worker.working();
            vehicle.making();

            if (currentTool.isUnfit()){
                currentTool = tools.iterator().next();
            }
        }

    }
}
