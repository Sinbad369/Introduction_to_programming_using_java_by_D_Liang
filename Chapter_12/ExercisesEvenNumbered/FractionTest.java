/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_12.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class FractionTest {

    public static void main(String[] args) throws NullDenominatorException {
        java.util.Scanner input = new java.util.Scanner(System.in);

        try {
            System.out.println("Enter value for numerator: ");
            int numerator = input.nextInt();

            System.out.println("Enter value for denominator: ");
            int denominator = input.nextInt();

            // Fraction object
            Fraction fraction = new Fraction(numerator, denominator);
            System.out.println("Fraction: " + fraction);

        } catch (NullDenominatorException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            input.close();
        }
    }
}
