package eu.veldsoft.no.thanks.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Table class which is an interface class for the package.
 */
public class Table {
    /**
     * Deck with the cards.
     */
    private List<Card> cards = new ArrayList<Card>();

    /**
     * List of players.
     */
    private List<Player> players = new ArrayList<Player>();

    /**
     * The player who is playing at the moment.
     */
    private Player playing = null;

    /**
     * Setup initial game components.
     *
     * @throws RuntimeException A setup failure.
     */
    public void setup() throws RuntimeException {
        Deck.shuffle();
        cards = Deck.deal(-9);

        /*
         * Determine the amount of chips to give away according to the game's rules.
         */
        int chips = 0;
        if (3 <= players.size() && players.size() <= 5) {
            chips = 11;
        } else if (players.size() == 6) {
            chips = 9;
        } else if (players.size() == 7) {
            chips = 7;
        } else {
            throw new RuntimeException("Invalid number of players!");
        }

        /*
         * Setup players.
         */
        for (Player p : players) {
            p.setup();
            p.chips(chips);
        }

        //TODO It is better each player to be able to be in each order.
        Collections.shuffle(players);

        /*
         * The first player plays after start of the game.
         */
        playing = players.get(0);
    }

    /**
     * Game over check.
     *
     * @return True if the game is over, false otherwise.
     */
    public boolean over() {
        return cards.size() == 0;
    }

    /**
     * Get the player on turn.
     *
     * @return Currently playing player.
     */
    public Player playing() {
        return playing;
    }
}
