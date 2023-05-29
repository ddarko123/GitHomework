package HWClass24;

import java.util.HashSet;

public class Student {
    String name;
    String studentID;
    Student (String name, String studentID) {
        this.name=name;
        this.studentID=studentID;
    }
    public String getName() {
        return name;
    }
    public String getStudentID() {
        return studentID;
    }

}
class StudentTester{

    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("Darko","123-321"));
        students.add(new Student("Marko","124-322"));
        students.add(new Student("Adam","125-323"));

        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
