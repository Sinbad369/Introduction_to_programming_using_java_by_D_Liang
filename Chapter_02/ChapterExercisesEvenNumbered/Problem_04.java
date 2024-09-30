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
public class Problem_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in square meters: ");
        double number = input.nextDouble();

        final double ONE_SQUARE_METER_IN_PING = 0.3025;
        double ping = number * ONE_SQUARE_METER_IN_PING;

        System.out.println(number + " square meters is " + ping + " pings");
    }
}
