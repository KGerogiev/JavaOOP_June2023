package zoo;

public class Animal {
    //fields
    private String name;

    //constructor
    public Animal(String name){
        this.setName(name);
    }

    //methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
