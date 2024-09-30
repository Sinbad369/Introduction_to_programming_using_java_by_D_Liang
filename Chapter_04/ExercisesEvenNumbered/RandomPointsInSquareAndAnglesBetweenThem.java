/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_04.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class RandomPointsInSquareAndAnglesBetweenThem {

    public static void main(String[] args) {

        // Generate three random points
        double x1 = Math.random() * 40 - 20;
        double y1 = Math.random() * 40 - 20;

        double x2 = Math.random() * 40 - 20;
        double y2 = Math.random() * 40 - 20;

        double x3 = Math.random() * 40 - 20;
        double y3 = Math.random() * 40 - 20;

        // Calculate the distances(d)
        double c = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))); // Distance AB
        double a = Math.sqrt((Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2))); // Distance BC
        double b = Math.sqrt((Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2))); // Distance CA

        // Calculate the angles in radians
        double angleAInRadians = Math.acos((b * b + c * c - a * a) / (2 * b * c));
        double angleBInRadians = Math.acos((a * a + c * c - b * b) / (2 * a * c));
        double angleCInRadians = Math.acos((a * a + b * b - c * c) / (2 * a * b));

        // Convert angles from radians to degrees
        double angleA = Math.toDegrees(angleAInRadians);
        double angleB = Math.toDegrees(angleBInRadians);
        double angleC = Math.toDegrees(angleCInRadians);

        // Display the result
        System.out.println("Angle A is " + angleA + " degrees");
        System.out.println("Angle B is " + angleB + " degrees");
        System.out.println("Angle C is " + angleC + " degrees");
    }
}
