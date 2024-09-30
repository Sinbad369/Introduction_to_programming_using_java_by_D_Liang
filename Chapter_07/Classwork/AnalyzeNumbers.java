/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07.Classwork;

/**
 *
 * @author Admin
 */
public class AnalyzeNumbers {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numberOfItems = input.nextInt();
        double[] numbers = new double[numberOfItems];
        double sum = 0;

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < numberOfItems; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double average = sum / numberOfItems;

        System.out.println("Average is " + average);

        int count = 0;
        for (int i = 0; i < numberOfItems; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }

        System.out.println("Number of elements above average is " + count);
    }
}
