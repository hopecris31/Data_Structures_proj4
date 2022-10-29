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

    public String handle(Stack<Token> s) {
        String toReturn = "";
        while(validPopConditions(s, this)){
            toReturn += s.pop();
        }
        s.push(this);
        return null;
    }

    private boolean validPopConditions(Stack<Token> s, Token current){
        if(s.isEmpty()){
            return false;
        }
        else if(s.pop() instanceof LeftParen){
            return false;
        }
        else return s.pop().precValue() >= current.precValue();
    }

    @Override
    public int precValue() {
        return this.precedence;
    }

    public String toString(){
        return "*";
    }
}
