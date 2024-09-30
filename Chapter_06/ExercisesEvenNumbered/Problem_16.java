/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_16 {

    public static int numberOfDaysInAYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return 366;
        }
        return 365;
    }

    /**
     * Main method to test
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 2014; i <= 2034; i++) {
            System.out.println("The year " + i + " has " + numberOfDaysInAYear(i) + " days");
        }
    }
}
