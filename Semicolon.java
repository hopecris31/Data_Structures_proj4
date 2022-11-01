package proj4;

/**
 * Processes the Semicolon token. Has no precedence.
 * 
 * @author Hope Crisafi
 * @version 10/29/2022
 */
public class Semicolon implements Token{

private boolean isOperator;
    public Semicolon(){
        this.isOperator = IS_NOT_OPERATOR;
    }

    /** Processes the Semicolon token.
     *  Indicates that the end of the expression has been reached.
     *  All remaining operators on the stack are popped and appended to the postfix String.
     *
     *  @param s the Stack the token uses, if necessary, when processing itself.
     *  @return String to be appended to the output
     */
    public String handle(Stack<Token> s) {
        String toReturn = "";
        while(!s.isEmpty()){
            toReturn += s.pop();
        }
        return toReturn;
    }

    /**
     * determines if the token is an operator
     * Semicolon is not an operator
     * @return false
     */
    public boolean isOperator() {
        return this.isOperator;
    }

    /**
     * Semicolon is not an operator, so it has no precedence.
     * @return 0
     */
    public int precValue() {
        return NO_PREC;
    }

    /**
     * @return the String representation of Semicolon
     */
    public String toString(){
        return ";";
    }

}
