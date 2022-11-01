package proj4;

/**
 * Processes the Minus token.  Has a Precedence of 1.
 * 
 * @author Hope Crisafi
 * @version 10/28/2022
 */
public class Minus implements Token{
    private int precedence;
    private boolean isOperator;

    public Minus(){
        this.isOperator = IS_OPERATOR;
        this.precedence = PREC_1;
    }

    /** Processes the Minus token.  Pops and appends every operator on the stack until either occurs:
     *      1. the Stack is empty
     *      2. the top of the stack is a LeftParen
     *      3. operator at top of Stack has lower precedence than Minus
     *  The Minus is then pushed onto the stack.
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
     * Minus is an operator
     * @return true
     */
    public boolean isOperator() {
        return this.isOperator;
    }


    /**
     * gets the precedence value of the Minus token
     * @return this.precedence
     */
    public int precValue() {
        return this.precedence;
    }


    /**
     * @return the String representation of Minus
     */
    public String toString(){
        return "-";
    }


    /** ------------------------------
     *      PRIVATE HELPER METHODS
     * _______________________________
     */


    /**
     * Returns true if:
     *      1. the Stack is not empty
     *      2. the top of the stack is not a LeftParen
     *      3. operator at top of Stack has higher precedence than Minus
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
