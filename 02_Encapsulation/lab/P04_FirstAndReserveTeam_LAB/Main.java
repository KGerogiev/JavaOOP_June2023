package P04_FirstAndReserveTeam_LAB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Team team = new Team("Black Eagle");

        int countPlayers = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countPlayers; i++) {
            String[] inputPlayer = scanner.nextLine().split("\\s+");

            String firstName = inputPlayer[0];
            String lastNmae = inputPlayer[1];
            int age = Integer.parseInt(inputPlayer[2]);
            double salary = Double.parseDouble(inputPlayer[3]);

            Person person = new Person(firstName, lastNmae, age, salary);
            team.addPlayer(person);
        }
        team.getStatistics();



    }
}
