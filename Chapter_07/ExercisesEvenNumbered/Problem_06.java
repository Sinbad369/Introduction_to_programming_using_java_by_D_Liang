/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_06 {

    public static void main(String[] args) {
        int numberLimit = 50;
        boolean[] isPrime = new boolean[numberLimit + 1];

        // Initialize all values to false
        for (int i = 0; i < numberLimit + 1; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= numberLimit; i++) { // outer loop finds the prime numbers
            /**
             * Look i * i checks if i less than sqrt of numberLimit actually bcz
             * lessay: numberLimit is 50 and i is 8, say we chose the path of i
             * < sqrt(numberLimit) instead of i * i < numberLimit, the same
             * thing happens 8 is greater than the number that square of 50
             * which is smaller than 8, instead, we use Sieve of Eratosthenes
             * and do i * i for the sake of efficiency
             */
            if (isPrime[i]) { // inner loop finds the multiple of the current prime numbers
                for (int j = i * i; j <= numberLimit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        System.out.println("Prime numbers less than " + numberLimit + " are: ");
        for (int i = 2; i <= numberLimit; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
