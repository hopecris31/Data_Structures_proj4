package proj4;

/**
 * Write a description of class RightParen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RightParen implements Token{

    private int precedence;

    public RightParen(){
        this.precedence = RIGHT_PAREN;
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
        return "(";
    }
}
