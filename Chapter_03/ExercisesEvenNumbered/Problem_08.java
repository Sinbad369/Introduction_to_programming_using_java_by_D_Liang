/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_03.ExercisesEvenNumbered;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Problem_08 {

    public static void main(String[] args) {
        // Inovke the Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to provide 3 inteders
        System.out.print("Enter three integers: ");
        int digit1 = input.nextInt();
        int digit2 = input.nextInt();
        int digit3 = input.nextInt();

        // Sort in an increasing order
        if (digit1 > digit2) {
            int temp = digit1;
            digit1 = digit2;
            digit2 = temp;
        }
        if (digit2 > digit3) {
            int temp = digit2;
            digit2 = digit3;
            digit3 = temp;
        }
        if (digit1 > digit2) {
            int temp = digit1;
            digit1 = digit2;
            digit2 = temp;
        }

        // Display the result
        System.out.println("Numbers in an increasing order is " + digit1 + " " + digit2 + " " + digit3);

        /*
        you may use the sorting and array

        int[] digits = new int[3];
        digits[0] = input.nextInt();
        digits[1] = input.nextInt();
        digits[2] = input.nextInt();

        Arrays.sort(digits);

        System.out.println("Numbers in non-decreasing order are " + digits[0]+ " " + digits[1] + " " + digits[2];
         */
    }
}
