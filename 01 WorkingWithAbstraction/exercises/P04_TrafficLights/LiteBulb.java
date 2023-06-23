package P04_TrafficLights;

public class LiteBulb {

    private Colors color;

    public LiteBulb(String color){
        this.color = Colors.valueOf(color);
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }



}
