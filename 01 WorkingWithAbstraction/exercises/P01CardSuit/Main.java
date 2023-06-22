package P01CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        printResult();

    }

    private static void printResult() {
        System.out.println("Card Suits:");
        for (CardSuits suit : CardSuits.values()) {
            System.out.println(suit.toString());
        }
    }
}
