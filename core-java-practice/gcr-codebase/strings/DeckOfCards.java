//Write a program to create a deck of cards, initialize the deck, shuffle the deck, and distribute the deck of n cards to x number of players. Finally, print the cards the players have.

//importing scanner class
import java.util.Scanner;

public class DeckOfCards {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		
		String[] suits={"Hearts","Diamonds","Clubs","Spades"};
		String[] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		int numOfCards=suits.length*ranks.length;
		String[] deck=initializeDeck(suits,ranks,numOfCards);
		//Shuffle deck
		shuffleDeck(deck);
		//user input
		System.out.print("Enter number of players: ");
        int players = input.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = input.nextInt();
		
		// Distribute cards
        String[][] distributedCards = distributeCards(deck, players, cardsPerPlayer);

        // Print players and cards
        printPlayers(distributedCards);
		
		// closing the input
		input.close();
	}
	 // Method to initialize deck
    public static String[] initializeDeck(String[] suits, String[] ranks,int numOfCards) {
        String[] deck = new String[numOfCards];
        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }
        return deck;
    }

    // Method to shuffle deck
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));

            // Swap
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {

        if (players * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return null;
        }

        String[][] playerCards = new String[players][cardsPerPlayer];
        int cardIndex = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex];
                cardIndex++;
            }
        }
        return playerCards;
    }

    // Method to print players and cards
    public static void printPlayers(String[][] players) {

        if (players == null) {
            return;
        }

        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + ":");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
        }
    }
	
}

