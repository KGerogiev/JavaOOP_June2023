package Animals_03;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Cat("Oscar", "Whiskas");
        System.out.println(animal.explainSelf());

        animal = new Dog("Rocky", "Meat");
        System.out.println(animal.explainSelf());


    }
}
