package JavaProject;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number that you would like to check if it is a prime number");
        int number = input.nextInt();

        boolean prime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
            break;
            }

        }
        if (prime==true && number > 1) {
            System.out.println(number+ " is a prime number");
        } else {
            System.out.println(number+" is not a prime number");
        }

    }
}
