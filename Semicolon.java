package proj4;

/**
 * Write a description of class Semicolon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Semicolon implements Token{

    private int precedence;
    private boolean isOperator;

    public Semicolon(){
        this.isOperator = false;
    }


    public String handle(Stack<Token> s) {
        String toReturn = "";
        while(!s.isEmpty()){
            toReturn += s.pop();
        }
        return toReturn;
    }

    @Override
    public boolean isOperator() {
        return this.isOperator;
    }

    public String toString(){
        return ";";
    }

    @Override
    public int precValue() {
        return 0;
    }
}
