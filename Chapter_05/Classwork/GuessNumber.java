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
public class GuessNumber {

    public static void main(String[] args) {

        // Create a random number between 0 and 100, inclusive
        int number = (int) (Math.random() * 101);

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Guess a magic number between 0 and 100");

        int guess = -1; // Just initializing the guess
        while (number != guess) {

            // Prompt the user to enter a guess
            System.out.println("Enter a guess: ");
            guess = input.nextInt();

            if (number == guess) {
                System.out.println("Yes, the number is " + number);
            } else if (number > guess) {
                System.out.println("Your guess is too low");
            } else {
                System.out.println("Your guess is too high");
            }

        }

    }
}
