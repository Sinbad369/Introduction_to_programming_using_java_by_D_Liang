/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_05.Classwork;

/**
 *
 * @author Admin
 */
public class TestSum {

    public static void main(String[] args) {
        // Initialize sum
        float sum = 0;

        // Add 0.01, 0.02, ... , 0.99, 1 to sum
        for (float i = 0.01f; i <= 1.0f; i = i + 0.01f) {
            sum += i;
        }
        // Display the result
        System.out.println("Sum is " + sum);
    }

}
