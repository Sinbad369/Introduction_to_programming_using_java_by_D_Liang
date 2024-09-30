/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_03.ExercisesEvenNumbered;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Problem_10 {

    public static void main(String[] args) {

        // Generate two random numbers less than 1000
        int number1 = (int) (Math.random() * 1000);
        int number2 = (int) (Math.random() * 1000);

        // Invoke a Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt the user for answer of the product
        System.out.println("What is " + number1 + " * " + number2 + "= ");
        int answer = input.nextInt();

        // Display the result
        String message = (number1 * number2 == answer) ? "You are right"
                : "Your answer is wrong, the correct answer is " + number1 * number2;

        System.out.println(message);
    }
}
