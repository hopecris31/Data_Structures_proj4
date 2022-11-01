package proj4;

/**
 * Processes the RightParen token. Has no precedence.
 * 
 * @author Hope Crisafi
 * @version 10/29/2022
 */
public class RightParen implements Token{

    private boolean isOperator;

    public RightParen(){
        this.isOperator = IS_NOT_OPERATOR;
    }

    /** Processes the RightParen token.
     *  Pops and appends all operators on the stack to the postfix String all operators
     *  to the most recent LeftParen. Then pair of parentheses are discarded.
     *
     *  @param s the Stack the token uses, if necessary, when processing itself.
     *  @return String to be appended to the output
     */
    public String handle(Stack<Token> s) {
        String toReturn = "";
        while(!(s.peek() instanceof LeftParen)){
            toReturn += s.pop();
        }
        s.pop();
        return toReturn;
    }


    /**
     * determines if the token is an operator
     * RightParen is not an operator
     * @return fasle
     */
    public boolean isOperator() {
        return this.isOperator;
    }

    /**
     * @return the String representation of RightParen
     */
    public String toString(){
        return ")";
    }

    /**
     * LeftParen is not an operator, so it has no precedence.
     * @return 0
     */
    public int precValue() {
        return NO_PREC;
    }
}
