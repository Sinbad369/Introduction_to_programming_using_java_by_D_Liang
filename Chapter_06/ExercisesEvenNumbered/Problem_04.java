/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06.ExercisesEvenNumbered;

import java.util.Scanner;

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
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("The reversed form of your number " + number + " is ");
        reverse(number);
    }

    public static void reverse(int num) {
        if (num == 0) {
            System.out.println("0");
        } else {
            int temp = num;
            while (temp > 0) {
                System.out.print(temp % 10);
                temp = temp / 10;
            }
            System.out.println();
        }
    }
}
