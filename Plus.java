package proj4;

/**
 * Write a description of class Plus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plus implements Token {

    private int precedence;

    public Plus(){
        this.precedence = LOW_1;
    }


    public String handle(Stack<Token> s) {
        return null;
    }


    public int precValue() {
        return this.precedence;
    }

    public String toString() {
    	return "+";
    }
    

}
