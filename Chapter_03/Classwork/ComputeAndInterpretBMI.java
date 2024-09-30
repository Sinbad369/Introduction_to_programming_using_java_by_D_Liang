/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_03.Classwork;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ComputeAndInterpretBMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user enter the weight in Pounds
        System.out.println("Enter the weight in Pounds:");
        double weight = input.nextDouble();

        // Prompt the user to enter height in inches
        System.out.println("Enter the height in Inches: ");
        double height = input.nextDouble();

        final double ONE_POUND_IN_KG = 0.45359237;
        final double ONE_INCH_IN_METERS = 0.0254;

        // Calculate the BMI
        double BMI = weight * ONE_POUND_IN_KG / (Math.pow(height * ONE_INCH_IN_METERS, 2));
        System.out.println("Your BMI is " + BMI);

        // Display the result
        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI < 25) {
            System.out.println("Normal");
        } else if (BMI < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
