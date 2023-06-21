package P03StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return this.repo;
    }


    public void createStudent(Student student) {

        if (!this.repo.containsKey(student.getName())) {
            this.repo.put(student.getName(), student);
        }
    }

    public void showStudent(String name) {

        if (this.repo.containsKey(name)) {
            var student = this.repo.get(name);
            System.out.println(student.toString() + getGrade(student));
        }
    }

    public String getGrade(Student student) {

        if (student.getGrade() >= 5.00) {
            return " Excellent student.";

        } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
            return " Average student.";

        } else {
            return " Very nice person.";

        }
    }
}
