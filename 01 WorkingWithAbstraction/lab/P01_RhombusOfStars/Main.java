package P01_RhombusOfStars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        createRhombus(size);

    }

    private static void createRhombus(int size) {
        upperUpart(size);

        lowerPart(size);
    }

    private static void lowerPart(int size) {
        for (int row = size - 1; row > 0; row--) {
            printRow(row, size);
        }
    }

    private static void upperUpart(int size) {
        for (int row = 1; row <= size; row++) {
            printRow(row, size);
        }
    }

    public static void printRow(int row, int size){
        for (int i = row; i < size ; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < row; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
