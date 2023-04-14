package HW2DArraysClass10;

public class Task2 {
    public static void main(String[] args) {

        String[][] cars = {
                {"Dodge", "Ford", "Chevy"},
                {"Hyundai", "Kia", "Genesis"},
                {"Mercedes", "BMW", "Audi"},
                {"Fiat", "Alfa Romeo", "Lamborghini"}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(cars[i][j]);

            }
        }

        System.out.println();

        int k = 0;
        while (k< cars.length) {
            int l=0;

            while (l<cars[k].length) {
                System.out.println(cars[k][l]);

                l++;

            }

            k++;
        }

    }

}

