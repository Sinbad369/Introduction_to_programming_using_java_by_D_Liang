/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11.ExercisesEvenNumbered.Problem_02;

/**
 *
 * @author Admin
 */
public class Employee extends Person {

    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee(String office, double salary, MyDate dateHired) {
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee{" + "office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + '}';
    }

}
