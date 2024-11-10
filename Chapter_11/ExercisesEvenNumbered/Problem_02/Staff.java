/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11.ExercisesEvenNumbered.Problem_02;

/**
 *
 * @author Admin
 */
public class Staff extends Employee {

    private String title;

    public Staff(String title, String office, double salary, MyDate dateHired) {
        super(office, salary, dateHired);
        this.title = title;
    }

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{" + "title=" + title + '}';
    }

}
