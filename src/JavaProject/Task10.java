package JavaProject;

public class Task10 {
    public static void main(String[] args) {

        String[] elements = {"Darko", "Marko", "John", "Connor", "Darko"};

        for (int i = 0; i < elements.length; i++) {
            for (int j = i+1; j < elements.length; j++) {
                if (elements[i]==elements[j]) {
                    System.out.println(elements[j]);
                }

            }

        }

    }
}
