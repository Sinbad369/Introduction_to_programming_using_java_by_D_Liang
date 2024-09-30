/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_05.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_10 {

    public static void main(String[] args) {

        // Set the numbers of divisors per line to 10
        final int NUMBER_OF_DIVISORS = 10;

        // Set the lower and higher bounds
        int lowerBound = 100;
        int higherBound = 1000;

        // Set the initial count to 0
        int count = 0;

        System.out.println("The list of numbers divisible for both 3 and 4 from " + lowerBound
                + " to " + higherBound + " : ");

        // Repeatedly find the divisors
        for (int i = lowerBound; i <= higherBound; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                System.out.print(i + " ");
                count++;
                if (count % NUMBER_OF_DIVISORS == 0) {
                    System.out.println();
                }
            }
        }

    }
}
