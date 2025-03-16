package Week06CodingAssign;

import java.util.ArrayList; // Imports ArrayList and Java utility
import java.util.List;

// public class declaration
public class Player {
 
	// These are private access modifiers can not be accessed outside of class 
	
	// Declares a private instance variable named hand, which is a list of Card objects.
	private List<Card> hand;
   
	// Declares a private integer variable named score used to keep track of the player's score in the game.
	private int score;
   
	// Declares a private string variable 'name' that is used to store the name of the player. 
	private String name;

    // Constructor initializes a Player object with an empty hand, a score of 0, and assigns the provided name to the player.
	public Player(String name) {
        this.hand = new ArrayList<Card>();
        this.score = 0;
        this.name = name;
    }

    // Describe method provides a textual representation of an object by printing its name, score, and the details of each card in its hand. 
		public void describe() {
        System.out.println("\n" + this.name + " has a score of " + this.score);
        System.out.println(this.name + "'s cards:");
        for (Card card : this.hand) {
            card.describe();
        }
    }

    // The 'flip()' method checks if the hand is empty and, if not, removes and returns the top card from the hand.
	// If the hand is empty, it returns null.
		public Card flip() {
        if (this.hand.isEmpty()) {
            return null;
        }
        return this.hand.remove(0); // Remove and return the top card
    }

    // The 'draw' method  tries to draw a card from the 'Deck', the card is not null it adds it to the current object's hand.
	public void draw(Deck deck) {
        Card card = deck.draw();
        if (card != null) {
            this.hand.add(card);
        }
    }

    //Method increases the value of the 'score instance variable by 1 each time its called
	public void incrementScore() {
        this.score++;
    }

    // Getters and Setters means of encapsulation
    
    // 'getHand' is a public 'getter' method that returns a list of 'Card' objects
    public List<Card> getHand() {
        return hand;
    }

    //The setHand setter method updates the instance variable 'hand' with the list of 'Card' objects passed to it.
    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    // Code defines a public getter method that reruns the value of the 'score' variable.  
    public int getScore() {
        return score;
    }     
        
    // Getter public method that updates the 'score' attribute of an object. 
    public void setScore(int score)	{
    this.score = score;
    }

    // Defines a getter method that returns the value of a String variable called 'name' 
    public String getName() {
        return name;
    }
    
    // Defines a setter method that updates the string 'name'
    public void setName(String name) {
        this.name = name;
    }
}

