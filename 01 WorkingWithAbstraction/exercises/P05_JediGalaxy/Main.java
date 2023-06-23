package P05_JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //четене на данните от конзолата
        int[] dimentions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimentions[0];
        int cols = dimentions[1];

        //създаване и пълнене на матрицата
        int[][] matrix = new int[rows][cols];

        int value = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = value++;
            }
        }

        //започване на играта
        String command = scanner.nextLine();
        long sum = 0;

        while (!command.equals("Let the Force be with you")) {

            int[] heroCoordinates = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilCoordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int evelRow = evilCoordinates[0];
            int evelCol = evilCoordinates[1];

            evelMove(matrix, evelRow, evelCol);

            int heroRow = heroCoordinates[0];
            int heroCol = heroCoordinates[1];

            sum = heroMove(matrix, sum, heroRow, heroCol);

            command = scanner.nextLine();
        }

        //отпечатвам резултата
        System.out.println(sum);
    }

    private static long heroMove(int[][] matrix, long sum, int heroRow, int heroCol) {
        while (heroRow >= 0 && heroCol < matrix[1].length) {
            if (heroRow < matrix.length && heroCol >= 0 && heroCol < matrix[0].length) {
                sum += matrix[heroRow][heroCol];
            }
            heroCol++;
            heroRow--;
        }
        return sum;
    }

    private static void evelMove(int[][] matrix, int evelRow, int evelCol) {
        while (evelRow >= 0 && evelCol >= 0) {
            if (evelRow < matrix.length && evelCol < matrix[0].length) {
                matrix[evelRow][evelCol] = 0;
            }
            evelRow--;
            evelCol--;
        }
    }
}
