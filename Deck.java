
package Week06CodingAssign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Declares the public class Deck
public class Deck {
	
	//The cards field will hold a list of Card objects.
	//The private access modifier means this list cannot be accessed directly from outside the class.
	//The list represents a collection of cards in a deck,or hand.
private List<Card> cards;

//Part of the constructor for the Deck class    
	public Deck() {
       
    	
    	// Initializes an empty list to store Card objects, using Java's ArrayList class.
    	this.cards = new ArrayList<Card>();

      // Create standard 52 card deck
      // Declares and initializes a string called suits
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
     
        // Declares and initializes a string called ranks
        String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
                "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

        // Code generates a full deck of cards by iterating over all possible combinations of suits and ranks, 
        // creating a Card object for each combination, and adding it to a collection.
        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
               
            	// Card values are 2-14 (representing 2-Ace)
                int value = i + 2;
                String name = ranks[i] + " of " + suit;
                
                // Creates a new object of the class Card assigning it the variable card and provides value and name
                Card card = new Card(value, name);
                this.cards.add(card);
            }
        }
    }
    // A method that shuffles the list of cards using Collections shuffle, that's a method that randomly reorders 
    // the elements in the 'cards'. 
   public void shuffle() {
        Collections.shuffle(this.cards);
    }

    
   // Declares the public method 'draw' that draws a card from a deck.
   public Card draw() {
	   	
	   //
	   // Method first checks if the collection of cards (this.cards) is empty using the isEmpty() method.
	   // it returns true if the collection has no elements.
		if (this.cards.isEmpty()) {
           
			// If the collection is empty, the method returns null. This indicates that there are no cards left to draw.
			return null;
        }
       
		// Code uses the remove method and returns the first element from the list 'this.cards'
        // Card is the return type to the method
        return this.cards.remove(0);
    }
}

