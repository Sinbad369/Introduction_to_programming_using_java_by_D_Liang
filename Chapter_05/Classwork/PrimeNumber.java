/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_05.Classwork;

/**
 *
 * @author Admin
 */
public class PrimeNumber {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        // Set the count for total prime numbers  to 50
        final int NUMBER_OF_PRIMES = 50;

        // Set the numbers of primes to print per line
        final int NUMBER_OF_PRIMES_PER_LINE = 10;

        // Set the initial count and number
        int count = 0;
        int number = 2;
        System.out.println("The first 50 prime numbers are: \n");

        // Repeatedly find prime numbers
        while (count < NUMBER_OF_PRIMES) {
            // Assume the number is prime
            boolean isPrime = true; // is the current number prime?

            // Test whether number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { // If true number is not prime
                    isPrime = false; // Set isPrime to false
                    break; // Exit the for loop
                }
            }

            // Display the prime number and increase the count
            if (isPrime) {
                count++; // Increase the count
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    // Display the number and advance to new line
                    System.out.println(number);
                } else {
                    System.out.print(number + "  ");
                }

            }
            // Check if the next number is Prime
            number++;
        }

    }
}
