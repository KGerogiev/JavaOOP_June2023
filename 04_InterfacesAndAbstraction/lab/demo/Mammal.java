package demo;

public abstract class Mammal {
    private String name;
    private int age;

    public Mammal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String sleep();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
