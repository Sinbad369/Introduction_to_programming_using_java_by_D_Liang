/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07.Classwork;

/**
 *
 * @author Admin
 */
public class LinearSearch {

    public static void main(String[] args) {
        int list[] = {1, 4, 4, 2, 5, -3, 6, 2};
        if (linearSearch(list, 4) == -1) {
            System.out.println("No match found");
        } else {
            System.out.println("Match found and the index is " + linearSearch(list, 4));
        }
    }

    /**
     * The method for finding a key in the list
     *
     * @param list
     * @param key}_)
     * @return
     */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }
}
