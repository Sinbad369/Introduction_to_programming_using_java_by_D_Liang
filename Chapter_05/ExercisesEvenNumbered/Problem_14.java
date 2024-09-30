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
public class Problem_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number1: ");
        int number1 = input.nextInt();
        System.out.print("Enter the number2: ");
        int number2 = input.nextInt();

        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        int gcd = 1;
        for (int i = number1; i >= 1; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
                break;
            }
        }

        System.out.println("The Greatest Common Divisor for " + number1 + " and " + number2
                + " is " + gcd);
    }
}
