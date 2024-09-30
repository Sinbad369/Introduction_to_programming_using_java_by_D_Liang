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
public class Problem_16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the side: ");
        double sideLength = input.nextDouble();
        double area = ((3.0 / 2) * Math.sqrt(3)) * (sideLength * sideLength);
        System.out.println("The area of the hexagon is " + area);
    }
}
