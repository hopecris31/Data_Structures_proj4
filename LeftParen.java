package proj4;

/**
 * Processes the LeftParen token.  Has no precedence.
 * 
 * @author Hope Crisafi
 * @version 10/28/2022
 */
public class LeftParen implements Token{

    private boolean isOperator;

    public LeftParen(){
        this.isOperator = IS_NOT_OPERATOR;
    }


    /** Processes the LeftParen token.
     *  Pushes the LeftParen onto the Stack.
     *
     *  @param s the Stack the token uses, if necessary, when processing itself.
     *  @return String to be appended to the output
     */
    public String handle(Stack<Token> s) {
        s.push(this);
        return "";
    }


    /**
     * determines if the token is an operator
     * LeftParen is not an operator
     * @return fasle, LeftParen is not an operator
     */
    public boolean isOperator() {
        return this.isOperator;
    }


    /**
     * gLeftParen is not an operator, so it has no precedence.
     * @return the precedence value
     */
    public int precValue() {
        return NO_PREC;
    }


    /** Returns the token LeftParen as a printable String
     *
     *  @return the String version of the token.
     */
    public String toString(){
        return "(";
    }

}
