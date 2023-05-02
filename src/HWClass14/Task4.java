package HWClass14;

public class Task4 {
    char getGrade(int score) {
        if (score > 90) {
            return 'A';
        } else if (score > 80) {
            return 'B';
        } else if (score > 70) {
            return 'C';
        } else if (score > 50) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        int score = 77;
        Task4 student = new Task4();
        char grade = student.getGrade(score);
        System.out.println(grade);
    }
}