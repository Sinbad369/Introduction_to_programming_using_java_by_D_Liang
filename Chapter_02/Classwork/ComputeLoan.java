/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_02.Classwork;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ComputeLoan {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Enter annual interest rate in percentage, e.g., 7.25
        System.out.println(" Enter annual interest rate in percentage, e.g., 7.25:  ");
        double annualInterestRate = input.nextDouble();

        // Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Enter number of years
        System.out.println("Enter number of years: ");
        double numberOfYears = input.nextInt();

        // Enter a loan amount, e.g.,  120000.95
        System.out.println("Enter a loan amount, e.g.,  120000.95: ");
        double loanAmount = input.nextDouble();

        // Calculate the payment
        double monthlyPayment = (loanAmount * monthlyInterestRate)
                / (1 - (1 / Math.pow((1 + monthlyInterestRate), numberOfYears * 12)));

        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("The monthly payment is $" + (int) (monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is $" + (int) (totalPayment * 100) / 100.0);

    }
}
