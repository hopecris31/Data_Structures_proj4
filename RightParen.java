package proj4;

/**
 * Write a description of class RightParen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RightParen implements Token{

    private int precedence;
    private boolean isOperator;

    public RightParen(){
        this.isOperator = false;
    }


    public String handle(Stack<Token> s) {
        String toReturn = "";
        while(!(s.peek() instanceof LeftParen)){
            toReturn += s.pop();
        }
        s.pop();
        return toReturn;
    }


    public boolean isOperator() {
        return this.isOperator;
    }

    public String toString(){
        return ")";
    }

    @Override
    public int precValue() {
        return 0;
    }
}
