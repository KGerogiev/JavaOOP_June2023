package P01_Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] carInformation = scanner.nextLine().split("\\s+");
        Vehicle car = new Car(Double.parseDouble(carInformation[1]), Double.parseDouble(carInformation[2]));

        String [] truckInformation = scanner.nextLine().split("\\s+");
        Vehicle truck = new Truck(Double.parseDouble(truckInformation[1]), Double.parseDouble(truckInformation[2]));

        int countCommand = Integer.parseInt(scanner.nextLine());

        for (int command = 0; command < countCommand ;command++) {
                //	Drive Car {distance}
                //	Refuel Car {liters}
            String [] currentCommand = scanner.nextLine().split("\\s+");

            switch (currentCommand[0]){
                case "Drive":
                    if ("Car".equals(currentCommand[1])){
                        car.drive(Double.parseDouble(currentCommand[2]));
                    } else if ("Truck".equals(currentCommand[1])){
                        truck.drive(Double.parseDouble(currentCommand[2]));
                    }
                    break;
                case "Refuel":
                    if ("Car".equals(currentCommand[1])){
                        car.refuel(Double.parseDouble(currentCommand[2]));
                    } else if ("Truck".equals(currentCommand[1])){
                        truck.refuel(Double.parseDouble(currentCommand[2]));
                    }
                    break;
            }

        }
        System.out.println(car);
        System.out.println(truck);
    }
}
