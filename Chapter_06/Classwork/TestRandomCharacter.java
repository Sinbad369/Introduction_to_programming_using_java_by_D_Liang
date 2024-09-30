/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06.Classwork;

/**
 *
 * @author Admin
 */
public class TestRandomCharacter {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;

        // Print the random characters between 'a' and 'z', 25 chars per line
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = RandomCharacter.getRandomLowerCaseLetter();
            if ((i + 1) % CHARS_PER_LINE == 0) {
                System.out.println(ch);
            } else {
                System.out.print(ch);
            }
        }
    }
}
