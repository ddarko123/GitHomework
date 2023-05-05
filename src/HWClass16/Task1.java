package HWClass16;
/* Create a method that will take a String as a parameter and
 returns reversed String. Method should be available to
 all classes within your project and accessible by class name. */
public class Task1 {
    public static String reversed (String s) {
        StringBuilder sbd=new StringBuilder(s);
        sbd.reverse();
        return sbd.toString();
    }

    public static void main(String[] args) {
        System.out.println(reversed("darko"));
    }
}
