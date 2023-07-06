package Shapes_02;

import java.rmi.MarshalException;

public class Circle extends Shape{

    private final Double radius;

    public Circle(Double radius){
        this.radius = radius;
        super.setPerimeter(this.calculatePerimeter());
        super.setArea(this.calculateArea());
    }

    @Override
    Double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    Double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    final Double getRadius() {
        return radius;
    }
}
