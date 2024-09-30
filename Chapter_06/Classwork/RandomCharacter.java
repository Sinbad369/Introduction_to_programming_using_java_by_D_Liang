/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06.Classwork;

/**
 *
 * @author Admin
 */
public class RandomCharacter {

    // You can use these methods in your future projects
    /**
     * Generate a random character between ch1 and ch2
     *
     * @param ch1
     * @param ch2
     * @return
     */
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /**
     * Generate a random lowercase letter
     *
     * @return
     */
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    /**
     * Generate a random uppercase letter
     *
     * @return
     */
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    /**
     * Generate a random digit character
     *
     * @return
     */
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    /**
     * Generate a random character
     *
     * @return
     */
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
