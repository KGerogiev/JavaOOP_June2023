package P02PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"{bottomLeftX} {bottomLeftY} {topRightX} {topRightY}

        int[] data = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Point rectingleBottomLeft = new Point(data[0], data[1]);
        Point rectingleTopRight = new Point(data[2], data[3]);

        Rectangle rectangle = new Rectangle(rectingleBottomLeft, rectingleTopRight);

        int countPoints = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countPoints; i++) {
            int[] currentPoint = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            System.out.println(rectangle.contains(new Point(currentPoint[0], currentPoint[1])));
        }
    }
}
