/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_24 {

    public static void main(String[] args) {
        printCurrentDateTime();
    }

    public static void printCurrentDateTime() {
        // Obtain the total milliseconds since midnight Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Calculate total seconds, minutes, and hours
        long totalSeconds = totalMilliseconds / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;

        // Compute the current time in the hour
        int currentSecond = (int) (totalSeconds % 60);
        int currentMinute = (int) (totalMinutes % 60);
        int currentHour = (int) (totalHours % 24);

        // Determine the current date
        int daysSinceEpoch = (int) (totalHours / 24);

        // Calculate the year
        int year = 1970;
        int daysInYear;
        while (true) {
            daysInYear = isLeapYear(year) ? 366 : 365;
            if (daysSinceEpoch < daysInYear) {
                break;
            }
            daysSinceEpoch -= daysInYear;
            year++;
        }

        // Calculate the month and day
        int month = 1;
        int daysInMonth;
        while (true) {
            daysInMonth = getDaysInMonth(month, year);
            if (daysSinceEpoch < daysInMonth) {
                break;
            }
            daysSinceEpoch -= daysInMonth;
            month++;
        }

        int day = daysSinceEpoch + 1; // Days are 1-indexed

        // Display the result
        System.out.printf("Current date and time is %d-%02d-%02d %02d:%02d:%02d GMT%n",
                year, month, day, currentHour, currentMinute, currentSecond);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                return 31;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            case 2: // February
                return isLeapYear(year) ? 29 : 28;
            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }
    }
}
