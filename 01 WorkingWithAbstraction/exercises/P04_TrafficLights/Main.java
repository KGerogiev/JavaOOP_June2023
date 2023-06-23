package P04_TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int countChanges = Integer.parseInt(scanner.nextLine());

        List<LiteBulb> bulbs = new ArrayList<>();


        //създавам крушки от подадените ми цветове и я добавям в списъка със крушки
        for (int i = 0; i < input.length; i++) {
            String currentColor = input[i];
            LiteBulb liteBulb = new LiteBulb(currentColor);
            bulbs.add(liteBulb);
        }

        //създавам светофар
        TrafficLite myTrafficLite = new TrafficLite(bulbs, bulbs.size());

        /*//обхождам списъкс с крушки и променям цвета им
        for (int i = 0; i < countChanges; i++) {
            bulbs.forEach(e -> {
                e.changeColor();
                System.out.print(e.getColor() + " ");
            });
            System.out.println();
        }*/

        for (int i = 0; i < countChanges; i++) {
            myTrafficLite.changeColor();
            myTrafficLite.getLiteBulbs().forEach(e -> System.out.print(e.getColor() + " "));
            System.out.println();

        }
    }
}
