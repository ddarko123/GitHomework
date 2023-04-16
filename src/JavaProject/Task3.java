package JavaProject;

public class Task3 {
    public static void main(String[] args) {

        int[][] numbers = {
                {15,22,78},
                {57,44,21},
                {28,66,53}
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if(numbers [i][j] % 2 == 0) {
                    System.out.print(+numbers[i][j]+" ");
                }

            }
            System.out.println();

        }

    }
}
