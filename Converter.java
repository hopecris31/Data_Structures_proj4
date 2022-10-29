package proj4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Write a description of class Converter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Converter {
	
	private Scanner myReader;

	/**
	 * non-default constructor; Gradescope needs this to run tests
	 * @param infile path to the input file 
	 */
    public Converter(String infile)
    {
		try {
            myReader = new Scanner(new File(infile)); 
    	} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}

	public void convert() {
		// This is just some sample code to remind you how to use the Scanner class to read 
		// input from a file and to suggest a way to look at the file input character by 
		// character, which is what you will ultimately need. Take from this code what you
		// need and get rid of the rest.
		Stack<Token> stack = new Stack<>();  // should this be defined locally
		while (myReader.hasNext()) {
			String nextExpression = myReader.next();
			StringBuilder postfix = new StringBuilder();
			//System.out.println(nextExpression);
			for (char c : nextExpression.toCharArray()) { //should c be an object here
				Token current = determineToken(c);
				if(current == null){
					postfix.append(c);
				}
				else if (isOperator(current)){
					while(validPopConditions(stack, current)){
						postfix.append(stack.pop());
						//operator.handle(stack, current.precValue())
					}
					stack.push(current);
				}
				else if(current instanceof LeftParen){
					stack.push(current); //this is intended behavior, but use the handle() method
				}
				else if(current instanceof RightParen){
					postfix.append(current.handle(stack));
				}
				System.out.println(c);
			}
		}       
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

	private static boolean isOperator(Token t){
		return t.precValue() <= 3;
	}

	public Token determineToken(char c){
		switch (c) {
			case '(':
				return new LeftParen();
			case ')':
				return new RightParen();
			case '+':
				return new Plus();
			case '-':
				return new Minus();
			case '*':
				return new Multiply();
			case '/':
				return new Divide();
			case '^':
				return new Exponent();
			case ';':
				return new Semicolon();
			default:  // if not token
				return null;
		}
	}
}
