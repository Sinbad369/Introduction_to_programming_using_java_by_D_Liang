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
public class Problem_20 {

    public static void main(String[] args) {

        // Invoke the Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter temperature and the windspeed
        System.out.println("Enter the temperature: ");
        double temperature = input.nextDouble();

        System.out.println("Enter the windspeed: ");
        double windspeed = input.nextDouble();

        if ((temperature < -58 || temperature > 41) && windspeed >= 2) {
            System.out.println("Temperature and/or wind speed is invalid.");
        } else {
            double windchillTemp = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windspeed, 0.16)
                    + 0.4275 * temperature * Math.pow(windspeed, 0.16);
            System.out.println("Wind-chill temperature is " + windchillTemp);
        }
    }
}
