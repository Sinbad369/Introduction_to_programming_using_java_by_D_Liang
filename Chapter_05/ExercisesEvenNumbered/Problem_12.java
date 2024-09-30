/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_05.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_12 {

    public static void main(String[] args) {
        int number = 12000;
        int i = 1; // initial number

        while (i * i * i < number) { // Do not use Math.pow(a, b) as it is double amount and causes precision error
            i++;
        }
        System.out.println("The smallest number such that the number * number * number  is greater than 12000 is " + i);

    }
}
