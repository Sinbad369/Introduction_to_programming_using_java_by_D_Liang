/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_09.ExercisesEvenNumbered.Problem_02;

/**
 *
 * @author Admin
 */
public class Problem_10 {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter the values for a, b, c with the space: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double discriminant = equation.getDiscriminant();
        if (discriminant > 0) {
            System.out.printf("The equation has two roots: %.2f, %.2f",
                    equation.getRoot1(), equation.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("The equation has one root " + (-b / 2 * a));
        } else {
            System.out.println("The equation has no roots");
        }
    }

    public static class QuadraticEquation {

        private final int a;
        private final int b;
        private final int c;

        public QuadraticEquation(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public int getC() {
            return c;
        }

        public double getDiscriminant() {
            return Math.pow(b, 2) - 4 * a * c;
        }

        public double getRoot1() {
            double discriminant = getDiscriminant();
            if (discriminant < 0) {
                return 0;
            }
            return (-b + Math.sqrt(discriminant)) / (2 * a);

        }

        public double getRoot2() {
            double discriminant = getDiscriminant();
            if (discriminant < 0) {
                return 0;
            }
            return (-b + Math.sqrt(discriminant)) / (2 * a);

        }

    }
}
