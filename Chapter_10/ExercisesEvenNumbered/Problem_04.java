/*
10.4 (The MyPoint class) Design a class named MyPoint to represent a point with
x- and y-coordinates. The class contains:
■■ The data fields x and y that represent the coordinates with getter methods.
■■ A no-arg constructor that creates a point (0, 0).
■■ A constructor that constructs a point with specified coordinates.
■■ A method named distance that returns the distance from this point to a
specified point of the MyPoint type.
■■ A method named distance that returns the distance from this point to
another point with specified x- and y-coordinates.
■■ A static method named distance that returns the distance from two MyPoint
objects.
Draw the UML diagram for the class then implement the class. Write a test
program that creates the two points (0, 0) and (10, 30.5) and displays the distance between them
 */
package Chapter_10.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_04 {

    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint(0, 0);
        MyPoint myPoint2 = new MyPoint(10, 30.5);
        System.out.println("The distance using MyPoint object is  " + myPoint1.distance(myPoint2));
        System.out.println("The distance using static method is  " + MyPoint.distance(myPoint1, myPoint2));
    }

}

class MyPoint {

    private double x;
    private double y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Calculating the distance with my constructor based points with new points
    public double distance(MyPoint point) {
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }

    // Calculating the distance with the previous distance method points as initial and new point as the second points
    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    // Literally, in the below method we are doing what we did in two methods before in one method.
    public static double distance(MyPoint point1, MyPoint point2) {
        return Math.sqrt(Math.pow(point2.x - point1.x, 2) + Math.pow(point2.y - point1.y, 2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
