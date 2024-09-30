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
public class Problem_08 {

    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the time offset to GMT: ");
        int offset = input.nextInt();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + offset) % 24;
        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
