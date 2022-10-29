package proj4;

/**
 * Write a description of class Divide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Divide implements Token{

    private int precedence;

    public Divide(){
        this.precedence = MED_2;
    }

    /** Processes the current token.  Since every token will handle
     *  itself in its own way, handling may involve pushing or
     *  popping from the given stack and/or appending more tokens
     *  to the output string.
     *
     *  @param s the Stack the token uses, if necessary, when processing itself.
     *  @return String to be appended to the output
     */

    public String handle(Stack<Token> s) {
        return "i";
    }

    @Override
    public int precValue() {
        return this.precedence;
    }

    public String toString(){
        return "/";
    }

}
