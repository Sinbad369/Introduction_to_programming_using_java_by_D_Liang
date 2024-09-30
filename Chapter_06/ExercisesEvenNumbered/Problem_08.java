/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_08 {

    public static void main(String[] args) {

        System.out.printf("%-15s%-15s%-7s%-20s%-20s", "Miles", "Kilometers", "|", "Kilometers", "Miles");
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        for (int i = 1, j = 20; i <= 10 && j <= 65; i++, j += 5) {
            double mileToKm = mileToKilometer(i);
            double kmToMile = kilometerToMile(j);

            System.out.printf("%-15d%-15.3f%-7s%-20d%-20.3f\n", i, mileToKm, "|", j, kmToMile);
        }
    }

    public static double mileToKilometer(double mile) {
        return mile * 1.609;
    }

    public static double kilometerToMile(double kilometer) {
        return kilometer / 1.609;
    }
}
