package P03_CardsWithPower;

public class Card {

    private RankPower rank;
    private SuitPower suit;
    private int power;

    public Card(RankPower rank, SuitPower suit){
        this.rank = rank;
        this.suit = suit;
        this.power = rank.getPowerRank() + suit.getPowerSuit();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", this.rank, this.suit, this.power);
    }
}
