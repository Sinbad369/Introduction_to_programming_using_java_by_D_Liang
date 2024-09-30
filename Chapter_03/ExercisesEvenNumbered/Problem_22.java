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
public class Problem_22 {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        double centerX = 0;
        double centerY = 0;

        // Prompt the user for a point with two coordinates
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Calculate whether the point is within the circle center at (0, 0) and radius 10
        double distance = Math.pow((x - centerX) * (x - centerX) + (y - centerY) * (y - centerY), 0.5);
        if (distance <= 10) {
            System.out.println("Point (" + x + ", " + y + ")" + " is in the circle");
        } else {
            System.out.println("Point (" + x + ", " + y + ")" + " is not in the circle");
        }
    }
}
