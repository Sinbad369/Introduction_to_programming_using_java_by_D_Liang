/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_28 {

    // So sexy problem for improving understanding
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s", "p", "2^p-1");
        System.out.println();
        System.out.println("________________________");
        for (int p = 2; p <= 31; p++) {
            if (isPrime(p)) {
                long marsennePrime = (long) Math.pow(2, p) - 1;
                if (isPrime(marsennePrime)) {
                    System.out.printf("%-15d%-15d", p, marsennePrime);
                    System.out.println();
                }
            }
        }
    }

    public static boolean isPrime(long num) {
        for (long divisor = 2; divisor <= Math.sqrt(num); divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
