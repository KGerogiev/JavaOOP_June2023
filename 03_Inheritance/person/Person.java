package person;

public class Person {
    //fields
    private String name;
    private int age;

    //constructor
    public Person(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    //methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
