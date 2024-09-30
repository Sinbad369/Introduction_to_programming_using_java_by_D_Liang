/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_02.Classwork;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ComputeAreaWithConsoleInput {

    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a radius
        System.out.print("Enter a radius: ");
        double radius = input.nextDouble();

        //Compute area
        double area = radius * radius * Math.PI;

        //Display results
        System.out.println("The area for the circle of radius " + radius
                + " is " + area);
    }
}
