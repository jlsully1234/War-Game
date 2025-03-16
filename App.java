
package Week06CodingAssign;

//Declares a public class called App
public class App {
   
	//Defines the main method
	public static void main(String[] args) {
        
		// Instantiate a deck and two players
		// Creates a new object of the 'Deck' class and assigns it the variable 'deck'
        Deck deck = new Deck();
        
        // Creates a new object of the Player class, passing the string "Player1" as an argument to the constructor.
        Player player1 = new Player("Player 1");
        
        // Creates another Player object, named "Player 2", and assigns it to the variable player2.
        Player player2 = new Player("Player 2");

        // Method used to shuffle the deck then prints to console that the deck has been shuffled
        deck.shuffle();
        System.out.println("The deck has been shuffled!");

        // prints to console, loops through cards to deal 26 cards to each player
        System.out.println("\nDealing cards to players...");
        for (int i = 0; i < 52; i++) {
           // Using the even & odd index to have player 1 and/ or two draw from the deck
        	if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        // Prints to console 
        System.out.println("Cards have been dealt!");

        // Starts the game play - with a for loop that does 26 rounds. Code prints "game start" and "Round X:" 
        // for each round from 1 to 26, each on a new line. 
        System.out.println("\n=== GAME START ===");
        for (int i = 0; i < 26; i++) {
            System.out.println("\nRound " + (i + 1) + ":");

            // Each player flips a card
            // Code declares two card objects and methods to flip the cards and returns a card object
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            // Prints to console what cards the players play, displaying the cards played for each player using the describe method
            // Prints concatenated message of cards and players
            System.out.print(player1.getName() + " plays: ");
            card1.describe();

            System.out.print(player2.getName() + " plays: ");
            card2.describe();

            // Compares cards and award points
            // Using if, else statements to get values to determine the winner. using concatenated message, prints name of winning player 1,  else if, player 2
            // or else, prints, it's a tie 
            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println(player1.getName() + " wins this round!");
            } else if (card2.getValue() > card1.getValue()) {
                player2.incrementScore();
                System.out.println(player2.getName() + " wins this round!");
            } else {
                System.out.println("It's a tie! No point awarded.");
            }

            // Prints to console current score and concatenates the message with players name and score
            System.out.println("Current score: " + player1.getName() + ": " + player1.getScore() +
                    " | " + player2.getName() + ": " + player2.getScore());
        }

        // Determines the game is over prints to  display 'game over and final results by getting player 1 or 2's score
        System.out.println("\n=== GAME OVER ===");
        System.out.println("Final Score:");
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());

        // Determine the winner by comparing which player has the highest score, creates an alternate condition if it's 
        // not player 1, else if player 2, else handles a draw. Prints the winning results. 
        if (player1.getScore() > player2.getScore()) {
            System.out.println("Winner: " + player1.getName());
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println("Winner: " + player2.getName());
        } else {
            System.out.println("Result: Draw");
        }
    }
}

