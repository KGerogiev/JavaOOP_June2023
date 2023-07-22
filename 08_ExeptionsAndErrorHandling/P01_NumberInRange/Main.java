package P01_NumberInRange;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] range = scanner.nextLine().split("\\s+");

        int startNumber = Integer.parseInt(range[0]);
        int endNumber = Integer.parseInt(range[1]);

        System.out.printf("Range: [%d...%d]%n", startNumber, endNumber);

        for(;;){
                String nextNum = scanner.nextLine();
            try {
                int inputNum = Integer.parseInt(nextNum);
                if (inputNum >= startNumber && inputNum <= endNumber) {
                    System.out.printf("Valid number: %d%n", inputNum);
                    return;
                } else {
                    throw new IllegalArgumentException("Invalid number: " + inputNum);
                }
            } catch (NumberFormatException e){
                System.out.println("Invalid number: " + nextNum);
            } catch (IllegalArgumentException e ) {
                System.out.println(e.getMessage());
            }
        }
    }
}
