/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_34 {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = input.nextLine();
        System.out.println("The sorted version of string " + string + " is " + sort(string));
    }

    public static String sort(String s) {
        char[] sorted = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            sorted[i] = s.charAt(i);
        }
        java.util.Arrays.sort(sorted);
        String result = "";
        for (int i = 0; i < sorted.length; i++) {
            result += sorted[i];
        }
        return result;
    }
}
