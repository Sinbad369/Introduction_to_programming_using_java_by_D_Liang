/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_04.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_16 {

    public static void main(String[] args) {
        int numberRandom = 97 + (int) (Math.random() * (122 - 97 + 1));
        System.out.println("The corresponding lowercase letter as per random code " + numberRandom
                + " is " + (char) numberRandom);
    }
}
