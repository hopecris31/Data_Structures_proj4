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
        this.precedence = PRECEDENCE_1;
    }

    public String handle (Stack<Token> s){
        if(s.peek().equals("(")){

        }
        return "i";
    }

    public String toString(){
        return "-";
    }

}
