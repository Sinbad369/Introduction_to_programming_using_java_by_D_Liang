/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_26 {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter list: ");
        int[] numbers = new int[input.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        if (isSorted(numbers)) {
            System.out.println("The list is sorted");
        } else {
            System.out.println("The list is not sorted");
        }
    }

    public static boolean isSorted(int[] list) {
        int[] copyOfList = new int[list.length];
        System.arraycopy(list, 0, copyOfList, 0, list.length);
        java.util.Arrays.sort(copyOfList);
        return java.util.Arrays.equals(list, copyOfList);
    }
}
