/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_03.ExercisesEvenNumbered;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Problem_18 {

    public static void main(String[] args) {

        // Invoke a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for the weight of a package in pounds
        System.out.println("Enter the weight of  the package in pounds: ");
        double weight = input.nextDouble();

        if (weight > 0 && weight <= 2) {
            System.out.println("The cost of shipping is $2.5");
        } else if (weight > 2 && weight <= 4) {
            System.out.println("The cost of shipping is $4.5");
        } else if (weight > 4 && weight <= 10) {
            System.out.println("The cost of shipping is $7.5");
        } else if (weight > 10 && weight <= 20) {
            System.out.println("The cost of shipping is $10.5");
        } else {
            System.out.println("Package cannot be shipped");
        }

    }
}
