package HWClass21;

public class ComputerTester {
    public static void main(String[] args) {

        Computer[] laptops ={new Apple(128,"Air"),
        new Lenovo(1024,"ThinkPad"),
                new HP(512,"Pavilion"),
        new Dell(2048,"Inspiron")};

        for (Computer computers:laptops) {
            computers.start();
            computers.shutDown();

        }
        Computer apple = new Apple(128,"Air");
        ((Apple)apple).touchPadLogin();
        Computer lenovo = new Lenovo(1024,"ThinkPad");
        ((Lenovo)lenovo).CPUBoost();
    }
}
