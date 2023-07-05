package MultipleImplementation_02;

public class Citizen implements Person, Birthable, Identifiable {
    private final String name;
    private final int age;
    private final String birthDate;
    private final String id;

    public Citizen(String name, int age, String id, String birthDate){
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.id = id;
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
}
