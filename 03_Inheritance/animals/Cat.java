package animals;

public class Cat extends Animal{
    //extended fields: name, age, gender

    //constructor
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    //extended abstract method
    @Override
    public String produceSound() {
        return "Meow meow";
    }
}
