/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06.ExercisesEvenNumbered;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Problem_18 {

    public static boolean isValid(String password) {

        // Check the length of password
        if (password.length() < 10) {
            return false;
        }

        // Check if the password has 3 digits at least
        int countDigits = 0;

        // Check each character
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;  // Return false if there's a non-letter/non-digit
            }
            if (Character.isDigit(ch)) {
                countDigits++;  // Count the digits
            }
        }
        // Check if there are at least 3 digits
        return countDigits >= 3;
    }

    /**
     * Main method as a test method
     *
     * @param args
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a password
        System.out.print("Enter a password: ");
        String password = input.nextLine();

        // Call a method
        if (isValid(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
