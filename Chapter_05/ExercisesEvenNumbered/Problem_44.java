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
public class Problem_44 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.print("The 8 bits are ");
        for (int i = 7; i >= 0; i--) {
            // Extract the bit at position i and display it
            int bit = (number >> i) & 1;
            System.out.print(bit);
        }
        System.out.println(); // Move to the nextLine after printing bits
    }
}
