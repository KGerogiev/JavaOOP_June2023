package animals;

public class Dog extends Animal {
    //extended fields: name, age, gender

    //constructor
    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    //extended abstract method
    @Override
    public String produceSound() {
        return "Woof!";
    }
}
