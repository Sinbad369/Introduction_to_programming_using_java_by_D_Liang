/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_01.ChapterExercises;

/**
 *
 * @author Admin
 */
public class Problem_12 {

    public static void main(String[] args) {
        final double ONE_MILE_IN_KM = 1.6;
        final double ONE_HOUR_IN_SECONDS = 3600;
        final double ONE_MINUTE_IN_SECONDS = 60;
        double timeInSeconds = 1 * ONE_HOUR_IN_SECONDS + 40 * ONE_MINUTE_IN_SECONDS + 35;
        double timeInHours = timeInSeconds / ONE_HOUR_IN_SECONDS;
        double distanceInKm = ONE_MILE_IN_KM * 24;
        double average = distanceInKm / timeInHours;
        System.out.printf("Average speed of a runner who runs "
                + " 24 miles in 1 hour, 40 minutes and 35 seconds is %.2f kilometers "
                + "per hour .%n", average);
    }
}
