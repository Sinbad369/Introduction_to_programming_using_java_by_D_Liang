/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_05.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_18_Pattern_A {

    public static void main(String[] args) {

        System.out.println("Pattern A");

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j <= i) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}
