/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_10 {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println("The largest element is " + numbers[indexOfLargestElement(numbers)]);
        System.out.println("The largest index of the largest element is " + indexOfLargestElement(numbers));
    }

    public static int indexOfLargestElement(double[] numbers) {
        int largestIndex = 0;
        double largestElement = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] >= largestElement) {
                largestElement = numbers[i];
                largestIndex = i;
            }
        }
        return largestIndex;
    }
}
