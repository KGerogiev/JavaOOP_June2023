package Demo;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Gosho", 12, 9);
        Animal animal = new Animal("Peshi", 2);

        cat.meau();
        cat.printHallo();

        animal.printHallo();
    }
}
