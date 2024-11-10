/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11.ExercisesEvenNumbered.Problem_18;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Problem_18 {

    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> characterList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            characterList.add(s.charAt(i));
        }

        return characterList;
    }

    public static void main(String[] args) {
        String s = "Serikpay";
        ArrayList<Character> charArray = toCharacterArray(s);

        System.out.println("List of characters in the string is: " + charArray);
    }
}
