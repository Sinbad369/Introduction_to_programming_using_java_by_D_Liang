/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_05.ExercisesOddNumberedTakenAsAnAlternativeBczOfTheirTwoStars;

/**
 *
 * @author Admin
 */
public class Problem_19_InsteadOfProblem20 {

    public static void main(String[] args) {
        // Initialize the number of rows
        int rows = 8;

        for (int i = 0; i < rows; i++) {
            // Print the leading spaces to center the pyramid
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("     ");
            }

            // Print the left-side of the pyramid
            for (int j = 0; j <= i; j++) {
                System.out.printf("%5d", (int) Math.pow(3, j));
            }

            // Print the right-side of the pyramid
            for (int j = i - 1; j >= 0; j--) {
                System.out.printf("%5d", (int) Math.pow(3, j));
            }

            // Move to the next line after each row is printed
            System.out.println();
        }
    }

}
