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
public class Problem_06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0  and 1000: ");
        int number = input.nextInt();

        if (number >= 1000) {
            System.out.println("Enter a number in the range of 0 and 1000");
        } else {
            int digit1 = number / 100;
            int digit2 = number / 10 % 10;
            int digit3 = number % 10;
            int product = digit1 * digit2 * digit3;
            System.out.println("Multiplication of all digits in " + number + " is " + product);
        }

    }
}
