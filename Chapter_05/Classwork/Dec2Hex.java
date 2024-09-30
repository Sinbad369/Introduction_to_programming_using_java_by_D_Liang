/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_05.Classwork;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Dec2Hex {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a decimal integer
        System.out.println("Enter a decimal number: ");
        int decimal = input.nextInt();

        // Convert decimal to hex
        String hex = "";
        while (decimal != 0) {
            int hexValue = decimal % 16;

            // Convert decimal value to a hex digit
            char hexDigit = (0 <= hexValue && hexValue <= 9) ? (char) (hexValue + '0')
                    : (char) (hexValue - 10 + 'A');

            hex = hexDigit + hex;

            decimal = decimal / 16;
        }

        System.out.println("The hex number is " + (hex.length() == 0 ? "0" : hex));
    }

}
