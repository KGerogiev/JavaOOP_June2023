package P01_SortByNameAndAge_LAB;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < countPeople; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);

            Person person = new Person(firstName, lastName, age);

            personList.add(person);
        }

        Collections.sort(personList, (firstPerson, secondPerson) -> {
            int result = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());
            if (result == 0) {
                result = Integer.compare(firstPerson.getAge(), secondPerson.getAge());
            }
            return result;
        });

        for (Person person : personList){
            System.out.println(person);
        }
    }
}
