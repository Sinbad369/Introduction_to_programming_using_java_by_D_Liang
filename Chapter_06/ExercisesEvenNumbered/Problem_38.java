/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06.ExercisesEvenNumbered;

import Chapter_06.Classwork.RandomCharacter;

/**
 *
 * @author Admin
 */
public class Problem_38 {

    public static void main(String[] args) {
        System.out.println("Random 200 Uppercase letters are: ");
        printRandomChar('A', 'Z');
        System.out.println("Random 200 single digits are: ");
        printRandomChar('0', '9');
    }

    public static void printRandomChar(char ch1, char ch2) {
        for (int i = 1; i <= 200; i++) {
            char ch = RandomCharacter.getRandomCharacter(ch1, ch2);
            if (i % 10 == 0) {
                System.out.printf(ch + "\n");
            } else {
                System.out.printf(ch + " ");
            }
        }
    }
}
