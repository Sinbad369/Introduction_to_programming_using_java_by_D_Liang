/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_01.ChapterExercises;

/**
 *
 * @author Admin
 */
public class Problem_10 {

    public static void main(String[] args) {
        final double ONE_MILE_IN_KM = 1.6;
        final double ONE_HOUR_IN_SECONDS = 3600;
        final double ONE_MINUTE_IN_SECONDS = 60;
        double timeInSeconds = 50 * ONE_MINUTE_IN_SECONDS + 30;
        double timeInHours = (timeInSeconds * 1.0) / ONE_HOUR_IN_SECONDS;
        double distanceInMiles = 15 / ONE_MILE_IN_KM;
        double average = (distanceInMiles * 1.0) / timeInHours;
        System.out.printf("Average speed of a runner who runs "
                + " 15 kilometers in 50 minutes and 30 seconds is %.2f miles "
                + "per hour .%n", average);
    }
}
