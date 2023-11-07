package eu.veldsoft.no.thanks.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents the deck of cards, available in the game.
 */
public class Deck {
    /**
     * List of cards.
     */
    private static final List<Card> cards = new ArrayList<Card>();

    /*
     *  Declaring the cards from 3 to 35
     */ {
        cards.add(new Card(3));
        cards.add(new Card(4));
        cards.add(new Card(5));
        cards.add(new Card(6));
        cards.add(new Card(7));
        cards.add(new Card(8));
        cards.add(new Card(9));
        cards.add(new Card(10));
        cards.add(new Card(11));
        cards.add(new Card(12));
        cards.add(new Card(13));
        cards.add(new Card(14));
        cards.add(new Card(15));
        cards.add(new Card(16));
        cards.add(new Card(17));
        cards.add(new Card(18));
        cards.add(new Card(19));
        cards.add(new Card(20));
        cards.add(new Card(21));
        cards.add(new Card(22));
        cards.add(new Card(23));
        cards.add(new Card(24));
        cards.add(new Card(25));
        cards.add(new Card(26));
        cards.add(new Card(27));
        cards.add(new Card(28));
        cards.add(new Card(29));
        cards.add(new Card(30));
        cards.add(new Card(31));
        cards.add(new Card(32));
        cards.add(new Card(33));
        cards.add(new Card(34));
        cards.add(new Card(35));
    }

    /**
     * Shuffles all cards.
     */
    static void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * Deal cards according to the game rules.
     *
     * @param miss Negative number for number of cards which are excluded.
     * @return Subset of cards to play with.
     */
    static List<Card> deal(int miss) {
        return cards.subList(0, cards.size() + miss);
    }
}
