package eu.veldsoft.no.thanks.model;

/**
 * It is a card played in the game.
 */
class Card implements Comparable<Card> {
    /**
     * Card number.
     */
    private int number;

    /**
     * The key value of the card.
     */
    private String key = "";

    /**
     * Checks if the card number is between 3 and 35.
     *
     * @param number The number of the card.
     * @param key    String key for card representation.
     */
    Card(int number, String key) {
        if (number < 3 && number > 35) {
            //TODO Do proper exception handling.
        }

        this.number = number;
        this.key = key;
    }

    /**
     * Card's number getter.
     *
     * @return The number of the card.
     */
    int number() {
        return number;
    }

    /**
     * Card's key getter.
     *
     * @return The string representation of card key.
     */
    String key() {
        return key;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int compareTo(Card card) {
        //TODO Check for acceding order sorting.
        return this.number() - card.number();
    }
}
