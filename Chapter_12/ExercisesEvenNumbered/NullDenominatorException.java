/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_12.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class NullDenominatorException extends Exception {

    public NullDenominatorException() {
        super("Denominator cannot be null or zero");
    }

    public NullDenominatorException(String message) {
        super(message);
    }
}
