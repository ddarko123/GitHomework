package JavaProject2.Task8;

public class Car {
    int carPrice;
    String color;

    public Car(int carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    double calculateSalePrice() {
        return this.carPrice;
    }
}
class Truck extends Car {
double weight;
    public Truck(int carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight=weight;
    }
    double calculateSalePrice(double weight) {
        double tenDiscout=(carPrice/100)*10;
        double twentyDiscout=(carPrice/100)*20;
        if(this.weight>2000) {
            return carPrice-tenDiscout;
        }
        return carPrice-twentyDiscout;
    }
}

class Sedan extends Car {
    double length;
    public Sedan(int carPrice, String color, double length) {
        super (carPrice, color);
        this.length=length;
    }

    double calculateSalePrice(double length) {
        double fiveDiscount=(carPrice/100)*5;
        double tenDiscount=(carPrice/100)*10;
        if (this.length>20) {
            return carPrice-fiveDiscount;
        }
        return carPrice-tenDiscount;
    }
}

class CarTester {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(50000,"blue",23);
        Truck truck = new Truck(60000,"brown", 2100 );
        System.out.println(sedan.calculateSalePrice(23));
        System.out.println(truck.calculateSalePrice(2100));
    }
}


