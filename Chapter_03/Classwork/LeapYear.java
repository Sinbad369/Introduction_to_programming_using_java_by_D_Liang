/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_03.Classwork;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user for a year
        System.out.println("Enter the year to check whether it is a leap year or not: ");
        int year = input.nextInt();
        /*
        // A leap year is divisible by 4
        boolean isLeapYear = (year % 4 == 0);

        // A leap year is divisible by 4, but not by 100
        isLeapYear = isLeapYear && (year % 100 != 0);

        // A leap year is divisibe by 4, but not by 100 or divisible by 400
        isLeapYear = isLeapYear || (year % 400 == 0);
        **/

        // You can combine all conditions in one statement
        // A leapyear is divisible by 4, but not by 100 or divisible by 400
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Display the result
        System.out.print(year + " is a leap year? " + isLeapYear);
    }
}
