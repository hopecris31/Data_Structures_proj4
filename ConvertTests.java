package proj4;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

/**
 *
 * Tests the Converter class.  Converts mathematical operations into postfix notation.
 *
 * @author Hope Crisafi
 * @version 10/29/2022
 *
 */
public class ConvertTests {

    @Rule
    public Timeout timeout = Timeout.millis(100);

    @Test // A+B-C --> AB+C-
    public void Test1(){
        System.out.println("Expected: A+B+C --> AB+C+");
        System.out.print("Actual:   ");Converter converter = new Converter("test1.txt");converter.convert();
        System.out.println("");
    }

    @Test // A+B*C --> ABC*+
    public void Test2(){
        System.out.println("Expected: A+B*C --> ABC*+");
        System.out.print("Actual:   ");Converter converter = new Converter("test2.txt");converter.convert();
        System.out.println("");
    }

    @Test // (A+B)*C --> AB+C*
    public void Test3(){
        System.out.println("Expected: (A+B)*C --> AB+C*");
        System.out.print("Actual:   ");Converter converter = new Converter("test3.txt");converter.convert();
        System.out.println("");
    }

    @Test // (A+B)/(C-D) --> AB+CD-/
    public void Test4(){
        System.out.println("Expected: (A+B)/(C-D) --> AB+CD-/");
        System.out.print("Actual:   ");Converter converter = new Converter("test4.txt");converter.convert();
        System.out.println("");
    }

    @Test // ((A+B)*(C-D)+E)/(F+G) --> AB+CD-*E+FG+/
    public void Test5(){
        System.out.println("Expected: ((A+B)*(C-D)+E)/(F+G) --> AB+CD-*E+FG+/");
        System.out.print("Actual:   ");Converter converter = new Converter("test5.txt");converter.convert();
        System.out.println("");
    }

    @Test // A/B^C-D --> ABC^/D-
    public void Test6(){
        System.out.println("Expected: A/B^C-D --> ABC^/D-");
        System.out.print("Actual:   ");Converter converter = new Converter("test6.txt");converter.convert();
        System.out.println("");
    }
}

