/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_03.Classwork;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TestBooleanOperators {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Receive an input
        System.out.println("Enter an integer:");
        int number = input.nextInt();

        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println(number + " is divisible by both 2 and 3.");
        }
        if (number % 2 == 0 || number % 3 == 0) {
            System.out.println(number + " is divisible by 2 or 3.");
        }
        if (number % 2 == 0 ^ number % 3 == 0) {
            System.out.println(number + " is divisible by 2 or 3, but not both.");
        }
    }
}
