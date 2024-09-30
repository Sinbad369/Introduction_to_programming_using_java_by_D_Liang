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
public class Problem_34 {

    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for three points
        System.out.print("Enter three points for p0, p1, and p2: ");
        double p0x = input.nextDouble();
        double p0y = input.nextDouble();
        double p1x = input.nextDouble();
        double p1y = input.nextDouble();
        double p2x = input.nextDouble();
        double p2y = input.nextDouble();

        double status = (p1x - p0x) * (p2y - p0y) - (p2x - p0x) * (p1y - p0y);

        if (status <= 0.0000000001 && ((p0x <= p2x && p2x <= p1x) || (p0x >= p2x && p2x >= p1x))) {
            System.out.println("(" + p2x + ", " + p2y + ") is on the line segment from"
                    + " (" + p0x + ", " + p0y + ") to " + "(" + p1x + ", " + p1y + ")");
        } else {
            System.out.println("(" + p2x + ", " + p2y + ") is not on the line segment from"
                    + " (" + p0x + ", " + p0y + ") to " + "(" + p1x + ", " + p1y + ")");
        }
    }
}
