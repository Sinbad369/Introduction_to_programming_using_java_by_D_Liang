/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11.ExercisesEvenNumbered.Problem_06;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Problem_06 {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Date());
        list.add("Hello Qazaqbay");
        list.add(new Loan(500, 26, 4));
        list.add(new Circle(75));

        for (Object element : list) {
            System.out.println(element.toString());
        }
    }
}

class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [Radius: " + radius + "]";
    }
}

class Loan {

    private double amount;
    private double interestRate;
    private int term;

    public Loan(double amount, double interestRate, int term) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.term = term;
    }

    @Override
    public String toString() {
        return "Loan [Amount: $" + amount + ", Interest Rate: " + interestRate + "%, Term: " + term + " years]";
    }
}
