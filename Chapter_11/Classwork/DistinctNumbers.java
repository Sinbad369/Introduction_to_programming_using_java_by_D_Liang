package Chapter_11.Classwork;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integers (input ends with 0): ");
        int value;

        do {
            value = input.nextInt(); // Read a value from the input

            if (!list.contains(value) && value != 0) {
                list.add(value); // Add the value if it is not in the list and not 0
            }
        } while (value != 0);

        input.close(); // Close the Scanner to avoid warnings

        // Display the distinct numbers
        System.out.print("Distinct numbers: ");
        for (int number : list) {
            System.out.print(number + " ");
        }
        /**
         * on lines 27-29 there might have been another solution which is
         * beginner style code for (int i = 0; i < list.size(); i++){
         * System.out.print(list.get(i) + " "); }
         */

        /**
         * OR on lines 27-29 there might have been another solution which is
         * better style code for (Integer number: list){ System.out.print(number
         * + " "); }
         */
    }
}
