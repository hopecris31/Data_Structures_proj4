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
			System.out.println(nextExpression);
			for (char c : nextExpression.toCharArray()) {
				System.out.println(c);
			}
		}       
	}
}
