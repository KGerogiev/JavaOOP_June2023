package P03_CardsWithPower;

public enum SuitPower {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int powerSuit;

    SuitPower(int powerSuit) {
        this.powerSuit = powerSuit;
    }

    public int getPowerSuit() {
        return powerSuit;
    }

    public void setPowerSuit(int powerSuit) {
        this.powerSuit = powerSuit;
    }
}
