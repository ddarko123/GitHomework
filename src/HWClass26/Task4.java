package HWClass26;

import java.util.ArrayList;

/*Create a collection of integers in which you can keep duplicates.
        Write a logic to find sum of all integers*/
public class Task4 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(6);
        numbers.add(10);

        int sum=0;
        for (Integer number : numbers) {
            sum=sum+number;
        }
        System.out.println(sum);
    }
}
