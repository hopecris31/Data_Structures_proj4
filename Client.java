package proj4;
/**
 * Runs the converter method from its class to convert expressions into postfix notation.
 * 
 * @author Hope Crisafi
 * @version 10/29/2022
 */

public class Client
{
    public static void main(String[] args)
    {
        Converter converter = new Converter("proj4_input.txt");
        converter.convert();
    }
}
