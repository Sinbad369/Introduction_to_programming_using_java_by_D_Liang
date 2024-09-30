/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_05.Classwork;

/**
 *
 * @author Admin
 */
public class TestContinue {

    public static void main(String[] args) {

        int number = 0;
        int sum = 0;

        while (number < 20) {
            number++;
            if (number == 10 || number == 11) {
                continue;
            }
            sum += number;
        }

        /**
         * int number = 0; int sum = 0;
         *
         * while (number < 20) { number++; if (number != 10 && number != 11) {
         * sum += number; } }
         *
         */
        System.out.println("The sum is " + sum);
    }

}
