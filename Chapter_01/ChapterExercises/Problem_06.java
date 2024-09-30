/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_01.ChapterExercises;

/**
 *
 * @author Admin
 */
public class Problem_06 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i < 10) {
                System.out.print(i + " + ");
            } else if (i == 10) {
                System.out.println(i + " = ");
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
