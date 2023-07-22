package P02SquareRoot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputNumber = scanner.nextLine();

        try {
            int parsedNumber = Integer.parseInt(inputNumber);
            if (parsedNumber <= 0){
                throw new RuntimeException();
            }
            double squareRoot = Math.sqrt(parsedNumber);
            System.out.printf("%.2f%n", squareRoot);
        } catch (RuntimeException e){
            System.out.println("Invalid");
        } finally {
            System.out.println("Goodbye");
        }
    }
}
