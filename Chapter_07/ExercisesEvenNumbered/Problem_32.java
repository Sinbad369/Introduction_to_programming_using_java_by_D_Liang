/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_32 {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = input.nextInt();
        System.out.println("Enter list content: ");
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        int pivotIndex = partition(list);
        System.out.print("After the partition, the list is ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println("\nPivot is at index: " + pivotIndex);

    }

    public static int partition(int[] list) {
        int pivot = list[0];
        int low = 1;
        int high = list.length - 1;
        while (true) {
            while (low <= high && list[low] <= pivot) {
                low++;
            }
            while (high >= low && list[high] >= pivot) {
                high--;
            }
            if (low > high) {
                break;
            }

            int temp = list[low];
            list[low] = list[high];
            list[high] = temp;
        }
        // Swap the pivot with the element at the right pointer
        list[0] = list[high];
        list[high] = pivot;

        // Return the index of the pivot
        return high;
    }
}
