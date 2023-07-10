package P02_VehiclesExtended;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] carInformation = scanner.nextLine().split("\\s+");
        Vehicle car = new Car(Double.parseDouble(carInformation[1]),
                Double.parseDouble(carInformation[2]),
                Integer.parseInt(carInformation[3]));

        String [] truckInformation = scanner.nextLine().split("\\s+");
        Vehicle truck = new Truck(Double.parseDouble(truckInformation[1]),
                Double.parseDouble(truckInformation[2]),
                Integer.parseInt(truckInformation[3]));

        String [] busInformation = scanner.nextLine().split("\\s+");
        Vehicle bus = new Bus(Double.parseDouble(busInformation[1]),
                Double.parseDouble(busInformation[2]),
                Integer.parseInt(busInformation[3]));

        int countCommand = Integer.parseInt(scanner.nextLine());

        for (int command = 0; command < countCommand ;command++) {
                //	Drive Car {distance}
                //	Refuel Car {liters}
            String [] currentCommand = scanner.nextLine().split("\\s+");

            switch (currentCommand[0]){
                case "DriveEmpty":
                    bus.drive(Double.parseDouble(currentCommand[2]));
                    break;
                case "Drive":
                    if ("Car".equals(currentCommand[1])){
                        car.drive(Double.parseDouble(currentCommand[2]));
                    } else if ("Truck".equals(currentCommand[1])){
                        truck.drive(Double.parseDouble(currentCommand[2]));
                    } else if ("Bus".equals(currentCommand[1])){
                        bus.driveFull(Double.parseDouble(currentCommand[2]));
                    }
                    break;
                case "Refuel":
                    if ("Car".equals(currentCommand[1])){
                        car.refuel(Double.parseDouble(currentCommand[2]));
                    } else if ("Truck".equals(currentCommand[1])){
                        truck.refuel(Double.parseDouble(currentCommand[2]));
                    } else if ("Bus".equals(currentCommand[1])){
                        bus.refuel(Double.parseDouble(currentCommand[2]));
                    }
                    break;
            }

        }

        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }
}
