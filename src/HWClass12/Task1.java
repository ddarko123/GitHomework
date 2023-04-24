package HWClass12;

public class Task1 {
    public static void main(String[] args) {

        String str = "this string is not an empty string";
        if (!str.isBlank() && str.length()>=3 && str.length()%2==1) {
            int halfString=str.length()/2;
            char middleChar=str.charAt(halfString);
            System.out.println(middleChar);
        }
    }
}
