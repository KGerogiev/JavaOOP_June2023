package P04HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //"{pricePerDay} {numberOfDays} {season} {discountType}

        String data = scanner.nextLine();
        String[] input = ArraySplitter.makeArray(data);

        double pricePerDay = Double.parseDouble(input[0]);
        int numberOfDays = Integer.parseInt(input[1]);
        Season season = Season.valueOf(input[2].toUpperCase());
        DiscountType discountType = DiscountType.valueOf(input[3].toUpperCase());

        double totalPrice = PriceCalculator.calculatePrice(pricePerDay, numberOfDays, season, discountType);

        System.out.println(String.format("%.2f", totalPrice));


    }


}
