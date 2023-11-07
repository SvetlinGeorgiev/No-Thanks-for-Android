package eu.veldsoft.no.thanks.model;

/**
 * It is a card played in the game.
 */
class Card implements Comparable<Card> {
    private int number;

    /*
     *  Checks if the card number is between 3 and 35.
     */
    Card(int number) {
        if (number < 3 && number > 35) {
            //TODO Do proper exception handling.
        }

        this.number = number;
    }

    /*
     *  Return the value of number.
     */
    int number() {
        return number;
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
