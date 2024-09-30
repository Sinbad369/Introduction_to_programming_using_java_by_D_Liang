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
public class Problem_04 {

    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the side-length of hexagon
        System.out.println("Enter the side-length of a hexagon: ");
        double sideLength = input.nextDouble();

        // Calculate the area of a hexagon
        double area = 6 * sideLength * sideLength / (4 * Math.tan(Math.PI / 6));

        // Display the result
        System.out.printf("The area of a hexagon is %.2f", area);
    }
}
