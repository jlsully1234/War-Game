

package Week06CodingAssign;

//Public constructor that's accessible from any other class. 
//Card is the name of the class, and constructor.
 public class Card {
  
	// Creates a private integer value and string name & specifies the constructor's parameters, 
	 // it is only accessible to it's class 
	private int value;
    private String name;

    // The constructor initializes a Card object with a specified integer value and string name, 
    // setting the object's value and name attributes to the provided arguments.
    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    //// Getter and Setter methods are used to encapsulate the fields and provide controlled access to them.
    
    
    // This is a public method that gets or returns the current value of an integer variable named value. 
       public int getValue() {
        return value;
    }

    //  This is a public method that (sets) or assigns the provided integer value to a variable named value.
    public void setValue(int value) {
       	this.value = value;
    }

    // A public method 'getName()' that gets or returns the value of the 'name' attribute.
        public String getName() {
        return name;
    }
    // A public method that sets the value of the 'name' attribute & allows other classes or objects to modify the value of 'name'.
    public void setName(String name) {
        this.name = name;
    }

    //The public describe() method outputs the name of the object to the console.
    public void describe() {
        System.out.println(this.name);
    }
}

