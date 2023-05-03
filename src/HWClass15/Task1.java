package HWClass15;

public class Task1 {

    String name;
    String ID;
    static int numberOfStudents;

    public static void main(String[] args) {


        Task1 student1 = new Task1();
        student1.name="Darko";
        student1.ID="123-111";
        numberOfStudents++;

        Task1 student2 = new Task1();
        student1.name="Marko";
        student1.ID="123-222";
        numberOfStudents++;

        Task1 student3 = new Task1();
        student1.name="Connor";
        student1.ID="123-333";
        numberOfStudents++;


        System.out.println(numberOfStudents);

    }
}
