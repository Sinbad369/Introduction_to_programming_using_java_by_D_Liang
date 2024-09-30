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
public class Problem_10 {

    public static void main(String[] args) {
        String set1 = String.format("%4s%4s%4s%4s\n", "1", "3", "5", "7")
                + String.format("%4s%4s%4s%4s\n", "9", "11", "13", "15")
                + String.format("%4s%4s%4s%4s\n", "17", "19", "21", "23")
                + String.format("%4s%4s%4s%4s\n", "25", "27", "29", "31");

        String set2 = String.format("%4s%4s%4s%4s\n", "2", "3", "6", "7")
                + String.format("%4s%4s%4s%4s\n", "10", "11", "14", "15")
                + String.format("%4s%4s%4s%4s\n", "18", "19", "22", "23")
                + String.format("%4s%4s%4s%4s\n", "26", "27", "30", "31");

        String set3 = String.format("%4s%4s%4s%4s\n", "4", "5", "6", "7")
                + String.format("%4s%4s%4s%4s\n", "12", "13", "14", "15")
                + String.format("%4s%4s%4s%4s\n", "24", "25", "26", "27")
                + String.format("%4s%4s%4s%4s\n", "28", "29", "30", "31");

        String set4 = String.format("%4s%4s%4s%4s\n", "8", "9", "10", "11")
                + String.format("%4s%4s%4s%4s\n", "12", "13", "14", "15")
                + String.format("%4s%4s%4s%4s\n", "24", "25", "26", "27")
                + String.format("%4s%4s%4s%4s\n", "28", "29", "30", "31");

        String set5 = String.format("%4s%4s%4s%4s\n", "16", "17", "18", "19")
                + String.format("%4s%4s%4s%4s\n", "20", "21", "22", "23")
                + String.format("%4s%4s%4s%4s\n", "24", "25", "26", "27")
                + String.format("%4s%4s%4s%4s\n", "28", "29", "30", "31");

        int day = 0;

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to answer question
        System.out.println("Is your birthday in Set1?\n");
        System.out.println(set1);
        System.out.println("\nEnter Y for Yes and N for No: ");
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("Y")) {
            day += 1;
        }

        // Prompt the user to answer question
        System.out.println("Is your birthday in Set2?\n");
        System.out.println(set2);
        System.out.println("\nEnter Y for Yes and N for No: ");
        answer = input.nextLine();

        if (answer.equalsIgnoreCase("Y")) {
            day += 2;
        }

        // Prompt the user to answer question
        System.out.println("Is your birthday in Set3?\n");
        System.out.println(set3);
        System.out.println("\nEnter Y for Yes and N for No: ");
        answer = input.nextLine();

        if (answer.equalsIgnoreCase("Y")) {
            day += 4;
        }

        // Prompt the user to answer question
        System.out.println("Is your birthday in Set4?\n");
        System.out.println(set4);
        System.out.println("\nEnter Y for Yes and N for No: ");
        answer = input.nextLine();

        if (answer.equalsIgnoreCase("Y")) {
            day += 8;
        }

        // Prompt the user to answer question
        System.out.println("Is your birthday in Set5?\n");
        System.out.println(set5);
        System.out.println("\nEnter Y for Yes and N for No: ");
        answer = input.nextLine();

        if (answer.equalsIgnoreCase("Y")) {
            day += 16;
        }

        System.out.println("Your birthday is " + day + " ! ");
    }
}
