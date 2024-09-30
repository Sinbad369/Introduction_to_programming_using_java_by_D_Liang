/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06.ExercisesEvenNumbered;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Problem_36 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the following metrics of a regular polygon");
        System.out.print("Enter the number of sides: ");
        int numberOfSides = input.nextInt();
        System.out.print("Enter the side: ");
        double sideLength = input.nextDouble();
        System.out.println("The area of the polygon is "
                + area(numberOfSides, sideLength));
    }

    public static double area(int n, double side) {
        double areaPolygon = (n * Math.pow(side, 2))
                / (4 * Math.tan(Math.PI / n));
        return areaPolygon;
    }
}
