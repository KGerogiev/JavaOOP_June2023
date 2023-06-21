package P01_RhombusOfStars;

public class Rhombus {
    private int size;

    public Rhombus(int size) {
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static void createRombus(int size) {
        for (int row = 1; row <= size; row++) {
            printRhombusRow(row, size);
        }

        for (int row = size - 1; row > 0; row--) {
            printRhombusRow(row, size);
        }
    }

    private static void printRhombusRow(int row, int size) {
        for (int i = row; i < size; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < row; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
