package animals;

public class Tomcat extends Cat {
    //extended fields: name, age

    //field
    private static final String GENDER = "Male";

    //constructor
    public Tomcat(String name, int age) {
        super(name, age, GENDER);
    }

    //extended abstract method
    @Override
    public String produceSound() {
        return "MEOW";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.getClass().getSimpleName()).append(System.lineSeparator());
        sb.append(this.getName() + " " + this.getAge() + " " + this.getGender()).append(System.lineSeparator());
        sb.append(this.produceSound());

        return sb.toString();
    }
}
