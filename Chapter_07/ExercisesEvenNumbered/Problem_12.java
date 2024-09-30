/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_12 {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println("The reversed version of the array is: ");
        double[] reversedNumbers = reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(reversedNumbers[i] + " ");
        }
    }

    public static double[] reverse(double[] numbers) {
        double[] reversedNumbers = new double[numbers.length];
        for (int i = 0, j = reversedNumbers.length - 1; i < reversedNumbers.length; i++, j--) {
            reversedNumbers[j] = numbers[i];
        }
        return reversedNumbers;
    }

}
