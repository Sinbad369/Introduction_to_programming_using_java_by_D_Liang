/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_05.ExercisesEvenNumbered;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Problem_38 {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for a decimal integer
        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();
        System.out.print("The decimal digit " + decimal);

        // Convert decimal to octal
        String octal = "";
        while (decimal != 0) {
            int octalValue = decimal % 8;

            // Convert the decimal to octal
            char octalDigit = (char) (octalValue + '0');

            octal = octalDigit + octal; // here, writing octalDigit before octal is important bcz if you
            // do not do so, you will add like space and then octal number, i.e., 12 bcomes 4*1*

            decimal /= 8;
        }
        System.out.println(" in octal is " + (octal.length() == 0 ? "0" : octal));

    }
}
