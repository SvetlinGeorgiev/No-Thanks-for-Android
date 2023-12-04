package eu.veldsoft.no.thanks.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents the deck of cards, available in the game.
 */
class Deck {
    /**
     * List of cards.
     */
    private static final List<Card> cards = new ArrayList<Card>();

    /**
     *  Declaring the cards from 3 to 35
     */
    static {
        cards.add(new Card(3, "03"));
        cards.add(new Card(4, "04"));
        cards.add(new Card(5, "05"));
        cards.add(new Card(6, "06"));
        cards.add(new Card(7, "07"));
        cards.add(new Card(8, "08"));
        cards.add(new Card(9, "09"));
        cards.add(new Card(10, "10"));
        cards.add(new Card(11, "11"));
        cards.add(new Card(12, "12"));
        cards.add(new Card(13, "13"));
        cards.add(new Card(14, "14"));
        cards.add(new Card(15, "15"));
        cards.add(new Card(16, "16"));
        cards.add(new Card(17, "17"));
        cards.add(new Card(18, "18"));
        cards.add(new Card(19, "19"));
        cards.add(new Card(20, "20"));
        cards.add(new Card(21, "21"));
        cards.add(new Card(22, "22"));
        cards.add(new Card(23, "23"));
        cards.add(new Card(24, "24"));
        cards.add(new Card(25, "25"));
        cards.add(new Card(26, "26"));
        cards.add(new Card(27, "27"));
        cards.add(new Card(28, "28"));
        cards.add(new Card(29, "29"));
        cards.add(new Card(30, "30"));
        cards.add(new Card(31, "31"));
        cards.add(new Card(32, "32"));
        cards.add(new Card(33, "33"));
        cards.add(new Card(34, "34"));
        cards.add(new Card(35, "35"));
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
        List<Card> subset = new ArrayList<Card>();

        /*
         * Explicit copy of the cards without removal from the deck.
         */
        for (int i = 0; i < cards.size() + miss; i++) {
            subset.add(cards.get(i));
        }

        return subset;
    }
}
