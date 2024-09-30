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
public class Problem_30 {

    public static void main(String[] args) {
        // Invoke the time
        long totalMilliseconds = System.currentTimeMillis();

        // Create the Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for time zone offset to GMT
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + offset) % 24;
        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);

        String hour12Form = currentHour >= 12 ? "PM" : "AM";
        currentHour = currentHour % 12;
        currentHour = currentHour == 0 ? 12 : currentHour; // Midnight handling
        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " " + hour12Form);
    }
}
