/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_05.Classwork;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SentinelValue {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Read an initial data
        System.out.print(
                "Enter an integer (the input ends if it is 0): ");
        int data = input.nextInt();

        int sum = 0;
        while (data != 0) {
            sum += data;
            System.out.print(
                    "Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
        }

        System.out.println("The sum is " + sum);
    }
}
