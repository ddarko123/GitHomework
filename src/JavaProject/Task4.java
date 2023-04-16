package JavaProject;

public class Task4 {
    public static void main(String[] args) {

        int[][] numbers = {
                {15, 22, 78},
                {57, 44, 21},
                {28, 66, 53}
        };
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    sumEven = sumEven + numbers[i][j];
                }

            }

        }
        System.out.print("The sum of all even numbers is "+sumEven);
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 1) {
                    sumOdd = sumOdd + numbers[i][j];
                }

            }

        }
        System.out.print("The sum of all odd numbers is "+sumOdd);
    }
}
