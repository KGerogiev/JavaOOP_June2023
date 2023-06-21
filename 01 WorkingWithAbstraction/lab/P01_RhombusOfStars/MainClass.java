package P01_RhombusOfStars;

import java.awt.*;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rhombus rhombus = new Rhombus(Integer.parseInt(scanner.nextLine()));

        //rhombus.createRombus();
        Rhombus.createRombus(4);
    }
}
