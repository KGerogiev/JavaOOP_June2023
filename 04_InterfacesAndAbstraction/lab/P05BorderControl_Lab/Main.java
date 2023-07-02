package P05BorderControl_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        List<Citizen> citizenList = new ArrayList<>();
        List<Robot> robotList = new ArrayList<>();

        while (!input[0].equals("End")) {
            if (input.length == 3) {
                //human
                String name = input[0];
                int age = Integer.parseInt(input[1]);
                String id = input[2];

                Citizen citizen = new Citizen(name, age, id);
                citizenList.add(citizen);
            } else if (input.length == 2) {
                //robot
                String model = input[0];
                String id = input[1];

                Robot robot = new Robot(model, id);
                robotList.add(robot);
            }
            input = scanner.nextLine().split("\\s+");
        }

        String fakeIdsEnd = scanner.nextLine();

        checkForFakeCitizens(citizenList, fakeIdsEnd);

        checkForFakeRobots(robotList, fakeIdsEnd);
    }

    private static void checkForFakeRobots(List<Robot> robotList, String fakeIdsEnd) {
        for (Robot robot : robotList) {
            String id = robot.getId();
            if (id.endsWith(fakeIdsEnd)) {
                System.out.println(id);
            }
        }
    }

    private static void checkForFakeCitizens(List<Citizen> citizenList, String fakeIdsEnd) {
        for (Citizen citizen : citizenList) {
            String id = citizen.getId();
            if (id.endsWith(fakeIdsEnd)) {
                System.out.println(id);
            }
        }
    }
}
