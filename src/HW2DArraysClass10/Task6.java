package HW2DArraysClass10;

public class Task6 {
    public static void main(String[] args) {

        String[][] countries = {
                {"Florida","Texas","Alaska"},
                {"Colombia","Brasil","Argentina"},
                {"Macedonia","France","Turkey"},
                {"China","Indonesia","North Korea"},
                {"Nigeria","Egypt","Algeria"}
        };

        int totalCountries=0;

        System.out.println("----------------For Loop-------------------");

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println("-----------------While Loop---------------------");
        int k=0;
        while  (k<countries.length) {
            int l=0;
            while (l<countries[k].length) {
                System.out.print(countries[k][l]+" ");
                l++;
            }
            System.out.println();
            k++;
        }
        System.out.println("-----------------Total Countries--------------------");


        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                totalCountries++;

            }

            }
        System.out.println(totalCountries);



        }
}
