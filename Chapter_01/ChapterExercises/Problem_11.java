/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_01.ChapterExercises;

/**
 *
 * @author Admin
 */
public class Problem_11 {

    public static void main(String[] args) {
        final int currentPopulation = 321032486;
        final int oneBirthXSecond = 7;
        final int oneDeathXSecond = 13;
        final int oneImmigrantXSecond = 45;
        double secondsInYear = 365 * 24 * 3600;
        for (int i = 1; i <= 5; i++) {
            double totalPopulation = (currentPopulation + i * secondsInYear / oneBirthXSecond
                    + i * secondsInYear / oneImmigrantXSecond - i * secondsInYear / oneDeathXSecond);

            System.out.println("The population number for year " + i + " is "
                    + (long) totalPopulation);
        }
    }
}
