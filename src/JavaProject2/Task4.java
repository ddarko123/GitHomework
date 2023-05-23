package JavaProject2;

public class Task4 {
 /*   public static void main(String[] args) {
        String word1 = "silent";
        String word2 = "listen";

        boolean isTrue = false;

        char[] a = new char[word1.length()];
        char[] b = new char[word2.length()];

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                System.out.println(!isTrue);
            } else {
                System.out.println(isTrue);
            }
        }

    }*/

    public static boolean anagram (String str1, String str2) {
        char[] a = new char[str1.length()];
        char[] b = new char[str2.length()];

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(anagram("silent","listen"));
    }

}