/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11.Classwork;

/**
 *
 * @author Admin
 */
public class DynamicBindingDemo {

    public static void main(String[] args) {
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());
    }

    public static void m(Object x) {
        System.out.println(x.toString());
    }
}

class GraduateStudent extends Student {
    // GraduateStudent inherits the toString() method from Student
}

class Student extends Person {

    @Override
    public String toString() {
        return "Student";
    }
}

class Person {

    @Override
    public String toString() {
        return "Person";
    }
}
