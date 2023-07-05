package BirthdayCelebrations_03.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Citizen> citizenList = new ArrayList<>();
        List<Pet> petList = new ArrayList<>();
        List<Robot> robotList = new ArrayList<>();

        while (!input.equals("End")){
            String[] data = input.split("\\s+");

            switch (data[0]){
                case "Citizen":
                Citizen citizen = new Citizen(data[1],Integer.parseInt(data[2]), data[3], data[4]);
                citizenList.add(citizen);
                    break;
                case "Robot":
                Robot robot = new Robot(data[1], data[2]);
                    break;
                case "Pet":
                Pet pet = new Pet(data[1], data[2]);
                petList.add(pet);
                    break;
            }
            input = scanner.nextLine();
        }

        String year = scanner.nextLine();

        citizenList.stream()
                .filter(citizen -> citizen.getBirthDate().endsWith(year))
                .forEach(e -> System.out.println(e.getBirthDate()));

        petList.stream()
                .filter(citizen -> citizen.getBirthDate().endsWith(year))
                .forEach(e -> System.out.println(e.getBirthDate()));
    }
}
