/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_26 {

    public static void main(String[] args) {
        int numberOfPalindromicPrimes = 120;
        System.out.println("The first 120 palindromic primes are: ");
        printPalindromicPrimes(numberOfPalindromicPrimes);
    }

    public static void printPalindromicPrimes(int numberOfPalinPrimes) {
        int count = 0;
        int number = 2;
        while (count < numberOfPalinPrimes) {
            if (isPrime(number) && isPalindrome(number)) {
                System.out.print(number + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {
        for (int divisor = 2; divisor <= Math.sqrt((num)); divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        String numStr = Integer.toString(num);
        int lowerIndex = 0;
        int higherIndex = numStr.length() - 1;

        while (lowerIndex < higherIndex) {
            if (numStr.charAt(lowerIndex) != numStr.charAt(higherIndex)) {
                return false;
            } else {
                lowerIndex++;
                higherIndex--;
            }
        }
        return true;
    }
}
