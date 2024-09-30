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
public class Problem_24 {

    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three countries
        System.out.println("Enter the first country: ");
        String country1 = input.nextLine();

        System.out.println("Enter the second country: ");
        String country2 = input.nextLine();

        System.out.println("Enter the third country: ");
        String country3 = input.nextLine();

        if (country1.length() < country2.length()) {
            String temp = country1;
            country1 = country2;
            country2 = temp;
        }
        if (country1.length() < country3.length()) {
            String temp = country1;
            country1 = country3;
            country3 = temp;
        }
        if (country2.length() < country3.length()) {
            String temp = country2;
            country2 = country3;
            country3 = temp;
        }

        System.out.println("The three countries in descending order are " + country1 + " " + country2 + " " + country3);
    }
}
