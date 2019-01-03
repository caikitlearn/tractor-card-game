public class TractorDeck extends CardCollection {

    public TractorDeck(String label) {
        super(label);

        for (int numDecks = 0; numDecks < 2; numDecks++) {
            // adding in regular cards
            for (int suit = 0; suit < 4; suit++) {
                for (int rank = 0; rank < 13; rank++) {
                    addCard(new Card(rank, suit));
                }
            }
            // adding in big and small jokers
            addCard(new Card(13, 4));
            addCard(new Card(14, 4));
        }
    }
}
