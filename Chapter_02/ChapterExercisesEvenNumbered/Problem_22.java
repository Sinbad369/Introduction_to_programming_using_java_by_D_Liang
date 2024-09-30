/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_02.ChapterExercisesEvenNumbered;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Problem_22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.println("Enter an amount in integer, last two digits represent cents: ");
        int amount = input.nextInt();

        // Find the number of one dollars
        int numberOfOneDollars = amount / 100;
        int numberOfQuarters = amount % 100 / 25;
        int numberOfDimes = amount % 100 % 25 / 10;
        int numberOfNickels = amount % 100 % 25 % 10 / 5;
        int numberOfPennies = amount % 100 % 25 % 10 % 5 / 1;

        System.out.println("Your amount " + amount + "consists of ");
        System.out.println(" " + numberOfOneDollars + " dollars ");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");

    }
}
