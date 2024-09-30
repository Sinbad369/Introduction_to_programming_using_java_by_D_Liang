/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_05.Classwork;

/**
 *
 * @author Admin
 */
public class MultiplicationTable {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        // Display the table heading
        System.out.println("              Multiplication table");

        // Display the number title
        System.out.print("         ");
        for (int j = 1; j <= 9; j++) {
            System.out.printf("%4d", j);
        }
        System.out.println("\n---------------------------------------------");

        // Display the table body
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + "    |   ");
            for (int j = 1; j <= 9; j++) {
                // Display the product and align properly
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
