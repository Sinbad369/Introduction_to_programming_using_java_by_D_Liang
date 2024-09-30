/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_05.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_24 {

    public static void main(String[] args) {
        final int LINE_BREAKER = 10;
        int count = 0;
        double sum = 0;

        for (int i = 1; i <= 97; i += 2) {
            double actualFraction = (double) i / (i + 2);
            System.out.print(i + " / " + (i + 2));

            sum += actualFraction;

            if (i < 97) {
                System.out.print(" + ");
            }
            if (i == 97) {
                System.out.println(" = ");
            }
            count++;
            if (count % LINE_BREAKER == 0) {
                System.out.println();
            }
        }

        System.out.println(sum);
    }
}
