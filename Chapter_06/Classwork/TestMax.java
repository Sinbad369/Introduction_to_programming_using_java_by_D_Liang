/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06.Classwork;

/**
 *
 * @author Admin
 */
public class TestMax {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }

    /**
     * Return the max of two numbers
     *
     * @param num1
     * @param num2
     * @return
     */
    public static int max(int num1, int num2) {
        int result;

        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }
}
