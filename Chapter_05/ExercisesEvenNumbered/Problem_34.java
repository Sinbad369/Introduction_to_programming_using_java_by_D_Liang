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
public class Problem_34 {

    public static void main(String[] args) {
        // Create a Scanner class
        Scanner input = new Scanner(System.in);

        // Set the count for both user and computer
        int countComputer = 0;
        int countUser = 0;

        while (Math.abs(countComputer - countUser) < 3) { // we stop the loop when absolute difference of choices is greater than 3, if less, then we continue
            // Generate scissor, rock, or paper
            int computerChoice = (int) (Math.random() * 3); // Make sure you are regenerating the computerChoice in each iteration

            // Prompt the user to enter scissor, rock, or paper
            System.out.print("Enter 0 (for scissor),  1 (for rock), 2 (paper): ");
            int userChoice = input.nextInt();

            String computerChoiceString = "";

            switch (computerChoice) {
                case 0:
                    computerChoiceString = "Scissor";
                    break;
                case 1:
                    computerChoiceString = "Rock";
                    break;
                case 2:
                    computerChoiceString = "Paper";
                    break;
            }
            String userChoiceString = "";
            switch (userChoice) {
                case 0:
                    userChoiceString = "Scissor";
                    break;
                case 1:
                    userChoiceString = "Rock";
                    break;
                case 2:
                    userChoiceString = "Paper";
                    break;
                default: // Added this to handle invalid input
                    System.out.println("Invalid input. Please enter 0, 1, or 2.");
                    continue; // Skip the current iteration if input is invalid
            }

            // Evaluate the tie-case
            if (computerChoice == userChoice) {
                System.out.println("The computer choice is " + computerChoiceString);
                System.out.println("Your choice is " + userChoiceString);
                System.out.println("It`s a tie  this round");
            } // Evaluate the computer-wins case
            else if (computerChoice == 0 && userChoice == 2 // Scissor beats paper
                    || computerChoice == 1 && userChoice == 0 // Rock beats scissor
                    || computerChoice == 2 && userChoice == 1) { // Paper bears rock
                countComputer++;
                System.out.println("The computer choice is " + computerChoiceString);
                System.out.println("Your choice is " + userChoiceString);
                System.out.println("Computer wins this round");
            } else {
                countUser++;
                System.out.println("The computer choice is " + computerChoiceString);
                System.out.println("Your choice is " + userChoiceString);
                System.out.println("You win this round");
            }

        }

        // Display the actual score
        System.out.printf("Final score :  Computer has %d scores and you have %d scores", countComputer, countUser);

        // Display the winner
        if (countComputer > countUser) {
            System.out.println("Computer wins the game.");
        } else {
            System.out.println("You win the game.");
        }
    }
}
