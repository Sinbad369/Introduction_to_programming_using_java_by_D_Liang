/*
12.6 (NumberFormatException) Listing 6.8 implements the hex2Dec(String
hexString) method, which converts a hex string into a decimal number.
Implement the hex2Dec method to throw a NumberFormatException if the
string is not a hex string.
 */
package Chapter_12.ExercisesEvenNumbered;

import java.util.Scanner;

public class Hex2Dec {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) throws NumberFormatException {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        try {
            System.out.print("Enter a hex number: ");
            String hex = input.nextLine();
            System.out.println("The decimal value for hex number " + hex + " is "
                    + hexToDecimal(hex.toUpperCase()));
        } catch (HexFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            input.close();
        }

    }

    public static int hexToDecimal(String hex) throws HexFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            if (!isHexChar(hexChar)) {
                throw new HexFormatException("Invalid hex character: " + hexChar);
            }
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else if (ch >= '0' && ch <= '9') {
            return ch - '0';
        } else {
            return -1;
        }
    }

    public static boolean isHexChar(char ch) {
        return (ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F');
    }
}
