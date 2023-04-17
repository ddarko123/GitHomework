package JavaProject;

public class Task8 {
    public static void main(String[] args) {

        int [] numbers = {55, 1, 33, 44, 57, 9, 12};
        int highestNum = numbers[0];
        int lowestNum = numbers [0];

        for (int i = 0; i < numbers.length; i++) {
            if (highestNum<numbers[i]) {
                highestNum = numbers[i];
            } else if (lowestNum>numbers[i]){
                lowestNum = numbers[i];
            }
        }
        System.out.println("Highest number is "+highestNum);
        System.out.println("Lowest number is "+lowestNum);


    }
}
