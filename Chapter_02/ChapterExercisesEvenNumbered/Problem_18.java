/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_02.ChapterExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_18 {

    public static void main(String[] args) {
        double[][] pointA = {{0, 0}, {1, 4}, {2, 7}, {3, 9}, {4, 11}};
        double[][] pointB = {{2, 1}, {4, 2}, {6, 3}, {10, 5}, {12, 7}};
        System.out.println("a               b              Middle Point");
        for (int i = 0; i < pointA.length; i++) {
            double[] midPoint = CalculateMiddlePoint(pointA[i], pointB[i]);
            System.out.printf("(%.1f, %.1f)     (%.1f, %.1f)     (%.1f, %.1f)%n",
                    pointA[i][0], pointA[i][1], pointB[i][0], pointB[i][1], midPoint[0], midPoint[1]);
        }
    }

    public static double[] CalculateMiddlePoint(double[] pointA, double[] pointB) {
        double midX = (pointA[0] + pointB[0]) / 2;
        double midY = (pointA[1] + pointB[1]) / 2;
        return new double[]{midX, midY};
    }
}
