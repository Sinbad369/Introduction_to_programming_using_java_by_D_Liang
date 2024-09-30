/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_04.Classwork;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class OrderTwoCities {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two cities
        System.out.println("Enter two cities: ");
        String city1 = input.nextLine();
        String city2 = input.nextLine();

        if (city1.compareTo(city2) < 0) {
            System.out.println("Cities in alphabetical order are "
                    + city1 + " and " + city2);
        } else {
            System.out.println("Cities in alphabetical order are "
                    + city2 + " and " + city1);
        }
    }
}
