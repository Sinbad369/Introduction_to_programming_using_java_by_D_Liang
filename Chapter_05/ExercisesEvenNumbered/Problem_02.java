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
public class Problem_02 {

    public static void main(String[] args) {

        // set the total number of questions
        final int TOTAL_NUMBER_OF_QUESTIONS = 10;

        // set the initial correct count to 0
        int countCorrect = 0;

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < TOTAL_NUMBER_OF_QUESTIONS; i++) {
            // Generate two random integers between 1 and 12
            int number1 = 1 + (int) (Math.random() * 13);
            int number2 = 1 + (int) (Math.random() * 13);

            // Prompt the user to enter an answer
            System.out.print("What is " + number1 + " * " + number2 + "? ");
            int answer = input.nextInt();

            if (answer != number1 * number2) {
                System.out.println("Your answer is wrong: " + number1 + " * " + number2 + " is " + number1 * number2);
            } else {
                System.out.println("Your answer is correct");
                countCorrect++;
            }
        }

        System.out.println("The correct number of answers out of 10 is " + countCorrect);
    }
}
