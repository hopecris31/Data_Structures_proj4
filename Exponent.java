package proj4;

/**
 * Write a description of class Exponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exponent implements Token{

    private int precedence;

    public Exponent(){
        this.precedence = HIGH_3;
    }

    @Override
    public String handle(Stack<Token> s) {
        return null;
    }

    @Override
    public int precValue() {
        return this.precedence;
    }

    public String toString(){
        return "^";
    }
}
