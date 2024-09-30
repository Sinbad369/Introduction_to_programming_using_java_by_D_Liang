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
public class Problem_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the sides and height of the Equilateral triangle:");
        double lengthOfSides = input.nextDouble();

        double area = (Math.sqrt(3) / 4) * Math.pow(lengthOfSides, 2);
        double volume = area * lengthOfSides;

        System.out.println("The area is " + area);
        System.out.println("The volume  of the Triangle prism is " + volume);
    }
}
