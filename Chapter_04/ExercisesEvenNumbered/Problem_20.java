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
public class Problem_20 {

    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String string = input.nextLine();

        System.out.println("The string " + string + " has a length of " + string.length() + " and "
                + string.charAt(string.length() - 1) + " is a last character in it");
    }

}
