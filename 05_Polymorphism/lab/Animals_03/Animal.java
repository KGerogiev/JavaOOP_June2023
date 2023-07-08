package Animals_03;

public abstract class Animal {

    private String name;
    private String favouriteFood;

    public Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    abstract String explainSelf();

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public String getName() {
        return name;
    }
}
