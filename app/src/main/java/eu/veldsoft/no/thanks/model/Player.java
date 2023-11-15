package eu.veldsoft.no.thanks.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents the players.
 */
class Player {
    /**
     * The name of the player.
     */
    private String name = "";

    /**
     * The number of chips.
     */
    private int chips = 0;

    /**
     * List of card for the player.
     */
    private List<Card> cards = new ArrayList<Card>();

    /**
     * Constructor for player object.
     *
     * @param name Name of the player.
     */
    Player(String name) {
        this.name = name;
    }

    /**
     * Player's name getter.
     *
     * @return Name of the player.
     */
    String name() {
        return name;
    }

    /**
     * Chips setter.
     *
     * @param chips Amount of chips.
     */
    void chips(int chips) {
        this.chips = chips;
    }

    /**
     * Chips getter.
     *
     * @return Amount of chips.
     */
    int chips() {
        return chips;
    }


    /**
     * Setup initial player components.
     */
    void setup() {
        chips = 0;
        cards.clear();
    }

    /**
     * Player's score according.
     *
     * @return Points of the player.
     */
    int score() {
        /*
         * Cards in a row only count as a single card with the lowest value. To calculate the score cards are sorted.
         */
        Collections.sort(cards);

        /*
         * Points taken from cards' values.
         */
        int points = 0;
        for (int i = 0, j = 0; i < cards.size(); ) {
            for (j = i + 1; j < cards.size(); j++) {
                if (cards.get(j).number() - cards.get(j - 1).number() != 1) {
                    break;
                }
            }

            points += cards.get(i).number();
            i = j;
        }
        //TODO Check the correctness of points calculation.

        return points - chips;
    }

    /**
     * Text report for the player state.
     *
     * @return Report text.
     */
    String report() {
        String text = "";

        text += name;
        text += "\n";
        text += "=== === ===";
        text += "\n";
        text += "Chips:";
        text += "\t";
        text += chips();
        text += "\n";
        text += "=== === ===";
        text += "\n";

        text += "Cards:";
        text += "\t";
        if (cards.size() > 0) {
            for (Card card : cards) {
                text += "\t";
                text += card.key();
            }
            text += "=== === ===";
            text += "\n";
        }

        return text;
    }
}
