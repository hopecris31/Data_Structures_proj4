package proj4;

/**
 * Write a description of class LeftParen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftParen implements Token{

    private boolean isOperator;
    public LeftParen(){
        this.isOperator = false;
    }

    public String handle(Stack<Token> s) {
        s.push(this);
        return "";
    }

    public boolean isOperator() {
        return this.isOperator;
    }

    @Override
    public int precValue() {
        return 0;
    }

}
