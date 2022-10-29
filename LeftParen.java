package proj4;

/**
 * Write a description of class LeftParen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftParen implements Token{

    private int precedence;
    public LeftParen(){
        this.precedence = LEFT_PAREN;
    }

    public String handle(Stack<Token> s) {
        return null;
    }

    @Override
    public int precValue() {
        return this.precedence;
    }
}
