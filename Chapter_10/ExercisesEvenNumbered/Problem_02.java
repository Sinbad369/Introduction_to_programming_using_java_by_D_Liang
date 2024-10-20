/*
10.2 (The BMI class) Add the following new constructor in the BMI class:
/** Construct a BMI with the specified name, age, weight,
* feet, and inches ==> public BMI(String name, int age, double weight, double feet,
 double inches)
 */
package Chapter_10.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_02 {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = input.next();
        System.out.println("Enter the age: ");
        int age = input.nextInt();
        System.out.println("Enter the weight: ");
        double weight = input.nextDouble();
        System.out.println("Enter the feet: ");
        double feet = input.nextDouble();
        System.out.println("Enter the inches: ");
        double inches = input.nextDouble();
        BMI bmi = new BMI(name, age, weight, feet, inches);
        System.out.printf("The BMI is: %.2f", bmi.getBMI());
        System.out.println("\nBased on your BMI, your status is: " + bmi.getBMIStatus());
    }

}

class BMI {

    private String name;
    private int age;
    private double weight;
    private double feet;
    private double inches;
    private double bmi;
    private double height;

    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }

    public double getBMI() {
        height = (this.feet * 0.3048) + (this.inches * 0.0254);
        bmi = this.weight / (height * height);
        return bmi;
    }

    public String getBMIStatus() {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else {
            return "Overweight";
        }
    }

}
