/**
 * A deck of playing cards.
 */
public class Deck extends CardCollection {

    /**
     * Constructs a standard deck of 52 cards.
     */
    public Deck(String label) {
        super(label);

        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                addCard(new Card(rank, suit));
            }
        }

        

    }

}
