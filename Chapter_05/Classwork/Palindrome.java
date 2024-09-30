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
public class Palindrome {

    /**
     * Main method
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a String
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        // The index of the first character in the string
        int low = 0;

        // The index of the last character in the string
        int high = string.length() - 1;

        boolean isPalindrome = true;
        while (low < high) {
            if (string.charAt(low) != string.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }

        if (isPalindrome) {
            System.out.println("The string " + string + " is a palindrome.");
        } else {
            System.out.println("The string " + string + " is not a palindrome.");
        }
    }
}
