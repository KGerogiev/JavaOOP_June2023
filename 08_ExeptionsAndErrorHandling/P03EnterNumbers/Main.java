package P03EnterNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = 1;
        int endNumber = 100;

        int countNumbers = 0;
        List<String> listOfNumbers = new ArrayList<>();

        while (countNumbers < 10) {

            int nextNumber = readNumber(startNumber, endNumber, scanner);

            if (nextNumber != startNumber) {
                listOfNumbers.add(String.valueOf(nextNumber));
                countNumbers++;
            }

            startNumber = nextNumber;
        }

        System.out.println(String.join(", ", listOfNumbers));

    }

    public static int readNumber(int startNumber, int endNumber, Scanner scanner) {
        String nextNumber = scanner.nextLine();
        try {
            int parsedNumber = Integer.parseInt(nextNumber);
            if (parsedNumber > startNumber && parsedNumber < endNumber) {
                return parsedNumber;
            } else {
                System.out.println("Your number is not in range " + startNumber + " - 100!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid Number!");
        }
        return startNumber;
    }
}
