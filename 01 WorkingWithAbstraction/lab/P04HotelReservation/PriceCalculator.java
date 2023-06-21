package P04HotelReservation;

public class PriceCalculator {

    public static double calculatePrice(double pricePerDay, int numberOfDays, Season season, DiscountType discountType) {
        return (pricePerDay * numberOfDays * season.getCoefficient()) * discountType.getDiscount();
    }
}
