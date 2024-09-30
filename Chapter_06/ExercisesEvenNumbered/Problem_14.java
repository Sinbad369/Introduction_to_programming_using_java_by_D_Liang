/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_14 {

    public static void main(String[] args) {
        System.out.printf("%-15s%-8s", "i", "m(i)");
        System.out.println("\n---------------------------");
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-15d%-8.4f\n", i, m(i));
        }
        System.out.println();
    }

    public static double m(int k) {
        double pi = 0.0;
        for (int i = 1; i <= k; i++) {
            double term = Math.pow(-1, i + 1) / (2.0 * i - 1);
            pi += term;
        }
        return pi * 4;
    }
}
