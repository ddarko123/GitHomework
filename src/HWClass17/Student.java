package HWClass17;
/* Write a java Class Students that have a constructor
which takes students name and 3 subject grades.
 Inside your class also have a method to Calculate Average Grade.
  Test Student class for 5 different
students with different marks.
Your program should print an average mark of each students name.*/
public class Student {
    String name;
    int mathGrade;
    int historyGrade;
    int biologyGrade;

    Student(String name, int mathGrade, int historyGrade, int biologyGrade) {
        this.name = name;
        this.mathGrade = mathGrade;
        this.historyGrade = historyGrade;
        this.biologyGrade = biologyGrade;
    }
        int avarageGrade () {
        return (mathGrade+historyGrade+biologyGrade)/3;
        }
        String returnName () {
        return name;
        }

    public static void main(String[] args) {
        Student student1 = new Student("Darko", 4,4,5);
        System.out.println(student1.returnName()+" "+student1.avarageGrade());

        Student student2 = new Student("John", 2,4,5);
        System.out.println(student2.returnName()+" "+student2.avarageGrade());

        Student student3 = new Student("Connor", 3,5,5);
        System.out.println(student3.returnName()+" "+student3.avarageGrade());

        Student student4 = new Student("Adam", 5,5,5);
        System.out.println(student4.returnName()+" "+student4.avarageGrade());

        Student student5 = new Student("Steve", 3,4,1);
        System.out.println(student5.returnName()+" "+student5.avarageGrade());

    }
    }

