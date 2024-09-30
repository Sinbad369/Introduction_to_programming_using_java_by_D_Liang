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
public class Problem_22 {

    public static double sqrt(long n) {
        double lastGuess = 1.0;
        double nextGuess = 0.0;
        do {
            nextGuess = (lastGuess + n / lastGuess) / 2.0;
            if (Math.abs(nextGuess - lastGuess) < 0.0001) {
                break;
            }
            lastGuess = nextGuess; // Update lastGuess only after checking the difference
        } while (true); // Loop indefinitely until the difference is small enough

        return nextGuess;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextLong();

        System.out.println("The square root of a number " + number + " is " + sqrt(number));
    }
}
