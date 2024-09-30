/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_08 {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter 10 double values: ");
        double[] numbers = new double[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println("The average of the numbers entered is " + average(numbers));
    }

    public static double average(double[] numbers) {
        double total = 0;
        for (double element : numbers) {
            total += element;
        }
        return total / numbers.length;
    }

    public static int average(int[] numbers) {
        int total = 0;
        for (int element : numbers) {
            total += element;
        }
        return total / numbers.length;
    }
}
