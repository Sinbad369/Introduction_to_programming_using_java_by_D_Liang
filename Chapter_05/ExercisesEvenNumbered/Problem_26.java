/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_05.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_26 {

    public static void main(String[] args) {

        for (int i = 10000; i <= 100000; i += 10000) {
            double e = 1.0;
            double item = 1.0;

            for (double j = 1; j <= i; j++) {
                item = item / j; // To understand the logic, just consider that (2/3) / 4 is 2 / 12, insanely simple and great
                e += item;
            }
            System.out.println(e + " when i is " + i + " is " + e);
        }
        System.out.println();

    }
}
