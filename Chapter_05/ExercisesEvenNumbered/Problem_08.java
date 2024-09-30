/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_05.ExercisesEvenNumbered;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Problem_08 {

    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        int max = 0;
        String topStudent = "";
        // Prompt the user to enter a number of students
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        for (int i = 0; i < numberOfStudents; i++) {
            // Prompt the name of a student
            System.out.print("Enter the name for student number " + (i + 1) + ": ");
            String name = input.next();

            // Prompt the score of a student
            System.out.print("Enter the score for student number " + (i + 1) + ": ");
            int score = input.nextInt();

            if (score > max) {
                max = score;
                topStudent = name;
            }
        }
        System.out.println("The highest score is " + max);
        System.out.println("The student who got the highest score is " + topStudent);
    }
}
