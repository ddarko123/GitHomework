package HWClass24;

import java.util.ArrayList;
import java.util.Iterator;

public class Insurance {
    String insuranceName;
    void getQuote() {}
    void cancelInsurance() {}
}

class Car extends Insurance {
    String carModel;
}
class Pet extends Insurance {
    String petType;
}
class Health extends Insurance {}
class Main {
    public static void main(String[] args) {
        ArrayList<Insurance> policies = new ArrayList<>();
        policies.add(new Car());
        policies.add(new Pet());
        policies.add(new Health());
        for (Insurance policy : policies) {
            policy.getQuote();
            policy.cancelInsurance();
        }
        Iterator<Insurance> iterator = policies.iterator();
        while(iterator.hasNext()) {
            Insurance insurance = iterator.next();
            insurance.getQuote();
            insurance.cancelInsurance();
        }

    }
}

