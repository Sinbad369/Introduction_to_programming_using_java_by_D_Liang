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
public class Problem_32 {

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

        // Evaluate p2`s location
        double p2Condition = (p1x - p0x) * (p2y - p0y) - (p2x - p0x) * (p1y - p0y);

        if (p2Condition > 0) {
            System.out.println("p2 is on the left side of the line");
        } else if (p2Condition == 0) {
            System.out.println("p2 is on the same line");
        } else {
            System.out.println("p2 is on the right side of the line");
        }
    }
}
