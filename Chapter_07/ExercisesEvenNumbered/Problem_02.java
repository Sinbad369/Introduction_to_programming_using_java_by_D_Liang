/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07.ExercisesEvenNumbered;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Problem_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[11];
        System.out.println("Enter 11 integers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int eleventhNumber = numbers[numbers.length - 1];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > eleventhNumber) {
                System.out.println(numbers[i] + " is greater than 11th integer " + eleventhNumber);
            } else if (numbers[i] == eleventhNumber) {
                System.out.println(numbers[i] + " is equal to 11th integer " + eleventhNumber);
            } else {
                System.out.println(numbers[i] + " is less than 11th integer " + eleventhNumber);
            }
        }
    }
}
