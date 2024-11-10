/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11.ExercisesEvenNumbered.Problem_16;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class RepeatAdditionQuiz {

    public static void main(String[] args) {
        // Create two random digits
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> previousAnswers = new ArrayList<>();

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        while (true) {
            // Get the user's answer
            int userAnswer = input.nextInt();

            // Check if the answer is already entered
            if (previousAnswers.contains(userAnswer)) {
                System.out.println("You already entered " + userAnswer);
            } else {
                // Add the answer to the list of entered answers
                previousAnswers.add(userAnswer);

                // Check if the answer is correct
                if (userAnswer == (number1 + number2)) {
                    System.out.println("You got it!");
                    break; // Exit the loop when the answer is correct
                } else {
                    System.out.println("Wrong answer. Try again.");
                }
            }
        }
    }
}
