/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_05.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_40 {

    public static void main(String[] args) {
        // Initialize the countCoinSides
        int countHeads = 0;
        int countTails = 0;

        // Create a loop to number of 2 million times
        for (int i = 0; i < 2_000_000; i++) {
            int coinSide = (int) (Math.random() * 2);
            if (coinSide == 0) {
                countHeads++;
            } else {
                countTails++;
            }
        }
        System.out.println("The number of Heads is " + countHeads);
        System.out.println("The number of Tails is " + countTails);

    }

}
