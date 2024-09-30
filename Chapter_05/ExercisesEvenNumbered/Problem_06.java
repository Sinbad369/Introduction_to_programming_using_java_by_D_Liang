/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_05.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_06 {

    public static void main(String[] args) {

        System.out.printf("%-10s%20s%5s%-20s%-10s", "Ping", "Square meter", "     |    ", "Square meter ", "Ping");
        System.out.println();
        final double ONE_PING_IN_SQUARE_METERS = 3.305;
        for (int ping = 10, squareMeter = 30; ping <= 80 && squareMeter <= 100; ping += 5, squareMeter += 5) {
            double pingToSquareMeters = ping * ONE_PING_IN_SQUARE_METERS;
            double squareMetersToPing = squareMeter / ONE_PING_IN_SQUARE_METERS;
            System.out.printf("%-10d%20.3f%5s%-20d%-10.3f\n", ping, pingToSquareMeters, "     |    ", squareMeter, squareMetersToPing);
        }
    }
}
