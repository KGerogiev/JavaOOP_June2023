package Demo;

import java.io.StringBufferInputStream;

public class Cat extends Animal {
    private int livesLeft;

    public Cat(String name, int age, int livesLeft) {
        super(name, age);
        this.livesLeft = livesLeft;
    }

    public String returnName() {
        return super.getName();
    }

    public void meau() {
        System.out.println("Meau meau");
    }

    @Override
    public void printHallo() {
        System.out.println("Hallo from Cat");
    }

}
