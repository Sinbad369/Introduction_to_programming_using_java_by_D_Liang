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
public class GuessBirthday {

    public static void main(String[] args) {

        String set1
                = "  1 3 5 7\n"
                + "  9 11 13 15\n"
                + "17 19 21 23\n"
                + "25 27 29 31";
        String set2
                = "  2   3   6   7\n"
                + "10 11 14 15\n"
                + "18 19 22 23\n"
                + "26 27 30 31";
        String set3
                = "  4   5   6   7\n"
                + "12 13 14 15\n"
                + "24 25 26 27\n"
                + "28 29 30 31";
        String set4
                = "  8   9 10 11\n"
                + "12 13 14 15\n"
                + "24 25 26 27\n"
                + "28 29 30 31";
        String set5
                = "16 17 18 19\n"
                + "20 21 22 23\n"
                + "24 25 26 27\n"
                + "28 29 30 31";

        int day = 0;

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to answer question
        System.out.println("Is your birthday in Set1?\n");
        System.out.println(set1);
        System.out.println("\nEnter 0 for No and 1 for Yes: ");
        int answer = input.nextInt();

        if (answer == 1) {
            day += 1;
        }

        // Prompt the user to answer question
        System.out.println("Is your birthday in Set2?\n");
        System.out.println(set2);
        System.out.println("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1) {
            day += 2;
        }

        // Prompt the user to answer question
        System.out.println("Is your birthday in Set3?\n");
        System.out.println(set3);
        System.out.println("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1) {
            day += 4;
        }

        // Prompt the user to answer question
        System.out.println("Is your birthday in Set4?\n");
        System.out.println(set4);
        System.out.println("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1) {
            day += 8;
        }

        // Prompt the user to answer question
        System.out.println("Is your birthday in Set5?\n");
        System.out.println(set5);
        System.out.println("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1) {
            day += 16;
        }

        System.out.println("Your birthday is " + day + " ! ");
    }
}
