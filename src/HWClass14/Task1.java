package HWClass14;

public class Task1 {
    /*Create a method that will say Hello in different
    language based on the country that will passed when method is executed.*/

    void sayHello (String country) {
        switch (country) {
            case "England":
                System.out.println("Hello");
                break;
            case "Colombia":
                System.out.println("Hola");
                break;
            case "Germany":
                System.out.println("Guten Tag");
                break;
            default:
                System.out.println("I dont know the language in that "+country);
        }
    }

    public static void main(String[] args) {

        Task1 language = new Task1();
        language.sayHello("England");
        language.sayHello("Colombia");
        language.sayHello("Germany");


    }

}
