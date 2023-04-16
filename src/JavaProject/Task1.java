package JavaProject;

public class Task1 {
    public static void main(String[] args) {

        double[] temperauresWeek = {77.8,45.5,33.0,67.6,77.7,87.87,100.1};
        double highest=temperauresWeek[0];
        double lowest=temperauresWeek[0];
        for (int i = 0; i < temperauresWeek.length; i++) {
            if (temperauresWeek[i]>highest) {
                highest = temperauresWeek[i];

            }

        }
        System.out.println("Highest temperature of the week is "+highest);

        for (int i = 0; i < temperauresWeek.length; i++) {
            if (temperauresWeek[i]<lowest) {
                lowest = temperauresWeek[i];

            }

        }
        System.out.println("Lowest temperature of the week is "+lowest);
    }

}
