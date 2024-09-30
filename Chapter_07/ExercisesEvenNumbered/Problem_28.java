/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_28 {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter 4 integers: ");
        int[] numbers = new int[4];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        permute(numbers, 0);
    }

    public static void permute(int[] numbers, int start) {

        if (start == numbers.length - 1) {
            System.out.println(java.util.Arrays.toString(numbers));
        } else {
            for (int i = start; i < numbers.length; i++) {
                // Swap the elements at indices 'start' and 'i'
                int temp = numbers[start];
                numbers[start] = numbers[i];
                numbers[i] = temp;

                // Recurse the remaining elements
                permute(numbers, start + 1);

                // Backtrack: undo the swap
                temp = numbers[start];
                numbers[start] = numbers[i];
                numbers[i] = temp;
            }
        }

    }

}
