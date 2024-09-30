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
public class TestDoWhile {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        int data;
        int sum = 0;

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Keep reading the data until input is 0
        do {
            // Read the next data
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
            sum += data;
        } while (data != 0);

        System.out.println("The sum is " + sum);
    }
}
