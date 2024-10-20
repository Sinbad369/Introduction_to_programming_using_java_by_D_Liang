/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_10.Classwork;

/**
 *
 * @author Admin
 */
public class TestCourse {

    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.println(students[i] + (i < course1.getNumberOfStudents() - 1 ? ", " : " "));
        }

        System.out.println();
        System.out.print("Number of students in course2: " + course2.getNumberOfStudents());

        course1.dropStudent("Kim Smith");
        System.out.println("\nNumber of students after dropping in course1: " + course1.getNumberOfStudents());
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.println(students[i] + ", ");
        }
    }
}
