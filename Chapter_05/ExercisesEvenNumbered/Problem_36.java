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
public class Problem_36 {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int ISBN_9 = input.nextInt();

        int ISBN_10 = 0;
        System.out.printf("ISBN_10 number is %09d", ISBN_9);
        int sum = 0;
        for (int i = 9; i >= 1; i--) {
            sum += (ISBN_9 % 10) * i;
            ISBN_9 = ISBN_9 / 10;
            ISBN_10 = sum % 11;
        }
        if (ISBN_10 == 10) {
            System.out.println("X");
        } else {
            System.out.println(ISBN_10);
        }
    }
}
