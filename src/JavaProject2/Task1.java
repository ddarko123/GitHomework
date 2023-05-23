package JavaProject2;

public class Task1 {
    static String reversed(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reversed("Hello"));
    }
}
