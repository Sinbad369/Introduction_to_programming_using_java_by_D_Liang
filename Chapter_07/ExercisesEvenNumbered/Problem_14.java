/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_14 {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter five numbers: ");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("The least common multiple of the numbers is " + lcm(numbers));
    }

    public static int lcm(int... numbers) {
        int l = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            l = lcm(l, numbers[i]);
        }
        return l;
    }

    /**
     * Return the lcm of two integers
     */
    public static int lcm(int n1, int n2) {
        int max = Math.max(n1, n2);
        int lcm = max;
        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                break;
            }
            lcm += max;
        }
        return lcm;
    }
}
