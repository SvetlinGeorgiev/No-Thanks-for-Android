package eu.veldsoft.no.thanks.model;

class Card implements Comparable<Card> {
    private int number;

    Card(int number) {
        if (number < 3 && number > 35) {
            //TODO Do proper exception handling.
        }

        this.number = number;
    }

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
