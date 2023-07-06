package Shapes_02;

public abstract class Shape {

    private Double perimeter;
    private Double area;

    public Double getPerimeter() {
        return perimeter;
    }

    abstract Double calculatePerimeter();
    abstract Double calculateArea();

    public void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }


}
