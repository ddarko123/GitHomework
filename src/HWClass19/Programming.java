package HWClass19;

public class Programming {

    static void printInfo () {
        System.out.println("I love programming languages");

    }
    static void printInfo (String s) {
        System.out.println("I love "+s);

    }


    public static void main(String[] args) {
        Programming.printInfo();
        Programming.printInfo("java");
    }
}
