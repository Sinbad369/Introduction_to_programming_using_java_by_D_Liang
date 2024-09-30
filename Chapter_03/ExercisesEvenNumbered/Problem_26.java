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
public class Problem_26 {

    public static void main(String[] args) {
        // Invoke Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Evaluate if the input is divisible by 4 and 5
        boolean isDivisibleBy4And5 = number % 4 == 0 && number % 5 == 0;

        // Evaluate if the input is divisible by 4 or 5
        boolean isDivisibleBy4Or5 = number % 4 == 0 || number % 5 == 0;

        // Evaluate if the input is divisible by 4 or 5 but not both
        boolean isDivisibleBy4Or5ButNotBoth = number % 4 == 0 ^ number % 5 == 0;

        System.out.println("Is " + number + " divisible by 4 and 5? " + isDivisibleBy4And5);
        System.out.println("Is " + number + " divisible by 4 or 5? " + isDivisibleBy4Or5);
        System.out.println("Is " + number + " divisible by 4 or 5 but not both? " + isDivisibleBy4Or5ButNotBoth);
    }
}
