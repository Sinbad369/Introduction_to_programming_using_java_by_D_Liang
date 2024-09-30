/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_04.ExercisesEvenNumbered;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Problem_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String letterGrade = input.nextLine();

        if (letterGrade.length() != 1) {
            System.out.println("You must enter exactly one character as a grade");
            System.exit(1);
        }

        char ch = Character.toUpperCase(letterGrade.charAt(0));
        int value = 0;
        if (ch >= 'A' && ch <= 'D') {
            value = 4 - (ch - 'A');
        } else if (ch == 'F') {
            value = 0;
        } else {
            System.out.println("Invalid input");
            System.exit(1);
        }

        System.out.println("The numeric value for grade " + ch + " is " + value);
    }
}
