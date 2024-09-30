/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07.ExercisesEvenNumbered;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Problem_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter scores (entering a negative number signifies the end of loop): ");
        double[] scores = new double[100];
        int count = 0;
        double sum = 0;
        while (count < 100) {
            double singleScore = input.nextDouble();
            if (singleScore < 0) {
                break;
            }
            scores[count] = singleScore;
            sum += singleScore;
            count++;
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Average score is " + average);
            classifyAsPerAverage(scores, count, average); // Invoking the classifyAsPerAverage method
        } else {
            System.out.println("No valid score entered");
        }
    }

    public static void classifyAsPerAverage(double scores[], int count, double average) {
        int aboveOrEqual = 0;
        int below = 0;
        for (int i = 0; i < count; i++) {
            if (scores[i] >= average) {
                aboveOrEqual++;
            } else {
                below++;
            }
        }
        System.out.println("Number of scores above or equal to average is " + aboveOrEqual);
        System.out.println("Number of scores below average is " + below);
    }

}
