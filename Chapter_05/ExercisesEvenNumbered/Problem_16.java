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
public class Problem_16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("The smallest factors of " + number + " is ");

        // Initialize the factor
        int factor = 2;
        while (factor <= number) {
            if (number % factor == 0) {
                System.out.print(factor + " ");
                number /= factor;
            } else {
                factor++;
            }
        }
    }
}
