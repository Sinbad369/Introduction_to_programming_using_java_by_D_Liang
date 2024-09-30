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
public class Problem_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enrter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        double length = (speed * speed) / (2 * acceleration);
        System.out.println("Minimum runway length for this airplane is " + length);
    }
}
