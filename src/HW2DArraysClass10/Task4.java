package HW2DArraysClass10;

public class Task4 {
    public static void main(String[] args) {

        int[][] numbers = {
                {4, 5, 23},
                {2, 77, 13},
                {6, 44, 32}
        };
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

            }

            int[] arr = numbers[i];
            for (int k = 0; k < arr.length; k++) {
                sum = sum + arr[k];

            }

        }
        System.out.println(sum);

    }
}
