package HWClass20;
//Create a class CreditCard and define variable balance and interest.
// Create an instance method that will calculate interest based on the given balance.
//Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//Call the method by creating an object of each of the three classes.
public class CreditCard {
    int balance;
    double interest;
    void calculateInterest() {
        System.out.println(balance*(interest*0.01));
    }
}

class Visa extends CreditCard{

}

class AX extends CreditCard{
@Override
    void calculateInterest() {
    System.out.println(balance*(interest*0.01));
}
}