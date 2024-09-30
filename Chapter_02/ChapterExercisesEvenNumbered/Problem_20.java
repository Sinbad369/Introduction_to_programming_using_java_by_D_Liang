/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_02.ChapterExercisesEvenNumbered;

import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class Problem_20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();
        double interest = balance * (annualInterestRate / 1200);
        System.out.println("The interest is " + interest);
    }

}
