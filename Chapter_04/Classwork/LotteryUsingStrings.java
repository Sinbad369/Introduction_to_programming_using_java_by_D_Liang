/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_04.Classwork;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LotteryUsingStrings {

    public static void main(String[] args) {
        // Generate a lottery as two-digit string
        String lottery = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10);

        // Prompt the user to enter the guess
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick(two-digits): ");
        String guess = input.nextLine();

        // Get the digits from lottery
        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        System.out.println("The lottery number is " + lottery);

        // Check the guess
        if (guess.equals(lottery)) {
            System.out.println("Exact match: you win $10,000");
        } else if (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1) {
            System.out.println("Match all digits: you win $3,000");
        } else if (lotteryDigit1 == guessDigit1
                || lotteryDigit2 == guessDigit2
                || lotteryDigit1 == guessDigit2
                || lotteryDigit2 == guessDigit1) {
            System.out.println("One digit match: you win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
