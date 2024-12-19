/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_12.Classwork;

public class TestCircleWithCustomException {

    public static void main(String[] args) {
        try {
            new CircleWithCustomException(5);   // Valid radius
            new CircleWithCustomException(-5);  // Invalid radius
            new CircleWithCustomException(0);   // Valid radius
        } catch (InvalidRadiusException ex) {
            System.out.println(ex); // Prints exception message
        }

        System.out.println("Number of objects created: "
                + CircleWithCustomException.getNumberOfObjects());
    }
}

class CircleWithCustomException {

    /**
     * The radius of the circle
     */
    private double radius;

    /**
     * The number of objects created
     */
    private static int numberOfObjects = 0;

    /**
     * Construct a circle with radius 1
     */
    public CircleWithCustomException() throws InvalidRadiusException {
        this(1.0); // Calls the parameterized constructor
    }

    /**
     * Construct a circle with a specified radius
     */
    public CircleWithCustomException(double newRadius) throws InvalidRadiusException {
        setRadius(newRadius); // Validates and sets the radius
        numberOfObjects++;    // Increments the object count
    }

    /**
     * Return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set a new radius
     */
    public void setRadius(double newRadius) throws InvalidRadiusException {
        if (newRadius >= 0) {
            radius = newRadius; // Assigns radius if valid
        } else {
            throw new InvalidRadiusException(newRadius); // Throws exception for invalid radius
        }
    }

    /**
     * Return the number of objects created
     */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /**
     * Return the area of this circle
     */
    public double findArea() {
        return radius * radius * 3.14159; // Area = πr²
    }
}
