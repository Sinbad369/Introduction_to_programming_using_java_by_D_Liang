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
public class Problem_14 {

    public static void main(String[] args) {

        // Generate a random 0 or 1 (0: heads vs 1: tails)
        int coin = (int) (Math.random() * 2);

        // Invoke a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for guess
        System.out.print("Enter your guess (0 for heads vs 1 for tails): ");
        int guess = input.nextInt();

        // Display the result
        boolean isCompatible = (coin == guess);
        if (isCompatible) {
            System.out.println("Your guess is right: "
                    + " the random coin side is " + coin + " and your guess is " + guess);
        } else {
            System.out.println("Your guess is wrong: "
                    + " the random coin is side is " + coin + " and your guess is " + guess);
        }

    }

}
