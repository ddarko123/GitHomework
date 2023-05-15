package HWClass21;

public class Computer {
    int storage;
    String model;

    void start () {
        System.out.println("computer is starting");
    }
    void shutDown() {
        System.out.println("computer is shutting down");
    }
    Computer(int storage, String model) {
        this.storage=storage;
        this.model=model;
    }
}

class Apple extends Computer{
       @Override
    void start () {
        System.out.println("Apple computer is starting");
    }
    void touchPadLogin() {
        System.out.println("logging in with finger");
    }
    Apple(int storage, String model) {
        super(storage, model);
    }

    }


class Lenovo extends Computer{
    @Override
    void start () {
        System.out.println("Lenovo computer is starting");
    }
    void CPUBoost() {
        System.out.println("boosting the CPU");
    }
    Lenovo(int storage, String model) {
        super(storage, model);
    }
}

class HP extends Computer{
    @Override
    void start () {
        System.out.println("HP computer is starting");
    }
    void gamingMode() {
        System.out.println("activates gaming mode");
    }
    HP(int storage, String model) {
        super(storage, model);
    }
}

class Dell extends Computer{
    @Override
    void start () {
        System.out.println("Dell computer is starting");
    }
    void GPUboost() {
        System.out.println("boosting the GPU");
    }
    Dell(int storage, String model){
        super (storage, model);
    }
}
