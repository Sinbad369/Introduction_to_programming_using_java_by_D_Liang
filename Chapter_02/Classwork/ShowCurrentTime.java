/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_02.Classwork;

/**
 *
 * @author Admin
 */
public class ShowCurrentTime {

    public static void main(String[] args) {
        // Obain the total milliseconds since midnight Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obain the total seconds since midnight Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Obain the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        // Display the result
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");

    }
}