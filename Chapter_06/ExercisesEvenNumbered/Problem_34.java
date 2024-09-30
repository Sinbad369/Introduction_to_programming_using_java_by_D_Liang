/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06.ExercisesEvenNumbered;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Problem_34 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for year
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();

        // Prompt the user for month
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();

        // Calculate the start day of the month
        int startDay = dayOfWeek(year, month, 1);

        // Validate the input and print the calendar
        if (year < 1800 || (month < 1 || month > 12)) {
            System.out.println("Please enter the year after 1800 and "
                    + "valid month numbers such as between 1 and 12");
        } else {
            printMonth(year, month, startDay);
        }

    }

    // Zeller`s Congruence method for day of the week
    public static int dayOfWeek(int year, int m, int q) {
        if (m == 1 || m == 2) {
            m += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        int h = (q + (26 * (m + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;
        int dayOfWeek = (h + 6) % 7;
        return dayOfWeek;
    }

    public static void printMonth(int year, int m, int startDay) {
        // Print the headings of the calendar
        printMonthTitle(year, m);

        // Print the body of the calendar
        printMonthBody(year, m, startDay);
    }

    public static void printMonthTitle(int year, int m) {
        System.out.println("        " + getMonthName(m) + "   " + year);
        System.out.println("------------------------------------");
        System.out.printf("%5s%5s%5s%5s%5s%5s%5s", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        System.out.println();
    }

    /**
     * Get the English name for the month
     *
     * @param m
     * @return
     */
    public static String getMonthName(int m) {
        String monthName = "";
        switch (m) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            case 13: // As per Zeller`s Congruence
                monthName = "January";
                break;
            case 14: // As per Zeller`s Congruence
                monthName = "February";
                break;
        }
        return monthName;
    }

    public static void printMonthBody(int year, int m, int startDay) {
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, m);

        // Pad space before the first day of the month
        for (int i = 0; i < startDay; i++) {
            System.out.printf("%5s", "");
        }

        for (int day = 1; day <= numberOfDaysInMonth; day++) {
            System.out.printf("%5d", day);
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static int getNumberOfDaysInMonth(int year, int m) {
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
        }
        return 0; // Month is invalid
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }
}
