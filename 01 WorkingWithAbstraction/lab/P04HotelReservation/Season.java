package P04HotelReservation;

public enum Season {

    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private int coefficient;

    Season(int coefficient){
        this.coefficient = coefficient;
    }
    public int getCoefficient(){
        return this.coefficient;
    }
    public void setCoefficient(int coefficient){
        this.coefficient = coefficient;
    }
}
