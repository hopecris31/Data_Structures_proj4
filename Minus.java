package proj4;

/**
 * Write a description of class Minus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Minus implements Token{
    private int precedence;

    public Minus(){
        this.precedence = LOW_1;
    }

    public String handle (Stack<Token> s){
        if(s.peek().equals("(")){

        }
        return "i";
    }

    @Override
    public int precValue() {
        return this.precedence;
    }

    public String toString(){
        return "-";
    }

}
