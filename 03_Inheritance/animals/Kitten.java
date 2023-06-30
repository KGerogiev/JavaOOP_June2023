package animals;

public class Kitten extends Cat {
    //extended fields: name, age, gender

    //field
    private static final String GENDER = "Female";

    //constructor
    public Kitten(String name, int age) {
        super(name, age, GENDER);

    }

    //extended abstract method
    @Override
    public String produceSound() {
        return "Meow";
    }
}
