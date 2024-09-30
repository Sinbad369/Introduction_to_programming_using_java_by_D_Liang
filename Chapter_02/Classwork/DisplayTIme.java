/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_02.Classwork;

/**
 *
 * @author Admin
 */
public class DisplayTIme {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        //Prompt the user for input
        System.out.println("Enter an integer for seconds: ");
        int seconds = input.nextInt();

        //Find minutes in seconds
        int minutes = seconds / 60;
        //Seconds  reamining
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + "seconds");
    }
}
