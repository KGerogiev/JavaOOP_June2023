package Shapes_02;

public class Rectangle extends Shape{

    private final Double height;
    private final Double width;

    public Rectangle(Double height, Double width){
        this.height = height;
        this.width = width;
        super.setPerimeter(calculatePerimeter());
        super.setArea(calculateArea());
    }

    @Override
    Double calculatePerimeter() {
        return 2 * this.getHeight() + 2 * this.getWidth();
    }

    @Override
    Double calculateArea() {
        return this.getWidth() * this.getHeight();
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }
}
