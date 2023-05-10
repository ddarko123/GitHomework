package HWClass19;

public class Task4 {

    private static void multiplication(int a, int b) {
        System.out.println(a*b);
    }

    private static void multiplication (double a, int b) {
        System.out.println(a*b);
    }

    private static void multiplication (int a, double b) {
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        multiplication(1,5);
        multiplication(3.4,5);
        multiplication(5,4.4);
    }

}
