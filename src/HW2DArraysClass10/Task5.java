package HW2DArraysClass10;

public class Task5 {
    public static void main(String[] args) {

        int[][] numbers = {
                {4, 5, 23,2},
                {2, 77, 13,2},
                {6, 44, 32,3}
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j]%2==0) {
                    System.out.print(numbers[i][j]+" ");
                }

            }
            System.out.println();

        }


    }
}
