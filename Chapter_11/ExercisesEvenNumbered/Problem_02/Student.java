/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11.ExercisesEvenNumbered.Problem_02;

/**
 *
 * @author Admin
 */
public class Student extends Person {

    private String classStatus;

    public Student() {
    }

    public Student(String classStatus) {
        this.classStatus = classStatus;
    }

    public Student(String name, String address, String phoneNumber, String email, String classStatus) {
        super(name, address, phoneNumber, email);
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return "Student{" + "classStatus=" + classStatus + '}';
    }

}
