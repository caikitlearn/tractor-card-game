import java.util.Scanner;

public class TractorGame {

    public static final String[] TRUMPS = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
    public static final int bottomSize = 8;
    public static final int handSize = 25;

    // declaring the players
    private Player home;
    private Player west;
    private Player north;
    private Player east;

    private Scanner in;
    private CardCollection bottom;
    private TractorDeck tractorDeck;

    public TractorGame() {
        home = new Player("home");
        west = new Player("west");
        north = new Player("north");
        east = new Player("east");

        tractorDeck = new TractorDeck("main tractor decks");
        tractorDeck.shuffle();

        bottom = new CardCollection("bottom");

        tractorDeck.deal(home.getHand(), handSize);
        tractorDeck.deal(west.getHand(), handSize);
        tractorDeck.deal(north.getHand(), handSize);
        tractorDeck.deal(east.getHand(), handSize);

        tractorDeck.deal(bottom, bottomSize);
    }

    // declaring trump
    public void trumpDeclaration() {
        for (int i = 0; i < handSize; i++) {

        }
    }

    // beginning the game
    public void playGame() {
        trumpDeclaration();
    }

    public static void main(String[] args) {
        TractorGame tractorGame = new TractorGame();
        System.out.println(tractorGame.home.getName());
        System.out.println(tractorGame.west);
        System.out.println(tractorGame.north);
        System.out.println(tractorGame.east);
        System.out.println(tractorGame.bottom);
        tractorGame.playGame();
    }
}
