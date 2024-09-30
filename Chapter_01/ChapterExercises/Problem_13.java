/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_01.ChapterExercises;

/**
 *
 * @author Admin
 */
public class Problem_13 {

    public static void main(String[] args) {
        System.out.println("From the equation: ");
        System.out.println("3.4x + 50.2y = 44.5");
        System.out.println("2.1x + 0.55y = 5.9");
        double xValue = (44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1);
        double yValue = (3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1);
        System.out.println("x value is " + xValue);
        System.out.println("y value is " + yValue);
    }
}
