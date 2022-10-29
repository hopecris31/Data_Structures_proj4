package proj4;

/**
 * Write a description of class Semicolon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Semicolon implements Token{

    private int precedence;

    public Semicolon(){
        this.precedence = SEMICO;
    }


    public String handle(Stack<Token> s) {
        return null;
    }

    public int precValue() {
        return this.precedence;
    }

    public String toString(){
        return ";";
    }
}
