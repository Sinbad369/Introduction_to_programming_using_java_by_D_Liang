/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_09.Classwork;

/**
 *
 * @author Admin
 */
public class TV {

    int channel = 1; // Default channel is 1 // Datafields
    int volumeLevel = 1; // Default volume level is 1 // Datafields
    boolean on = false; // TV is off // Datafields

    public TV() { // Constructor
    }

    public void turnOn() { // turn on TV
        on = true;
    }

    public void turnOff() { // turn off TV
        on = false;
    }

    // Set a new Channel
    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    // Set a new Volume
    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
            volumeLevel = newVolumeLevel;
        }
    }

    // Increase channel
    public void channelUp() {
        if (on && channel < 120) {
            channel++;
        }
    }

    // Decrease channel
    public void channelDown() {
        if (on && channel > 1) {
            channel--;
        }
    }

    // Increase volume
    public void volumeUp() {
        if (on && volumeLevel < 7) {
            volumeLevel++;
        }
    }

    // Decrease volume
    public void volumeDown() {
        if (on && volumeLevel > 1) {
            volumeLevel--;
        }
    }
}
