/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_16 {

    public static void main(String[] args) {
        int[] numbersAscendingOrder = new int[100_000_000];
        for (int i = 0; i < numbersAscendingOrder.length; i++) {
            numbersAscendingOrder[i] = i + 1;
        }

        int[] testValues = {1, 25_000_000, 50_000_000, 75_000_000, 100_000_000};

        // Uncommented this section to include linear search
        for (int element : testValues) {
            long startTimeLinear = System.nanoTime();
            linearSearch(element, numbersAscendingOrder);
            long endTimeLinear = System.nanoTime();
            long executionTimeLinear = endTimeLinear - startTimeLinear;
            System.out.println("Linear Search time for number " + element + " is " + executionTimeLinear / 1_000_000_000.0 + " seconds");
        }

        // This is the binary search timing code
        for (int elementBinary : testValues) {
            long startTimeBinary = System.nanoTime();
            binarySearch(elementBinary, numbersAscendingOrder);
            long endTimeBinary = System.nanoTime();
            long executionTimeBinary = endTimeBinary - startTimeBinary;
            System.out.println("Binary Search time for number " + elementBinary + " is " + executionTimeBinary / 1_000_000_000.0 + " seconds");
        }
    }

    public static void linearSearch(int searchNumber, int[] ascendingNumbersList) {
        for (int i = 0; i < ascendingNumbersList.length; i++) { // Fixed boundary condition
            if (searchNumber == ascendingNumbersList[i]) {
                System.out.println("The index of the linear searched number " + searchNumber + " in the list is " + i);
                return;
            }
        }
        System.out.println("Linear Search: Number " + searchNumber + " not found.");
    }

    public static void binarySearch(int searchNumber, int[] ascendingNumbersList) {
        int low = 0;
        int high = ascendingNumbersList.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2; // Move this calculation inside the loop
            if (searchNumber == ascendingNumbersList[mid]) {
                System.out.println("The index of the binary searched number " + searchNumber + " in the list is " + mid);
                return;
            } else if (searchNumber < ascendingNumbersList[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Binary Search: Number " + searchNumber + " not found.");
    }
}
