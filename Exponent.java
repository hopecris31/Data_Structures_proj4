package proj4;

/**
 * Process the Exponent token.  Has the highest precedence of 3.
 *
 * @author Hope Crisafi
 * @version 10/28/2022
 */
public class Exponent implements Token{

    private int precedence;
    private boolean isOperator;

    public Exponent(){
        this.isOperator = IS_OPERATOR;
        this.precedence = PREC_3;
    }

    /** Processes the Exponent token.  Pops and appends every operator on the stack until either occurs:
     *      1. the Stack is empty
     *      2. the top of the stack is a LeftParen
     *      3. operator at top of Stack has lower precedence than Exponent
     *  The Exponent is then pushed onto the stack.
     *
     *  @param s the Stack the token uses, if necessary, when processing itself.
     *  @return String to be appended to the output
     */
    public String handle(Stack<Token> s) {
        String toReturn = "";
        while(validPopConditions(s, this)){
            toReturn += s.pop();
        }
        s.push(this);
        return toReturn;
    }


    /**
     * determines if the token is an operator
     * Exponent is an operator
     * @return true, Exponent is an operator
     */
    public boolean isOperator() {
        return this.isOperator;
    }


    /**
     * gets the precedence value of the Exponent token
     * @return the precedence value
     */
    public int precValue() {
        return this.precedence;
    }


    /** Returns the token Exponent as a printable String
     *
     *  @return the String version of the token.
     */
    public String toString(){
        return "^";
    }

    /** ------------------------------
     *      PRIVATE HELPER METHODS
     * _______________________________
     */


    /**
     * Returns true if:
     *      1. the Stack is not empty
     *      2. the top of the stack is not a LeftParen
     *      3. operator at top of Stack has higher precedence than Exponent
     * @param s a Stack ADT
     * @param current the current Token
     * @return true or false depending on conditions above
     */
    private boolean validPopConditions(Stack<Token> s, Token current){
        if(s.isEmpty()){
            return false;
        }
        else if(s.peek() instanceof LeftParen){
            return false;
        }
        else return s.peek().precValue() >= current.precValue();
    }
}
