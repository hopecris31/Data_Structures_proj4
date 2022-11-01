package proj4;

/** 
 * Describes the methods that must be defined in order for an
 * object to be considered a token.  Every token must be able
 * to be processed (handle) and printable (toString).
 * 
 * @author Hope Crisafi
 * @version 10/26/2022
 *
 */
public interface Token {

	public final int NO_PREC = 0;
	public final int PREC_1 = 1;
	public final int PREC_2 = 2;
	public final int PREC_3 = 3;
	public final boolean IS_OPERATOR = true;
	public final boolean IS_NOT_OPERATOR = false;


	/** Processes the current token.  Since every token will handle
	 *  itself in its own way, handling may involve pushing or
	 *  popping from the given stack and/or appending more tokens
	 *  to the output string.
	 * 
	 *  @param s the Stack the token uses, if necessary, when processing itself.
	 *  @return String to be appended to the output
	 */
    public String handle(Stack<Token> s);

	/**
	 * Determines if a Token is an operator
	 * @return true if it is an operator, false if not
	 */
	public boolean isOperator();

	/**
	 * determines the precedence value of a token
	 * @return the precedence value
	 */
	public int precValue();
    
    /** Returns the token as a printable String
     * 
     *  @return the String version of the token.  For example, ")"
     *  for a right parenthesis.
     */
    public String toString();

}
