/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_12 {

    public static void printNumbers(int num1, int num2, int numberPerLine) {
        for (int i = num1; i <= num2; i++) {
            if (i % 10 == 0) {
                System.out.print(i + " \n");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
