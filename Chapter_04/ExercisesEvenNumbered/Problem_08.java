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
public class Problem_08 {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.println("Enter a character: ");
        String character = input.nextLine();

        // Check if the String has exactly one character
        if (character.length() != 1) {
            System.out.println("Enter exactly one character");
            System.exit(1);
        }

        // Evaluate the character to ASCII code
        // The below code is not correctly converter for all cases(lines 31-42)
        char ch = character.charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            int value = ch - 'A' + 65;
            System.out.println("The ASCII code value of character " + ch + " is " + value);
        } else if (ch >= 'a' && ch <= 'z') {
            int value = ch - 'a' + 97;
            System.out.println("The ASCII code value of character " + ch + " is " + value);
        } else if (ch >= '0' && ch <= '9') {
            int value = ch - '0' + 48;
            System.out.println("The ASCII code value of character " + ch + " is " + value);
        } else {
            System.out.println("Enter a character that is digit, either capital or small letter");
        }

        // The correct code to fit all cases
        int asciiValue = (int) ch;
        System.out.println("The ASCII code value of character " + ch + " is " + asciiValue);
    }
}
