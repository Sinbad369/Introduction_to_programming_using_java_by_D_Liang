/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11.Classwork;

/**
 *
 * @author Admin
 */
public class Rectangle extends GeometricObject {

    private double width;
    private double height;

    /**
     * Construct a default Rectangle
     */
    public Rectangle() {
    }

    /**
     * Construct a Rectangle with specified width and height
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Construct a Rectangle with specified width, height, color, and filled
     * value
     */
    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    /**
     * Return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Set a new width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Set a new height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Return area
     */
    public double getArea() {
        return width * height;
    }

    /**
     * Return perimeter
     */
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
