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
public class Problem_02 {

    public static void main(String[] args) {
        // Generate 3 single digit numbers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);

        // Prompt the user for product of the numbers
        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " * " + number2 + " * " + number3 + " equal to? ");
        int answer = input.nextInt();
        if (answer != (number1 * number2 * number3)) {
            System.out.println("Your answer is wriing. The correct answer is " + (number1 * number2 * number3));
        } else {
            System.out.println("You are right");
        }
    }
}
