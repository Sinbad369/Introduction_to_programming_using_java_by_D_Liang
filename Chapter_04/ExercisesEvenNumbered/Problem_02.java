/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_04.ExercisesEvenNumbered;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Problem_02 {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        final double EARTH_RADIUS_IN_KILOMETERS = 6371.01;

        // Prompt the user for points` latitudes and longitudes
        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = Math.toRadians(input.nextDouble());
        double y1 = Math.toRadians(input.nextDouble());
        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = Math.toRadians(input.nextDouble());
        double y2 = Math.toRadians(input.nextDouble());

        // Calculate the great circle distance
        double d = EARTH_RADIUS_IN_KILOMETERS
                * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        // Display the distance
        System.out.println("The distance between two points is " + d + " km");
    }
}
