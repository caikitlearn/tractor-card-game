/**
 * Test code for Deck and Hand.
 */
public class Test {

    public static void main(String[] args) {
        TractorDeck tractorDeck = new TractorDeck("main tractor deck");
        tractorDeck.shuffle();
        System.out.println(tractorDeck);
        System.out.println(tractorDeck.size());


        //
        // Hand hand = new Hand("Hand");
        // deck.deal(hand, 5);
        // hand.display();
        //
        // Hand drawPile = new Hand("Draw Pile");
        // deck.dealAll(drawPile);
        // System.out.printf("Draw Pile has %d cards.\n",
        //                   drawPile.size());
    }

}
