/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_22 {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        System.out.println("The numbers of vowels in string " + string + " is " + countVowels(string));
    }

    public static int countVowels(String string) {
        int count = 0;
        string = string.toUpperCase();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == 'A' || ch == 'O' || ch == 'U' || ch == 'E' || ch == 'I') {
                count++;
            }
        }
        return count;
    }
}
