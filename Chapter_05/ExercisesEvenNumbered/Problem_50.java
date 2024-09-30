/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_05.ExercisesEvenNumbered;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Problem_50 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println("Multiplication Table using for-loop");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " * " + i + " = " + i * j + " ");
            }
            System.out.println();
        }

        System.out.println("\nMultiplication Table using while-loop");
        int y = 1;
        while (y <= 9) {
            int w = 1;
            while (w <= 9) {
                System.out.print(w + " * " + y + " = " + w * y + " ");
                w++;
            }
            System.out.println();
            y++;
        }

        System.out.println("\nMultiplication Table using do-while-loop");
        int t = 1;
        do {
            int p = 1;
            do {
                System.out.print(t + " * " + p + " = " + t * p + " ");
                p++;
            } while (p <= 9);
            t++;
            System.out.println();
        } while (t <= 9);
    }
}
