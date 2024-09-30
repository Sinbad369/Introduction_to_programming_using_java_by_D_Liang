/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_03.ExercisesEvenNumbered;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Problem_12 {

    public static void main(String[] args) {
        // Invoke the Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for 3-digit integer
        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        // Check if it is palindrome like 121 242 454, same from left-rigt and right-left
        int digit1 = number / 100;
        int digit2 = number % 10;

        boolean isPalindrome = (digit1 == digit2);

        if (isPalindrome) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
    }
}
