package demo;

public class Cat extends Mammal implements Animal{

    public Cat(String name, int age){
        super(name, age);
    }
    @Override
    public String sleep() {
        return "Cat is sleeping..";
    }


    @Override
    public String produceSound() {
        return "Mrrrrr";
    }

    public String countPows(){
        return String.valueOf(Animal.COUNT_POWS);
    }
}
