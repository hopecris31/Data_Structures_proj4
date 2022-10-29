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
        s.push(this);
        return null;
    } //handle only returns when algorithm requires popping, that string is taken and appended in convert class

    //string.append(current.handle())
    @Override
    public int precValue() {
        return this.precedence;
    }
}
