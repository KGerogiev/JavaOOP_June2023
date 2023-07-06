package Shapes_02;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 4.0);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        Circle circle = new Circle(2d);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

    }
}
