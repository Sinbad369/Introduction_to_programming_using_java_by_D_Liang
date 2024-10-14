/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_09.Classwork;

/**
 *
 * @author Admin
 */
public class CircleWithPrivateDataFields {

    /**
     * The radius of the circle
     */
    private double radius = 1;

    /**
     * The number of objects created
     */
    private static int numberOfObjects = 0;

    /**
     * Construct a circle with radius 1
     */
    public CircleWithPrivateDataFields() {
        numberOfObjects++;
    }

    /**
     * Construct a circle with a specified radius
     *
     * @param newRadius
     */
    public CircleWithPrivateDataFields(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    /**
     * Return radius
     *
     * @return
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set a new radius
     *
     * @param newRadius
     */
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    /**
     * Return the number of objects
     *
     * @return
     */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /**
     * Return the area of this circle
     *
     * @return
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
