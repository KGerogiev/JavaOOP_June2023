package P03_CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rankOfTheCard = scanner.nextLine();
        String suitOfTheCard = scanner.nextLine();

        Card card = new Card(RankPower.valueOf(rankOfTheCard), SuitPower.valueOf(suitOfTheCard));

        System.out.println(card);
    }
}
