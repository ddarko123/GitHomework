package HWClass18;
/* Write a Java program called Teacher.
Identify features and 4 behaviour of that Class.
Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher .
Test all 4 classes*/
public class Teacher {
    String name;
    char gender;
    boolean isGraduated;

    void teach () {
        System.out.println("giving a lecture");
    }
    void test () {
        System.out.println("testing the students");
    }
    void discuss () {
        System.out.println("having a discussion");
    }
    void relax () {
        System.out.println("relaxing");
    }
}
