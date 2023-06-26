package ClassBoxDataValidation_01;

public class Box {
    //fields
    private double length;
    private double width;
    private double height;

    //methods

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
    }

    private void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
    }

    private void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
    }

    public double calculateSurfaceArea() {
        // 2lw + 2lh + 2wh
        return 2 * this.length * this.width + 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public double calculateLateralSurfaceArea() {
        //2lh + 2wh
        return 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public double calculateVolume() {
        //lwh
        return this.length * this.width * this.height;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Surface Area - ").append(this.calculateSurfaceArea()).append(System.lineSeparator());
        sb.append("Lateral Surface Area - " + this.calculateLateralSurfaceArea()).append(System.lineSeparator());
        sb.append("Volume – " + this.calculateVolume());
        return sb.toString();
    }
}
