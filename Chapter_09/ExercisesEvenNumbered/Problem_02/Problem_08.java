/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_09.ExercisesEvenNumbered.Problem_02;

/**
 *
 * @author Admin
 */
public class Problem_08 {

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan2.toString());
    }

    public static class Fan {

        public static int SLOW = 1;
        public static int MEDIUM = 2;
        public static int FAST = 3;
        private int speed = SLOW;
        private boolean on = false;
        private double radius = 5;
        String color = "blue";

        public int getSpeed() {
            return speed;
        }

        public boolean isOn() {
            return on;
        }

        public double getRadius() {
            return radius;
        }

        public String getColor() {
            return color;
        }

        public void setSpeed(int newSpeed) {
            speed = newSpeed;
        }

        public void setColor(String newColor) {
            color = newColor;
        }

        public void setOn(boolean trueOrFalse) {
            this.on = trueOrFalse;
        }

        public void setRadius(double newRadius) {
            radius = newRadius;
        }

        public Fan() {
        }

        @Override
        public String toString() {
            if (on) {
                return "Speed - " + speed + "Color - " + color + "Radius " + radius;
            } else {
                return "Color - " + color + "Radius - " + radius + ", fan is off.";
            }
        }
    }
}
