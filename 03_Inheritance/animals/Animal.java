package animals;

public class Animal {
    //fields
    private String name;
    private int age;
    private String gender;


    //constructor
    public Animal(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    //methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (!gender.trim().isEmpty()) {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    public String produceSound() {
        return null;
    }
}
