package JavaProject2;

public class Task2 {
    public static void main(String[] args) {
        String normal = "madam";
        StringBuilder sb = new StringBuilder(normal);
        sb.reverse();
        String reversed = sb.toString();
        if (normal.equals(reversed)) {
            System.out.println(normal+" is palindrome");
        } else {
            System.out.println(normal+ " is not a palindrome");
        }
    }
}
