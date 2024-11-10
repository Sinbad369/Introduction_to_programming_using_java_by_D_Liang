/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11.ExercisesEvenNumbered.Problem_14;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Problem_14 {

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> listUnion = new ArrayList<>();

        for (Integer num : list1) {
            if (!listUnion.contains(num)) {
                listUnion.add(num); // Only add if not already in the list
            }
        }

        for (Integer num : list2) {
            if (!listUnion.contains(num)) {
                listUnion.add(num); // Only add if not already in the list
            }
        }
        return listUnion;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(1);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(3);
        list1.add(4);
        list1.add(6);

        System.out.println("The combined list is " + union(list1, list2));
    }
}
