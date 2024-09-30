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
public class Problem_30 {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user for an amount, annual interest rate and number of months
        System.out.print("Enter an amount: ");
        double initialAmount = input.nextDouble();

        System.out.print("Enter an annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of months: ");
        double numberOfMonths = input.nextInt();

        System.out.println();
        double amount = 0;
        for (int i = 1; i <= numberOfMonths; i++) {
            amount = (initialAmount + amount) * (1 + annualInterestRate / 1200.0);
            System.out.printf("After month %d, the balance is %-5.3f\n", i, amount);
            System.out.println();
        }
    }
}
