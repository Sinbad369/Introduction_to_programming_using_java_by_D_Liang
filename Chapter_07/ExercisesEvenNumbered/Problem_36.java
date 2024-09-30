/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_36 {

    public static void main(String[] args) {
        int[] queenPositions = new int[8]; // Each index represents a row, value represents the column
        placeQueen(queenPositions, 0); // Start placing queens from the first row
    }

    // Recursive method to place queens
    public static boolean placeQueen(int[] queenPositions, int row) {
        if (row == 8) { // All queens have been placed successfully
            printBoard(queenPositions);
            return true; // Found a solution
        }

        for (int col = 0; col < 8; col++) { // Try placing a queen in each column
            if (isSafe(queenPositions, row, col)) {
                queenPositions[row] = col; // Place queen at (row, col)
                if (placeQueen(queenPositions, row + 1)) { // Recur for next row
                    return true; // Stop after finding one solution
                }
            }
        }

        return false; // Trigger backtracking
    }

    // Check if placing a queen at (row, col) is safe
    public static boolean isSafe(int[] queenPositions, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queenPositions[i] == col
                    || Math.abs(i - row) == Math.abs(queenPositions[i] - col)) {
                return false; // Same column or same diagonal
            }
        }
        return true;
    }

    // Print the board configuration
    public static void printBoard(int[] queenPositions) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (queenPositions[i] == j) {
                    System.out.print("|Q");
                } else {
                    System.out.print("| ");
                }
            }
            System.out.println("|");
        }
        System.out.println(); // Print an empty line after the board
    }
}
