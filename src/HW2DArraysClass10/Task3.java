package HW2DArraysClass10;

public class Task3 {
    public static void main(String[] args) {


        String[][] groceries = {
                {"sprouts", "tomatoes", "potatoes"},
                {"lemons", "oranges", "berries"},
                {"cheese", "yogurt", "sour cream"},
                {"waffles", "crepes", "pancakes"}};

        for (int i = 0; i < groceries.length; i++) {
            for (int j = 0; j < groceries[i].length; j++) {
                System.out.print(groceries[i][j] + " ");


            }
            System.out.println();

        }
        System.out.println();
        int k=0;

        while (k< groceries.length) {
            int l=0;
            while (l < groceries[k].length) {
                System.out.print(groceries[k][l]+" ");
                l++;
            }
            System.out.println();
            k++;
        }

    }
}
