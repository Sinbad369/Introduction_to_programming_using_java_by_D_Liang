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
public class Problem_06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter metrics like weigth, feet, inches
        System.out.println("Enter the weight in pounds: ");
        double weightPounds = input.nextDouble();

        System.out.println("Enter feet:");
        double heightFeet = input.nextDouble();

        System.out.println("Enter inches: ");
        double heightInches = input.nextDouble();

        // Convert the metrics to suit formula
        final double ONE_POUND_IN_KG = 0.45359237;
        final double ONE_INCH_IN_METERS = 0.0254;
        final double ONE_FEET_IN_METERS = 0.3048;

        double weightKG = weightPounds * ONE_POUND_IN_KG;
        double heightMeters = heightInches * ONE_INCH_IN_METERS
                + heightFeet * ONE_FEET_IN_METERS;

        // Calculate BMI
        double BMI = weightKG / Math.pow(heightMeters, 2);
        System.out.println("BMI is " + BMI);

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
