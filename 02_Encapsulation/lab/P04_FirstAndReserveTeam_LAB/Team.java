package P04_FirstAndReserveTeam_LAB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name){
        this.name = name;
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(this.firstTeam);
    }

    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(this.reserveTeam);
    }

    public void addPlayer(Person person){
        if (person.getAge() < 40){
            this.firstTeam.add(person);
        } else {
            this.reserveTeam.add(person);
        }
    }

    public void getStatistics(){
        System.out.printf("First team have %d players%n", this.getFirstTeam().size());
        System.out.printf("Reserve team have %d players%n", this.getReserveTeam().size());
    }
}
