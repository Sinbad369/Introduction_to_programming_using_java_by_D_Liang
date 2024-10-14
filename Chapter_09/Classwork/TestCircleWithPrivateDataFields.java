/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_09.Classwork;

/**
 *
 * @author Admin
 */
public class TestCircleWithPrivateDataFields {

    /**
     * Main method
     */
    public static void main(String[] args) {
        // Create a circle with radius 5.0
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
        System.out.println("The area of the circle with radius " + myCircle.getRadius()
                + " is " + myCircle.getArea());

        // Increase myCircle`s radius by 10%
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is "
                + myCircle.getArea());

        System.out.println("The number of objects created is " + CircleWithPrivateDataFields.getNumberOfObjects());
    }
}
