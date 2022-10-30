package proj4;

/**
 * Write a description of class Multiply here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Multiply implements Token{

    private int precedence;
    private boolean isOperator;

    public Multiply(){
        this.isOperator = true;
        this.precedence = MED_2;
    }

    public String handle(Stack<Token> s) {
        String toReturn = "";
        while(validPopConditions(s, this)){
            toReturn += s.pop();
        }
        s.push(this);
        return toReturn;
    }

    private boolean validPopConditions(Stack<Token> s, Token current){
        if(s.isEmpty()){
            return false;
        }
        else if(s.peek() instanceof LeftParen){
            return false;
        }
        else return s.peek().precValue() >= current.precValue();
    }


    public int precValue() {
        return this.precedence;
    }

    public boolean isOperator() {
        return this.isOperator;
    }

    public String toString(){
        return "*";
    }
}
