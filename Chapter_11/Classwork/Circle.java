/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11.Classwork;

/**
 *
 * @author Admin
 */
public class Circle extends GeometricObject {

    private double radius;

    /**
     * Construct a default Circle
     */
    public Circle() {
    }

    /**
     * Construct a Circle with the specified radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Construct a Circle with specified radius, color, and filled value
     */
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
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
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Return area
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Return diameter
     */
    public double getDiameter() {
        return 2 * radius;
    }

    /**
     * Return perimeter
     */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * Print the circle info
     */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }

    @Override
    public String toString() {
        return super.toString() + "\nradius is " + radius;
    }
}
