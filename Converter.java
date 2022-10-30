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
		Stack<Token> stack = new Stack<>();
		String postfix = "";
		while (myReader.hasNext()) {
			String nextExpression = myReader.next();
			System.out.println(nextExpression);
			for (char c : nextExpression.toCharArray()) {
				Token current = determineToken(c);
				if(current == null){
					postfix += c;
				}
				else{
					postfix += current.handle(stack);
				}
			}
			System.out.println(postfix);
		}
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
			default:
				return null;
		}
	}
}
