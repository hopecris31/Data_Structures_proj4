package proj4;

/** 
 * Describes the methods that must be defined in order for an
 * object to be considered a token.  Every token must be able
 * to be processed (handle) and printable (toString).
 * 
 * @author Chris Fernandes
 * @version 10/26/08
 *
 */
public interface Token {

	public final int LOW_1 = 1;
	public final int MED_2 = 2;

	public final int HIGH_3 = 3;
	public final int LEFT_PAREN = 4;
	public final int RIGHT_PAREN = 5;
	public final int SEMICO = 6;

	/** Processes the current token.  Since every token will handle
	 *  itself in its own way, handling may involve pushing or
	 *  popping from the given stack and/or appending more tokens
	 *  to the output string.
	 * 
	 *  @param s the Stack the token uses, if necessary, when processing itself.
	 *  @return String to be appended to the output
	 */
    public String handle(Stack<Token> s);

	public int precValue();
    
    /** Returns the token as a printable String
     * 
     *  @return the String version of the token.  For example, ")"
     *  for a right parenthesis.
     */
    public String toString();

}
