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
public class Problem_22 {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user for the loan amount
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();

        // Prompt the user for number of years
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();

        // Prompt the user for annual interest rate
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.println();
        // Calculate and print the monthly payment
        double monthlyInterestRate = annualInterestRate / 1200.0;
        int totalNumberOfPayments = numberOfYears * 12;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow((1 + monthlyInterestRate), -totalNumberOfPayments));
        System.out.printf("Monthly payment: %-10.2f", monthlyPayment);
        System.out.println();

        // Calculate and print the total payment
        System.out.println();
        double totalPayment = monthlyPayment * totalNumberOfPayments;
        System.out.printf("Total payment:  %-10.2f", totalPayment);
        System.out.println();

        System.out.printf("%-20s%-17s%-20s%-20s", "Payment#", "Interest", " Principal", "Balance");
        System.out.println();

        double balance = loanAmount;

        // Evaluate the amortization table
        for (int i = 1; i <= numberOfYears * 12; i++) {
            double interest = monthlyInterestRate * balance;
            double principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.printf("%-20d%-18.2f%-20.2f%-20.2f\n", i, interest, principal, balance);
        }

        // Handle potential final balance discrepancy due to precision
        if (Math.abs(balance) > 0.01) {
            System.out.printf("Final Payment:   %-10.2f\n", balance + monthlyPayment);
        }
    }
}
