/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11.ExercisesEvenNumbered.Problem_12;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Problem_12 {

    public static double sum(ArrayList<Double> list) {
        double total = 0;
        for (Double number : list) {
            total += number;
        }
        return total;
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers.add(input.nextDouble());
        }

        double total = sum(numbers);

        System.out.println("The sum is: " + total);
    }
}
