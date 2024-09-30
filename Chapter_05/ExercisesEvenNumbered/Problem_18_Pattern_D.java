/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_05.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_18_Pattern_D {

    public static void main(String[] args) {
        System.out.println("Pattern D");
        for (int i = 6; i >= 1; i--) {
            for (int j = 6; j >= 1; j--) {
                if (j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
