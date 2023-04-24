package HWClass12;


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Mom's first name?");
        String girlName = scanner.nextLine();
        System.out.println("Dad's first name?");
        String boyName= scanner.nextLine();
        System.out.println("Boy or Girl?");
        String gender = scanner.nextLine();

        if (gender.equals("boy")) {
            System.out.println("Suggested baby name: "+boyName.substring(0,3).toUpperCase()+girlName.substring(2).toUpperCase());
        } else if (gender.equals("girl")) {
            System.out.println("Suggested baby name: "+girlName.substring(0,2).toUpperCase()+ boyName.substring(3).toUpperCase());
        }
    }
}
