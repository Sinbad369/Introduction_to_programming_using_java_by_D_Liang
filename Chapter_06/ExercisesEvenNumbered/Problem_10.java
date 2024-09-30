/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_10 {

    public static void main(String[] args) {
        System.out.println("The prime numbers less than 10000 are: ");
        printPrimeNumbers(10000);
    }

    public static void printPrimeNumbers(int numberPrimeMax) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int number = 2;
        int count = 0;

        while (number < numberPrimeMax) {
            if (isPrime(number)) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.printf("%-5d\n", number);
                } else {
                    System.out.printf("%-5d", number);
                }
            }
            number++;
        }
    }

    /**
     * Check if the number is prime
     *
     * @param number
     * @return
     */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
