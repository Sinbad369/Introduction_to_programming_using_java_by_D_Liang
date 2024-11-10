/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11.ExercisesEvenNumbered.Problem_02;

/**
 *
 * @author Admin
 */
public class MyDate {

    private int year;
    private int month;
    private int day;

    // Default constructor that sets the date to the current date
    public MyDate() {
        // Set default date to current date
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.year = calendar.get(java.util.Calendar.YEAR);
        this.month = calendar.get(java.util.Calendar.MONTH) + 1; // Calendar.MONTH is 0-based
        this.day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
    }

    // Constructor that takes specific year, month, and day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getter methods
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // toString method to return a string representation of the date
    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}
