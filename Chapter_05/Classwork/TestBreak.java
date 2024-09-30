/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_05.Classwork;

/**
 *
 * @author Admin
 */
public class TestBreak {

    public static void main(String[] args) {

        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100) {
                break;
            }
        }

        /**
         * // OPTION I TO WRITE WITHOUT BREAK boolean condition = false; int
         * sum = 0; int number = 0; while (number < 20 && condition != true) {
         * sum += number;
         * if (sum >= 100) { condition = true; } else { number++; } }
         *
         */
        /**
         * // OPTION II TO WRITE WITHOUT BREAK int sum = 0; int number = 0;
         * while (number < 20 && sum < 100) { number++; sum += number; }
         *
         */
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}
