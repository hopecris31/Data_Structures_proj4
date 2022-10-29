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


    public String handle(Stack<Token> s) {
        String toReturn = "";
        while(!(s.peek() instanceof LeftParen)){
            toReturn += s.pop();
        }
        s.pop();
        return toReturn;
    }

    @Override
    public int precValue() {
        return this.precedence;
    }

    public String toString(){
        return "(";
    }
}
