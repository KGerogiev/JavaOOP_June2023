package vehicleShop.core;

import vehicleShop.common.ConstantMessages;
import vehicleShop.common.ExceptionMessages;
import vehicleShop.models.shop.Shop;
import vehicleShop.models.shop.ShopImpl;
import vehicleShop.models.tool.Tool;
import vehicleShop.models.tool.ToolImpl;
import vehicleShop.models.vehicle.Vehicle;
import vehicleShop.models.vehicle.VehicleImpl;
import vehicleShop.models.worker.FirstShift;
import vehicleShop.models.worker.SecondShift;
import vehicleShop.models.worker.Worker;
import vehicleShop.repositories.VehicleRepository;
import vehicleShop.repositories.WorkerRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ControllerImpl implements Controller {

    // saving the created Workers:
    private WorkerRepository workerRepository;
    // saving the created Vehicles:
    private VehicleRepository vehicleRepository;

    private int readyVehicles;

    public ControllerImpl() {
        this.workerRepository = new WorkerRepository();
        this.vehicleRepository = new VehicleRepository();
        this.readyVehicles = 0;
    }

    @Override
    public String addWorker(String type, String workerName) {
        Worker worker = null;
        if (type.equals("FirstShift")) {
            worker = new FirstShift(workerName);
        } else if (type.equals("SecondShift")) {
            worker = new SecondShift(workerName);
        } else {
            throw new IllegalArgumentException(ExceptionMessages.WORKER_TYPE_DOESNT_EXIST);
        }
        workerRepository.add(worker);
        return String.format(ConstantMessages.ADDED_WORKER, worker.getClass().getSimpleName(), worker.getName());
    }

    @Override
    public String addVehicle(String vehicleName, int strengthRequired) {
        Vehicle vehicle = new VehicleImpl(vehicleName, strengthRequired);
        vehicleRepository.add(vehicle);
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_VEHICLE, vehicle.getName());
    }

    @Override
    public String addToolToWorker(String workerName, int power) {
        Tool tool = new ToolImpl(power);
        Worker worker;
        worker = this.workerRepository.getWorkers().stream()
                .filter(w -> w.getName().equals(workerName))
                .findFirst()
                .orElse(null);
        if (worker == null) {
            throw new IllegalArgumentException(ExceptionMessages.HELPER_DOESNT_EXIST);
        }
        worker.addTool(tool);
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_TOOL_TO_WORKER, power, workerName);
    }

    @Override
    public String makingVehicle(String vehicleName) {   // MAY HAVE PROBLEM
        // Workers shoud have more than 70 strength
        // Check if there are ready to work workers if not - throw an exception
        List<Worker> readyToWork = new ArrayList<>();
        this.workerRepository.getWorkers().stream().filter(w -> w.getStrength() > 70)
                .forEach(worker -> readyToWork.add(worker));
        if (readyToWork.isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.NO_WORKER_READY);
        }
        Vehicle vehicle = this.vehicleRepository.findByName(vehicleName); // кола, която трябва да се направи

        Shop shop = new ShopImpl();  //място, където ще прваим колата

        int brokenTools = 0;

        while (!vehicle.reached() && !readyToWork.isEmpty()) {
            //работник, който ще работи
            Worker worker = readyToWork.get(0);
            shop.make(vehicle, worker);

            brokenTools += worker.getTools().stream().filter(Tool::isUnfit).count();

            if (!worker.canWork() || worker.getTools().stream().noneMatch(tool -> !tool.isUnfit())) {
                readyToWork.remove(worker);
            }
        }
        if (vehicle.reached()) {
            readyVehicles++;
            return String.format(ConstantMessages.VEHICLE_DONE, vehicleName, "done")
                    + String.format(ConstantMessages.COUNT_BROKEN_INSTRUMENTS, brokenTools);
        }

        return String.format(ConstantMessages.VEHICLE_DONE, vehicleName, "not done")
                + String.format(ConstantMessages.COUNT_BROKEN_INSTRUMENTS, brokenTools);

    }

    @Override
    public String statistics() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%d vehicles are ready!", readyVehicles));
        sb.append(System.lineSeparator());
        sb.append("Info for workers:");
        sb.append(System.lineSeparator());
        workerRepository.getWorkers().stream().forEach(worker -> sb.append(worker.toString()));

        return sb.toString().trim();
    }

    public WorkerRepository getWorkerRepository() {
        return workerRepository;
    }

    public VehicleRepository getVehicleRepository() {
        return vehicleRepository;
    }
}
