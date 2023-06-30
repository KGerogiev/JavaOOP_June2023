package Demo;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public void printHallo(){
        System.out.println("Hallo from Animal");
    }
}
