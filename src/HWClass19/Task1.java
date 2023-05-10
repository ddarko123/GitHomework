package HWClass19;

public class Task1 {
    static void calculateArea (int a, int b) {
        System.out.println(a*b);
    }
   static void calculateArea (int a) {
        System.out.println(a*a);
    }
}

class TesterTask1 extends Task1 {
    public static void main(String[] args) {
        Task1.calculateArea(2,4);
        Task1.calculateArea(5);
    }

}
