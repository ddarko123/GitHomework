package JavaProject2;

public class Task5 {
       public static void main(String args[]) {

        String str ="abracadabra";

        for(char repetitive : str.toCharArray()){
            if ( str.indexOf(repetitive) == str.lastIndexOf(repetitive)) {
                System.out.println(repetitive);
                break;
            }
        }
    }
}
