package demo;

public class Dog extends Mammal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String sleep() {
        return "Dog is sleeping";
    }

}
