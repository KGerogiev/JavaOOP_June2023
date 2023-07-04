package demo;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("P", 23);

        Dog dog = new Dog("G", 3);

        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.sleep());
        System.out.println(cat.produceSound());
        System.out.println(cat.countPows());

        System.out.println();

        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.sleep());



    }
}
