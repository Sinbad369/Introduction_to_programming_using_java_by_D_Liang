/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07.Classwork;

/**
 *
 * @author Admin
 */
public class TestPassArray {

    /**
     * Main method
     */
    public static void main(String[] args) {
        int[] a = {1, 2};

        // Swap elements using swap method
        System.out.println("Before the swap method");
        System.out.println("array is {" + a[0] + ", " + a[1] + "} ");
        swap(a[0], a[1]);
        System.out.println("After the swap method");
        System.out.println("array is {" + a[0] + ", " + a[1] + "} ");

        // Swap elements using the swapFirstTwoInArray method
        System.out.println("Before the swap method");
        System.out.println("array is {" + a[0] + ", " + a[1] + "} ");
        swapFirstTwoInArray(a);
        System.out.println("After the swap method");
        System.out.println("array is {" + a[0] + ", " + a[1] + "} ");
    }

    /**
     * Swap two variables
     */
    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    /**
     * Swap first two elements in the array
     */
    public static void swapFirstTwoInArray(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}
