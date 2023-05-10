package HWClass19;

public class Task3 {
    static void multiplication(int a, int b) {
        System.out.println(a*b);
    }

    static void multiplication (double a, int b) {
        System.out.println(a*b);
    }

    static void multiplication (int a, double b) {
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        multiplication(3.5,4);
        multiplication(5,5.5);
        multiplication(3,8);
    }
}
