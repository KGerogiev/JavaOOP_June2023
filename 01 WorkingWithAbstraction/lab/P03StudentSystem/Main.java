package P03StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentSystem studentSystem = new StudentSystem();

        String command = scanner.nextLine();

        while (!command.equals("Exit")){

            String[] input = command.split(" ");

          if (input[0].equals("Create")){

                var name = input[1];
                var age = Integer.parseInt(input[2]);
                var grade =Double.parseDouble(input[3]);

                Student student = new Student(name, age, grade);
                studentSystem.createStudent(student);

            } else if (input[0].equals("Show")){
                studentSystem.showStudent(input[1]);
            }

            command = scanner.nextLine();
        }
    }
}
