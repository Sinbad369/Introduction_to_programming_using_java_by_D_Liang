/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07.Classwork;

/**
 *
 * @author Admin
 */
public class CountLettersInArray {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        // Declare and create an array
        char[] chars = createArray();

        // Display the array
        System.out.println("The lowercase letters are: ");
        displayArray(chars);

        // Count the occurence of each letter
        int[] counts = countLetters(chars);

        // Display the counts
        System.out.println();
        System.out.println("The occurence of each letter are:  ");
        displayCounts(counts);
    }

    /**
     * Create an array of characters
     *
     * @return
     */
    public static char[] createArray() {
        // Declare an array of characters and create it
        char[] chars = new char[100];

        // Create lowercase letters randomly and assign them to the array
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Chapter_06.Classwork.RandomCharacter.getRandomLowerCaseLetter();
        }

        // Return the array
        return chars;
    }

    /**
     * Display the array of characters
     *
     * @param chars
     */
    public static void displayArray(char[] chars) {
        // Display the characters in the array 20 on each line
        for (int i = 0; i < chars.length; i++) {
            if (i % 20 == 0) {
                System.out.println(chars[i]);
            } else {
                System.out.print(chars[i] + " ");
            }
        }
    }

    /**
     * Count the occurence of each letter
     *
     * @param chars
     * @return
     */
    public static int[] countLetters(char[] chars) {
        // Declare and create an array of 26 int
        int[] counts = new int[26];

        // For each lowercase letter in an array, count it
        for (int i = 0; i < chars.length; i++) {
            counts[chars[i] - 'a']++;
        }
        return counts;
    }

    /**
     * Display the counts
     *
     * @param counts
     */
    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.println(counts[i] + " " + (char) (i + 'a'));
            } else {
                System.out.print(counts[i] + " " + (char) (i + 'a') + " ");
            }
        }
    }
}
