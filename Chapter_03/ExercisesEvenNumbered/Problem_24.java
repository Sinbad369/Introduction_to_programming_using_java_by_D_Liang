/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_03.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_24 {

    public static void main(String[] args) {
        int card = 1 + (int) (Math.random() * 13);
        int suit = (int) (Math.random() * 4);

        switch (card) {
            case 1:
                System.out.print("The card you picked is Ace of");
                break;
            case 2:
                System.out.print("The card you picked is 2 of");
                break;
            case 3:
                System.out.print("The card you picked is 3 of");
                break;
            case 4:
                System.out.print("The card you picked is 4 of");
                break;
            case 5:
                System.out.print("The card you picked is 5 of");
                break;
            case 6:
                System.out.print("The card you picked is 6 of");
                break;
            case 7:
                System.out.print("The card you picked is 7 of");
                break;
            case 8:
                System.out.print("The card you picked is 8 of");
                break;
            case 9:
                System.out.print("The card you picked is 9 of");
                break;
            case 10:
                System.out.print("The card you picked is 10 of");
                break;
            case 11:
                System.out.print("The card you picked is Jack of");
                break;
            case 12:
                System.out.print("The card you picked is Queen of");
                break;
            case 13:
                System.out.print("The card you picked is King of");
                break;
        }

        switch (suit) {
            case 0:
                System.out.println(" Clubs");
                break;
            case 1:
                System.out.println(" Diamonds");
                break;
            case 2:
                System.out.println(" Hearts");
                break;
            case 3:
                System.out.println(" Spades");
                break;

        }
    }
}
