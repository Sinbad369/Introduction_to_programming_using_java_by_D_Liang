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
public class Problem_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms: ");
        double massWater = input.nextDouble();
        System.out.println("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
        System.out.println("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();
        double energy = massWater * (finalTemperature - initialTemperature) * 4184;
        System.out.println("The energy needed is " + energy);

    }
}
