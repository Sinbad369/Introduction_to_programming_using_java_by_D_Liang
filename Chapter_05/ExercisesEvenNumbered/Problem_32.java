/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_05.ExercisesEvenNumbered;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Problem_32 {

    public static void main(String[] args) {
        // Generate two lottery digits that are different from each other
        int lotteryDigit1 = (int) (Math.random() * 10);
        int lotteryDigit2;

        // Ensure the second digit is different from the first digit
        do { // Look do-while loop executes the body at least once, so it is the most efficient loop here.
            lotteryDigit2 = (int) (Math.random() * 10);
        } while (lotteryDigit1 == lotteryDigit2);

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a guess
        System.out.print("Enter your lottery pick (two digits):  ");
        int guess = input.nextInt();

        // Get digits from the guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lotteryDigit1 + lotteryDigit2);

        // Check the guess
        if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2) {
            System.out.println("Exact match, you win $10000");
        } else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1) {
            System.out.println("All digits match, you win $3000");
        } else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2) {
            System.out.println("Match one digit, you win $1000");
        } else {
            System.out.println("Sorry, no match.");
        }

    }
}
