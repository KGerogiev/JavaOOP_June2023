package P03_ValidationData_LAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        int countPeople = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countPeople; i++) {
            //Angel Ivanov 65 2200
            String[] data = scanner.nextLine().split("\\s+");
            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            double salary = Double.parseDouble(data[3]);


            Person person = new Person(firstName, lastName, age, salary);
            if (personDataIsCorrect(person)) {
                personList.add(person);
            }
        }


        int percentBonus = Integer.parseInt(scanner.nextLine());

        for (Person person : personList) {
            person.increaseSalary(percentBonus);
            System.out.println(person);
        }
    }
    public static boolean personDataIsCorrect (Person person){
        return !"null".equals(person.getFirstName()) && !"null".equals(person.getLastName()) &&
                person.getAge() != 0 && person.getSalary() != 0;
    }
}
