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
public class Problem_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.println("Enter height in inhes: ");
        double height = input.nextDouble();
        final double ONE_POUND_IN_KG = 0.45359237;
        final double ONE_INCH_IN_METERS = 0.0254;
        double BMI = weight * ONE_POUND_IN_KG / (Math.pow(height * ONE_INCH_IN_METERS, 2));
        System.out.println("BMI is " + BMI);
    }
}
