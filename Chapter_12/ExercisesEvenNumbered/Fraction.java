/*
 12.10 (Fraction) Create a class Fraction with two integer final fields: numera
tor and denominator. Its constructor creates fractions when given values
for both, but it has to avoid fractions with null denominators by throwing a
NullDenominatorException of Programming Exercise 12.7.
 */
package Chapter_12.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) throws NullDenominatorException {
        if (denominator == 0) {
            throw new NullDenominatorException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return "Fraction = " + numerator + "/" + denominator + '}';
    }

}
