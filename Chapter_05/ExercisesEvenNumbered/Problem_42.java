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
public class Problem_42 {

    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt the user for commission sought
        System.out.print("Enter a commission sought: ");
        double commissionSought = input.nextDouble();
        System.out.println();

        // Initialize commissionGained and salesAmount
        int salesAmount = 1;
        double commissionGained = 0;
        while (commissionGained < commissionSought) {
            if (salesAmount < 5000) {
                commissionGained = salesAmount * 0.06;
            } else if (salesAmount >= 5000 && salesAmount < 10000) {
                commissionGained = 5000 * 0.06 + (salesAmount - 5000) * 0.08;
            } else {
                commissionGained = 5000 * 0.06 + 5000 * 0.08 + (salesAmount - 10000) * 0.1;
            }
            salesAmount++;
        }

        System.out.printf("To gain $%6.2f of commission, you should do sales on an amount of $%d", commissionSought, salesAmount);
    }
}
