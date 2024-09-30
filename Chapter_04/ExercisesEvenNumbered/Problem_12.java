/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_04.ExercisesEvenNumbered;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Problem_12 {

    public static void main(String[] args) {
        // Creater a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for hex digit
        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();

        // Check if the string has length of 1
        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character!");
            System.exit(1);
        }

        String binaryValue = "";
        char ch = Character.toUpperCase(hexString.charAt(0));
        switch (ch) {
            case '0':
                binaryValue = "0000";
                break;
            case '1':
                binaryValue = "0001";
                break;
            case '2':
                binaryValue = "0010";
                break;
            case '3':
                binaryValue = "0011";
                break;
            case '4':
                binaryValue = "0100";
                break;
            case '5':
                binaryValue = "0101";
                break;
            case '6':
                binaryValue = "0110";
                break;
            case '7':
                binaryValue = "0111";
                break;
            case '8':
                binaryValue = "1000";
                break;
            case '9':
                binaryValue = "1001";
                break;
            case 'A':
                binaryValue = "1010";
                break;
            case 'B':
                binaryValue = "1011";
                break;
            case 'C':
                binaryValue = "1100";
                break;
            case 'D':
                binaryValue = "1101";
                break;
            case 'E':
                binaryValue = "1110";
                break;
            case 'F':
                binaryValue = "1111";
                break;
            default:
                System.out.print(ch + " is an invalid input");
                System.exit(1);
        }

        System.out.println("The binary value of hex digit " + ch + " is " + binaryValue);
    }
}
