package HWClass13;

public class Task1 {
    public static void main(String[] args) {

        String str = "This sentence I want to reverse";
        String [] strArr = str.split(" ");


       for (String s : strArr) {
            for (int i =s.length()-1; i>=0 ; i--) {
                System.out.print(s.charAt(i));

            }
           System.out.print(" ");
        }


    }
}
