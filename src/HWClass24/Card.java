package HWClass24;

import java.util.Iterator;
import java.util.LinkedList;

public class Card {
    double interestRate;
    String cardType;
    Card(double interestRate, String cardType) {
        this.interestRate=interestRate;
        this.cardType=cardType;
    }

    @Override
    public String toString() {
        return "Card{" +
                "interestRate=" + interestRate +
                ", cardType='" + cardType + '\'' +
                '}';
    }
}
class CardTester {
    public static void main(String[] args) {
        LinkedList<Card> cards = new LinkedList<>();
        cards.add(new Card(3.5,"card1"));
        cards.add(new Card(2.5,"card2"));
        cards.add(new Card(6.5,"card3"));

        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            card.toString();

        for (Card card1 : cards) {
            card1.toString();
        }
        Iterator<Card> iterator = cards.iterator();
        while (iterator.hasNext()) {
            Card cardIterator = iterator.next();
            cardIterator.toString();
        }
        }
    }
}



