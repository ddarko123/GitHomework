package HWClass20;

public class CreditCardTester {
    public static void main(String[] args) {

        CreditCard card1=new CreditCard();
        Visa card2 = new Visa();
        AX card3 = new AX();

        card1.calculateInterest();
        card2.calculateInterest();
        card3.calculateInterest();
    }
}
