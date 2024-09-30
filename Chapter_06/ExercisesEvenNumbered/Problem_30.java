/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_30 {

    public static void main(String[] args) {
        playCraps();
    }

    public static void playCraps() {
        int point = 0;

        int rollSum = sumOfDices();
        System.out.println("You rolled " + rollSum);

        if (rollSum == 2 || rollSum == 3 || rollSum == 12) {
            System.out.println("You lose");
        } else if (rollSum == 7 || rollSum == 11) {
            System.out.println("You win");
        } else {
            point = rollSum;
            System.out.println("point is " + rollSum);
            boolean gameWon = false;
            while (!gameWon) {
                rollSum = sumOfDices();
                System.out.println("You rolled " + rollSum);
                if (rollSum == 7) {
                    System.out.println("You lose");
                    break;
                }
                if (rollSum == point) {
                    System.out.println("You win");
                    gameWon = true;
                }
            }
        }

    }

    public static int sumOfDices() {
        // Create a random integer for dices
        int dice1 = 1 + (int) (Math.random() * 6);
        int dice2 = 1 + (int) (Math.random() * 6);
        return dice1 + dice2;
    }
}
