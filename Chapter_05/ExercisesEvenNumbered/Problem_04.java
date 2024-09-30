/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_05.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_04 {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        final double ONE_INCH_IN_CM = 2.54;
        System.out.printf("%-15s%-15s", "Inches", "Centimeters");
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-15d%-15f\n", i, i * ONE_INCH_IN_CM);
        }

    }
}
