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
		while (myReader.hasNext()) {
			String nextExpression = myReader.next();
			StringBuilder postfix = new StringBuilder();
			//System.out.println(nextExpression);
			for (char c : nextExpression.toCharArray()) { //should c be an object here
				Token token = determineToken(c);
				if(!((Object) c instanceof Token)){
					postfix.append(c);
				}
				else{

				}
				System.out.println(c);
			}
		}       
	}

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
			default:
				return new Semicolon();
		}
	}
}
