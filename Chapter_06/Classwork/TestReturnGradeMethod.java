/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06.Classwork;

/**
 *
 * @author Admin
 */
public class TestReturnGradeMethod {

    public static void main(String[] args) {
        System.out.print("The grade is " + getGrade(78.5));
        System.out.print("\nThe grade is " + getGrade(59.5));
    }

    public static char getGrade(double score) {
        if (score >= 90) {
            return 'A'; // note: not System.out.println('A');
        } else if (score >= 80) {
            return 'B'; // note: not System.out.println('B');
        } else if (score >= 70) {
            return 'C'; // note: not System.out.println('C');
        } else if (score >= 60) {
            return 'D'; // note: not System.out.println('D');
        } else {
            return 'F'; // note: not System.out.println('F');
        }
    }
}
