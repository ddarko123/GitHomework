package HWClass12;

public class Task2 {
    public static void main(String[] args) {
        String str = "Sunday";
        StringBuilder reverseStr= new StringBuilder(str);
        reverseStr.reverse();
        String str2=reverseStr.toString();
        System.out.println(str2);


    }
}
