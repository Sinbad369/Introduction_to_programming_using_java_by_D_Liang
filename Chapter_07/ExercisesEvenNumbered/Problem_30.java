/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_30 {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int numberOfValues = input.nextInt();
        System.out.print("Enter the values: ");
        int[] numbers = new int[numberOfValues];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        if (isConsecutiveFour(numbers)) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");
        }
    }

    public static boolean isConsecutiveFour(int[] values) {
        int count = 1;
        for (int i = 1; i < values.length; i++) {
            if (values[i] == values[i - 1]) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 1; // We are resetting the count if the sequence of the numbers is broken before it reaches 4
            }
        }
        return false;
    }
}
