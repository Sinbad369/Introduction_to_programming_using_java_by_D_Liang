/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_32 {

    public static void main(String[] args) {
        playCraps();
    }

    public static void playCraps() {
        int countWinning = 0;
        for (int i = 1; i <= 15000; i++) {
            int rollSum = sumOfDices();
            // System.out.println("You rolled " + rollSum);

            if (rollSum == 2 || rollSum == 3 || rollSum == 12) {
                //System.out.println("You lose");
            } else if (rollSum == 7 || rollSum == 11) {
                countWinning++;
                //System.out.println("You win");
            } else {
                int point = rollSum;
                // System.out.println("point is " + rollSum);
                boolean gameWon = false;
                while (!gameWon) {
                    rollSum = sumOfDices();
                    //System.out.println("You rolled " + rollSum);
                    if (rollSum == 7) {
                        //System.out.println("You lose");
                        break;
                    }
                    if (rollSum == point) {
                        //System.out.println("You win");
                        gameWon = true;
                    }
                }
            }

        }
        System.out.println("The number of winning games is " + countWinning);
    }

    public static int sumOfDices() {
        // Create a random integer for dices
        int dice1 = 1 + (int) (Math.random() * 6);
        int dice2 = 1 + (int) (Math.random() * 6);
        return dice1 + dice2;
    }
}
