/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_04.Classwork;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HexDigit2Dec {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex digit: ");
        String hexString = input.nextLine();

        // Check if hex strig has exactly one character
        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }

        // Display decimal value for the hex digit
        char ch = Character.toUpperCase(hexString.charAt(0));
        if (ch >= 'A' && ch <= 'F') {
            int value = ch - 'A' + 10;
            System.out.println("The decimal value of hexadeximal digit " + ch + " is " + value);
        } else if (Character.isDigit(ch)) {
            System.out.println("The decimal value of hexadeximal digit " + ch + " is " + ch);
        } else {
            System.out.println(ch + " is an invalid input");
        }
    }
}
