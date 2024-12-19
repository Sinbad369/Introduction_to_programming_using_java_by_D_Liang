/*
 12.8 (HexFormatException) Programming Exercise 12.6 implements the  hex2Dec
method to throw a NumberFormatException if the string is not a hex string.
Define a custom exception called HexFormatException. Implement the  hex2Dec
method to throw a HexFormatException if the string is not a hex string.
 */
package Chapter_12.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class HexFormatException extends Exception {

    public HexFormatException() {
        super("Invalid hexadecimal format");
    }

    public HexFormatException(String message) {
        super(message);
    }
}
