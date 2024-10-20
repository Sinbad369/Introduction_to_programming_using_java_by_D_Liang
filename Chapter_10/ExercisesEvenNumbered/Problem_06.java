/*
*10.6 (Display the prime numbers) Write a program that displays all the prime numbers less than 120 in
decreasing order. Use the StackOfIntegers class to store the prime numbers (e.g., 2, 3, 5, . . . ) and retrieve
and display them in reverse order.
 */
package Chapter_10.ExercisesEvenNumbered;

import Chapter_10.Classwork.StackOfIntegers;

/**
 *
 * @author Admin
 */
public class Problem_06 {

    public static void main(String[] args) {
        IsPrime isPrime = new IsPrime(120);
        StackOfIntegers stack = new StackOfIntegers();

        // Sorting the primes less than 120
        for (int number = 2; number < isPrime.getMaxNumber(); number++) {
            if (IsPrime.isPrime(number)) {
                stack.push(number);
            }
        }

        // Printing the primes in decreasing order
        System.out.println("All Prime numbers less than 120 mentioned below in decreasing order: ");
        while (!stack.empty()) {
            System.out.println(stack.pop() + " ");
        }
    }
}

class IsPrime {

    private int maxNumber;

    public IsPrime(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
