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
public class GreatestCommonDivisor {

    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt the user for numbers
        System.out.print("Enter number1: ");
        int number1 = input.nextInt();

        System.out.print("Enter number2: ");
        int number2 = input.nextInt();

        int gcd = 1; // Initial gcd = 1
        int k = 2; // Possible gcd

        while (k <= number1 && k <= number2) {
            if (number1 % k == 0 && number2 % k == 0) {
                gcd = k; // Update the gcd
            }
            k++;
        }

        // Also another way
        for (k = 2; k < number1 && k < number2; k++) {
            if (number1 % k == 0 && number2 % k == 0) {
                gcd = k;
            }
        }

        // Display the gcd
        System.out.println("Greatest Common Divisor of " + number1 + " and " + number2 + " is " + gcd);
    }
}
