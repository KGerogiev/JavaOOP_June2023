package P04_TrafficLights;

import java.util.List;

public class TrafficLite {
    private List<LiteBulb> liteBulbs;
    private int countBulbs;


    public TrafficLite(List<LiteBulb> liteBulbs, int countBulbs) {
        this.liteBulbs = liteBulbs;
        this.countBulbs = countBulbs;
    }

    public List<LiteBulb> getLiteBulbs() {
        return liteBulbs;
    }

    public void setLiteBulbs(List<LiteBulb> liteBulbs) {
        this.liteBulbs = liteBulbs;
    }

    public int getCountBulbs() {
        return countBulbs;
    }

    public void setCountBulbs(int countBulbs) {
        this.countBulbs = countBulbs;
    }

    public void changeColor() {

        this.getLiteBulbs().forEach(e -> {

            String color = e.getColor().toString();

            switch (color) {
                case "RED":
                    e.setColor(Colors.GREEN);
                    break;
                case "GREEN":
                    e.setColor(Colors.YELLOW);
                    break;
                case "YELLOW":
                    e.setColor(Colors.RED);
                    break;
            }
        });
    }
}
