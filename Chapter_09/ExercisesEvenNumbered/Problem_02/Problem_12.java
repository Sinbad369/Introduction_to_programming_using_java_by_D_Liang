/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_09.ExercisesEvenNumbered.Problem_02;

/**
 *
 * @author Admin
 */
public class Problem_12 {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Prompt for line segment 1 endpoints
        System.out.println("Enter the coordinates for the first line segment (x1, y1, x2, y2): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Prompt for line segment 2 endpoints
        System.out.println("Enter the coordinates for the second line segment (x3, y3, x4, y4): ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // Calculate coefficients
        int a = (int) (y1 - y2);
        int b = (int) -(x1 - x2);
        int c = (int) (y3 - y4);
        int d = (int) -(x3 - x4);
        int e = (int) ((y1 - y2) * x1 - (x1 - x2) * y1);
        int f = (int) ((y3 - y4) * x3 - (x3 - x4) * y3);

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            System.out.printf("The intersecting point is at (%.2f, %.2f)\n", equation.getX(), equation.getY());
        } else {
            System.out.println("No intersection point, the lines do not intersect.");
        }
    }

    public static class LinearEquation {

        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;

        public LinearEquation(int a, int b, int c, int d, int e, int f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
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

        public int getD() {
            return d;
        }

        public int getE() {
            return e;
        }

        public int getF() {
            return f;
        }

        public boolean isSolvable() {
            return a * d - b * c != 0;
        }

        public double getX() {
            double x = (e * d - b * f) / (a * d - b * c);
            return x;
        }

        public double getY() {
            double y = (a * f - e * c) / (a * d - b * c);
            return y;
        }
    }
}
