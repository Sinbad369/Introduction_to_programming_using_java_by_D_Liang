/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11.Classwork;

/**
 *
 * @author Admin
 */
public class PolymorphismDemo {

    /**
     * Main method
     */
    public static void main(String[] args) {
        // Display circle and rectangle properties
        displayObject(new Circle(1, "red", false));
        displayObject(new Rectangle(1, 1, "black", true));
    }

    /**
     * Display geometric object properties
     */
    public static void displayObject(GeometricObject object) {
        System.out.println("Created on " + object.getDateCreated()
                + ". Color is " + object.getColor());
    }
}
