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
public class Problem_02 {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        System.out.println("The sum of digits of number " + number + " is " + sumDigits(number)); // Call sumDigits and print
    }

    public static int sumDigits(long n) {
        long temp = Math.abs(n); //  Make sure the number is positive
        int sum = 0;
        while (temp > 0) { // Note: using for-loop thus calling .length() method on long(primitive data type causes an error)
            sum += temp % 10; // Add the last digit to sum
            temp = temp / 10; // Remove the last digit
        }
        return sum; // Return the calculated sum
    }
}
