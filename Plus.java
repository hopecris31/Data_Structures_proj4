package proj4;

/**
 * Write a description of class Plus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plus implements Token {

    public String handle(Stack<Token> s) {
        return "erase this";
    }

    @Override
    public int precValue() {
        return 0;
    }

    public String toString() {
    	return "erase this";
    }
    

}
