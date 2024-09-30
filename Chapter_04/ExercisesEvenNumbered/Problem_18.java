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
public class Problem_18 {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for an input
        System.out.println("Enter two characters: ");
        String majorStatus = input.nextLine();

        // Check whether the length is 2
        if (majorStatus.length() != 2) {
            System.out.println("You must enter two characters");
            System.exit(1);
        }

        String major = "";
        char ch = Character.toUpperCase(majorStatus.charAt(0));
        switch (ch) {
            case 'I':
                major = "Information Management";
                break;
            case 'C':
                major = "Computer Science";
                break;
            case 'A':
                major = "Accounting";
                break;
            default:
                System.out.println("Invalid input");
                System.exit(1);
        }
        String status = "";
        switch (majorStatus.charAt(1)) {
            case '1':
                status = "Freshman";
                break;
            case '2':
                status = "Sophomore";
                break;
            case '3':
                status = "Junior";
                break;
            case '4':
                status = "Senior";
                break;
            default:
                System.out.println("Invalid input");
                System.exit(1);
        }

        System.out.println(major + " " + status);
    }
}
