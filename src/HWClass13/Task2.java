package HWClass13;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to check if it is palindrome or not:");
        String word = scanner.nextLine();
        boolean isTrue = true;
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        String reversed = sb.toString();
        System.out.println(reversed);
       if (word.equals(reversed)) {
            System.out.println(isTrue);
        } else {
            System.out.println(!isTrue);
        }
    }
}
