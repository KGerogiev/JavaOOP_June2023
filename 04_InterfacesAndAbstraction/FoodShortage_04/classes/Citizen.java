package FoodShortage_04.classes;

import FoodShortage_04.inerfaces.Buyer;
import FoodShortage_04.inerfaces.Identifiable;
import FoodShortage_04.inerfaces.Person;
import FoodShortage_04.inerfaces.Birthable;

public class Citizen implements Person, Birthable, Identifiable, Buyer {
    private final String name;
    private final int age;
    private final String id;
    private final String birthDate;
    private int food;

    public Citizen(String name, int age, String id, String birthDate){
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.id = id;
        this.food = 0;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }

    @Override
    public int getFood() {
        return this.food;
    }
}
