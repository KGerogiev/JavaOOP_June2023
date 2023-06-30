package animals;

public class Frog extends Animal{
    //extended fields: name, age, gender

    //constructor
    public Frog(String name, int age, String gender) {
        super(name, age, gender);
    }

    //extended abstract method
    @Override
    public String produceSound() {
        return "Ribbit";
    }

}
