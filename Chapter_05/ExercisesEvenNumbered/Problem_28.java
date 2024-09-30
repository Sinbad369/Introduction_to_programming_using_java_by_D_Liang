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
public class Problem_28 {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user for the year
        System.out.println("Enter the year: ");
        int year = input.nextInt();

        // Prompt the user for the first day to the year
        System.out.println("Enter the first day of the year: ");
        int day = input.nextInt();

        // Determine whether it is a leap year
        boolean isLeapYear = false;
        if ((year % 100 != 0 && year % 400 == 0) || year % 4 == 0) {
            isLeapYear = true;
        }

        // Loop through each month
        String monthName = "";
        int daysInMonth = 0;
        for (int month = 1; month <= 12; month++) {
            // Adjust the months and their number of days accordingly
            switch (month) {
                case 1:
                    monthName = "January";
                    daysInMonth = 31;
                    break;
                case 2:
                    monthName = "February";
                    daysInMonth = isLeapYear ? 29 : 28;
                    break;
                case 3:
                    monthName = "March";
                    daysInMonth = 31;
                    break;
                case 4:
                    monthName = "April";
                    daysInMonth = 30;
                    break;
                case 5:
                    monthName = "May";
                    daysInMonth = 31;
                    break;
                case 6:
                    monthName = "June";
                    daysInMonth = 30;
                    break;
                case 7:
                    monthName = "July";
                    daysInMonth = 31;
                    break;
                case 8:
                    monthName = "August";
                    daysInMonth = 31;
                    break;
                case 9:
                    monthName = "September";
                    daysInMonth = 30;
                    break;
                case 10:
                    monthName = "October";
                    daysInMonth = 31;
                    break;
                case 11:
                    monthName = "November";
                    daysInMonth = 30;
                    break;
                case 12:
                    monthName = "December";
                    daysInMonth = 31;
                    break;
            }
            // Determine the day name for the current month
            String dayName = " ";
            switch (day % 7) {
                case 0:
                    dayName = "Sunday";
                    break;
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                    dayName = "Saturday";
                    break;
            }
            // Print the first day of the month
            System.out.println(monthName + " 1, " + year + " is " + dayName);

            // Update the starting day for the next month
            day = (day + daysInMonth) % 7; //  almost all logic is here
        }

    }
}
