package Animals_03;

public class Dog extends Animal {

    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    String explainSelf() {
        return String.format("I am %s and my favourite food is %s%nDJAAF", super.getName(), super.getFavouriteFood());
    }
}
