/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_09.Classwork;

/**
 *
 * @author Admin
 */
public class TestTV {

    public static void main(String[] args) {
        TV tv1 = new TV(); // Create a TV object
        tv1.turnOn(); // Turn on // invoking a method here
        tv1.setChannel(30); // set a new channel // invoking a method here
        tv1.setVolume(3); //  set a new volume // invoking a method here

        TV tv2 = new TV(); // Create a TV object
        tv2.turnOn(); // Turn on // invoking a method here
        tv2.channelUp(); // increase channel // invoking a method here
        tv2.volumeUp(); // increase volume // invoking a method here

        // Display state
        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel); // Data field accessed using syntax tv1.channel
        System.out.println("tv1's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
    }
}
