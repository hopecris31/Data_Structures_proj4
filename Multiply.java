package proj4;

/**
 * Write a description of class Multiply here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Multiply implements Token{

    private int precedence;

    public Multiply(){
        this.precedence = MED_2;
    }

    @Override
    public String handle(Stack<Token> s) {
        return null;
    }

    @Override
    public int precValue() {
        return 0;
    }

    public String toString(){
        return "*";
    }
}
