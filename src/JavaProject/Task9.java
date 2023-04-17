package JavaProject;

public class Task9 {
    public static void main(String[] args) {

        int[] numbers = {20, 2, 31, 14, 65, 18, 17, 16, 19};
        int highest = numbers[0];
        int secondHighest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (highest < numbers[i]) {
                secondHighest=highest;
                highest = numbers[i];
            }

        }

        System.out.println("Second largst number in the array is "+secondHighest);
    }
}
