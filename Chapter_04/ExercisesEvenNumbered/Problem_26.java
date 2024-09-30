/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_04.ExercisesEvenNumbered;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Problem_26 {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for amount
        System.out.println("Enter the amount: ");
        String amount = input.nextLine();

        // Identify the floating-point index
        int indexFloatingPoint = amount.indexOf(".");

        // Extract the decimal point as dollars
        String oneDollars = amount.substring(0, indexFloatingPoint);

        // Extract the remaining floating-point part as decimal
        String remainingFloatingPoint = amount.substring(indexFloatingPoint + 1);

        // Ensure the cents part is two digits
        remainingFloatingPoint = remainingFloatingPoint.length() == 1
                ? remainingFloatingPoint + "0"
                : remainingFloatingPoint.substring(0, 2);

        // Convert the String into Int
        int remainingFloatStringToInt = Integer.parseInt(remainingFloatingPoint);

        // Extract the quarters from remainingFloatStringToInt
        int quarters = remainingFloatStringToInt / 25;

        // Extract the dimes from remainingFloatStringToInt
        int dimes = remainingFloatStringToInt % 25 / 10;

        // Extract the nickels from remainingFloatStringToInt
        int nickels = remainingFloatStringToInt % 25 % 10 / 5;

        // Extract the pennies from remainingFloatStringToInt
        int pennies = remainingFloatStringToInt % 25 % 10 % 5 / 1;

        System.out.println("Your amount " + amount + " consists of \n"
                + oneDollars + " dollars\n"
                + quarters + " quarters\n"
                + dimes + " dimes\n"
                + nickels + " nickels\n"
                + pennies + " pennies\n");
    }
}
