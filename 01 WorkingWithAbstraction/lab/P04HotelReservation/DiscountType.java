package P04HotelReservation;

public enum DiscountType {

    VIP(0.8),
    SECONDVISIT(0.9),
    NONE(1);

    private double discount;

    DiscountType(double discount){
        this.discount = discount;
    }
    public double getDiscount(){
        return this.discount;
    }
    public void setDiscount(double discount){
        this.discount = discount;
    }
}
