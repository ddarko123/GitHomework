package JavaProject2;

public class Task3  {
    public static int numberOfWords (String sentence) {
        String[] split = sentence.split(" ");
        int count=0;
        for (int i = 0; i < split.length; i++) {

            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfWords("This should print out number six"));
    }
}
