/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_03.Classwork;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SubtractionQuiz {

    public static void main(String[] args) {
        // Generate two random single-digit integers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // If number1 is smaller than number2, swap number1 with number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // Prompt the student to answer "What is number1 - number2"
        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        int answer = input.nextInt();

        // Grade the answer and display the result
        if (number1 - number2 == answer) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong. The correct answer is " + (number1 - number2));
        }
    }
}
