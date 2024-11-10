package Chapter_11.ExercisesEvenNumbered.Problem_04;

import java.util.ArrayList;
import java.util.Collections;

public class MaxFinder {

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        return Collections.max(list);
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter a sequence of numbers(entering 0 ends the input process): ");
        int number = input.nextInt();

        while (number != 0) {
            numbers.add(number);
            number = input.nextInt();
        }
        Integer highest = max(numbers);
        if (highest != null) {
            System.out.println("The highest number is " + highest);
        } else {
            System.out.println("No volid numbers were entered");
        }

        input.close();
    }
}
