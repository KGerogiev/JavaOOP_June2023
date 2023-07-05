package FoodShortage_04.classes;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());

        Set<Citizen> citizens = new LinkedHashSet<>();
        Set<Rebel> rebels = new LinkedHashSet<>();

        for (int person = 1; person <= countPeople; person++) {
            String[] information = scanner.nextLine().split("\\s+");

            if (information.length == 4) {
                //Citizen {name} {age} {id} {birthdate}
                Citizen citizen = new Citizen(information[0], Integer.parseInt(information[1]), information[2], information[3]);
                citizens.add(citizen);
            } else if (information.length == 3) {
                //Rebel {name} {age} {group}
                Rebel rebel = new Rebel(information[0], Integer.parseInt(information[1]), information[2]);
                rebels.add(rebel);
            }
        }

        String name = scanner.nextLine();

        while (!name.equals("End")) {

            for (Citizen citizen : citizens) {
                if (citizen.getName().equals(name)) {
                    citizen.buyFood();
                }
            }
            for (Rebel rebel : rebels) {
                if (rebel.getName().equals(name)) {
                    rebel.buyFood();
                }
            }

            name = scanner.nextLine();
        }

        int sumCitizens = citizens.stream().map(Citizen::getFood).reduce(0, Integer::sum);
        int sumRebels = rebels.stream().map(e -> e.getFood()).reduce(0, (a, b) -> a + b);


        System.out.println(sumCitizens + sumRebels);
    }
}
