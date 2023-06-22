package P02_CardRank;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Ranks:");

        for (Rank rank : Rank.values()){
            System.out.printf("Ordinal value: %d; Name value: %s%n", rank.ordinal(), rank);
        }
    }
}
