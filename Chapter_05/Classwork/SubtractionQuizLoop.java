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
public class SubtractionQuizLoop {

    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        long startTimeNano = System.nanoTime();
        String output = " ";

        // Create a scanner
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            // Generate two random numbers
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            // If number1 is less than number2, swap
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            // Prompt the student what is number1 - number2
            System.out.print("What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();

            // Grade the answer and display the result
            if (number1 - number2 == answer) {
                System.out.println("You are correct");
                correctCount++; // Increase the correctCount
            } else {
                System.out.println("Your answer is wrong " + number1 + " - " + number2
                        + " should be " + (number1 - number2));
            }
            // Increase the question count
            count++;
            output += "\n" + number1 + " - " + number2 + " = " + answer
                    + ((number1 - number2 == answer) ? " correct" : " wrong");
        }

        // Calculate test time
        long endTime = System.currentTimeMillis();
        long testTimeMillis = endTime - startTime;

        long endTimeNano = System.nanoTime();
        long testTimeNano = endTimeNano - startTimeNano;

        // Display the result
        System.out.println("\nCorrect count is " + correctCount
                + "\nTest time is " + testTimeMillis / 1000 + " seconds using currentTimeMillis() and "
                + testTimeNano / 1_000_000 + " seconds using nanoTime()\n" + output);
    }
}
