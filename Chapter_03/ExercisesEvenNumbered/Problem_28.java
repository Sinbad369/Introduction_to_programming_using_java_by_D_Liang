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
public class Problem_28 {

    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter rectangle #1`s x-, y- coordinate, width, height
        System.out.print("Enter r1`s center x-, y-coordinates, width, and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();

        // Prompt the user to enter rectangle #2`s x-, y- coordinate, width, height
        System.out.print("Enter r2`s center x-, y-coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();

        if (x2 - width2 / 2 >= x1 - width1 / 2
                && x2 + width2 / 2 <= x1 + width1 / 2
                && y2 + height2 / 2 <= y1 + height1 / 2
                && y2 - height2 / 2 >= y1 - height1 / 2) {
            System.out.println("r2 is inside r1");
        } else if (x2 + width2 / 2 > x1 - width1 / 2
                && x2 - width2 / 2 < x1 + width1 / 2
                && y2 + height2 / 2 > y1 - height1 / 2
                && y2 - height2 / 2 < y1 + height1 / 2) {
            System.out.println("r2 overlaps with r1");
        } else {
            System.out.println("r2 does not overlap with r1");
        }
    }
}
