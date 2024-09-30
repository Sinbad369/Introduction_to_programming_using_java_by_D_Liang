/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06.Classwork;

/**
 *
 * @author Admin
 */
public class Increment {

    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the increment, x is " + x);
        increment(x);
        System.out.println("After the increment, x is " + x);
    }

    public static void increment(int n) {
        n++;
        System.out.println("n inside the method is " + n);
    }
}
