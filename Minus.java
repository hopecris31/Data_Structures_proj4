package proj4;

/**
 * Write a description of class Minus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Minus implements Token{
    private int precedence;
    private boolean isOperator;

    public Minus(){
        this.isOperator = true;
        this.precedence = LOW_1;
    }

    public String handle(Stack<Token> s) {
        String toReturn = "";
        while(validPopConditions(s, this)){
            toReturn += s.pop();
        }
        s.push(this);
        return toReturn;
    }

    @Override //should this return the boolean of the instance variable or just true
    public boolean isOperator() {
        return this.isOperator;
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


    public String toString(){
        return "-";
    }

}
