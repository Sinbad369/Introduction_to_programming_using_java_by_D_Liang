/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07.Classwork;

/**
 *
 * @author Admin
 */
public class VarArgsDemo {

    public static void main(String[] args) {
        printMax(34, 3, 3, 2, 56.5); // Pass variable length argument list
        printMax(new double[]{1, 2, 3}); // Pass an array argument
    }

    public static void printMax(double... numbers) { // A variable length arg parameter
        if (numbers.length == 0) {
            System.out.println("No arguments passed");
            return;
        }
        double result = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }

}
