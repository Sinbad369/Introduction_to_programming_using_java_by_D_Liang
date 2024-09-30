/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06.ExercisesEvenNumbered;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Problem_06 {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("The pattern as per your input is: ");
        displayPattern(number);
    }

    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
