package proj4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Write a description of class Converter here.
 * 
 * @author Hope Crisafi
 * @version 10/29/2022
 */
public class Converter {
	
	private Scanner myReader;

	/**
	 * non-default constructor;
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

	/**
	 * converts infix expressions from a file into postfix notation
	 */
	public void convert() {
		Stack<Token> stack = new Stack<>();
		while (myReader.hasNext()) {
			String nextExpression = myReader.next();
			String postfix = "";
			for (char c : nextExpression.toCharArray()) {
				Token current = determineToken(c);
				if (current == null) {
					postfix += c;
				} else {
					postfix += current.handle(stack);
				}
			}
			System.out.println(nextExpression.substring(0, nextExpression.length() - 1) + " --> " + postfix);
		}
	}


	/** ------------------------------
	 *      PRIVATE HELPER METHODS
	 * _______________________________
	 */

	/**
	 * Determines the Token type of a given character
	 * @param c a char
	 * @return the Token type of that character
	 */
	private Token determineToken(char c){
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
